const http = require('http');
const os = require('os');

const SERVER_NAME = process.env.SERVER_NAME || 'unknown';
const SERVER_PORT = parseInt(process.env.SERVER_PORT) || 3000;

let requestCount = 0;
let activeConnections = 0;
const startTime = Date.now();

// Simuler une base de donnees de produits
const products = [
  { id: 1, name: "Laptop Pro", price: 1299.99, stock: 50 },
  { id: 2, name: "Wireless Mouse", price: 29.99, stock: 200 },
  { id: 3, name: "USB-C Hub", price: 49.99, stock: 150 },
  { id: 4, name: "Mechanical Keyboard", price: 89.99, stock: 75 },
  { id: 5, name: "Monitor 27\"", price: 399.99, stock: 30 },
];

const server = http.createServer((req, res) => {
  requestCount++;
  activeConnections++;

  const respond = (statusCode, data) => {
    activeConnections--;
    res.writeHead(statusCode, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify(data));
  };

  // Route: Health Check
  if (req.url === '/api/health') {
    respond(200, {
      status: 'healthy',
      serverName: SERVER_NAME,
      uptime: Math.floor((Date.now() - startTime) / 1000),
      requestCount: requestCount,
      activeConnections: activeConnections
    });
    return;
  }

  // Route: Metrics
  if (req.url === '/api/metrics') {
    respond(200, {
      serverName: SERVER_NAME,
      requestCount: requestCount,
      activeConnections: activeConnections,
      uptime: Math.floor((Date.now() - startTime) / 1000),
      memory: {
        total: Math.round(os.totalmem() / 1024 / 1024),
        free: Math.round(os.freemem() / 1024 / 1024),
        usagePercent: Math.round((1 - os.freemem() / os.totalmem()) * 100)
      },
      cpu: os.loadavg()
    });
    return;
  }

  // Route: Liste des produits
  if (req.url === '/api/products') {
    // Simuler un leger delai de base de donnees (10-50ms)
    const delay = Math.floor(Math.random() * 40) + 10;
    setTimeout(() => {
      respond(200, {
        serverName: SERVER_NAME,
        data: products,
        count: products.length,
        responseTime: delay
      });
    }, delay);
    return;
  }

  // Route: Produit par ID
  if (req.url.match(/^\/api\/products\/\d+$/)) {
    const id = parseInt(req.url.split('/').pop());
    const product = products.find(p => p.id === id);
    if (product) {
      respond(200, { serverName: SERVER_NAME, data: product });
    } else {
      respond(404, { serverName: SERVER_NAME, error: 'Product not found' });
    }
    return;
  }

  // Route: Simuler une requete lourde (pour tester least_connections)
  if (req.url === '/api/heavy') {
    const delay = Math.floor(Math.random() * 2000) + 500;
    setTimeout(() => {
      respond(200, {
        serverName: SERVER_NAME,
        route: '/api/heavy',
        processingTime: delay,
        activeConnections: activeConnections
      });
    }, delay);
    return;
  }

  // Route: Info serveur
  if (req.url === '/api/info') {
    respond(200, {
      serverName: SERVER_NAME,
      port: SERVER_PORT,
      hostname: os.hostname(),
      platform: os.platform(),
      arch: os.arch(),
      nodeVersion: process.version,
      uptime: Math.floor((Date.now() - startTime) / 1000),
      requestCount: requestCount
    });
    return;
  }

  // Route par defaut
  if (req.url === '/' || req.url === '/api') {
    respond(200, {
      serverName: SERVER_NAME,
      message: "E-Commerce API Backend",
      version: "1.0",
      endpoints: [
        "GET /api/health",
        "GET /api/metrics",
        "GET /api/products",
        "GET /api/products/:id",
        "GET /api/heavy",
        "GET /api/info"
      ]
    });
    return;
  }

  // 404
  respond(404, { serverName: SERVER_NAME, error: 'Not found', path: req.url });
});

server.listen(SERVER_PORT, '0.0.0.0', () => {
  console.log(`[${SERVER_NAME}] API server running on port ${SERVER_PORT}`);
});
