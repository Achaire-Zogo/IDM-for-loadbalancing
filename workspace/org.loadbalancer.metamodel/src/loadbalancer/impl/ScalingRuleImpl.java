/**
 */
package loadbalancer.impl;

import loadbalancer.LoadbalancerPackage;
import loadbalancer.Metric;
import loadbalancer.ScalingRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaling Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.impl.ScalingRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.impl.ScalingRuleImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link loadbalancer.impl.ScalingRuleImpl#getScaleUpDown <em>Scale Up Down</em>}</li>
 *   <li>{@link loadbalancer.impl.ScalingRuleImpl#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link loadbalancer.impl.ScalingRuleImpl#getMaxInstances <em>Max Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalingRuleImpl extends MinimalEObjectImpl.Container implements ScalingRule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final Metric METRIC_EDEFAULT = Metric.CPU_USAGE;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected Metric metric = METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleUpDown() <em>Scale Up Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleUpDown()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_UP_DOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleUpDown() <em>Scale Up Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleUpDown()
	 * @generated
	 * @ordered
	 */
	protected String scaleUpDown = SCALE_UP_DOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INSTANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected int minInstances = MIN_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INSTANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected int maxInstances = MAX_INSTANCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadbalancerPackage.Literals.SCALING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SCALING_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(Metric newMetric) {
		Metric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SCALING_RULE__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScaleUpDown() {
		return scaleUpDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleUpDown(String newScaleUpDown) {
		String oldScaleUpDown = scaleUpDown;
		scaleUpDown = newScaleUpDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SCALING_RULE__SCALE_UP_DOWN, oldScaleUpDown, scaleUpDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinInstances() {
		return minInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinInstances(int newMinInstances) {
		int oldMinInstances = minInstances;
		minInstances = newMinInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SCALING_RULE__MIN_INSTANCES, oldMinInstances, minInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxInstances() {
		return maxInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxInstances(int newMaxInstances) {
		int oldMaxInstances = maxInstances;
		maxInstances = newMaxInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SCALING_RULE__MAX_INSTANCES, oldMaxInstances, maxInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoadbalancerPackage.SCALING_RULE__NAME:
				return getName();
			case LoadbalancerPackage.SCALING_RULE__METRIC:
				return getMetric();
			case LoadbalancerPackage.SCALING_RULE__SCALE_UP_DOWN:
				return getScaleUpDown();
			case LoadbalancerPackage.SCALING_RULE__MIN_INSTANCES:
				return getMinInstances();
			case LoadbalancerPackage.SCALING_RULE__MAX_INSTANCES:
				return getMaxInstances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LoadbalancerPackage.SCALING_RULE__NAME:
				setName((String)newValue);
				return;
			case LoadbalancerPackage.SCALING_RULE__METRIC:
				setMetric((Metric)newValue);
				return;
			case LoadbalancerPackage.SCALING_RULE__SCALE_UP_DOWN:
				setScaleUpDown((String)newValue);
				return;
			case LoadbalancerPackage.SCALING_RULE__MIN_INSTANCES:
				setMinInstances((Integer)newValue);
				return;
			case LoadbalancerPackage.SCALING_RULE__MAX_INSTANCES:
				setMaxInstances((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LoadbalancerPackage.SCALING_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LoadbalancerPackage.SCALING_RULE__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case LoadbalancerPackage.SCALING_RULE__SCALE_UP_DOWN:
				setScaleUpDown(SCALE_UP_DOWN_EDEFAULT);
				return;
			case LoadbalancerPackage.SCALING_RULE__MIN_INSTANCES:
				setMinInstances(MIN_INSTANCES_EDEFAULT);
				return;
			case LoadbalancerPackage.SCALING_RULE__MAX_INSTANCES:
				setMaxInstances(MAX_INSTANCES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LoadbalancerPackage.SCALING_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LoadbalancerPackage.SCALING_RULE__METRIC:
				return metric != METRIC_EDEFAULT;
			case LoadbalancerPackage.SCALING_RULE__SCALE_UP_DOWN:
				return SCALE_UP_DOWN_EDEFAULT == null ? scaleUpDown != null : !SCALE_UP_DOWN_EDEFAULT.equals(scaleUpDown);
			case LoadbalancerPackage.SCALING_RULE__MIN_INSTANCES:
				return minInstances != MIN_INSTANCES_EDEFAULT;
			case LoadbalancerPackage.SCALING_RULE__MAX_INSTANCES:
				return maxInstances != MAX_INSTANCES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", metric: ");
		result.append(metric);
		result.append(", scaleUpDown: ");
		result.append(scaleUpDown);
		result.append(", minInstances: ");
		result.append(minInstances);
		result.append(", maxInstances: ");
		result.append(maxInstances);
		result.append(')');
		return result.toString();
	}

} //ScalingRuleImpl
