/**
 */
package loadbalancer.impl;

import loadbalancer.Algorithm;
import loadbalancer.LoadBalancer;
import loadbalancer.LoadbalancerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.impl.LoadBalancerImpl#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.impl.LoadBalancerImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link loadbalancer.impl.LoadBalancerImpl#isStickySession <em>Sticky Session</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBalancerImpl extends MinimalEObjectImpl.Container implements LoadBalancer {
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
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Algorithm ALGORITHM_EDEFAULT = Algorithm.ROUND_ROBIN;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Algorithm algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #isStickySession() <em>Sticky Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStickySession()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STICKY_SESSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStickySession() <em>Sticky Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStickySession()
	 * @generated
	 * @ordered
	 */
	protected boolean stickySession = STICKY_SESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadbalancerPackage.Literals.LOAD_BALANCER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.LOAD_BALANCER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithm getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(Algorithm newAlgorithm) {
		Algorithm oldAlgorithm = algorithm;
		algorithm = newAlgorithm == null ? ALGORITHM_EDEFAULT : newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.LOAD_BALANCER__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStickySession() {
		return stickySession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStickySession(boolean newStickySession) {
		boolean oldStickySession = stickySession;
		stickySession = newStickySession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.LOAD_BALANCER__STICKY_SESSION, oldStickySession, stickySession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoadbalancerPackage.LOAD_BALANCER__NAME:
				return getName();
			case LoadbalancerPackage.LOAD_BALANCER__ALGORITHM:
				return getAlgorithm();
			case LoadbalancerPackage.LOAD_BALANCER__STICKY_SESSION:
				return isStickySession();
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
			case LoadbalancerPackage.LOAD_BALANCER__NAME:
				setName((String)newValue);
				return;
			case LoadbalancerPackage.LOAD_BALANCER__ALGORITHM:
				setAlgorithm((Algorithm)newValue);
				return;
			case LoadbalancerPackage.LOAD_BALANCER__STICKY_SESSION:
				setStickySession((Boolean)newValue);
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
			case LoadbalancerPackage.LOAD_BALANCER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LoadbalancerPackage.LOAD_BALANCER__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case LoadbalancerPackage.LOAD_BALANCER__STICKY_SESSION:
				setStickySession(STICKY_SESSION_EDEFAULT);
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
			case LoadbalancerPackage.LOAD_BALANCER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LoadbalancerPackage.LOAD_BALANCER__ALGORITHM:
				return algorithm != ALGORITHM_EDEFAULT;
			case LoadbalancerPackage.LOAD_BALANCER__STICKY_SESSION:
				return stickySession != STICKY_SESSION_EDEFAULT;
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
		result.append(", algorithm: ");
		result.append(algorithm);
		result.append(", stickySession: ");
		result.append(stickySession);
		result.append(')');
		return result.toString();
	}

} //LoadBalancerImpl
