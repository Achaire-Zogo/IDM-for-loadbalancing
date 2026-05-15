/**
 */
package loadbalancer;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.Server#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.Server#getHost <em>Host</em>}</li>
 *   <li>{@link loadbalancer.Server#getPort <em>Port</em>}</li>
 *   <li>{@link loadbalancer.Server#getWeight <em>Weight</em>}</li>
 *   <li>{@link loadbalancer.Server#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link loadbalancer.Server#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getServer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveWeight'"
 * @generated
 */
public interface Server extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see loadbalancer.LoadbalancerPackage#getServer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link loadbalancer.Server#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see loadbalancer.LoadbalancerPackage#getServer_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link loadbalancer.Server#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see loadbalancer.LoadbalancerPackage#getServer_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link loadbalancer.Server#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see loadbalancer.LoadbalancerPackage#getServer_Weight()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link loadbalancer.Server#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Max Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Connections</em>' attribute.
	 * @see #setMaxConnections(int)
	 * @see loadbalancer.LoadbalancerPackage#getServer_MaxConnections()
	 * @model required="true"
	 * @generated
	 */
	int getMaxConnections();

	/**
	 * Sets the value of the '{@link loadbalancer.Server#getMaxConnections <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Connections</em>' attribute.
	 * @see #getMaxConnections()
	 * @generated
	 */
	void setMaxConnections(int value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see loadbalancer.LoadbalancerPackage#getServer_Enabled()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link loadbalancer.Server#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.port &gt;= 1 and self.port &lt;= 65535'"
	 * @generated
	 */
	boolean validPort(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.weight &gt;= 1'"
	 * @generated
	 */
	boolean positiveWeight(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Server
