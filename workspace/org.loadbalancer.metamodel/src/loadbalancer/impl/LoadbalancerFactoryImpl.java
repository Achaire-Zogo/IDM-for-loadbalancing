/**
 */
package loadbalancer.impl;

import loadbalancer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadbalancerFactoryImpl extends EFactoryImpl implements LoadbalancerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadbalancerFactory init() {
		try {
			LoadbalancerFactory theLoadbalancerFactory = (LoadbalancerFactory)EPackage.Registry.INSTANCE.getEFactory(LoadbalancerPackage.eNS_URI);
			if (theLoadbalancerFactory != null) {
				return theLoadbalancerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LoadbalancerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadbalancerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM: return createLoadBalancerSystem();
			case LoadbalancerPackage.CLUSTER: return createCluster();
			case LoadbalancerPackage.SERVER: return createServer();
			case LoadbalancerPackage.LOAD_BALANCER: return createLoadBalancer();
			case LoadbalancerPackage.HEALTH_CHECK: return createHealthCheck();
			case LoadbalancerPackage.LISTENER: return createListener();
			case LoadbalancerPackage.SESSION_PERSISTENCE: return createSessionPersistence();
			case LoadbalancerPackage.ALERT: return createAlert();
			case LoadbalancerPackage.SCALING_RULE: return createScalingRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LoadbalancerPackage.ALGORITHM:
				return createAlgorithmFromString(eDataType, initialValue);
			case LoadbalancerPackage.PROTOCOL:
				return createProtocolFromString(eDataType, initialValue);
			case LoadbalancerPackage.PERSISTENCE_TYPE:
				return createPersistenceTypeFromString(eDataType, initialValue);
			case LoadbalancerPackage.METRIC:
				return createMetricFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LoadbalancerPackage.ALGORITHM:
				return convertAlgorithmToString(eDataType, instanceValue);
			case LoadbalancerPackage.PROTOCOL:
				return convertProtocolToString(eDataType, instanceValue);
			case LoadbalancerPackage.PERSISTENCE_TYPE:
				return convertPersistenceTypeToString(eDataType, instanceValue);
			case LoadbalancerPackage.METRIC:
				return convertMetricToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalancerSystem createLoadBalancerSystem() {
		LoadBalancerSystemImpl loadBalancerSystem = new LoadBalancerSystemImpl();
		return loadBalancerSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalancer createLoadBalancer() {
		LoadBalancerImpl loadBalancer = new LoadBalancerImpl();
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthCheck createHealthCheck() {
		HealthCheckImpl healthCheck = new HealthCheckImpl();
		return healthCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Listener createListener() {
		ListenerImpl listener = new ListenerImpl();
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SessionPersistence createSessionPersistence() {
		SessionPersistenceImpl sessionPersistence = new SessionPersistenceImpl();
		return sessionPersistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alert createAlert() {
		AlertImpl alert = new AlertImpl();
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalingRule createScalingRule() {
		ScalingRuleImpl scalingRule = new ScalingRuleImpl();
		return scalingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithm createAlgorithmFromString(EDataType eDataType, String initialValue) {
		Algorithm result = Algorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlgorithmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceType createPersistenceTypeFromString(EDataType eDataType, String initialValue) {
		PersistenceType result = PersistenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetricFromString(EDataType eDataType, String initialValue) {
		Metric result = Metric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadbalancerPackage getLoadbalancerPackage() {
		return (LoadbalancerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LoadbalancerPackage getPackage() {
		return LoadbalancerPackage.eINSTANCE;
	}

} //LoadbalancerFactoryImpl
