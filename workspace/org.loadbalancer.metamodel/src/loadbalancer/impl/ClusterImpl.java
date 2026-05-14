/**
 */
package loadbalancer.impl;

import java.util.Collection;

import loadbalancer.Cluster;
import loadbalancer.HealthCheck;
import loadbalancer.LoadBalancer;
import loadbalancer.LoadbalancerPackage;
import loadbalancer.ScalingRule;
import loadbalancer.Server;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link loadbalancer.impl.ClusterImpl#getName <em>Name</em>}</li>
 *   <li>{@link loadbalancer.impl.ClusterImpl#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link loadbalancer.impl.ClusterImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link loadbalancer.impl.ClusterImpl#getLoadBalancer <em>Load Balancer</em>}</li>
 *   <li>{@link loadbalancer.impl.ClusterImpl#getHealthCheck <em>Health Check</em>}</li>
 *   <li>{@link loadbalancer.impl.ClusterImpl#getScalingRule <em>Scaling Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends MinimalEObjectImpl.Container implements Cluster {
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
	 * The default value of the '{@link #getMaxConnections() <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CONNECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxConnections() <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected int maxConnections = MAX_CONNECTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> servers;

	/**
	 * The cached value of the '{@link #getLoadBalancer() <em>Load Balancer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected LoadBalancer loadBalancer;

	/**
	 * The cached value of the '{@link #getHealthCheck() <em>Health Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthCheck()
	 * @generated
	 * @ordered
	 */
	protected HealthCheck healthCheck;

	/**
	 * The cached value of the '{@link #getScalingRule() <em>Scaling Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingRule()
	 * @generated
	 * @ordered
	 */
	protected ScalingRule scalingRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadbalancerPackage.Literals.CLUSTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.CLUSTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxConnections() {
		return maxConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxConnections(int newMaxConnections) {
		int oldMaxConnections = maxConnections;
		maxConnections = newMaxConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.CLUSTER__MAX_CONNECTIONS, oldMaxConnections, maxConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Server> getServers() {
		if (servers == null) {
			servers = new EObjectContainmentEList<Server>(Server.class, this, LoadbalancerPackage.CLUSTER__SERVERS);
		}
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalancer getLoadBalancer() {
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadBalancer(LoadBalancer newLoadBalancer, NotificationChain msgs) {
		LoadBalancer oldLoadBalancer = loadBalancer;
		loadBalancer = newLoadBalancer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.CLUSTER__LOAD_BALANCER, oldLoadBalancer, newLoadBalancer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalancer(LoadBalancer newLoadBalancer) {
		if (newLoadBalancer != loadBalancer) {
			NotificationChain msgs = null;
			if (loadBalancer != null)
				msgs = ((InternalEObject)loadBalancer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LoadbalancerPackage.CLUSTER__LOAD_BALANCER, null, msgs);
			if (newLoadBalancer != null)
				msgs = ((InternalEObject)newLoadBalancer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LoadbalancerPackage.CLUSTER__LOAD_BALANCER, null, msgs);
			msgs = basicSetLoadBalancer(newLoadBalancer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.CLUSTER__LOAD_BALANCER, newLoadBalancer, newLoadBalancer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthCheck getHealthCheck() {
		return healthCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthCheck(HealthCheck newHealthCheck, NotificationChain msgs) {
		HealthCheck oldHealthCheck = healthCheck;
		healthCheck = newHealthCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.CLUSTER__HEALTH_CHECK, oldHealthCheck, newHealthCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthCheck(HealthCheck newHealthCheck) {
		if (newHealthCheck != healthCheck) {
			NotificationChain msgs = null;
			if (healthCheck != null)
				msgs = ((InternalEObject)healthCheck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LoadbalancerPackage.CLUSTER__HEALTH_CHECK, null, msgs);
			if (newHealthCheck != null)
				msgs = ((InternalEObject)newHealthCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LoadbalancerPackage.CLUSTER__HEALTH_CHECK, null, msgs);
			msgs = basicSetHealthCheck(newHealthCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.CLUSTER__HEALTH_CHECK, newHealthCheck, newHealthCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalingRule getScalingRule() {
		return scalingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalingRule(ScalingRule newScalingRule, NotificationChain msgs) {
		ScalingRule oldScalingRule = scalingRule;
		scalingRule = newScalingRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.CLUSTER__SCALING_RULE, oldScalingRule, newScalingRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalingRule(ScalingRule newScalingRule) {
		if (newScalingRule != scalingRule) {
			NotificationChain msgs = null;
			if (scalingRule != null)
				msgs = ((InternalEObject)scalingRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LoadbalancerPackage.CLUSTER__SCALING_RULE, null, msgs);
			if (newScalingRule != null)
				msgs = ((InternalEObject)newScalingRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LoadbalancerPackage.CLUSTER__SCALING_RULE, null, msgs);
			msgs = basicSetScalingRule(newScalingRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoadbalancerPackage.CLUSTER__SCALING_RULE, newScalingRule, newScalingRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoadbalancerPackage.CLUSTER__SERVERS:
				return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
			case LoadbalancerPackage.CLUSTER__LOAD_BALANCER:
				return basicSetLoadBalancer(null, msgs);
			case LoadbalancerPackage.CLUSTER__HEALTH_CHECK:
				return basicSetHealthCheck(null, msgs);
			case LoadbalancerPackage.CLUSTER__SCALING_RULE:
				return basicSetScalingRule(null, msgs);
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
			case LoadbalancerPackage.CLUSTER__NAME:
				return getName();
			case LoadbalancerPackage.CLUSTER__MAX_CONNECTIONS:
				return getMaxConnections();
			case LoadbalancerPackage.CLUSTER__SERVERS:
				return getServers();
			case LoadbalancerPackage.CLUSTER__LOAD_BALANCER:
				return getLoadBalancer();
			case LoadbalancerPackage.CLUSTER__HEALTH_CHECK:
				return getHealthCheck();
			case LoadbalancerPackage.CLUSTER__SCALING_RULE:
				return getScalingRule();
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
			case LoadbalancerPackage.CLUSTER__NAME:
				setName((String)newValue);
				return;
			case LoadbalancerPackage.CLUSTER__MAX_CONNECTIONS:
				setMaxConnections((Integer)newValue);
				return;
			case LoadbalancerPackage.CLUSTER__SERVERS:
				getServers().clear();
				getServers().addAll((Collection<? extends Server>)newValue);
				return;
			case LoadbalancerPackage.CLUSTER__LOAD_BALANCER:
				setLoadBalancer((LoadBalancer)newValue);
				return;
			case LoadbalancerPackage.CLUSTER__HEALTH_CHECK:
				setHealthCheck((HealthCheck)newValue);
				return;
			case LoadbalancerPackage.CLUSTER__SCALING_RULE:
				setScalingRule((ScalingRule)newValue);
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
			case LoadbalancerPackage.CLUSTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LoadbalancerPackage.CLUSTER__MAX_CONNECTIONS:
				setMaxConnections(MAX_CONNECTIONS_EDEFAULT);
				return;
			case LoadbalancerPackage.CLUSTER__SERVERS:
				getServers().clear();
				return;
			case LoadbalancerPackage.CLUSTER__LOAD_BALANCER:
				setLoadBalancer((LoadBalancer)null);
				return;
			case LoadbalancerPackage.CLUSTER__HEALTH_CHECK:
				setHealthCheck((HealthCheck)null);
				return;
			case LoadbalancerPackage.CLUSTER__SCALING_RULE:
				setScalingRule((ScalingRule)null);
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
			case LoadbalancerPackage.CLUSTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LoadbalancerPackage.CLUSTER__MAX_CONNECTIONS:
				return maxConnections != MAX_CONNECTIONS_EDEFAULT;
			case LoadbalancerPackage.CLUSTER__SERVERS:
				return servers != null && !servers.isEmpty();
			case LoadbalancerPackage.CLUSTER__LOAD_BALANCER:
				return loadBalancer != null;
			case LoadbalancerPackage.CLUSTER__HEALTH_CHECK:
				return healthCheck != null;
			case LoadbalancerPackage.CLUSTER__SCALING_RULE:
				return scalingRule != null;
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
		result.append(", maxConnections: ");
		result.append(maxConnections);
		result.append(')');
		return result.toString();
	}

} //ClusterImpl
