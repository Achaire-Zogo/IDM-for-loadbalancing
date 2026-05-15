/**
 */
package loadbalancer.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import loadbalancer.LoadbalancerPackage;
import loadbalancer.LoadbalancerTables;
import loadbalancer.PersistenceType;
import loadbalancer.SessionPersistence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

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
	protected static final PersistenceType TYPE_EDEFAULT = PersistenceType.COOKIE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PersistenceType type = TYPE_EDEFAULT;

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
	public PersistenceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PersistenceType newType) {
		PersistenceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
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
	public boolean cookieRequiresName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SessionPersistence::cookieRequiresName";
		try {
			/**
			 *
			 * inv cookieRequiresName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.type = PersistenceType::COOKIE implies self.cookieName <> '' and self.cookieName <> null
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.SESSION_PERSISTENCE___COOKIE_REQUIRES_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String cookieName_0 = this.getCookieName();
					final /*@NonInvalid*/ PersistenceType type = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = type == null ? null : LoadbalancerTables.ENUMid_PersistenceType.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type == LoadbalancerTables.ELITid_COOKIE;
					final /*@Thrown*/ Boolean result;
					if (!eq) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean ne = !LoadbalancerTables.STR_.equals(cookieName_0);
						final /*@NonInvalid*/ Boolean and;
						if (!ne) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean ne_0 = cookieName_0 != null;
							if (!ne_0) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						if (and == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (and == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, LoadbalancerTables.INT_0).booleanValue();
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
				setType((PersistenceType)newValue);
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
				return type != TYPE_EDEFAULT;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LoadbalancerPackage.SESSION_PERSISTENCE___COOKIE_REQUIRES_NAME__DIAGNOSTICCHAIN_MAP:
				return cookieRequiresName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
