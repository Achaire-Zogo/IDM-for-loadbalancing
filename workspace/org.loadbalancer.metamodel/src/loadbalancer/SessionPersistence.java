/**
 */
package loadbalancer;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cookieRequiresName'"
 * @generated
 */
public interface SessionPersistence extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link loadbalancer.PersistenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see loadbalancer.PersistenceType
	 * @see #setType(PersistenceType)
	 * @see loadbalancer.LoadbalancerPackage#getSessionPersistence_Type()
	 * @model
	 * @generated
	 */
	PersistenceType getType();

	/**
	 * Sets the value of the '{@link loadbalancer.SessionPersistence#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see loadbalancer.PersistenceType
	 * @see #getType()
	 * @generated
	 */
	void setType(PersistenceType value);

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
	 * @model required="true"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.type = PersistenceType::COOKIE implies\n\t\t\t\tself.cookieName &lt;&gt; \'\' and self.cookieName &lt;&gt; null'"
	 * @generated
	 */
	boolean cookieRequiresName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SessionPersistence
