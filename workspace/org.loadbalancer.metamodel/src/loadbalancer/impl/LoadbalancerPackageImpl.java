/**
 */
package loadbalancer.impl;

import loadbalancer.Alert;
import loadbalancer.Algorithm;
import loadbalancer.Cluster;
import loadbalancer.HealthCheck;
import loadbalancer.Listener;
import loadbalancer.LoadBalancer;
import loadbalancer.LoadBalancerSystem;
import loadbalancer.LoadbalancerFactory;
import loadbalancer.LoadbalancerPackage;
import loadbalancer.Metric;
import loadbalancer.PersistenceType;
import loadbalancer.Protocol;
import loadbalancer.ScalingRule;
import loadbalancer.Server;
import loadbalancer.SessionPersistence;

import loadbalancer.util.LoadbalancerValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadbalancerPackageImpl extends EPackageImpl implements LoadbalancerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBalancerSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBalancerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionPersistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum algorithmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see loadbalancer.LoadbalancerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LoadbalancerPackageImpl() {
		super(eNS_URI, LoadbalancerFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LoadbalancerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LoadbalancerPackage init() {
		if (isInited) return (LoadbalancerPackage)EPackage.Registry.INSTANCE.getEPackage(LoadbalancerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLoadbalancerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LoadbalancerPackageImpl theLoadbalancerPackage = registeredLoadbalancerPackage instanceof LoadbalancerPackageImpl ? (LoadbalancerPackageImpl)registeredLoadbalancerPackage : new LoadbalancerPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLoadbalancerPackage.createPackageContents();

		// Initialize created meta-data
		theLoadbalancerPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLoadbalancerPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return LoadbalancerValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLoadbalancerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LoadbalancerPackage.eNS_URI, theLoadbalancerPackage);
		return theLoadbalancerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoadBalancerSystem() {
		return loadBalancerSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadBalancerSystem_Name() {
		return (EAttribute)loadBalancerSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadBalancerSystem_Description() {
		return (EAttribute)loadBalancerSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadBalancerSystem_Version() {
		return (EAttribute)loadBalancerSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadBalancerSystem_Clusters() {
		return (EReference)loadBalancerSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadBalancerSystem_Listeners() {
		return (EReference)loadBalancerSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadBalancerSystem_Alerts() {
		return (EReference)loadBalancerSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLoadBalancerSystem__UniqueListenerPorts__DiagnosticChain_Map() {
		return loadBalancerSystemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLoadBalancerSystem__AtLeastOneListener__DiagnosticChain_Map() {
		return loadBalancerSystemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCluster_Name() {
		return (EAttribute)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCluster_MaxConnections() {
		return (EAttribute)clusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_Servers() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_LoadBalancer() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_HealthCheck() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_ScalingRule() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCluster__NonEmptyCluster__DiagnosticChain_Map() {
		return clusterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCluster__AtLeastOneEnabledServer__DiagnosticChain_Map() {
		return clusterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCluster__UniqueServerNames__DiagnosticChain_Map() {
		return clusterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCluster__WeightedRequiresWeights__DiagnosticChain_Map() {
		return clusterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_Name() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_Host() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_Port() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_Weight() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_MaxConnections() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_Enabled() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getServer__ValidPort__DiagnosticChain_Map() {
		return serverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getServer__PositiveWeight__DiagnosticChain_Map() {
		return serverEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoadBalancer() {
		return loadBalancerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadBalancer_Name() {
		return (EAttribute)loadBalancerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadBalancer_Algorithm() {
		return (EAttribute)loadBalancerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadBalancer_StickySession() {
		return (EAttribute)loadBalancerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadBalancer_SessionPersistence() {
		return (EReference)loadBalancerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthCheck() {
		return healthCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHealthCheck_Protocol() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHealthCheck_Path() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHealthCheck_Interval() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHealthCheck_Timeout() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHealthCheck_HealthyThreshold() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHealthCheck_UnhealthyThreshold() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHealthCheck__IntervalGreaterThanTimeout__DiagnosticChain_Map() {
		return healthCheckEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListener() {
		return listenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListener_Name() {
		return (EAttribute)listenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListener_Protocol() {
		return (EAttribute)listenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListener_Port() {
		return (EAttribute)listenerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListener_TargetCluster() {
		return (EReference)listenerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getListener__ValidListenerPort__DiagnosticChain_Map() {
		return listenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSessionPersistence() {
		return sessionPersistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSessionPersistence_Type() {
		return (EAttribute)sessionPersistenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSessionPersistence_CookieName() {
		return (EAttribute)sessionPersistenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSessionPersistence_Ttl() {
		return (EAttribute)sessionPersistenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSessionPersistence__CookieRequiresName__DiagnosticChain_Map() {
		return sessionPersistenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlert() {
		return alertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlert_Name() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlert_Metric() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlert_Threshold() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlert_Action() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScalingRule() {
		return scalingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalingRule_Name() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalingRule_Metric() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalingRule_ScaleUpThreshold() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalingRule_ScaleDownThreshold() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalingRule_MinInstances() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalingRule_MaxInstances() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScalingRule__MinLessOrEqualMax__DiagnosticChain_Map() {
		return scalingRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScalingRule__ScaleUpGreaterThanDown__DiagnosticChain_Map() {
		return scalingRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAlgorithm() {
		return algorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProtocol() {
		return protocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPersistenceType() {
		return persistenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMetric() {
		return metricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadbalancerFactory getLoadbalancerFactory() {
		return (LoadbalancerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		loadBalancerSystemEClass = createEClass(LOAD_BALANCER_SYSTEM);
		createEAttribute(loadBalancerSystemEClass, LOAD_BALANCER_SYSTEM__NAME);
		createEAttribute(loadBalancerSystemEClass, LOAD_BALANCER_SYSTEM__DESCRIPTION);
		createEAttribute(loadBalancerSystemEClass, LOAD_BALANCER_SYSTEM__VERSION);
		createEReference(loadBalancerSystemEClass, LOAD_BALANCER_SYSTEM__CLUSTERS);
		createEReference(loadBalancerSystemEClass, LOAD_BALANCER_SYSTEM__LISTENERS);
		createEReference(loadBalancerSystemEClass, LOAD_BALANCER_SYSTEM__ALERTS);
		createEOperation(loadBalancerSystemEClass, LOAD_BALANCER_SYSTEM___UNIQUE_LISTENER_PORTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(loadBalancerSystemEClass, LOAD_BALANCER_SYSTEM___AT_LEAST_ONE_LISTENER__DIAGNOSTICCHAIN_MAP);

		clusterEClass = createEClass(CLUSTER);
		createEAttribute(clusterEClass, CLUSTER__NAME);
		createEAttribute(clusterEClass, CLUSTER__MAX_CONNECTIONS);
		createEReference(clusterEClass, CLUSTER__SERVERS);
		createEReference(clusterEClass, CLUSTER__LOAD_BALANCER);
		createEReference(clusterEClass, CLUSTER__HEALTH_CHECK);
		createEReference(clusterEClass, CLUSTER__SCALING_RULE);
		createEOperation(clusterEClass, CLUSTER___NON_EMPTY_CLUSTER__DIAGNOSTICCHAIN_MAP);
		createEOperation(clusterEClass, CLUSTER___AT_LEAST_ONE_ENABLED_SERVER__DIAGNOSTICCHAIN_MAP);
		createEOperation(clusterEClass, CLUSTER___UNIQUE_SERVER_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(clusterEClass, CLUSTER___WEIGHTED_REQUIRES_WEIGHTS__DIAGNOSTICCHAIN_MAP);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__NAME);
		createEAttribute(serverEClass, SERVER__HOST);
		createEAttribute(serverEClass, SERVER__PORT);
		createEAttribute(serverEClass, SERVER__WEIGHT);
		createEAttribute(serverEClass, SERVER__MAX_CONNECTIONS);
		createEAttribute(serverEClass, SERVER__ENABLED);
		createEOperation(serverEClass, SERVER___VALID_PORT__DIAGNOSTICCHAIN_MAP);
		createEOperation(serverEClass, SERVER___POSITIVE_WEIGHT__DIAGNOSTICCHAIN_MAP);

		loadBalancerEClass = createEClass(LOAD_BALANCER);
		createEAttribute(loadBalancerEClass, LOAD_BALANCER__NAME);
		createEAttribute(loadBalancerEClass, LOAD_BALANCER__ALGORITHM);
		createEAttribute(loadBalancerEClass, LOAD_BALANCER__STICKY_SESSION);
		createEReference(loadBalancerEClass, LOAD_BALANCER__SESSION_PERSISTENCE);

		healthCheckEClass = createEClass(HEALTH_CHECK);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__PROTOCOL);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__PATH);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__INTERVAL);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__TIMEOUT);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__HEALTHY_THRESHOLD);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__UNHEALTHY_THRESHOLD);
		createEOperation(healthCheckEClass, HEALTH_CHECK___INTERVAL_GREATER_THAN_TIMEOUT__DIAGNOSTICCHAIN_MAP);

		listenerEClass = createEClass(LISTENER);
		createEAttribute(listenerEClass, LISTENER__NAME);
		createEAttribute(listenerEClass, LISTENER__PROTOCOL);
		createEAttribute(listenerEClass, LISTENER__PORT);
		createEReference(listenerEClass, LISTENER__TARGET_CLUSTER);
		createEOperation(listenerEClass, LISTENER___VALID_LISTENER_PORT__DIAGNOSTICCHAIN_MAP);

		sessionPersistenceEClass = createEClass(SESSION_PERSISTENCE);
		createEAttribute(sessionPersistenceEClass, SESSION_PERSISTENCE__TYPE);
		createEAttribute(sessionPersistenceEClass, SESSION_PERSISTENCE__COOKIE_NAME);
		createEAttribute(sessionPersistenceEClass, SESSION_PERSISTENCE__TTL);
		createEOperation(sessionPersistenceEClass, SESSION_PERSISTENCE___COOKIE_REQUIRES_NAME__DIAGNOSTICCHAIN_MAP);

		alertEClass = createEClass(ALERT);
		createEAttribute(alertEClass, ALERT__NAME);
		createEAttribute(alertEClass, ALERT__METRIC);
		createEAttribute(alertEClass, ALERT__THRESHOLD);
		createEAttribute(alertEClass, ALERT__ACTION);

		scalingRuleEClass = createEClass(SCALING_RULE);
		createEAttribute(scalingRuleEClass, SCALING_RULE__NAME);
		createEAttribute(scalingRuleEClass, SCALING_RULE__METRIC);
		createEAttribute(scalingRuleEClass, SCALING_RULE__SCALE_UP_THRESHOLD);
		createEAttribute(scalingRuleEClass, SCALING_RULE__SCALE_DOWN_THRESHOLD);
		createEAttribute(scalingRuleEClass, SCALING_RULE__MIN_INSTANCES);
		createEAttribute(scalingRuleEClass, SCALING_RULE__MAX_INSTANCES);
		createEOperation(scalingRuleEClass, SCALING_RULE___MIN_LESS_OR_EQUAL_MAX__DIAGNOSTICCHAIN_MAP);
		createEOperation(scalingRuleEClass, SCALING_RULE___SCALE_UP_GREATER_THAN_DOWN__DIAGNOSTICCHAIN_MAP);

		// Create enums
		algorithmEEnum = createEEnum(ALGORITHM);
		protocolEEnum = createEEnum(PROTOCOL);
		persistenceTypeEEnum = createEEnum(PERSISTENCE_TYPE);
		metricEEnum = createEEnum(METRIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(loadBalancerSystemEClass, LoadBalancerSystem.class, "LoadBalancerSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadBalancerSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, LoadBalancerSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancerSystem_Description(), ecorePackage.getEString(), "description", null, 0, 1, LoadBalancerSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancerSystem_Version(), ecorePackage.getEString(), "version", null, 0, 1, LoadBalancerSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadBalancerSystem_Clusters(), this.getCluster(), null, "clusters", null, 0, -1, LoadBalancerSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadBalancerSystem_Listeners(), this.getListener(), null, "listeners", null, 0, -1, LoadBalancerSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadBalancerSystem_Alerts(), this.getAlert(), null, "alerts", null, 0, -1, LoadBalancerSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLoadBalancerSystem__UniqueListenerPorts__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueListenerPorts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLoadBalancerSystem__AtLeastOneListener__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "atLeastOneListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCluster_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCluster_MaxConnections(), ecorePackage.getEInt(), "maxConnections", null, 1, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_Servers(), this.getServer(), null, "servers", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_LoadBalancer(), this.getLoadBalancer(), null, "loadBalancer", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_HealthCheck(), this.getHealthCheck(), null, "healthCheck", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_ScalingRule(), this.getScalingRule(), null, "scalingRule", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCluster__NonEmptyCluster__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonEmptyCluster", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCluster__AtLeastOneEnabledServer__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "atLeastOneEnabledServer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCluster__UniqueServerNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueServerNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCluster__WeightedRequiresWeights__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "weightedRequiresWeights", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Host(), ecorePackage.getEString(), "host", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Port(), ecorePackage.getEInt(), "port", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Weight(), ecorePackage.getEInt(), "weight", "1", 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_MaxConnections(), ecorePackage.getEInt(), "maxConnections", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getServer__ValidPort__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getServer__PositiveWeight__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "positiveWeight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loadBalancerEClass, LoadBalancer.class, "LoadBalancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadBalancer_Name(), ecorePackage.getEString(), "name", null, 0, 1, LoadBalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancer_Algorithm(), this.getAlgorithm(), "algorithm", null, 0, 1, LoadBalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadBalancer_StickySession(), ecorePackage.getEBoolean(), "stickySession", null, 1, 1, LoadBalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadBalancer_SessionPersistence(), this.getSessionPersistence(), null, "sessionPersistence", null, 0, 1, LoadBalancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healthCheckEClass, HealthCheck.class, "HealthCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealthCheck_Protocol(), this.getProtocol(), "protocol", null, 0, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthCheck_Path(), ecorePackage.getEString(), "path", null, 0, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthCheck_Interval(), ecorePackage.getEInt(), "interval", null, 1, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthCheck_Timeout(), ecorePackage.getEInt(), "timeout", null, 1, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthCheck_HealthyThreshold(), ecorePackage.getEInt(), "healthyThreshold", null, 0, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthCheck_UnhealthyThreshold(), ecorePackage.getEInt(), "unhealthyThreshold", null, 0, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getHealthCheck__IntervalGreaterThanTimeout__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "intervalGreaterThanTimeout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listenerEClass, Listener.class, "Listener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListener_Name(), ecorePackage.getEString(), "name", null, 0, 1, Listener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListener_Protocol(), this.getProtocol(), "protocol", null, 0, 1, Listener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListener_Port(), ecorePackage.getEInt(), "port", null, 1, 1, Listener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListener_TargetCluster(), this.getCluster(), null, "targetCluster", null, 0, 1, Listener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getListener__ValidListenerPort__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validListenerPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sessionPersistenceEClass, SessionPersistence.class, "SessionPersistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSessionPersistence_Type(), this.getPersistenceType(), "type", null, 0, 1, SessionPersistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionPersistence_CookieName(), ecorePackage.getEString(), "cookieName", null, 0, 1, SessionPersistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionPersistence_Ttl(), ecorePackage.getEInt(), "ttl", null, 1, 1, SessionPersistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSessionPersistence__CookieRequiresName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cookieRequiresName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(alertEClass, Alert.class, "Alert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlert_Name(), ecorePackage.getEString(), "name", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlert_Metric(), this.getMetric(), "metric", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlert_Threshold(), ecorePackage.getEDouble(), "threshold", null, 1, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlert_Action(), ecorePackage.getEString(), "action", null, 1, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalingRuleEClass, ScalingRule.class, "ScalingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScalingRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingRule_Metric(), this.getMetric(), "metric", null, 0, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingRule_ScaleUpThreshold(), ecorePackage.getEDouble(), "scaleUpThreshold", null, 1, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingRule_ScaleDownThreshold(), ecorePackage.getEDouble(), "scaleDownThreshold", null, 1, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingRule_MinInstances(), ecorePackage.getEInt(), "minInstances", null, 1, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingRule_MaxInstances(), ecorePackage.getEInt(), "maxInstances", null, 1, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getScalingRule__MinLessOrEqualMax__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "minLessOrEqualMax", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getScalingRule__ScaleUpGreaterThanDown__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "scaleUpGreaterThanDown", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(algorithmEEnum, Algorithm.class, "Algorithm");
		addEEnumLiteral(algorithmEEnum, Algorithm.ROUND_ROBIN);
		addEEnumLiteral(algorithmEEnum, Algorithm.WEIGHTED_ROUND_ROBIN);
		addEEnumLiteral(algorithmEEnum, Algorithm.LEAST_CONNECTIONS);
		addEEnumLiteral(algorithmEEnum, Algorithm.IP_HASH);
		addEEnumLiteral(algorithmEEnum, Algorithm.RANDOM);

		initEEnum(protocolEEnum, Protocol.class, "Protocol");
		addEEnumLiteral(protocolEEnum, Protocol.HTTP);
		addEEnumLiteral(protocolEEnum, Protocol.HTTPS);
		addEEnumLiteral(protocolEEnum, Protocol.TCP);

		initEEnum(persistenceTypeEEnum, PersistenceType.class, "PersistenceType");
		addEEnumLiteral(persistenceTypeEEnum, PersistenceType.COOKIE);
		addEEnumLiteral(persistenceTypeEEnum, PersistenceType.IP);
		addEEnumLiteral(persistenceTypeEEnum, PersistenceType.HEADER);

		initEEnum(metricEEnum, Metric.class, "Metric");
		addEEnumLiteral(metricEEnum, Metric.CPU_USAGE);
		addEEnumLiteral(metricEEnum, Metric.MEMORY_USAGE);
		addEEnumLiteral(metricEEnum, Metric.REQUEST_COUNT);
		addEEnumLiteral(metricEEnum, Metric.RESPONSE_TIME);
		addEEnumLiteral(metricEEnum, Metric.ERROR_RATE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (loadBalancerSystemEClass,
		   source,
		   new String[] {
			   "constraints", "atLeastOneListener"
		   });
		addAnnotation
		  (clusterEClass,
		   source,
		   new String[] {
			   "constraints", "weightedRequiresWeights"
		   });
		addAnnotation
		  (serverEClass,
		   source,
		   new String[] {
			   "constraints", "positiveWeight"
		   });
		addAnnotation
		  (healthCheckEClass,
		   source,
		   new String[] {
			   "constraints", "intervalGreaterThanTimeout"
		   });
		addAnnotation
		  (listenerEClass,
		   source,
		   new String[] {
			   "constraints", "validListenerPort"
		   });
		addAnnotation
		  (sessionPersistenceEClass,
		   source,
		   new String[] {
			   "constraints", "cookieRequiresName"
		   });
		addAnnotation
		  (scalingRuleEClass,
		   source,
		   new String[] {
			   "constraints", "scaleUpGreaterThanDown"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getLoadBalancerSystem__UniqueListenerPorts__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.listeners->isUnique(l | l.port)"
		   });
		addAnnotation
		  (getLoadBalancerSystem__AtLeastOneListener__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.listeners->size() >= 1"
		   });
		addAnnotation
		  (getCluster__NonEmptyCluster__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.servers->notEmpty()"
		   });
		addAnnotation
		  (getCluster__AtLeastOneEnabledServer__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.servers->exists(s | s.enabled = true)"
		   });
		addAnnotation
		  (getCluster__UniqueServerNames__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.servers->isUnique(s | s.name)"
		   });
		addAnnotation
		  (getCluster__WeightedRequiresWeights__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.loadBalancer.algorithm = Algorithm::WEIGHTED_ROUND_ROBIN\n\t\t\t\timplies self.servers->forAll(s | s.weight >= 1)"
		   });
		addAnnotation
		  (getServer__ValidPort__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.port >= 1 and self.port <= 65535"
		   });
		addAnnotation
		  (getServer__PositiveWeight__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.weight >= 1"
		   });
		addAnnotation
		  (getHealthCheck__IntervalGreaterThanTimeout__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.interval > self.timeout"
		   });
		addAnnotation
		  (getListener__ValidListenerPort__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.port >= 1 and self.port <= 65535"
		   });
		addAnnotation
		  (getSessionPersistence__CookieRequiresName__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.type = PersistenceType::COOKIE implies\n\t\t\t\tself.cookieName <> \'\' and self.cookieName <> null"
		   });
		addAnnotation
		  (getScalingRule__MinLessOrEqualMax__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.minInstances <= self.maxInstances"
		   });
		addAnnotation
		  (getScalingRule__ScaleUpGreaterThanDown__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.scaleUpThreshold > self.scaleDownThreshold"
		   });
	}

} //LoadbalancerPackageImpl
