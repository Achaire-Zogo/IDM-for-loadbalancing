/**
 */
package loadbalancer;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.HealthCheck#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link loadbalancer.HealthCheck#getPath <em>Path</em>}</li>
 *   <li>{@link loadbalancer.HealthCheck#getInterval <em>Interval</em>}</li>
 *   <li>{@link loadbalancer.HealthCheck#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link loadbalancer.HealthCheck#getHealthyThreshold <em>Healthy Threshold</em>}</li>
 *   <li>{@link loadbalancer.HealthCheck#getUnhealthyThreshold <em>Unhealthy Threshold</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getHealthCheck()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='intervalGreaterThanTimeout'"
 * @generated
 */
public interface HealthCheck extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link loadbalancer.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see loadbalancer.Protocol
	 * @see #setProtocol(Protocol)
	 * @see loadbalancer.LoadbalancerPackage#getHealthCheck_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link loadbalancer.HealthCheck#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see loadbalancer.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see loadbalancer.LoadbalancerPackage#getHealthCheck_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link loadbalancer.HealthCheck#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(int)
	 * @see loadbalancer.LoadbalancerPackage#getHealthCheck_Interval()
	 * @model required="true"
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '{@link loadbalancer.HealthCheck#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see loadbalancer.LoadbalancerPackage#getHealthCheck_Timeout()
	 * @model required="true"
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link loadbalancer.HealthCheck#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Healthy Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Healthy Threshold</em>' attribute.
	 * @see #setHealthyThreshold(int)
	 * @see loadbalancer.LoadbalancerPackage#getHealthCheck_HealthyThreshold()
	 * @model
	 * @generated
	 */
	int getHealthyThreshold();

	/**
	 * Sets the value of the '{@link loadbalancer.HealthCheck#getHealthyThreshold <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthy Threshold</em>' attribute.
	 * @see #getHealthyThreshold()
	 * @generated
	 */
	void setHealthyThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Unhealthy Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unhealthy Threshold</em>' attribute.
	 * @see #setUnhealthyThreshold(int)
	 * @see loadbalancer.LoadbalancerPackage#getHealthCheck_UnhealthyThreshold()
	 * @model
	 * @generated
	 */
	int getUnhealthyThreshold();

	/**
	 * Sets the value of the '{@link loadbalancer.HealthCheck#getUnhealthyThreshold <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unhealthy Threshold</em>' attribute.
	 * @see #getUnhealthyThreshold()
	 * @generated
	 */
	void setUnhealthyThreshold(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.interval &gt; self.timeout'"
	 * @generated
	 */
	boolean intervalGreaterThanTimeout(DiagnosticChain diagnostics, Map<Object, Object> context);

} // HealthCheck
