/**
 */
package loadbalancer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancer System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.LoadBalancerSystem#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.LoadBalancerSystem#getDescription <em>Description</em>}</li>
 *   <li>{@link loadbalancer.LoadBalancerSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link loadbalancer.LoadBalancerSystem#getClusters <em>Clusters</em>}</li>
 *   <li>{@link loadbalancer.LoadBalancerSystem#getListeners <em>Listeners</em>}</li>
 *   <li>{@link loadbalancer.LoadBalancerSystem#getAlerts <em>Alerts</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getLoadBalancerSystem()
 * @model
 * @generated
 */
public interface LoadBalancerSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancerSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link loadbalancer.LoadBalancerSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancerSystem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link loadbalancer.LoadBalancerSystem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancerSystem_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link loadbalancer.LoadBalancerSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' containment reference list.
	 * The list contents are of type {@link loadbalancer.Cluster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' containment reference list.
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancerSystem_Clusters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cluster> getClusters();

	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link loadbalancer.Listener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference list.
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancerSystem_Listeners()
	 * @model containment="true"
	 * @generated
	 */
	EList<Listener> getListeners();

	/**
	 * Returns the value of the '<em><b>Alerts</b></em>' containment reference list.
	 * The list contents are of type {@link loadbalancer.Alert}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alerts</em>' containment reference list.
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancerSystem_Alerts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alert> getAlerts();

} // LoadBalancerSystem
