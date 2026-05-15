/**
 */
package loadbalancer;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link loadbalancer.ScalingRule#getScaleUpThreshold <em>Scale Up Threshold</em>}</li>
 *   <li>{@link loadbalancer.ScalingRule#getScaleDownThreshold <em>Scale Down Threshold</em>}</li>
 *   <li>{@link loadbalancer.ScalingRule#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link loadbalancer.ScalingRule#getMaxInstances <em>Max Instances</em>}</li>
 * </ul>
 *
 * @see loadbalancer.LoadbalancerPackage#getScalingRule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='scaleUpGreaterThanDown'"
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
	 * Returns the value of the '<em><b>Scale Up Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Up Threshold</em>' attribute.
	 * @see #setScaleUpThreshold(double)
	 * @see loadbalancer.LoadbalancerPackage#getScalingRule_ScaleUpThreshold()
	 * @model required="true"
	 * @generated
	 */
	double getScaleUpThreshold();

	/**
	 * Sets the value of the '{@link loadbalancer.ScalingRule#getScaleUpThreshold <em>Scale Up Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Up Threshold</em>' attribute.
	 * @see #getScaleUpThreshold()
	 * @generated
	 */
	void setScaleUpThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Scale Down Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Down Threshold</em>' attribute.
	 * @see #setScaleDownThreshold(double)
	 * @see loadbalancer.LoadbalancerPackage#getScalingRule_ScaleDownThreshold()
	 * @model required="true"
	 * @generated
	 */
	double getScaleDownThreshold();

	/**
	 * Sets the value of the '{@link loadbalancer.ScalingRule#getScaleDownThreshold <em>Scale Down Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Down Threshold</em>' attribute.
	 * @see #getScaleDownThreshold()
	 * @generated
	 */
	void setScaleDownThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Instances</em>' attribute.
	 * @see #setMinInstances(int)
	 * @see loadbalancer.LoadbalancerPackage#getScalingRule_MinInstances()
	 * @model required="true"
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
	 * @model required="true"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.minInstances &lt;= self.maxInstances'"
	 * @generated
	 */
	boolean minLessOrEqualMax(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.scaleUpThreshold &gt; self.scaleDownThreshold'"
	 * @generated
	 */
	boolean scaleUpGreaterThanDown(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ScalingRule
