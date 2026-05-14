/**
 */
package loadbalancer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see loadbalancer.LoadbalancerPackage
 * @generated
 */
public interface LoadbalancerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoadbalancerFactory eINSTANCE = loadbalancer.impl.LoadbalancerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Load Balancer System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balancer System</em>'.
	 * @generated
	 */
	LoadBalancerSystem createLoadBalancerSystem();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	Cluster createCluster();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Load Balancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balancer</em>'.
	 * @generated
	 */
	LoadBalancer createLoadBalancer();

	/**
	 * Returns a new object of class '<em>Health Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Check</em>'.
	 * @generated
	 */
	HealthCheck createHealthCheck();

	/**
	 * Returns a new object of class '<em>Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listener</em>'.
	 * @generated
	 */
	Listener createListener();

	/**
	 * Returns a new object of class '<em>Session Persistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session Persistence</em>'.
	 * @generated
	 */
	SessionPersistence createSessionPersistence();

	/**
	 * Returns a new object of class '<em>Alert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alert</em>'.
	 * @generated
	 */
	Alert createAlert();

	/**
	 * Returns a new object of class '<em>Scaling Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaling Rule</em>'.
	 * @generated
	 */
	ScalingRule createScalingRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LoadbalancerPackage getLoadbalancerPackage();

} //LoadbalancerFactory
