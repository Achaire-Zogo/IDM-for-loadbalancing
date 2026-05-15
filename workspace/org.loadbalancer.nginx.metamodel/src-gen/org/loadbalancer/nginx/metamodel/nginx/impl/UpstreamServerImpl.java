/**
 */
package org.loadbalancer.nginx.metamodel.nginx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.loadbalancer.nginx.metamodel.nginx.NginxPackage;
import org.loadbalancer.nginx.metamodel.nginx.UpstreamServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Upstream Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamServerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamServerImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamServerImpl#getMaxFails <em>Max Fails</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamServerImpl#getFailTimeout <em>Fail Timeout</em>}</li>
 *   <li>{@link org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamServerImpl#isBackup <em>Backup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpstreamServerImpl extends MinimalEObjectImpl.Container implements UpstreamServer {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxFails() <em>Max Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFails()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_FAILS_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getMaxFails() <em>Max Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFails()
	 * @generated
	 * @ordered
	 */
	protected int maxFails = MAX_FAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailTimeout() <em>Fail Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String FAIL_TIMEOUT_EDEFAULT = "30s";

	/**
	 * The cached value of the '{@link #getFailTimeout() <em>Fail Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailTimeout()
	 * @generated
	 * @ordered
	 */
	protected String failTimeout = FAIL_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBackup() <em>Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BACKUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBackup() <em>Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackup()
	 * @generated
	 * @ordered
	 */
	protected boolean backup = BACKUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpstreamServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NginxPackage.Literals.UPSTREAM_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.UPSTREAM_SERVER__ADDRESS, oldAddress,
					address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.UPSTREAM_SERVER__WEIGHT, oldWeight,
					weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxFails() {
		return maxFails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxFails(int newMaxFails) {
		int oldMaxFails = maxFails;
		maxFails = newMaxFails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.UPSTREAM_SERVER__MAX_FAILS, oldMaxFails,
					maxFails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFailTimeout() {
		return failTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailTimeout(String newFailTimeout) {
		String oldFailTimeout = failTimeout;
		failTimeout = newFailTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.UPSTREAM_SERVER__FAIL_TIMEOUT,
					oldFailTimeout, failTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBackup() {
		return backup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackup(boolean newBackup) {
		boolean oldBackup = backup;
		backup = newBackup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NginxPackage.UPSTREAM_SERVER__BACKUP, oldBackup,
					backup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NginxPackage.UPSTREAM_SERVER__ADDRESS:
			return getAddress();
		case NginxPackage.UPSTREAM_SERVER__WEIGHT:
			return getWeight();
		case NginxPackage.UPSTREAM_SERVER__MAX_FAILS:
			return getMaxFails();
		case NginxPackage.UPSTREAM_SERVER__FAIL_TIMEOUT:
			return getFailTimeout();
		case NginxPackage.UPSTREAM_SERVER__BACKUP:
			return isBackup();
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
		case NginxPackage.UPSTREAM_SERVER__ADDRESS:
			setAddress((String) newValue);
			return;
		case NginxPackage.UPSTREAM_SERVER__WEIGHT:
			setWeight((Integer) newValue);
			return;
		case NginxPackage.UPSTREAM_SERVER__MAX_FAILS:
			setMaxFails((Integer) newValue);
			return;
		case NginxPackage.UPSTREAM_SERVER__FAIL_TIMEOUT:
			setFailTimeout((String) newValue);
			return;
		case NginxPackage.UPSTREAM_SERVER__BACKUP:
			setBackup((Boolean) newValue);
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
		case NginxPackage.UPSTREAM_SERVER__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case NginxPackage.UPSTREAM_SERVER__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case NginxPackage.UPSTREAM_SERVER__MAX_FAILS:
			setMaxFails(MAX_FAILS_EDEFAULT);
			return;
		case NginxPackage.UPSTREAM_SERVER__FAIL_TIMEOUT:
			setFailTimeout(FAIL_TIMEOUT_EDEFAULT);
			return;
		case NginxPackage.UPSTREAM_SERVER__BACKUP:
			setBackup(BACKUP_EDEFAULT);
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
		case NginxPackage.UPSTREAM_SERVER__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case NginxPackage.UPSTREAM_SERVER__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case NginxPackage.UPSTREAM_SERVER__MAX_FAILS:
			return maxFails != MAX_FAILS_EDEFAULT;
		case NginxPackage.UPSTREAM_SERVER__FAIL_TIMEOUT:
			return FAIL_TIMEOUT_EDEFAULT == null ? failTimeout != null : !FAIL_TIMEOUT_EDEFAULT.equals(failTimeout);
		case NginxPackage.UPSTREAM_SERVER__BACKUP:
			return backup != BACKUP_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (address: ");
		result.append(address);
		result.append(", weight: ");
		result.append(weight);
		result.append(", maxFails: ");
		result.append(maxFails);
		result.append(", failTimeout: ");
		result.append(failTimeout);
		result.append(", backup: ");
		result.append(backup);
		result.append(')');
		return result.toString();
	}

} //UpstreamServerImpl
