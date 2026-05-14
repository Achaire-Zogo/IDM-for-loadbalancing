/**
 */
package loadbalancer.impl;

import loadbalancer.LoadbalancerPackage;
import loadbalancer.SessionPersistence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Persistence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.impl.SessionPersistenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link loadbalancer.impl.SessionPersistenceImpl#getCookieName <em>Cookie Name</em>}</li>
 *   <li>{@link loadbalancer.impl.SessionPersistenceImpl#getTtl <em>Ttl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionPersistenceImpl extends MinimalEObjectImpl.Container implements SessionPersistence {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCookieName() <em>Cookie Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookieName()
	 * @generated
	 * @ordered
	 */
	protected static final String COOKIE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCookieName() <em>Cookie Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookieName()
	 * @generated
	 * @ordered
	 */
	protected String cookieName = COOKIE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTtl() <em>Ttl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtl()
	 * @generated
	 * @ordered
	 */
	protected static final int TTL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTtl() <em>Ttl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtl()
	 * @generated
	 * @ordered
	 */
	protected int ttl = TTL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionPersistenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadbalancerPackage.Literals.SESSION_PERSISTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SESSION_PERSISTENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCookieName() {
		return cookieName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCookieName(String newCookieName) {
		String oldCookieName = cookieName;
		cookieName = newCookieName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SESSION_PERSISTENCE__COOKIE_NAME, oldCookieName, cookieName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTtl() {
		return ttl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTtl(int newTtl) {
		int oldTtl = ttl;
		ttl = newTtl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.SESSION_PERSISTENCE__TTL, oldTtl, ttl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoadbalancerPackage.SESSION_PERSISTENCE__TYPE:
				return getType();
			case LoadbalancerPackage.SESSION_PERSISTENCE__COOKIE_NAME:
				return getCookieName();
			case LoadbalancerPackage.SESSION_PERSISTENCE__TTL:
				return getTtl();
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
			case LoadbalancerPackage.SESSION_PERSISTENCE__TYPE:
				setType((String)newValue);
				return;
			case LoadbalancerPackage.SESSION_PERSISTENCE__COOKIE_NAME:
				setCookieName((String)newValue);
				return;
			case LoadbalancerPackage.SESSION_PERSISTENCE__TTL:
				setTtl((Integer)newValue);
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
			case LoadbalancerPackage.SESSION_PERSISTENCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LoadbalancerPackage.SESSION_PERSISTENCE__COOKIE_NAME:
				setCookieName(COOKIE_NAME_EDEFAULT);
				return;
			case LoadbalancerPackage.SESSION_PERSISTENCE__TTL:
				setTtl(TTL_EDEFAULT);
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
			case LoadbalancerPackage.SESSION_PERSISTENCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case LoadbalancerPackage.SESSION_PERSISTENCE__COOKIE_NAME:
				return COOKIE_NAME_EDEFAULT == null ? cookieName != null : !COOKIE_NAME_EDEFAULT.equals(cookieName);
			case LoadbalancerPackage.SESSION_PERSISTENCE__TTL:
				return ttl != TTL_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", cookieName: ");
		result.append(cookieName);
		result.append(", ttl: ");
		result.append(ttl);
		result.append(')');
		return result.toString();
	}

} //SessionPersistenceImpl
