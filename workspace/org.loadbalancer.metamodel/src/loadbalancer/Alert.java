/**
 */
package loadbalancer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.Alert#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.Alert#getMetric <em>Metric</em>}</li>
 *   <li>{@link loadbalancer.Alert#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getAlert()
 * @model
 * @generated
 */
public interface Alert extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see loadbalancer.LoadbalancerPackage#getAlert_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link loadbalancer.Alert#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link loadbalancer.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see loadbalancer.Metric
	 * @see #setMetric(Metric)
	 * @see loadbalancer.LoadbalancerPackage#getAlert_Metric()
	 * @model
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link loadbalancer.Alert#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see loadbalancer.Metric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(int)
	 * @see loadbalancer.LoadbalancerPackage#getAlert_Threshold()
	 * @model
	 * @generated
	 */
	int getThreshold();

	/**
	 * Sets the value of the '{@link loadbalancer.Alert#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(int value);

} // Alert
