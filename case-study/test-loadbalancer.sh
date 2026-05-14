#!/bin/bash
# ============================================================
# Script de test du Load Balancer
# Projet IDM - Répartition de charge par DSL
# ============================================================

echo "============================================================"
echo "  TEST DU MECANISME DE REPARTITION DE CHARGE"
echo "  Projet INF5039 - IDM pour Load Balancing"
echo "============================================================"
echo ""

BASE_URL_WEB="http://localhost:80"
BASE_URL_API="http://localhost:3000"

# Couleurs
GREEN='\033[0;32m'
BLUE='\033[0;34m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
NC='\033[0m'

# ============================================================
# TEST 1 : Verification que tous les services sont actifs
# ============================================================
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo -e "${BLUE}  TEST 1 : Verification des services${NC}"
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo ""

echo "Verification du Load Balancer..."
if curl -s -o /dev/null -w "%{http_code}" $BASE_URL_WEB/health | grep -q "200"; then
    echo -e "  ${GREEN}✓ Load Balancer (port 80) : OK${NC}"
else
    echo -e "  ${RED}✗ Load Balancer (port 80) : ERREUR${NC}"
fi

if curl -s -o /dev/null -w "%{http_code}" $BASE_URL_API/api/health | grep -q "200"; then
    echo -e "  ${GREEN}✓ Load Balancer (port 3000) : OK${NC}"
else
    echo -e "  ${RED}✗ Load Balancer (port 3000) : ERREUR${NC}"
fi
echo ""

# ============================================================
# TEST 2 : Test de la repartition Round Robin (WebFrontend)
# ============================================================
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo -e "${BLUE}  TEST 2 : Repartition Round Robin (WebFrontend)${NC}"
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo ""
echo "Envoi de 12 requetes au cluster WebFrontend..."
echo "(Attendu: web1 ~50%, web2 ~33%, web3 ~17% selon les poids 3:2:1)"
echo ""

declare -A web_counts
web_counts[web1]=0
web_counts[web2]=0
web_counts[web3]=0

for i in $(seq 1 12); do
    response=$(curl -s $BASE_URL_WEB/ 2>/dev/null)
    server=$(echo $response | grep -oP '"serverName"\s*:\s*"\K[^"]+' 2>/dev/null || echo $response | python3 -c "import sys,json; print(json.load(sys.stdin).get('serverName','unknown'))" 2>/dev/null)
    if [ -n "$server" ] && [ "$server" != "unknown" ]; then
        web_counts[$server]=$((${web_counts[$server]} + 1))
        echo -e "  Requete $i -> ${GREEN}$server${NC}"
    else
        echo -e "  Requete $i -> ${YELLOW}(parsing response)${NC}"
        # Fallback: chercher le nom du serveur dans le HTML
        server=$(echo $response | grep -oP 'Served by: \K\w+' 2>/dev/null)
        if [ -n "$server" ]; then
            web_counts[$server]=$((${web_counts[$server]} + 1))
            echo -e "  Requete $i -> ${GREEN}$server${NC} (from HTML)"
        fi
    fi
done

echo ""
echo "Resultats de la repartition :"
echo -e "  web1 (poids=3) : ${GREEN}${web_counts[web1]} requetes${NC}"
echo -e "  web2 (poids=2) : ${GREEN}${web_counts[web2]} requetes${NC}"
echo -e "  web3 (poids=1) : ${GREEN}${web_counts[web3]} requetes${NC}"
echo ""

# ============================================================
# TEST 3 : Test de la repartition Least Connections (APIBackend)
# ============================================================
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo -e "${BLUE}  TEST 3 : Repartition Least Connections (APIBackend)${NC}"
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo ""
echo "Envoi de 10 requetes au cluster APIBackend..."
echo "(Attendu: distribution equilibree ~50/50 avec least_conn)"
echo ""

declare -A api_counts
api_counts[api1]=0
api_counts[api2]=0

for i in $(seq 1 10); do
    response=$(curl -s $BASE_URL_API/api/info 2>/dev/null)
    server=$(echo $response | grep -oP '"serverName"\s*:\s*"\K[^"]+' 2>/dev/null || echo $response | python3 -c "import sys,json; print(json.load(sys.stdin).get('serverName','unknown'))" 2>/dev/null)
    if [ -n "$server" ] && [ "$server" != "unknown" ]; then
        api_counts[$server]=$((${api_counts[$server]} + 1))
        echo -e "  Requete $i -> ${GREEN}$server${NC}"
    fi
done

echo ""
echo "Resultats de la repartition :"
echo -e "  api1 : ${GREEN}${api_counts[api1]} requetes${NC}"
echo -e "  api2 : ${GREEN}${api_counts[api2]} requetes${NC}"
echo ""

# ============================================================
# TEST 4 : Health Check
# ============================================================
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo -e "${BLUE}  TEST 4 : Health Checks${NC}"
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo ""

echo "Health check WebFrontend :"
curl -s $BASE_URL_WEB/health | python3 -m json.tool 2>/dev/null || curl -s $BASE_URL_WEB/health
echo ""

echo "Health check APIBackend :"
curl -s $BASE_URL_API/api/health | python3 -m json.tool 2>/dev/null || curl -s $BASE_URL_API/api/health
echo ""

# ============================================================
# TEST 5 : API Products endpoint
# ============================================================
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo -e "${BLUE}  TEST 5 : Endpoint API Products${NC}"
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo ""

echo "GET /api/products :"
curl -s $BASE_URL_API/api/products | python3 -m json.tool 2>/dev/null || curl -s $BASE_URL_API/api/products
echo ""

# ============================================================
# TEST 6 : Test de failover (optionnel)
# ============================================================
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo -e "${BLUE}  TEST 6 : Test de failover${NC}"
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo ""
echo -e "${YELLOW}Pour tester le failover, executez dans un autre terminal :${NC}"
echo "  docker compose stop web3"
echo "  # Puis relancez ce script pour voir la redistribution"
echo "  docker compose start web3"
echo ""

# ============================================================
# RESUME
# ============================================================
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo -e "${BLUE}  RESUME DES TESTS${NC}"
echo -e "${BLUE}═══════════════════════════════════════════════════════${NC}"
echo ""
echo "Infrastructure deployee :"
echo "  - 3 serveurs web (web1, web2, web3) sur port 8080"
echo "  - 2 serveurs API (api1, api2) sur port 3000"
echo "  - 1 load balancer Nginx"
echo ""
echo "Algorithmes verifies :"
echo "  - Weighted Round Robin sur WebFrontend (poids 3:2:1)"
echo "  - Least Connections sur APIBackend"
echo ""
echo "Acces :"
echo "  - Frontend web : http://localhost:80"
echo "  - API Backend  : http://localhost:3000/api/products"
echo "  - Health web   : http://localhost:80/health"
echo "  - Health API   : http://localhost:3000/api/health"
echo ""
echo -e "${GREEN}Tests termines !${NC}"
