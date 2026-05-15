/**
 */
package loadbalancer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.LoadBalancer#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.LoadBalancer#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link loadbalancer.LoadBalancer#isStickySession <em>Sticky Session</em>}</li>
 *   <li>{@link loadbalancer.LoadBalancer#getSessionPersistence <em>Session Persistence</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getLoadBalancer()
 * @model
 * @generated
 */
public interface LoadBalancer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link loadbalancer.LoadBalancer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link loadbalancer.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see loadbalancer.Algorithm
	 * @see #setAlgorithm(Algorithm)
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancer_Algorithm()
	 * @model
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link loadbalancer.LoadBalancer#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see loadbalancer.Algorithm
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algorithm value);

	/**
	 * Returns the value of the '<em><b>Sticky Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sticky Session</em>' attribute.
	 * @see #setStickySession(boolean)
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancer_StickySession()
	 * @model required="true"
	 * @generated
	 */
	boolean isStickySession();

	/**
	 * Sets the value of the '{@link loadbalancer.LoadBalancer#isStickySession <em>Sticky Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sticky Session</em>' attribute.
	 * @see #isStickySession()
	 * @generated
	 */
	void setStickySession(boolean value);

	/**
	 * Returns the value of the '<em><b>Session Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Persistence</em>' containment reference.
	 * @see #setSessionPersistence(SessionPersistence)
	 * @see loadbalancer.LoadbalancerPackage#getLoadBalancer_SessionPersistence()
	 * @model containment="true"
	 * @generated
	 */
	SessionPersistence getSessionPersistence();

	/**
	 * Sets the value of the '{@link loadbalancer.LoadBalancer#getSessionPersistence <em>Session Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Persistence</em>' containment reference.
	 * @see #getSessionPersistence()
	 * @generated
	 */
	void setSessionPersistence(SessionPersistence value);

} // LoadBalancer
