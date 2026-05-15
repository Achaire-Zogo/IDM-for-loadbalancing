/**
 */
package org.loadbalancer.nginx.metamodel.nginx.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.loadbalancer.nginx.metamodel.nginx.Location;
import org.loadbalancer.nginx.metamodel.nginx.NginxConfig;
import org.loadbalancer.nginx.metamodel.nginx.NginxFactory;
import org.loadbalancer.nginx.metamodel.nginx.NginxPackage;
import org.loadbalancer.nginx.metamodel.nginx.ServerBlock;
import org.loadbalancer.nginx.metamodel.nginx.Upstream;
import org.loadbalancer.nginx.metamodel.nginx.UpstreamServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NginxPackageImpl extends EPackageImpl implements NginxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nginxConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upstreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upstreamServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NginxPackageImpl() {
		super(eNS_URI, NginxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NginxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NginxPackage init() {
		if (isInited)
			return (NginxPackage) EPackage.Registry.INSTANCE.getEPackage(NginxPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNginxPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NginxPackageImpl theNginxPackage = registeredNginxPackage instanceof NginxPackageImpl
				? (NginxPackageImpl) registeredNginxPackage
				: new NginxPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theNginxPackage.createPackageContents();

		// Initialize created meta-data
		theNginxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNginxPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NginxPackage.eNS_URI, theNginxPackage);
		return theNginxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNginxConfig() {
		return nginxConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNginxConfig_WorkerProcesses() {
		return (EAttribute) nginxConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNginxConfig_WorkerConnections() {
		return (EAttribute) nginxConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNginxConfig_Upstreams() {
		return (EReference) nginxConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNginxConfig_Servers() {
		return (EReference) nginxConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpstream() {
		return upstreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstream_Name() {
		return (EAttribute) upstreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstream_Algorithm() {
		return (EAttribute) upstreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpstream_Servers() {
		return (EReference) upstreamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpstreamServer() {
		return upstreamServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstreamServer_Address() {
		return (EAttribute) upstreamServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstreamServer_Weight() {
		return (EAttribute) upstreamServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstreamServer_MaxFails() {
		return (EAttribute) upstreamServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstreamServer_FailTimeout() {
		return (EAttribute) upstreamServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpstreamServer_Backup() {
		return (EAttribute) upstreamServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerBlock() {
		return serverBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerBlock_ListenPort() {
		return (EAttribute) serverBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerBlock_ServerName() {
		return (EAttribute) serverBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerBlock_ProxyPass() {
		return (EAttribute) serverBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerBlock_Locations() {
		return (EReference) serverBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Path() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_ProxyPass() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_ProxySetHeaders() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NginxFactory getNginxFactory() {
		return (NginxFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		nginxConfigEClass = createEClass(NGINX_CONFIG);
		createEAttribute(nginxConfigEClass, NGINX_CONFIG__WORKER_PROCESSES);
		createEAttribute(nginxConfigEClass, NGINX_CONFIG__WORKER_CONNECTIONS);
		createEReference(nginxConfigEClass, NGINX_CONFIG__UPSTREAMS);
		createEReference(nginxConfigEClass, NGINX_CONFIG__SERVERS);

		upstreamEClass = createEClass(UPSTREAM);
		createEAttribute(upstreamEClass, UPSTREAM__NAME);
		createEAttribute(upstreamEClass, UPSTREAM__ALGORITHM);
		createEReference(upstreamEClass, UPSTREAM__SERVERS);

		upstreamServerEClass = createEClass(UPSTREAM_SERVER);
		createEAttribute(upstreamServerEClass, UPSTREAM_SERVER__ADDRESS);
		createEAttribute(upstreamServerEClass, UPSTREAM_SERVER__WEIGHT);
		createEAttribute(upstreamServerEClass, UPSTREAM_SERVER__MAX_FAILS);
		createEAttribute(upstreamServerEClass, UPSTREAM_SERVER__FAIL_TIMEOUT);
		createEAttribute(upstreamServerEClass, UPSTREAM_SERVER__BACKUP);

		serverBlockEClass = createEClass(SERVER_BLOCK);
		createEAttribute(serverBlockEClass, SERVER_BLOCK__LISTEN_PORT);
		createEAttribute(serverBlockEClass, SERVER_BLOCK__SERVER_NAME);
		createEAttribute(serverBlockEClass, SERVER_BLOCK__PROXY_PASS);
		createEReference(serverBlockEClass, SERVER_BLOCK__LOCATIONS);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__PATH);
		createEAttribute(locationEClass, LOCATION__PROXY_PASS);
		createEAttribute(locationEClass, LOCATION__PROXY_SET_HEADERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(nginxConfigEClass, NginxConfig.class, "NginxConfig", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNginxConfig_WorkerProcesses(), ecorePackage.getEString(), "workerProcesses", "auto", 0, 1,
				NginxConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNginxConfig_WorkerConnections(), ecorePackage.getEInt(), "workerConnections", "1024", 0, 1,
				NginxConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getNginxConfig_Upstreams(), this.getUpstream(), null, "upstreams", null, 0, -1,
				NginxConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNginxConfig_Servers(), this.getServerBlock(), null, "servers", null, 0, -1, NginxConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upstreamEClass, Upstream.class, "Upstream", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpstream_Name(), ecorePackage.getEString(), "name", null, 0, 1, Upstream.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpstream_Algorithm(), ecorePackage.getEString(), "algorithm", null, 0, 1, Upstream.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpstream_Servers(), this.getUpstreamServer(), null, "servers", null, 0, -1, Upstream.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upstreamServerEClass, UpstreamServer.class, "UpstreamServer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpstreamServer_Address(), ecorePackage.getEString(), "address", null, 0, 1,
				UpstreamServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpstreamServer_Weight(), ecorePackage.getEInt(), "weight", "1", 0, 1, UpstreamServer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpstreamServer_MaxFails(), ecorePackage.getEInt(), "maxFails", "3", 0, 1,
				UpstreamServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpstreamServer_FailTimeout(), ecorePackage.getEString(), "failTimeout", "30s", 0, 1,
				UpstreamServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpstreamServer_Backup(), ecorePackage.getEBoolean(), "backup", "false", 0, 1,
				UpstreamServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serverBlockEClass, ServerBlock.class, "ServerBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerBlock_ListenPort(), ecorePackage.getEInt(), "listenPort", null, 0, 1, ServerBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerBlock_ServerName(), ecorePackage.getEString(), "serverName", "_", 0, 1,
				ServerBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerBlock_ProxyPass(), ecorePackage.getEString(), "proxyPass", null, 0, 1,
				ServerBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getServerBlock_Locations(), this.getLocation(), null, "locations", null, 0, -1,
				ServerBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Path(), ecorePackage.getEString(), "path", "/", 0, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_ProxyPass(), ecorePackage.getEString(), "proxyPass", null, 0, 1, Location.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_ProxySetHeaders(), ecorePackage.getEString(), "proxySetHeaders", null, 0, -1,
				Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NginxPackageImpl
