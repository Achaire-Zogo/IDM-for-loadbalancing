/**
 */
package loadbalancer.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import loadbalancer.Algorithm;
import loadbalancer.Cluster;
import loadbalancer.HealthCheck;
import loadbalancer.LoadBalancer;
import loadbalancer.LoadbalancerPackage;
import loadbalancer.LoadbalancerTables;
import loadbalancer.ScalingRule;
import loadbalancer.Server;

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
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

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
	public boolean nonEmptyCluster(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Cluster::nonEmptyCluster";
		try {
			/**
			 *
			 * inv nonEmptyCluster:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.servers->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.CLUSTER___NON_EMPTY_CLUSTER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Server> servers = this.getServers();
				final /*@NonInvalid*/ OrderedSetValue BOXED_servers = idResolver.createOrderedSetOfAll(LoadbalancerTables.ORD_CLSSid_Server, servers);
				final /*@NonInvalid*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_servers).booleanValue();
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
	public boolean atLeastOneEnabledServer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Cluster::atLeastOneEnabledServer";
		try {
			/**
			 *
			 * inv atLeastOneEnabledServer:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.servers->exists(s | s.enabled = true)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.CLUSTER___AT_LEAST_ONE_ENABLED_SERVER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Server> servers = this.getServers();
				final /*@NonInvalid*/ OrderedSetValue BOXED_servers = idResolver.createOrderedSetOfAll(LoadbalancerTables.ORD_CLSSid_Server, servers);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_s = BOXED_servers.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_s.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Server s = (Server)ITERATOR_s.next();
					/**
					 * s.enabled
					 */
					final /*@NonInvalid*/ boolean enabled = s.isEnabled();
					//
					if (enabled) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (!enabled) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
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
	public boolean uniqueServerNames(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Cluster::uniqueServerNames";
		try {
			/**
			 *
			 * inv uniqueServerNames:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.servers->isUnique(s | s.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.CLUSTER___UNIQUE_SERVER_NAMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Server> servers = this.getServers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_servers = idResolver.createOrderedSetOfAll(LoadbalancerTables.ORD_CLSSid_Server, servers);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(LoadbalancerTables.ORD_CLSSid_Server);
					Iterator<Object> ITERATOR_s = BOXED_servers.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR_s.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Server s = (Server)ITERATOR_s.next();
						/**
						 * s.name
						 */
						final /*@NonInvalid*/ String name = s.getName();
						//
						if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
							result = false;
							break;			// Abort after second find
						}
						else {
							accumulator.add(name);
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
	public boolean weightedRequiresWeights(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Cluster::weightedRequiresWeights";
		try {
			/**
			 *
			 * inv weightedRequiresWeights:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.loadBalancer.algorithm = Algorithm::WEIGHTED_ROUND_ROBIN implies
			 *         self.servers->forAll(s | s.weight >= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, LoadbalancerPackage.Literals.CLUSTER___WEIGHTED_REQUIRES_WEIGHTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, LoadbalancerTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_eq;
					try {
						final /*@NonInvalid*/ LoadBalancer loadBalancer = this.getLoadBalancer();
						if (loadBalancer == null) {
							throw new InvalidValueException("Null source for \'\'http://www.example.org/loadbalancer\'::LoadBalancer::algorithm\'");
						}
						final /*@Thrown*/ Algorithm algorithm = loadBalancer.getAlgorithm();
						final /*@Thrown*/ EnumerationLiteralId BOXED_algorithm = algorithm == null ? null : LoadbalancerTables.ENUMid_Algorithm.getEnumerationLiteralId(ClassUtil.nonNullState(algorithm.getName()));
						final /*@Thrown*/ boolean eq = BOXED_algorithm == LoadbalancerTables.ELITid_WEIGHTED_ROUND_ROBIN;
						CAUGHT_eq = eq;
					}
					catch (Exception e) {
						CAUGHT_eq = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<Server> servers = this.getServers();
						final /*@NonInvalid*/ OrderedSetValue BOXED_servers = idResolver.createOrderedSetOfAll(LoadbalancerTables.ORD_CLSSid_Server, servers);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_s = BOXED_servers.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_s.hasNext()) {
								if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Server s = (Server)ITERATOR_s.next();
							/**
							 * s.weight >= 1
							 */
							final /*@NonInvalid*/ int weight = s.getWeight();
							final /*@NonInvalid*/ IntegerValue BOXED_weight = ValueUtil.integerValueOf(weight);
							final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_weight, LoadbalancerTables.INT_1).booleanValue();
							//
							if (!ge) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (ge) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_eq instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_eq;
							}
							if (forAll == null) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LoadbalancerPackage.CLUSTER___NON_EMPTY_CLUSTER__DIAGNOSTICCHAIN_MAP:
				return nonEmptyCluster((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case LoadbalancerPackage.CLUSTER___AT_LEAST_ONE_ENABLED_SERVER__DIAGNOSTICCHAIN_MAP:
				return atLeastOneEnabledServer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case LoadbalancerPackage.CLUSTER___UNIQUE_SERVER_NAMES__DIAGNOSTICCHAIN_MAP:
				return uniqueServerNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case LoadbalancerPackage.CLUSTER___WEIGHTED_REQUIRES_WEIGHTS__DIAGNOSTICCHAIN_MAP:
				return weightedRequiresWeights((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", maxConnections: ");
		result.append(maxConnections);
		result.append(')');
		return result.toString();
	}

} //ClusterImpl
