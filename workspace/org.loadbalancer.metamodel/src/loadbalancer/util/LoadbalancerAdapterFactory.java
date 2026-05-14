/**
 */
package loadbalancer.util;

import loadbalancer.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see loadbalancer.LoadbalancerPackage
 * @generated
 */
public class LoadbalancerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LoadbalancerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadbalancerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LoadbalancerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadbalancerSwitch<Adapter> modelSwitch =
		new LoadbalancerSwitch<Adapter>() {
			@Override
			public Adapter caseLoadBalancerSystem(LoadBalancerSystem object) {
				return createLoadBalancerSystemAdapter();
			}
			@Override
			public Adapter caseCluster(Cluster object) {
				return createClusterAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseLoadBalancer(LoadBalancer object) {
				return createLoadBalancerAdapter();
			}
			@Override
			public Adapter caseHealthCheck(HealthCheck object) {
				return createHealthCheckAdapter();
			}
			@Override
			public Adapter caseListener(Listener object) {
				return createListenerAdapter();
			}
			@Override
			public Adapter caseSessionPersistence(SessionPersistence object) {
				return createSessionPersistenceAdapter();
			}
			@Override
			public Adapter caseAlert(Alert object) {
				return createAlertAdapter();
			}
			@Override
			public Adapter caseScalingRule(ScalingRule object) {
				return createScalingRuleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link loadbalancer.LoadBalancerSystem <em>Load Balancer System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see loadbalancer.LoadBalancerSystem
	 * @generated
	 */
	public Adapter createLoadBalancerSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link loadbalancer.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see loadbalancer.Cluster
	 * @generated
	 */
	public Adapter createClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link loadbalancer.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see loadbalancer.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link loadbalancer.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see loadbalancer.LoadBalancer
	 * @generated
	 */
	public Adapter createLoadBalancerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link loadbalancer.HealthCheck <em>Health Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see loadbalancer.HealthCheck
	 * @generated
	 */
	public Adapter createHealthCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link loadbalancer.Listener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see loadbalancer.Listener
	 * @generated
	 */
	public Adapter createListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link loadbalancer.SessionPersistence <em>Session Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see loadbalancer.SessionPersistence
	 * @generated
	 */
	public Adapter createSessionPersistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link loadbalancer.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see loadbalancer.Alert
	 * @generated
	 */
	public Adapter createAlertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link loadbalancer.ScalingRule <em>Scaling Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see loadbalancer.ScalingRule
	 * @generated
	 */
	public Adapter createScalingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LoadbalancerAdapterFactory
