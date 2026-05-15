package org.loadbalancer.dsl.validation;

import org.eclipse.xtext.validation.Check;

import loadbalancer.Algorithm;
import loadbalancer.Cluster;
import loadbalancer.HealthCheck;
import loadbalancer.Listener;
import loadbalancer.LoadBalancerSystem;
import loadbalancer.LoadbalancerPackage;
import loadbalancer.PersistenceType;
import loadbalancer.ScalingRule;
import loadbalancer.Server;
import loadbalancer.SessionPersistence;

import java.util.HashSet;
import java.util.Set;

public class LoadBalancerValidator extends AbstractLoadBalancerValidator {

    // RG01 - Unicite des noms de serveurs dans un cluster
    @Check
    public void checkUniqueServerNames(Cluster cluster) {
        Set<String> names = new HashSet<>();
        for (Server s : cluster.getServers()) {
            if (!names.add(s.getName())) {
                error("Nom de serveur dupliqué : " + s.getName(),
                        LoadbalancerPackage.Literals.CLUSTER__SERVERS);
            }
        }
    }

    // RG02 - Port valide (1 - 65535)
    @Check
    public void checkValidPort(Server server) {
        if (server.getPort() < 1 || server.getPort() > 65535) {
            error("Le port doit être entre 1 et 65535",
                    LoadbalancerPackage.Literals.SERVER__PORT);
        }
    }

    @Check
    public void checkValidListenerPort(Listener listener) {
        if (listener.getPort() < 1 || listener.getPort() > 65535) {
            error("Le port du listener doit être entre 1 et 65535",
                    LoadbalancerPackage.Literals.LISTENER__PORT);
        }
    }

    // RG03 - Poids positif
    @Check
    public void checkPositiveWeight(Server server) {
        if (server.getWeight() < 1) {
            error("Le poids doit être >= 1",
                    LoadBalancerPackage.Literals.SERVER__WEIGHT);
        }
    }

    // RG04 - Cluster non vide
    @Check
    public void checkNonEmptyCluster(Cluster cluster) {
        if (cluster.getServers().isEmpty()) {
            error("Un cluster doit contenir au moins un serveur",
                    LoadBalancerPackage.Literals.CLUSTER__SERVERS);
        }
    }

    // RG05 - Health check : interval > timeout
    @Check
    public void checkHealthCheckCoherence(HealthCheck hc) {
        if (hc.getInterval() <= hc.getTimeout()) {
            error("L’interval doit être supérieur au timeout",
                    LoadBalancerPackage.Literals.HEALTH_CHECK__INTERVAL);
        }
    }

    // RG06 - Seuils de scaling cohérents
    @Check
    public void checkScalingThresholds(ScalingRule rule) {
        if (rule.getScaleUpThreshold() <= rule.getScaleDownThreshold()) {
            error("scaleUpThreshold doit être > scaleDownThreshold",
                    LoadBalancerPackage.Literals.SCALING_RULE__SCALE_UP_THRESHOLD);
        }
    }

    // RG07 - Instances min <= max
    @Check
    public void checkMinMaxInstances(ScalingRule rule) {
        if (rule.getMinInstances() > rule.getMaxInstances()) {
            error("minInstances doit être <= maxInstances",
                    LoadBalancerPackage.Literals.SCALING_RULE__MIN_INSTANCES);
        }
    }

    // RG08 - Ports de listeners uniques
    @Check
    public void checkUniqueListenerPorts(LoadBalancerSystem system) {
        Set<Integer> ports = new HashSet<>();
        for (Listener l : system.getListeners()) {
            if (!ports.add(l.getPort())) {
                error("Port de listener dupliqué : " + l.getPort(),
                        LoadBalancerPackage.Literals.LOAD_BALANCER_SYSTEM__LISTENERS);
            }
        }
    }

    // RG09 - Weighted Round Robin requiert des poids
    @Check
    public void checkWeightedRequiresWeights(Cluster cluster) {
        if (cluster.getLoadBalancer().getAlgorithm() == Algorithm.WEIGHTED_ROUND_ROBIN) {
            for (Server s : cluster.getServers()) {
                if (s.getWeight() < 1) {
                    error("Algorithme WEIGHTED_ROUND_ROBIN requiert un poids >= 1 pour chaque serveur",
                            LoadBalancerPackage.Literals.CLUSTER__SERVERS);
                }
            }
        }
    }

    // RG10 - Cookie persistence requiert un nom
    @Check
    public void checkCookieRequiresName(SessionPersistence sp) {
        if (sp.getType() == PersistenceType.COOKIE) {
            if (sp.getCookieName() == null || sp.getCookieName().isEmpty()) {
                error("Le type COOKIE requiert un cookieName",
                        LoadBalancerPackage.Literals.SESSION_PERSISTENCE__COOKIE_NAME);
            }
        }
    }

    // RG11 - Au moins un listener
    @Check
    public void checkAtLeastOneListener(LoadBalancerSystem system) {
        if (system.getListeners().isEmpty()) {
            error("Le système doit avoir au moins un listener",
                    LoadBalancerPackage.Literals.LOAD_BALANCER_SYSTEM__LISTENERS);
        }
    }

    // RG12 - Au moins un serveur actif par cluster
    @Check
    public void checkAtLeastOneEnabledServer(Cluster cluster) {
        boolean hasEnabled = false;
        for (Server server : cluster.getServers()) {
            // getEnabled() retourne directement un Boolean (true/false)
            if (server.isEnabled()) {  // ou server.getEnabled() selon le naming
                hasEnabled = true;
                break;
            }
        }
        if (!hasEnabled) {
            error("Le cluster doit avoir au moins un serveur actif",
                    LoadBalancerPackage.Literals.CLUSTER__SERVERS);
        }
    }
}