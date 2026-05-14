# Étude de Cas : Load Balancer pour E-Commerce

## Description

Ce cas d'étude implémente un système de répartition de charge pour une application e-commerce avec :
- **3 serveurs web** (frontend) avec répartition **Weighted Round Robin** (poids 3:2:1)
- **2 serveurs API** (backend) avec répartition **Least Connections**
- **Health checks** HTTP sur chaque cluster
- **Nginx** comme load balancer

## Architecture

```
                    ┌──────────────┐
                    │   Client     │
                    └──────┬───────┘
                           │
                    ┌──────▼───────┐
                    │   Nginx LB   │
                    │  (port 80,   │
                    │   port 3000) │
                    └──┬───────┬───┘
                       │       │
          ┌────────────┘       └────────────┐
          │ Round Robin                     │ Least Connections
          │ (Weighted)                      │
    ┌─────▼─────┐                    ┌─────▼─────┐
    │ WebFrontend│                    │ APIBackend │
    ├───────────┤                    ├───────────┤
    │web1 (w=3) │                    │   api1    │
    │web2 (w=2) │                    │   api2    │
    │web3 (w=1) │                    └───────────┘
    └───────────┘
```

## Prérequis

- Docker (>= 20.10)
- Docker Compose (>= 2.0)

## Démarrage rapide

```bash
# 1. Construire et lancer tous les services
docker compose up --build -d

# 2. Vérifier les services
docker compose ps

# 3. Tester
chmod +x test-loadbalancer.sh
./test-loadbalancer.sh

# 4. Accéder via navigateur
# Frontend : http://localhost:80
# API      : http://localhost:3000/api/products
```

## Endpoints disponibles

### Frontend (port 80)
| Endpoint | Description |
|----------|-------------|
| `GET /` | Page HTML du e-commerce |
| `GET /health` | Health check |
| `GET /metrics` | Métriques du serveur |
| `GET /heavy` | Simulation de charge |

### API (port 3000)
| Endpoint | Description |
|----------|-------------|
| `GET /api` | Info et liste des endpoints |
| `GET /api/health` | Health check |
| `GET /api/products` | Liste des produits |
| `GET /api/products/:id` | Produit par ID |
| `GET /api/heavy` | Simulation de requête lente |
| `GET /api/info` | Informations du serveur |

## Tests

### Test de répartition Round Robin
```bash
for i in $(seq 1 12); do
  curl -s http://localhost:80/ | python3 -c "import sys,json; print(json.load(sys.stdin)['serverName'])"
done
```

### Test de répartition Least Connections
```bash
for i in $(seq 1 10); do
  curl -s http://localhost:3000/api/info | python3 -c "import sys,json; print(json.load(sys.stdin)['serverName'])"
done
```

### Test de failover
```bash
# Arrêter web3
docker compose stop web3

# Vérifier la redistribution
for i in $(seq 1 6); do
  curl -s http://localhost:80/ | python3 -c "import sys,json; print(json.load(sys.stdin)['serverName'])"
done

# Relancer web3
docker compose start web3
```

### Test de charge
```bash
# Avec wrk (si installé)
wrk -t4 -c100 -d30s http://localhost:80/

# Avec ab (Apache Bench)
ab -n 1000 -c 50 http://localhost:80/
```

## Arrêt

```bash
docker compose down
```
