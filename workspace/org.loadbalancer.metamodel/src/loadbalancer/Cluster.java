/**
 */
package loadbalancer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.Cluster#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.Cluster#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link loadbalancer.Cluster#getServers <em>Servers</em>}</li>
 *   <li>{@link loadbalancer.Cluster#getLoadBalancer <em>Load Balancer</em>}</li>
 *   <li>{@link loadbalancer.Cluster#getHealthCheck <em>Health Check</em>}</li>
 *   <li>{@link loadbalancer.Cluster#getScalingRule <em>Scaling Rule</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getCluster()
 * @model
 * @generated
 */
public interface Cluster extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see loadbalancer.LoadbalancerPackage#getCluster_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link loadbalancer.Cluster#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Max Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Connections</em>' attribute.
	 * @see #setMaxConnections(int)
	 * @see loadbalancer.LoadbalancerPackage#getCluster_MaxConnections()
	 * @model
	 * @generated
	 */
	int getMaxConnections();

	/**
	 * Sets the value of the '{@link loadbalancer.Cluster#getMaxConnections <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Connections</em>' attribute.
	 * @see #getMaxConnections()
	 * @generated
	 */
	void setMaxConnections(int value);

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link loadbalancer.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see loadbalancer.LoadbalancerPackage#getCluster_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServers();

	/**
	 * Returns the value of the '<em><b>Load Balancer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancer</em>' containment reference.
	 * @see #setLoadBalancer(LoadBalancer)
	 * @see loadbalancer.LoadbalancerPackage#getCluster_LoadBalancer()
	 * @model containment="true"
	 * @generated
	 */
	LoadBalancer getLoadBalancer();

	/**
	 * Sets the value of the '{@link loadbalancer.Cluster#getLoadBalancer <em>Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer</em>' containment reference.
	 * @see #getLoadBalancer()
	 * @generated
	 */
	void setLoadBalancer(LoadBalancer value);

	/**
	 * Returns the value of the '<em><b>Health Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Check</em>' containment reference.
	 * @see #setHealthCheck(HealthCheck)
	 * @see loadbalancer.LoadbalancerPackage#getCluster_HealthCheck()
	 * @model containment="true"
	 * @generated
	 */
	HealthCheck getHealthCheck();

	/**
	 * Sets the value of the '{@link loadbalancer.Cluster#getHealthCheck <em>Health Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Check</em>' containment reference.
	 * @see #getHealthCheck()
	 * @generated
	 */
	void setHealthCheck(HealthCheck value);

	/**
	 * Returns the value of the '<em><b>Scaling Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Rule</em>' containment reference.
	 * @see #setScalingRule(ScalingRule)
	 * @see loadbalancer.LoadbalancerPackage#getCluster_ScalingRule()
	 * @model containment="true"
	 * @generated
	 */
	ScalingRule getScalingRule();

	/**
	 * Sets the value of the '{@link loadbalancer.Cluster#getScalingRule <em>Scaling Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Rule</em>' containment reference.
	 * @see #getScalingRule()
	 * @generated
	 */
	void setScalingRule(ScalingRule value);

} // Cluster
