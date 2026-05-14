/**
 */
package loadbalancer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see loadbalancer.LoadbalancerFactory
 * @model kind="package"
 * @generated
 */
public interface LoadbalancerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "loadbalancer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/loadbalancer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoadbalancerPackage eINSTANCE = loadbalancer.impl.LoadbalancerPackageImpl.init();

	/**
	 * The meta object id for the '{@link loadbalancer.impl.LoadBalancerSystemImpl <em>Load Balancer System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.impl.LoadBalancerSystemImpl
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getLoadBalancerSystem()
	 * @generated
	 */
	int LOAD_BALANCER_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_SYSTEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_SYSTEM__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Clusters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_SYSTEM__CLUSTERS = 3;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_SYSTEM__LISTENERS = 4;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_SYSTEM__ALERTS = 5;

	/**
	 * The number of structural features of the '<em>Load Balancer System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_SYSTEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Load Balancer System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link loadbalancer.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.impl.ClusterImpl
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Max Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__MAX_CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__SERVERS = 2;

	/**
	 * The feature id for the '<em><b>Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__LOAD_BALANCER = 3;

	/**
	 * The feature id for the '<em><b>Health Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__HEALTH_CHECK = 4;

	/**
	 * The feature id for the '<em><b>Scaling Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__SCALING_RULE = 5;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link loadbalancer.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.impl.ServerImpl
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__HOST = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PORT = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Max Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MAX_CONNECTIONS = 4;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ENABLED = 5;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link loadbalancer.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.impl.LoadBalancerImpl
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getLoadBalancer()
	 * @generated
	 */
	int LOAD_BALANCER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Sticky Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__STICKY_SESSION = 2;

	/**
	 * The number of structural features of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link loadbalancer.impl.HealthCheckImpl <em>Health Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.impl.HealthCheckImpl
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getHealthCheck()
	 * @generated
	 */
	int HEALTH_CHECK = 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK__PATH = 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK__INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK__TIMEOUT = 3;

	/**
	 * The feature id for the '<em><b>Thresholds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK__THRESHOLDS = 4;

	/**
	 * The number of structural features of the '<em>Health Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Health Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link loadbalancer.impl.ListenerImpl <em>Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.impl.ListenerImpl
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getListener()
	 * @generated
	 */
	int LISTENER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__PORT = 2;

	/**
	 * The feature id for the '<em><b>Target Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__TARGET_CLUSTER = 3;

	/**
	 * The number of structural features of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link loadbalancer.impl.SessionPersistenceImpl <em>Session Persistence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.impl.SessionPersistenceImpl
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getSessionPersistence()
	 * @generated
	 */
	int SESSION_PERSISTENCE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PERSISTENCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Cookie Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PERSISTENCE__COOKIE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ttl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PERSISTENCE__TTL = 2;

	/**
	 * The number of structural features of the '<em>Session Persistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PERSISTENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Session Persistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_PERSISTENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link loadbalancer.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.impl.AlertImpl
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__METRIC = 1;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__THRESHOLD = 2;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link loadbalancer.impl.ScalingRuleImpl <em>Scaling Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.impl.ScalingRuleImpl
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getScalingRule()
	 * @generated
	 */
	int SCALING_RULE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE__METRIC = 1;

	/**
	 * The feature id for the '<em><b>Scale Up Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE__SCALE_UP_DOWN = 2;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE__MIN_INSTANCES = 3;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE__MAX_INSTANCES = 4;

	/**
	 * The number of structural features of the '<em>Scaling Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scaling Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link loadbalancer.Algorithm <em>Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.Algorithm
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 9;

	/**
	 * The meta object id for the '{@link loadbalancer.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.Protocol
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 10;

	/**
	 * The meta object id for the '{@link loadbalancer.Metric <em>Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.Metric
	 * @see loadbalancer.impl.LoadbalancerPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 11;


	/**
	 * Returns the meta object for class '{@link loadbalancer.LoadBalancerSystem <em>Load Balancer System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancer System</em>'.
	 * @see loadbalancer.LoadBalancerSystem
	 * @generated
	 */
	EClass getLoadBalancerSystem();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.LoadBalancerSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see loadbalancer.LoadBalancerSystem#getName()
	 * @see #getLoadBalancerSystem()
	 * @generated
	 */
	EAttribute getLoadBalancerSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.LoadBalancerSystem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see loadbalancer.LoadBalancerSystem#getDescription()
	 * @see #getLoadBalancerSystem()
	 * @generated
	 */
	EAttribute getLoadBalancerSystem_Description();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.LoadBalancerSystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see loadbalancer.LoadBalancerSystem#getVersion()
	 * @see #getLoadBalancerSystem()
	 * @generated
	 */
	EAttribute getLoadBalancerSystem_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link loadbalancer.LoadBalancerSystem#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clusters</em>'.
	 * @see loadbalancer.LoadBalancerSystem#getClusters()
	 * @see #getLoadBalancerSystem()
	 * @generated
	 */
	EReference getLoadBalancerSystem_Clusters();

	/**
	 * Returns the meta object for the containment reference list '{@link loadbalancer.LoadBalancerSystem#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listeners</em>'.
	 * @see loadbalancer.LoadBalancerSystem#getListeners()
	 * @see #getLoadBalancerSystem()
	 * @generated
	 */
	EReference getLoadBalancerSystem_Listeners();

	/**
	 * Returns the meta object for the containment reference list '{@link loadbalancer.LoadBalancerSystem#getAlerts <em>Alerts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alerts</em>'.
	 * @see loadbalancer.LoadBalancerSystem#getAlerts()
	 * @see #getLoadBalancerSystem()
	 * @generated
	 */
	EReference getLoadBalancerSystem_Alerts();

	/**
	 * Returns the meta object for class '{@link loadbalancer.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see loadbalancer.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Cluster#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see loadbalancer.Cluster#getName()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_Name();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Cluster#getMaxConnections <em>Max Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Connections</em>'.
	 * @see loadbalancer.Cluster#getMaxConnections()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_MaxConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link loadbalancer.Cluster#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see loadbalancer.Cluster#getServers()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Servers();

	/**
	 * Returns the meta object for the containment reference '{@link loadbalancer.Cluster#getLoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load Balancer</em>'.
	 * @see loadbalancer.Cluster#getLoadBalancer()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_LoadBalancer();

	/**
	 * Returns the meta object for the containment reference '{@link loadbalancer.Cluster#getHealthCheck <em>Health Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Health Check</em>'.
	 * @see loadbalancer.Cluster#getHealthCheck()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_HealthCheck();

	/**
	 * Returns the meta object for the containment reference '{@link loadbalancer.Cluster#getScalingRule <em>Scaling Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scaling Rule</em>'.
	 * @see loadbalancer.Cluster#getScalingRule()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_ScalingRule();

	/**
	 * Returns the meta object for class '{@link loadbalancer.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see loadbalancer.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Server#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see loadbalancer.Server#getName()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Server#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see loadbalancer.Server#getHost()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Host();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Server#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see loadbalancer.Server#getPort()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Port();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Server#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see loadbalancer.Server#getWeight()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Weight();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Server#getMaxConnections <em>Max Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Connections</em>'.
	 * @see loadbalancer.Server#getMaxConnections()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_MaxConnections();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Server#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see loadbalancer.Server#isEnabled()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Enabled();

	/**
	 * Returns the meta object for class '{@link loadbalancer.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancer</em>'.
	 * @see loadbalancer.LoadBalancer
	 * @generated
	 */
	EClass getLoadBalancer();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.LoadBalancer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see loadbalancer.LoadBalancer#getName()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EAttribute getLoadBalancer_Name();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.LoadBalancer#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see loadbalancer.LoadBalancer#getAlgorithm()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EAttribute getLoadBalancer_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.LoadBalancer#isStickySession <em>Sticky Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sticky Session</em>'.
	 * @see loadbalancer.LoadBalancer#isStickySession()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EAttribute getLoadBalancer_StickySession();

	/**
	 * Returns the meta object for class '{@link loadbalancer.HealthCheck <em>Health Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Check</em>'.
	 * @see loadbalancer.HealthCheck
	 * @generated
	 */
	EClass getHealthCheck();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.HealthCheck#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see loadbalancer.HealthCheck#getProtocol()
	 * @see #getHealthCheck()
	 * @generated
	 */
	EAttribute getHealthCheck_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.HealthCheck#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see loadbalancer.HealthCheck#getPath()
	 * @see #getHealthCheck()
	 * @generated
	 */
	EAttribute getHealthCheck_Path();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.HealthCheck#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see loadbalancer.HealthCheck#getInterval()
	 * @see #getHealthCheck()
	 * @generated
	 */
	EAttribute getHealthCheck_Interval();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.HealthCheck#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see loadbalancer.HealthCheck#getTimeout()
	 * @see #getHealthCheck()
	 * @generated
	 */
	EAttribute getHealthCheck_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.HealthCheck#getThresholds <em>Thresholds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thresholds</em>'.
	 * @see loadbalancer.HealthCheck#getThresholds()
	 * @see #getHealthCheck()
	 * @generated
	 */
	EAttribute getHealthCheck_Thresholds();

	/**
	 * Returns the meta object for class '{@link loadbalancer.Listener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener</em>'.
	 * @see loadbalancer.Listener
	 * @generated
	 */
	EClass getListener();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Listener#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see loadbalancer.Listener#getName()
	 * @see #getListener()
	 * @generated
	 */
	EAttribute getListener_Name();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Listener#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see loadbalancer.Listener#getProtocol()
	 * @see #getListener()
	 * @generated
	 */
	EAttribute getListener_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Listener#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see loadbalancer.Listener#getPort()
	 * @see #getListener()
	 * @generated
	 */
	EAttribute getListener_Port();

	/**
	 * Returns the meta object for the reference '{@link loadbalancer.Listener#getTargetCluster <em>Target Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Cluster</em>'.
	 * @see loadbalancer.Listener#getTargetCluster()
	 * @see #getListener()
	 * @generated
	 */
	EReference getListener_TargetCluster();

	/**
	 * Returns the meta object for class '{@link loadbalancer.SessionPersistence <em>Session Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Persistence</em>'.
	 * @see loadbalancer.SessionPersistence
	 * @generated
	 */
	EClass getSessionPersistence();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.SessionPersistence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see loadbalancer.SessionPersistence#getType()
	 * @see #getSessionPersistence()
	 * @generated
	 */
	EAttribute getSessionPersistence_Type();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.SessionPersistence#getCookieName <em>Cookie Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookie Name</em>'.
	 * @see loadbalancer.SessionPersistence#getCookieName()
	 * @see #getSessionPersistence()
	 * @generated
	 */
	EAttribute getSessionPersistence_CookieName();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.SessionPersistence#getTtl <em>Ttl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ttl</em>'.
	 * @see loadbalancer.SessionPersistence#getTtl()
	 * @see #getSessionPersistence()
	 * @generated
	 */
	EAttribute getSessionPersistence_Ttl();

	/**
	 * Returns the meta object for class '{@link loadbalancer.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see loadbalancer.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Alert#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see loadbalancer.Alert#getName()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Name();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Alert#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see loadbalancer.Alert#getMetric()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Metric();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.Alert#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see loadbalancer.Alert#getThreshold()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Threshold();

	/**
	 * Returns the meta object for class '{@link loadbalancer.ScalingRule <em>Scaling Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Rule</em>'.
	 * @see loadbalancer.ScalingRule
	 * @generated
	 */
	EClass getScalingRule();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.ScalingRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see loadbalancer.ScalingRule#getName()
	 * @see #getScalingRule()
	 * @generated
	 */
	EAttribute getScalingRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.ScalingRule#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see loadbalancer.ScalingRule#getMetric()
	 * @see #getScalingRule()
	 * @generated
	 */
	EAttribute getScalingRule_Metric();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.ScalingRule#getScaleUpDown <em>Scale Up Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Up Down</em>'.
	 * @see loadbalancer.ScalingRule#getScaleUpDown()
	 * @see #getScalingRule()
	 * @generated
	 */
	EAttribute getScalingRule_ScaleUpDown();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.ScalingRule#getMinInstances <em>Min Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instances</em>'.
	 * @see loadbalancer.ScalingRule#getMinInstances()
	 * @see #getScalingRule()
	 * @generated
	 */
	EAttribute getScalingRule_MinInstances();

	/**
	 * Returns the meta object for the attribute '{@link loadbalancer.ScalingRule#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see loadbalancer.ScalingRule#getMaxInstances()
	 * @see #getScalingRule()
	 * @generated
	 */
	EAttribute getScalingRule_MaxInstances();

	/**
	 * Returns the meta object for enum '{@link loadbalancer.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Algorithm</em>'.
	 * @see loadbalancer.Algorithm
	 * @generated
	 */
	EEnum getAlgorithm();

	/**
	 * Returns the meta object for enum '{@link loadbalancer.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see loadbalancer.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link loadbalancer.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric</em>'.
	 * @see loadbalancer.Metric
	 * @generated
	 */
	EEnum getMetric();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LoadbalancerFactory getLoadbalancerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link loadbalancer.impl.LoadBalancerSystemImpl <em>Load Balancer System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.impl.LoadBalancerSystemImpl
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getLoadBalancerSystem()
		 * @generated
		 */
		EClass LOAD_BALANCER_SYSTEM = eINSTANCE.getLoadBalancerSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_SYSTEM__NAME = eINSTANCE.getLoadBalancerSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_SYSTEM__DESCRIPTION = eINSTANCE.getLoadBalancerSystem_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER_SYSTEM__VERSION = eINSTANCE.getLoadBalancerSystem_Version();

		/**
		 * The meta object literal for the '<em><b>Clusters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER_SYSTEM__CLUSTERS = eINSTANCE.getLoadBalancerSystem_Clusters();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER_SYSTEM__LISTENERS = eINSTANCE.getLoadBalancerSystem_Listeners();

		/**
		 * The meta object literal for the '<em><b>Alerts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER_SYSTEM__ALERTS = eINSTANCE.getLoadBalancerSystem_Alerts();

		/**
		 * The meta object literal for the '{@link loadbalancer.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.impl.ClusterImpl
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__NAME = eINSTANCE.getCluster_Name();

		/**
		 * The meta object literal for the '<em><b>Max Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__MAX_CONNECTIONS = eINSTANCE.getCluster_MaxConnections();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__SERVERS = eINSTANCE.getCluster_Servers();

		/**
		 * The meta object literal for the '<em><b>Load Balancer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__LOAD_BALANCER = eINSTANCE.getCluster_LoadBalancer();

		/**
		 * The meta object literal for the '<em><b>Health Check</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__HEALTH_CHECK = eINSTANCE.getCluster_HealthCheck();

		/**
		 * The meta object literal for the '<em><b>Scaling Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__SCALING_RULE = eINSTANCE.getCluster_ScalingRule();

		/**
		 * The meta object literal for the '{@link loadbalancer.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.impl.ServerImpl
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__NAME = eINSTANCE.getServer_Name();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__HOST = eINSTANCE.getServer_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__PORT = eINSTANCE.getServer_Port();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__WEIGHT = eINSTANCE.getServer_Weight();

		/**
		 * The meta object literal for the '<em><b>Max Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__MAX_CONNECTIONS = eINSTANCE.getServer_MaxConnections();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__ENABLED = eINSTANCE.getServer_Enabled();

		/**
		 * The meta object literal for the '{@link loadbalancer.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.impl.LoadBalancerImpl
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getLoadBalancer()
		 * @generated
		 */
		EClass LOAD_BALANCER = eINSTANCE.getLoadBalancer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER__NAME = eINSTANCE.getLoadBalancer_Name();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER__ALGORITHM = eINSTANCE.getLoadBalancer_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Sticky Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER__STICKY_SESSION = eINSTANCE.getLoadBalancer_StickySession();

		/**
		 * The meta object literal for the '{@link loadbalancer.impl.HealthCheckImpl <em>Health Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.impl.HealthCheckImpl
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getHealthCheck()
		 * @generated
		 */
		EClass HEALTH_CHECK = eINSTANCE.getHealthCheck();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_CHECK__PROTOCOL = eINSTANCE.getHealthCheck_Protocol();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_CHECK__PATH = eINSTANCE.getHealthCheck_Path();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_CHECK__INTERVAL = eINSTANCE.getHealthCheck_Interval();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_CHECK__TIMEOUT = eINSTANCE.getHealthCheck_Timeout();

		/**
		 * The meta object literal for the '<em><b>Thresholds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_CHECK__THRESHOLDS = eINSTANCE.getHealthCheck_Thresholds();

		/**
		 * The meta object literal for the '{@link loadbalancer.impl.ListenerImpl <em>Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.impl.ListenerImpl
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getListener()
		 * @generated
		 */
		EClass LISTENER = eINSTANCE.getListener();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER__NAME = eINSTANCE.getListener_Name();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER__PROTOCOL = eINSTANCE.getListener_Protocol();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER__PORT = eINSTANCE.getListener_Port();

		/**
		 * The meta object literal for the '<em><b>Target Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER__TARGET_CLUSTER = eINSTANCE.getListener_TargetCluster();

		/**
		 * The meta object literal for the '{@link loadbalancer.impl.SessionPersistenceImpl <em>Session Persistence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.impl.SessionPersistenceImpl
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getSessionPersistence()
		 * @generated
		 */
		EClass SESSION_PERSISTENCE = eINSTANCE.getSessionPersistence();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_PERSISTENCE__TYPE = eINSTANCE.getSessionPersistence_Type();

		/**
		 * The meta object literal for the '<em><b>Cookie Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_PERSISTENCE__COOKIE_NAME = eINSTANCE.getSessionPersistence_CookieName();

		/**
		 * The meta object literal for the '<em><b>Ttl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_PERSISTENCE__TTL = eINSTANCE.getSessionPersistence_Ttl();

		/**
		 * The meta object literal for the '{@link loadbalancer.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.impl.AlertImpl
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__NAME = eINSTANCE.getAlert_Name();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__METRIC = eINSTANCE.getAlert_Metric();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__THRESHOLD = eINSTANCE.getAlert_Threshold();

		/**
		 * The meta object literal for the '{@link loadbalancer.impl.ScalingRuleImpl <em>Scaling Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.impl.ScalingRuleImpl
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getScalingRule()
		 * @generated
		 */
		EClass SCALING_RULE = eINSTANCE.getScalingRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_RULE__NAME = eINSTANCE.getScalingRule_Name();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_RULE__METRIC = eINSTANCE.getScalingRule_Metric();

		/**
		 * The meta object literal for the '<em><b>Scale Up Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_RULE__SCALE_UP_DOWN = eINSTANCE.getScalingRule_ScaleUpDown();

		/**
		 * The meta object literal for the '<em><b>Min Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_RULE__MIN_INSTANCES = eINSTANCE.getScalingRule_MinInstances();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_RULE__MAX_INSTANCES = eINSTANCE.getScalingRule_MaxInstances();

		/**
		 * The meta object literal for the '{@link loadbalancer.Algorithm <em>Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.Algorithm
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getAlgorithm()
		 * @generated
		 */
		EEnum ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '{@link loadbalancer.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.Protocol
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link loadbalancer.Metric <em>Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see loadbalancer.Metric
		 * @see loadbalancer.impl.LoadbalancerPackageImpl#getMetric()
		 * @generated
		 */
		EEnum METRIC = eINSTANCE.getMetric();

	}

} //LoadbalancerPackage
