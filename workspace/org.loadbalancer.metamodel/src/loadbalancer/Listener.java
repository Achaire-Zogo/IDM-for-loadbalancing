/**
 */
package loadbalancer;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.Listener#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.Listener#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link loadbalancer.Listener#getPort <em>Port</em>}</li>
 *   <li>{@link loadbalancer.Listener#getTargetCluster <em>Target Cluster</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getListener()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validListenerPort'"
 * @generated
 */
public interface Listener extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see loadbalancer.LoadbalancerPackage#getListener_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link loadbalancer.Listener#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link loadbalancer.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see loadbalancer.Protocol
	 * @see #setProtocol(Protocol)
	 * @see loadbalancer.LoadbalancerPackage#getListener_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link loadbalancer.Listener#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see loadbalancer.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see loadbalancer.LoadbalancerPackage#getListener_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link loadbalancer.Listener#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Target Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cluster</em>' reference.
	 * @see #setTargetCluster(Cluster)
	 * @see loadbalancer.LoadbalancerPackage#getListener_TargetCluster()
	 * @model
	 * @generated
	 */
	Cluster getTargetCluster();

	/**
	 * Sets the value of the '{@link loadbalancer.Listener#getTargetCluster <em>Target Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cluster</em>' reference.
	 * @see #getTargetCluster()
	 * @generated
	 */
	void setTargetCluster(Cluster value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.port &gt;= 1 and self.port &lt;= 65535'"
	 * @generated
	 */
	boolean validListenerPort(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Listener
