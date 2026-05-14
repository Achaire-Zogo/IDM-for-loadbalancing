/**
 */
package loadbalancer.impl;

import loadbalancer.HealthCheck;
import loadbalancer.LoadbalancerPackage;
import loadbalancer.Protocol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link loadbalancer.impl.HealthCheckImpl#getThresholds <em>Thresholds</em>}</li>
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
	 * The default value of the '{@link #getThresholds() <em>Thresholds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholds()
	 * @generated
	 * @ordered
	 */
	protected static final int THRESHOLDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThresholds() <em>Thresholds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholds()
	 * @generated
	 * @ordered
	 */
	protected int thresholds = THRESHOLDS_EDEFAULT;

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
	public int getThresholds() {
		return thresholds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholds(int newThresholds) {
		int oldThresholds = thresholds;
		thresholds = newThresholds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.HEALTH_CHECK__THRESHOLDS, oldThresholds, thresholds));
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
			case LoadbalancerPackage.HEALTH_CHECK__THRESHOLDS:
				return getThresholds();
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
			case LoadbalancerPackage.HEALTH_CHECK__THRESHOLDS:
				setThresholds((Integer)newValue);
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
			case LoadbalancerPackage.HEALTH_CHECK__THRESHOLDS:
				setThresholds(THRESHOLDS_EDEFAULT);
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
			case LoadbalancerPackage.HEALTH_CHECK__THRESHOLDS:
				return thresholds != THRESHOLDS_EDEFAULT;
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", path: ");
		result.append(path);
		result.append(", interval: ");
		result.append(interval);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", thresholds: ");
		result.append(thresholds);
		result.append(')');
		return result.toString();
	}

} //HealthCheckImpl
