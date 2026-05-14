/**
 */
package loadbalancer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.ScalingRule#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.ScalingRule#getMetric <em>Metric</em>}</li>
 *   <li>{@link loadbalancer.ScalingRule#getScaleUpDown <em>Scale Up Down</em>}</li>
 *   <li>{@link loadbalancer.ScalingRule#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link loadbalancer.ScalingRule#getMaxInstances <em>Max Instances</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getScalingRule()
 * @model
 * @generated
 */
public interface ScalingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see loadbalancer.LoadbalancerPackage#getScalingRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link loadbalancer.ScalingRule#getName <em>Name</em>}' attribute.
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
	 * @see loadbalancer.LoadbalancerPackage#getScalingRule_Metric()
	 * @model
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link loadbalancer.ScalingRule#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see loadbalancer.Metric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Scale Up Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Up Down</em>' attribute.
	 * @see #setScaleUpDown(String)
	 * @see loadbalancer.LoadbalancerPackage#getScalingRule_ScaleUpDown()
	 * @model
	 * @generated
	 */
	String getScaleUpDown();

	/**
	 * Sets the value of the '{@link loadbalancer.ScalingRule#getScaleUpDown <em>Scale Up Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Up Down</em>' attribute.
	 * @see #getScaleUpDown()
	 * @generated
	 */
	void setScaleUpDown(String value);

	/**
	 * Returns the value of the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Instances</em>' attribute.
	 * @see #setMinInstances(int)
	 * @see loadbalancer.LoadbalancerPackage#getScalingRule_MinInstances()
	 * @model
	 * @generated
	 */
	int getMinInstances();

	/**
	 * Sets the value of the '{@link loadbalancer.ScalingRule#getMinInstances <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Instances</em>' attribute.
	 * @see #getMinInstances()
	 * @generated
	 */
	void setMinInstances(int value);

	/**
	 * Returns the value of the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Instances</em>' attribute.
	 * @see #setMaxInstances(int)
	 * @see loadbalancer.LoadbalancerPackage#getScalingRule_MaxInstances()
	 * @model
	 * @generated
	 */
	int getMaxInstances();

	/**
	 * Sets the value of the '{@link loadbalancer.ScalingRule#getMaxInstances <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instances</em>' attribute.
	 * @see #getMaxInstances()
	 * @generated
	 */
	void setMaxInstances(int value);

} // ScalingRule
