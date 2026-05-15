/**
 */
package loadbalancer.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import loadbalancer.HealthCheck;
import loadbalancer.LoadbalancerPackage;
import loadbalancer.LoadbalancerTables;
import loadbalancer.Protocol;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.impl.HealthCheckImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link loadbalancer.impl.HealthCheckImpl#getPath <em>Path</em>}</li>
 *   <li>{@link loadbalancer.impl.HealthCheckImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link loadbalancer.impl.HealthCheckImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link loadbalancer.impl.HealthCheckImpl#getHealthyThreshold <em>Healthy Threshold</em>}</li>
 *   <li>{@link loadbalancer.impl.HealthCheckImpl#getUnhealthyThreshold <em>Unhealthy Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthCheckImpl extends MinimalEObjectImpl.Container implements HealthCheck {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_EDEFAULT = Protocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected int interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected int timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthyThreshold() <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int HEALTHY_THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHealthyThreshold() <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected int healthyThreshold = HEALTHY_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnhealthyThreshold() <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int UNHEALTHY_THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnhealthyThreshold() <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected int unhealthyThreshold = UNHEALTHY_THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadbalancerPackage.Literals.HEALTH_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Protocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(Protocol newProtocol) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.HEALTH_CHECK__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.HEALTH_CHECK__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterval(int newInterval) {
		int oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.HEALTH_CHECK__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(int newTimeout) {
		int oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.HEALTH_CHECK__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHealthyThreshold() {
		return healthyThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthyThreshold(int newHealthyThreshold) {
		int oldHealthyThreshold = healthyThreshold;
		healthyThreshold = newHealthyThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.HEALTH_CHECK__HEALTHY_THRESHOLD, oldHealthyThreshold, healthyThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUnhealthyThreshold() {
		return unhealthyThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnhealthyThreshold(int newUnhealthyThreshold) {
		int oldUnhealthyThreshold = unhealthyThreshold;
		unhealthyThreshold = newUnhealthyThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.HEALTH_CHECK__UNHEALTHY_THRESHOLD, oldUnhealthyThreshold, unhealthyThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean intervalGreaterThanTimeout(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "HealthCheck::intervalGreaterThanTimeout";
		try {
			/**
			 *
			 * inv intervalGreaterThanTimeout:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.interval > self.timeout
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.HEALTH_CHECK___INTERVAL_GREATER_THAN_TIMEOUT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int interval = this.getInterval();
				final /*@NonInvalid*/ IntegerValue BOXED_interval = ValueUtil.integerValueOf(interval);
				final /*@NonInvalid*/ int timeout = this.getTimeout();
				final /*@NonInvalid*/ IntegerValue BOXED_timeout = ValueUtil.integerValueOf(timeout);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_interval, BOXED_timeout).booleanValue();
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
			case LoadbalancerPackage.HEALTH_CHECK__PROTOCOL:
				return getProtocol();
			case LoadbalancerPackage.HEALTH_CHECK__PATH:
				return getPath();
			case LoadbalancerPackage.HEALTH_CHECK__INTERVAL:
				return getInterval();
			case LoadbalancerPackage.HEALTH_CHECK__TIMEOUT:
				return getTimeout();
			case LoadbalancerPackage.HEALTH_CHECK__HEALTHY_THRESHOLD:
				return getHealthyThreshold();
			case LoadbalancerPackage.HEALTH_CHECK__UNHEALTHY_THRESHOLD:
				return getUnhealthyThreshold();
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
			case LoadbalancerPackage.HEALTH_CHECK__PROTOCOL:
				setProtocol((Protocol)newValue);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__PATH:
				setPath((String)newValue);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__INTERVAL:
				setInterval((Integer)newValue);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__TIMEOUT:
				setTimeout((Integer)newValue);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__HEALTHY_THRESHOLD:
				setHealthyThreshold((Integer)newValue);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__UNHEALTHY_THRESHOLD:
				setUnhealthyThreshold((Integer)newValue);
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
			case LoadbalancerPackage.HEALTH_CHECK__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__HEALTHY_THRESHOLD:
				setHealthyThreshold(HEALTHY_THRESHOLD_EDEFAULT);
				return;
			case LoadbalancerPackage.HEALTH_CHECK__UNHEALTHY_THRESHOLD:
				setUnhealthyThreshold(UNHEALTHY_THRESHOLD_EDEFAULT);
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
			case LoadbalancerPackage.HEALTH_CHECK__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case LoadbalancerPackage.HEALTH_CHECK__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case LoadbalancerPackage.HEALTH_CHECK__INTERVAL:
				return interval != INTERVAL_EDEFAULT;
			case LoadbalancerPackage.HEALTH_CHECK__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
			case LoadbalancerPackage.HEALTH_CHECK__HEALTHY_THRESHOLD:
				return healthyThreshold != HEALTHY_THRESHOLD_EDEFAULT;
			case LoadbalancerPackage.HEALTH_CHECK__UNHEALTHY_THRESHOLD:
				return unhealthyThreshold != UNHEALTHY_THRESHOLD_EDEFAULT;
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
			case LoadbalancerPackage.HEALTH_CHECK___INTERVAL_GREATER_THAN_TIMEOUT__DIAGNOSTICCHAIN_MAP:
				return intervalGreaterThanTimeout((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", path: ");
		result.append(path);
		result.append(", interval: ");
		result.append(interval);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", healthyThreshold: ");
		result.append(healthyThreshold);
		result.append(", unhealthyThreshold: ");
		result.append(unhealthyThreshold);
		result.append(')');
		return result.toString();
	}

} //HealthCheckImpl
