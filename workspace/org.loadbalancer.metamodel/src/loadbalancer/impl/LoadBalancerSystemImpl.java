/**
 */
package loadbalancer.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import loadbalancer.Alert;
import loadbalancer.Cluster;
import loadbalancer.Listener;
import loadbalancer.LoadBalancerSystem;
import loadbalancer.LoadbalancerPackage;

import loadbalancer.LoadbalancerTables;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balancer System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.impl.LoadBalancerSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.impl.LoadBalancerSystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link loadbalancer.impl.LoadBalancerSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link loadbalancer.impl.LoadBalancerSystemImpl#getClusters <em>Clusters</em>}</li>
 *   <li>{@link loadbalancer.impl.LoadBalancerSystemImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link loadbalancer.impl.LoadBalancerSystemImpl#getAlerts <em>Alerts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBalancerSystemImpl extends MinimalEObjectImpl.Container implements LoadBalancerSystem {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClusters() <em>Clusters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusters()
	 * @generated
	 * @ordered
	 */
	protected EList<Cluster> clusters;

	/**
	 * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected EList<Listener> listeners;

	/**
	 * The cached value of the '{@link #getAlerts() <em>Alerts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlerts()
	 * @generated
	 * @ordered
	 */
	protected EList<Alert> alerts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.LOAD_BALANCER_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.LOAD_BALANCER_SYSTEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.LOAD_BALANCER_SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cluster> getClusters() {
		if (clusters == null) {
			clusters = new EObjectContainmentEList<Cluster>(Cluster.class, this, LoadbalancerPackage.LOAD_BALANCER_SYSTEM__CLUSTERS);
		}
		return clusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Listener> getListeners() {
		if (listeners == null) {
			listeners = new EObjectContainmentEList<Listener>(Listener.class, this, LoadbalancerPackage.LOAD_BALANCER_SYSTEM__LISTENERS);
		}
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Alert> getAlerts() {
		if (alerts == null) {
			alerts = new EObjectContainmentEList<Alert>(Alert.class, this, LoadbalancerPackage.LOAD_BALANCER_SYSTEM__ALERTS);
		}
		return alerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean uniqueListenerPorts(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LoadBalancerSystem::uniqueListenerPorts";
		try {
			/**
			 *
			 * inv uniqueListenerPorts:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.listeners->isUnique(l | l.port)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM___UNIQUE_LISTENER_PORTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Listener> listeners = this.getListeners();
				final /*@NonInvalid*/ OrderedSetValue BOXED_listeners = idResolver.createOrderedSetOfAll(LoadbalancerTables.ORD_CLSSid_Listener, listeners);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(LoadbalancerTables.ORD_CLSSid_Listener);
				Iterator<Object> ITERATOR_l = BOXED_listeners.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_l.hasNext()) {
						result = true;
						break;
					}
					/*@NonInvalid*/ Listener l = (Listener)ITERATOR_l.next();
					/**
					 * l.port
					 */
					final /*@NonInvalid*/ int port = l.getPort();
					final /*@NonInvalid*/ IntegerValue BOXED_port = ValueUtil.integerValueOf(port);
					//
					if (accumulator.includes(BOXED_port) == ValueUtil.TRUE_VALUE) {
						result = false;
						break;			// Abort after second find
					}
					else {
						accumulator.add(BOXED_port);
					}
				}
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
	public boolean atLeastOneListener(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LoadBalancerSystem::atLeastOneListener";
		try {
			/**
			 *
			 * inv atLeastOneListener:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.listeners->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM___AT_LEAST_ONE_LISTENER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Listener> listeners = this.getListeners();
				final /*@NonInvalid*/ OrderedSetValue BOXED_listeners = idResolver.createOrderedSetOfAll(LoadbalancerTables.ORD_CLSSid_Listener, listeners);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_listeners);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, LoadbalancerTables.INT_1).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__CLUSTERS:
				return ((InternalEList<?>)getClusters()).basicRemove(otherEnd, msgs);
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__LISTENERS:
				return ((InternalEList<?>)getListeners()).basicRemove(otherEnd, msgs);
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__ALERTS:
				return ((InternalEList<?>)getAlerts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__NAME:
				return getName();
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__DESCRIPTION:
				return getDescription();
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__VERSION:
				return getVersion();
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__CLUSTERS:
				return getClusters();
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__LISTENERS:
				return getListeners();
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__ALERTS:
				return getAlerts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__VERSION:
				setVersion((String)newValue);
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__CLUSTERS:
				getClusters().clear();
				getClusters().addAll((Collection<? extends Cluster>)newValue);
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__LISTENERS:
				getListeners().clear();
				getListeners().addAll((Collection<? extends Listener>)newValue);
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__ALERTS:
				getAlerts().clear();
				getAlerts().addAll((Collection<? extends Alert>)newValue);
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
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__CLUSTERS:
				getClusters().clear();
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__LISTENERS:
				getListeners().clear();
				return;
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__ALERTS:
				getAlerts().clear();
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
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__CLUSTERS:
				return clusters != null && !clusters.isEmpty();
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__LISTENERS:
				return listeners != null && !listeners.isEmpty();
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM__ALERTS:
				return alerts != null && !alerts.isEmpty();
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
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM___UNIQUE_LISTENER_PORTS__DIAGNOSTICCHAIN_MAP:
				return uniqueListenerPorts((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case LoadbalancerPackage.LOAD_BALANCER_SYSTEM___AT_LEAST_ONE_LISTENER__DIAGNOSTICCHAIN_MAP:
				return atLeastOneListener((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", description: ");
		result.append(description);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //LoadBalancerSystemImpl
