const http = require('http');
const os = require('os');

const SERVER_NAME = process.env.SERVER_NAME || 'unknown';
const SERVER_PORT = parseInt(process.env.SERVER_PORT) || 8080;
const SERVER_WEIGHT = parseInt(process.env.SERVER_WEIGHT) || 1;

let requestCount = 0;
const startTime = Date.now();

const server = http.createServer((req, res) => {
  requestCount++;

  const responseData = {
    serverName: SERVER_NAME,
    port: SERVER_PORT,
    weight: SERVER_WEIGHT,
    requestNumber: requestCount,
    timestamp: new Date().toISOString(),
    uptime: Math.floor((Date.now() - startTime) / 1000),
    hostname: os.hostname(),
    memory: {
      total: Math.round(os.totalmem() / 1024 / 1024),
      free: Math.round(os.freemem() / 1024 / 1024),
      usage: Math.round((1 - os.freemem() / os.totalmem()) * 100)
    },
    cpu: os.loadavg()
  };

  // Route: Health Check
  if (req.url === '/health') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({
      status: 'healthy',
      serverName: SERVER_NAME,
      uptime: responseData.uptime,
      requestCount: requestCount
    }));
    return;
  }

  // Route: Metrics
  if (req.url === '/metrics') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({
      serverName: SERVER_NAME,
      requestCount: requestCount,
      uptime: responseData.uptime,
      memory: responseData.memory,
      cpu: responseData.cpu
    }));
    return;
  }

  // Route: Simuler une charge (pour tests)
  if (req.url === '/heavy') {
    // Simuler un traitement lourd (100ms-500ms)
    const delay = Math.floor(Math.random() * 400) + 100;
    setTimeout(() => {
      res.writeHead(200, { 'Content-Type': 'application/json' });
      res.end(JSON.stringify({
        ...responseData,
        route: '/heavy',
        processingTime: delay
      }));
    }, delay);
    return;
  }

  // Route par defaut: Page d'accueil
  if (req.url === '/' || req.url === '/index.html') {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end(`
      <!DOCTYPE html>
      <html>
      <head><title>E-Commerce - ${SERVER_NAME}</title></head>
      <body style="font-family: Arial, sans-serif; padding: 20px; background: #f0f0f0;">
        <div style="max-width: 600px; margin: 0 auto; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 2px 10px rgba(0,0,0,0.1);">
          <h1 style="color: #333;">E-Commerce Store</h1>
          <div style="background: #e8f5e9; padding: 15px; border-radius: 5px; margin: 15px 0;">
            <h3 style="margin: 0; color: #2e7d32;">Served by: ${SERVER_NAME}</h3>
            <p style="margin: 5px 0; color: #555;">Weight: ${SERVER_WEIGHT} | Request #${requestCount}</p>
            <p style="margin: 5px 0; color: #555;">Time: ${new Date().toISOString()}</p>
          </div>
          <p>This response was served by <strong>${SERVER_NAME}</strong> (weight=${SERVER_WEIGHT}).</p>
          <p>The load balancer distributes requests using <strong>Weighted Round Robin</strong>.</p>
          <hr>
          <small style="color: #999;">Hostname: ${os.hostname()} | Uptime: ${responseData.uptime}s</small>
        </div>
      </body>
      </html>
    `);
    return;
  }

  // Route: JSON par defaut
  res.writeHead(200, { 'Content-Type': 'application/json' });
  res.end(JSON.stringify(responseData));
});

server.listen(SERVER_PORT, '0.0.0.0', () => {
  console.log(`[${SERVER_NAME}] Web server running on port ${SERVER_PORT} (weight=${SERVER_WEIGHT})`);
});
