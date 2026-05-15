/**
 */
package org.loadbalancer.nginx.metamodel.nginx.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.loadbalancer.nginx.metamodel.nginx.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage
 * @generated
 */
public class NginxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NginxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NginxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NginxPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NginxSwitch<Adapter> modelSwitch = new NginxSwitch<Adapter>() {
		@Override
		public Adapter caseNginxConfig(NginxConfig object) {
			return createNginxConfigAdapter();
		}

		@Override
		public Adapter caseUpstream(Upstream object) {
			return createUpstreamAdapter();
		}

		@Override
		public Adapter caseUpstreamServer(UpstreamServer object) {
			return createUpstreamServerAdapter();
		}

		@Override
		public Adapter caseServerBlock(ServerBlock object) {
			return createServerBlockAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxConfig
	 * @generated
	 */
	public Adapter createNginxConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.loadbalancer.nginx.metamodel.nginx.Upstream <em>Upstream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Upstream
	 * @generated
	 */
	public Adapter createUpstreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer <em>Upstream Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.loadbalancer.nginx.metamodel.nginx.UpstreamServer
	 * @generated
	 */
	public Adapter createUpstreamServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock <em>Server Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.loadbalancer.nginx.metamodel.nginx.ServerBlock
	 * @generated
	 */
	public Adapter createServerBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.loadbalancer.nginx.metamodel.nginx.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
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

} //NginxAdapterFactory
