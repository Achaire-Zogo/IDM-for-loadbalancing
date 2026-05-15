/**
 */
package loadbalancer.util;

import java.util.Map;

import loadbalancer.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see loadbalancer.LoadbalancerPackage
 * @generated
 */
public class LoadbalancerValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LoadbalancerValidator INSTANCE = new LoadbalancerValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "loadbalancer";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Listener Ports' of 'Load Balancer System'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOAD_BALANCER_SYSTEM__UNIQUE_LISTENER_PORTS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Least One Listener' of 'Load Balancer System'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOAD_BALANCER_SYSTEM__AT_LEAST_ONE_LISTENER = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Empty Cluster' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__NON_EMPTY_CLUSTER = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Least One Enabled Server' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__AT_LEAST_ONE_ENABLED_SERVER = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Server Names' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__UNIQUE_SERVER_NAMES = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Weighted Requires Weights' of 'Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLUSTER__WEIGHTED_REQUIRES_WEIGHTS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Port' of 'Server'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVER__VALID_PORT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Weight' of 'Server'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVER__POSITIVE_WEIGHT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Interval Greater Than Timeout' of 'Health Check'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTH_CHECK__INTERVAL_GREATER_THAN_TIMEOUT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Listener Port' of 'Listener'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LISTENER__VALID_LISTENER_PORT = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cookie Requires Name' of 'Session Persistence'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SESSION_PERSISTENCE__COOKIE_REQUIRES_NAME = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Min Less Or Equal Max' of 'Scaling Rule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCALING_RULE__MIN_LESS_OR_EQUAL_MAX = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Scale Up Greater Than Down' of 'Scaling Rule'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCALING_RULE__SCALE_UP_GREATER_THAN_DOWN = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadbalancerValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LoadbalancerPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM:
				return validateLoadBalancerSystem((LoadBalancerSystem)value, diagnostics, context);
			case LoadbalancerPackage.CLUSTER:
				return validateCluster((Cluster)value, diagnostics, context);
			case LoadbalancerPackage.SERVER:
				return validateServer((Server)value, diagnostics, context);
			case LoadbalancerPackage.LOAD_BALANCER:
				return validateLoadBalancer((LoadBalancer)value, diagnostics, context);
			case LoadbalancerPackage.HEALTH_CHECK:
				return validateHealthCheck((HealthCheck)value, diagnostics, context);
			case LoadbalancerPackage.LISTENER:
				return validateListener((Listener)value, diagnostics, context);
			case LoadbalancerPackage.SESSION_PERSISTENCE:
				return validateSessionPersistence((SessionPersistence)value, diagnostics, context);
			case LoadbalancerPackage.ALERT:
				return validateAlert((Alert)value, diagnostics, context);
			case LoadbalancerPackage.SCALING_RULE:
				return validateScalingRule((ScalingRule)value, diagnostics, context);
			case LoadbalancerPackage.ALGORITHM:
				return validateAlgorithm((Algorithm)value, diagnostics, context);
			case LoadbalancerPackage.PROTOCOL:
				return validateProtocol((Protocol)value, diagnostics, context);
			case LoadbalancerPackage.PERSISTENCE_TYPE:
				return validatePersistenceType((PersistenceType)value, diagnostics, context);
			case LoadbalancerPackage.METRIC:
				return validateMetric((Metric)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancerSystem(LoadBalancerSystem loadBalancerSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loadBalancerSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loadBalancerSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loadBalancerSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loadBalancerSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loadBalancerSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loadBalancerSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loadBalancerSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loadBalancerSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loadBalancerSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancerSystem_atLeastOneListener(loadBalancerSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancerSystem_uniqueListenerPorts(loadBalancerSystem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the atLeastOneListener constraint of '<em>Load Balancer System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancerSystem_atLeastOneListener(LoadBalancerSystem loadBalancerSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return loadBalancerSystem.atLeastOneListener(diagnostics, context);
	}

	/**
	 * Validates the uniqueListenerPorts constraint of '<em>Load Balancer System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancerSystem_uniqueListenerPorts(LoadBalancerSystem loadBalancerSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return loadBalancerSystem.uniqueListenerPorts(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cluster, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_weightedRequiresWeights(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_nonEmptyCluster(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_atLeastOneEnabledServer(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_uniqueServerNames(cluster, diagnostics, context);
		return result;
	}

	/**
	 * Validates the weightedRequiresWeights constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_weightedRequiresWeights(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.weightedRequiresWeights(diagnostics, context);
	}

	/**
	 * Validates the nonEmptyCluster constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_nonEmptyCluster(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.nonEmptyCluster(diagnostics, context);
	}

	/**
	 * Validates the atLeastOneEnabledServer constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_atLeastOneEnabledServer(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.atLeastOneEnabledServer(diagnostics, context);
	}

	/**
	 * Validates the uniqueServerNames constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_uniqueServerNames(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cluster.uniqueServerNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(server, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= validateServer_positiveWeight(server, diagnostics, context);
		if (result || diagnostics != null) result &= validateServer_validPort(server, diagnostics, context);
		return result;
	}

	/**
	 * Validates the positiveWeight constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_positiveWeight(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return server.positiveWeight(diagnostics, context);
	}

	/**
	 * Validates the validPort constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_validPort(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return server.validPort(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancer(LoadBalancer loadBalancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadBalancer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthCheck(HealthCheck healthCheck, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthCheck, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(healthCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(healthCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(healthCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(healthCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(healthCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(healthCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(healthCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(healthCheck, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthCheck_intervalGreaterThanTimeout(healthCheck, diagnostics, context);
		return result;
	}

	/**
	 * Validates the intervalGreaterThanTimeout constraint of '<em>Health Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthCheck_intervalGreaterThanTimeout(HealthCheck healthCheck, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthCheck.intervalGreaterThanTimeout(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListener(Listener listener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listener, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listener, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listener, diagnostics, context);
		if (result || diagnostics != null) result &= validateListener_validListenerPort(listener, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validListenerPort constraint of '<em>Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListener_validListenerPort(Listener listener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return listener.validListenerPort(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionPersistence(SessionPersistence sessionPersistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sessionPersistence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sessionPersistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sessionPersistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sessionPersistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sessionPersistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sessionPersistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sessionPersistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sessionPersistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sessionPersistence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSessionPersistence_cookieRequiresName(sessionPersistence, diagnostics, context);
		return result;
	}

	/**
	 * Validates the cookieRequiresName constraint of '<em>Session Persistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionPersistence_cookieRequiresName(SessionPersistence sessionPersistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sessionPersistence.cookieRequiresName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlert(Alert alert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingRule(ScalingRule scalingRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scalingRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scalingRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scalingRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scalingRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scalingRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scalingRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scalingRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scalingRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scalingRule, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalingRule_scaleUpGreaterThanDown(scalingRule, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalingRule_minLessOrEqualMax(scalingRule, diagnostics, context);
		return result;
	}

	/**
	 * Validates the scaleUpGreaterThanDown constraint of '<em>Scaling Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingRule_scaleUpGreaterThanDown(ScalingRule scalingRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scalingRule.scaleUpGreaterThanDown(diagnostics, context);
	}

	/**
	 * Validates the minLessOrEqualMax constraint of '<em>Scaling Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingRule_minLessOrEqualMax(ScalingRule scalingRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scalingRule.minLessOrEqualMax(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithm(Algorithm algorithm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceType(PersistenceType persistenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetric(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LoadbalancerValidator
