/**
 */
package org.loadbalancer.nginx.metamodel.nginx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.loadbalancer.nginx.metamodel.nginx.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NginxFactoryImpl extends EFactoryImpl implements NginxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NginxFactory init() {
		try {
			NginxFactory theNginxFactory = (NginxFactory) EPackage.Registry.INSTANCE.getEFactory(NginxPackage.eNS_URI);
			if (theNginxFactory != null) {
				return theNginxFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NginxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NginxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NginxPackage.NGINX_CONFIG:
			return createNginxConfig();
		case NginxPackage.UPSTREAM:
			return createUpstream();
		case NginxPackage.UPSTREAM_SERVER:
			return createUpstreamServer();
		case NginxPackage.SERVER_BLOCK:
			return createServerBlock();
		case NginxPackage.LOCATION:
			return createLocation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NginxConfig createNginxConfig() {
		NginxConfigImpl nginxConfig = new NginxConfigImpl();
		return nginxConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Upstream createUpstream() {
		UpstreamImpl upstream = new UpstreamImpl();
		return upstream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpstreamServer createUpstreamServer() {
		UpstreamServerImpl upstreamServer = new UpstreamServerImpl();
		return upstreamServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerBlock createServerBlock() {
		ServerBlockImpl serverBlock = new ServerBlockImpl();
		return serverBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NginxPackage getNginxPackage() {
		return (NginxPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NginxPackage getPackage() {
		return NginxPackage.eINSTANCE;
	}

} //NginxFactoryImpl
