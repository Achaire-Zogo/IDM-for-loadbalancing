# IDM pour Load Balancing - Projet INF5039

## Modélisation et génération d'un mécanisme de répartition de charge par DSL pour un système distribué

**Étudiants :**
- ZOGO ABOUMA Zozime Achaire – 18N2824
- NKOLO Stéphane Roylex – 21T2588

**Encadreur :** Dr MONTHE Valérie – Université de Yaoundé 1

---

## Structure du projet

```
IDM-for-loadbalancing/
├── README.md                          # Ce fichier
├── rapport/
│   ├── rapport.tex                    # Rapport LaTeX complet
│   └── rapport.pdf                    # Rapport compilé (38 pages)
├── Rapport_IDM_LoadBalancing_DSL.docx # Rapport au format Word
├── case-study/                        # Implémentation du cas d'étude
│   ├── README.md                      # Guide du cas d'étude
│   ├── ecommerce.lb                   # Modèle DSL source
│   ├── nginx.conf                     # Configuration Nginx générée
│   ├── docker-compose.yml             # Docker Compose généré
│   ├── test-loadbalancer.sh           # Script de tests automatisés
│   └── servers/
│       ├── web/                       # Serveurs frontend (Node.js)
│       │   ├── Dockerfile
│       │   └── server.js
│       └── api/                       # Serveurs API backend (Node.js)
│           ├── Dockerfile
│           └── server.js
└── generate_rapport.py                # Script de génération du .docx
```

## Démarrage rapide

### 1. Prérequis
```bash
# Installer Docker et Docker Compose
sudo apt update
sudo apt install -y docker.io docker-compose-plugin
sudo usermod -aG docker $USER
```

### 2. Lancer le cas d'étude
```bash
cd case-study/
docker compose up --build -d
```

### 3. Tester
```bash
./test-loadbalancer.sh
```

### 4. Accéder
- Frontend : http://localhost:80
- API : http://localhost:3000/api/products
- Health : http://localhost:80/health

### 5. Arrêter
```bash
docker compose down
```

## Compilation du rapport LaTeX
```bash
cd rapport/
pdflatex rapport.tex && pdflatex rapport.tex
```
