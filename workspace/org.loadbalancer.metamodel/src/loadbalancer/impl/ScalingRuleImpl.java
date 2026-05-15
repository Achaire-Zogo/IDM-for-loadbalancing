/**
 */
package loadbalancer.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import loadbalancer.LoadbalancerPackage;
import loadbalancer.LoadbalancerTables;
import loadbalancer.Metric;
import loadbalancer.ScalingRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

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
 *   <li>{@link loadbalancer.impl.ScalingRuleImpl#getScaleUpThreshold <em>Scale Up Threshold</em>}</li>
 *   <li>{@link loadbalancer.impl.ScalingRuleImpl#getScaleDownThreshold <em>Scale Down Threshold</em>}</li>
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
	 * The default value of the '{@link #getScaleUpThreshold() <em>Scale Up Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleUpThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_UP_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScaleUpThreshold() <em>Scale Up Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleUpThreshold()
	 * @generated
	 * @ordered
	 */
	protected double scaleUpThreshold = SCALE_UP_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleDownThreshold() <em>Scale Down Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleDownThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_DOWN_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScaleDownThreshold() <em>Scale Down Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleDownThreshold()
	 * @generated
	 * @ordered
	 */
	protected double scaleDownThreshold = SCALE_DOWN_THRESHOLD_EDEFAULT;

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
	public double getScaleUpThreshold() {
		return scaleUpThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleUpThreshold(double newScaleUpThreshold) {
		double oldScaleUpThreshold = scaleUpThreshold;
		scaleUpThreshold = newScaleUpThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SCALING_RULE__SCALE_UP_THRESHOLD, oldScaleUpThreshold, scaleUpThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScaleDownThreshold() {
		return scaleDownThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleDownThreshold(double newScaleDownThreshold) {
		double oldScaleDownThreshold = scaleDownThreshold;
		scaleDownThreshold = newScaleDownThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SCALING_RULE__SCALE_DOWN_THRESHOLD, oldScaleDownThreshold, scaleDownThreshold));
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
	public boolean minLessOrEqualMax(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ScalingRule::minLessOrEqualMax";
		try {
			/**
			 *
			 * inv minLessOrEqualMax:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.minInstances <= self.maxInstances
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.SCALING_RULE___MIN_LESS_OR_EQUAL_MAX__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int minInstances = this.getMinInstances();
				final /*@NonInvalid*/ IntegerValue BOXED_minInstances = ValueUtil.integerValueOf(minInstances);
				final /*@NonInvalid*/ int maxInstances = this.getMaxInstances();
				final /*@NonInvalid*/ IntegerValue BOXED_maxInstances = ValueUtil.integerValueOf(maxInstances);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_minInstances, BOXED_maxInstances).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, LoadbalancerTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean scaleUpGreaterThanDown(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ScalingRule::scaleUpGreaterThanDown";
		try {
			/**
			 *
			 * inv scaleUpGreaterThanDown:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.scaleUpThreshold > self.scaleDownThreshold
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.SCALING_RULE___SCALE_UP_GREATER_THAN_DOWN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ double scaleUpThreshold = this.getScaleUpThreshold();
				final /*@NonInvalid*/ RealValue BOXED_scaleUpThreshold = ValueUtil.realValueOf(scaleUpThreshold);
				final /*@NonInvalid*/ double scaleDownThreshold = this.getScaleDownThreshold();
				final /*@NonInvalid*/ RealValue BOXED_scaleDownThreshold = ValueUtil.realValueOf(scaleDownThreshold);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_scaleUpThreshold, BOXED_scaleDownThreshold).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, LoadbalancerTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
			case LoadbalancerPackage.SCALING_RULE__SCALE_UP_THRESHOLD:
				return getScaleUpThreshold();
			case LoadbalancerPackage.SCALING_RULE__SCALE_DOWN_THRESHOLD:
				return getScaleDownThreshold();
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
			case LoadbalancerPackage.SCALING_RULE__SCALE_UP_THRESHOLD:
				setScaleUpThreshold((Double)newValue);
				return;
			case LoadbalancerPackage.SCALING_RULE__SCALE_DOWN_THRESHOLD:
				setScaleDownThreshold((Double)newValue);
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
			case LoadbalancerPackage.SCALING_RULE__SCALE_UP_THRESHOLD:
				setScaleUpThreshold(SCALE_UP_THRESHOLD_EDEFAULT);
				return;
			case LoadbalancerPackage.SCALING_RULE__SCALE_DOWN_THRESHOLD:
				setScaleDownThreshold(SCALE_DOWN_THRESHOLD_EDEFAULT);
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
			case LoadbalancerPackage.SCALING_RULE__SCALE_UP_THRESHOLD:
				return scaleUpThreshold != SCALE_UP_THRESHOLD_EDEFAULT;
			case LoadbalancerPackage.SCALING_RULE__SCALE_DOWN_THRESHOLD:
				return scaleDownThreshold != SCALE_DOWN_THRESHOLD_EDEFAULT;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LoadbalancerPackage.SCALING_RULE___MIN_LESS_OR_EQUAL_MAX__DIAGNOSTICCHAIN_MAP:
				return minLessOrEqualMax((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case LoadbalancerPackage.SCALING_RULE___SCALE_UP_GREATER_THAN_DOWN__DIAGNOSTICCHAIN_MAP:
				return scaleUpGreaterThanDown((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", scaleUpThreshold: ");
		result.append(scaleUpThreshold);
		result.append(", scaleDownThreshold: ");
		result.append(scaleDownThreshold);
		result.append(", minInstances: ");
		result.append(minInstances);
		result.append(", maxInstances: ");
		result.append(maxInstances);
		result.append(')');
		return result.toString();
	}

} //ScalingRuleImpl
