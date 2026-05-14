/**
 */
package loadbalancer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Persistence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.SessionPersistence#getType <em>Type</em>}</li>
 *   <li>{@link loadbalancer.SessionPersistence#getCookieName <em>Cookie Name</em>}</li>
 *   <li>{@link loadbalancer.SessionPersistence#getTtl <em>Ttl</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getSessionPersistence()
 * @model
 * @generated
 */
public interface SessionPersistence extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see loadbalancer.LoadbalancerPackage#getSessionPersistence_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link loadbalancer.SessionPersistence#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Cookie Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookie Name</em>' attribute.
	 * @see #setCookieName(String)
	 * @see loadbalancer.LoadbalancerPackage#getSessionPersistence_CookieName()
	 * @model
	 * @generated
	 */
	String getCookieName();

	/**
	 * Sets the value of the '{@link loadbalancer.SessionPersistence#getCookieName <em>Cookie Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookie Name</em>' attribute.
	 * @see #getCookieName()
	 * @generated
	 */
	void setCookieName(String value);

	/**
	 * Returns the value of the '<em><b>Ttl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttl</em>' attribute.
	 * @see #setTtl(int)
	 * @see loadbalancer.LoadbalancerPackage#getSessionPersistence_Ttl()
	 * @model
	 * @generated
	 */
	int getTtl();

	/**
	 * Sets the value of the '{@link loadbalancer.SessionPersistence#getTtl <em>Ttl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttl</em>' attribute.
	 * @see #getTtl()
	 * @generated
	 */
	void setTtl(int value);

} // SessionPersistence
