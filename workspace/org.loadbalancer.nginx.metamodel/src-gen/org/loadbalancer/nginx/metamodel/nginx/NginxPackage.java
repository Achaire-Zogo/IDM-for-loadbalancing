/**
 */
package org.loadbalancer.nginx.metamodel.nginx;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.loadbalancer.nginx.metamodel.nginx.NginxFactory
 * @model kind="package"
 * @generated
 */
public interface NginxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nginx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/nginx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nginx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NginxPackage eINSTANCE = org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.NginxConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxConfigImpl
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getNginxConfig()
	 * @generated
	 */
	int NGINX_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Worker Processes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGINX_CONFIG__WORKER_PROCESSES = 0;

	/**
	 * The feature id for the '<em><b>Worker Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGINX_CONFIG__WORKER_CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Upstreams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGINX_CONFIG__UPSTREAMS = 2;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGINX_CONFIG__SERVERS = 3;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGINX_CONFIG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGINX_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamImpl <em>Upstream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamImpl
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getUpstream()
	 * @generated
	 */
	int UPSTREAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM__ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM__SERVERS = 2;

	/**
	 * The number of structural features of the '<em>Upstream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Upstream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamServerImpl <em>Upstream Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamServerImpl
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getUpstreamServer()
	 * @generated
	 */
	int UPSTREAM_SERVER = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_SERVER__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_SERVER__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Max Fails</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_SERVER__MAX_FAILS = 2;

	/**
	 * The feature id for the '<em><b>Fail Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_SERVER__FAIL_TIMEOUT = 3;

	/**
	 * The feature id for the '<em><b>Backup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_SERVER__BACKUP = 4;

	/**
	 * The number of structural features of the '<em>Upstream Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_SERVER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Upstream Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.ServerBlockImpl <em>Server Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.ServerBlockImpl
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getServerBlock()
	 * @generated
	 */
	int SERVER_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Listen Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_BLOCK__LISTEN_PORT = 0;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_BLOCK__SERVER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Proxy Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_BLOCK__PROXY_PASS = 2;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_BLOCK__LOCATIONS = 3;

	/**
	 * The number of structural features of the '<em>Server Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Server Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.LocationImpl
	 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PATH = 0;

	/**
	 * The feature id for the '<em><b>Proxy Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROXY_PASS = 1;

	/**
	 * The feature id for the '<em><b>Proxy Set Headers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROXY_SET_HEADERS = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxConfig
	 * @generated
	 */
	EClass getNginxConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getWorkerProcesses <em>Worker Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Processes</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getWorkerProcesses()
	 * @see #getNginxConfig()
	 * @generated
	 */
	EAttribute getNginxConfig_WorkerProcesses();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getWorkerConnections <em>Worker Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Connections</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getWorkerConnections()
	 * @see #getNginxConfig()
	 * @generated
	 */
	EAttribute getNginxConfig_WorkerConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getUpstreams <em>Upstreams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upstreams</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getUpstreams()
	 * @see #getNginxConfig()
	 * @generated
	 */
	EReference getNginxConfig_Upstreams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.NginxConfig#getServers()
	 * @see #getNginxConfig()
	 * @generated
	 */
	EReference getNginxConfig_Servers();

	/**
	 * Returns the meta object for class '{@link org.loadbalancer.nginx.metamodel.nginx.Upstream <em>Upstream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upstream</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Upstream
	 * @generated
	 */
	EClass getUpstream();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.Upstream#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Upstream#getName()
	 * @see #getUpstream()
	 * @generated
	 */
	EAttribute getUpstream_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.Upstream#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Upstream#getAlgorithm()
	 * @see #getUpstream()
	 * @generated
	 */
	EAttribute getUpstream_Algorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.loadbalancer.nginx.metamodel.nginx.Upstream#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Upstream#getServers()
	 * @see #getUpstream()
	 * @generated
	 */
	EReference getUpstream_Servers();

	/**
	 * Returns the meta object for class '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer <em>Upstream Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upstream Server</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.UpstreamServer
	 * @generated
	 */
	EClass getUpstreamServer();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getAddress()
	 * @see #getUpstreamServer()
	 * @generated
	 */
	EAttribute getUpstreamServer_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getWeight()
	 * @see #getUpstreamServer()
	 * @generated
	 */
	EAttribute getUpstreamServer_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getMaxFails <em>Max Fails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Fails</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getMaxFails()
	 * @see #getUpstreamServer()
	 * @generated
	 */
	EAttribute getUpstreamServer_MaxFails();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getFailTimeout <em>Fail Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail Timeout</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#getFailTimeout()
	 * @see #getUpstreamServer()
	 * @generated
	 */
	EAttribute getUpstreamServer_FailTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#isBackup <em>Backup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backup</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.UpstreamServer#isBackup()
	 * @see #getUpstreamServer()
	 * @generated
	 */
	EAttribute getUpstreamServer_Backup();

	/**
	 * Returns the meta object for class '{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock <em>Server Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Block</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.ServerBlock
	 * @generated
	 */
	EClass getServerBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getListenPort <em>Listen Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listen Port</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getListenPort()
	 * @see #getServerBlock()
	 * @generated
	 */
	EAttribute getServerBlock_ListenPort();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getServerName()
	 * @see #getServerBlock()
	 * @generated
	 */
	EAttribute getServerBlock_ServerName();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getProxyPass <em>Proxy Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Pass</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getProxyPass()
	 * @see #getServerBlock()
	 * @generated
	 */
	EAttribute getServerBlock_ProxyPass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.ServerBlock#getLocations()
	 * @see #getServerBlock()
	 * @generated
	 */
	EReference getServerBlock_Locations();

	/**
	 * Returns the meta object for class '{@link org.loadbalancer.nginx.metamodel.nginx.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.Location#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Location#getPath()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.loadbalancer.nginx.metamodel.nginx.Location#getProxyPass <em>Proxy Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Pass</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Location#getProxyPass()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_ProxyPass();

	/**
	 * Returns the meta object for the attribute list '{@link org.loadbalancer.nginx.metamodel.nginx.Location#getProxySetHeaders <em>Proxy Set Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Proxy Set Headers</em>'.
	 * @see org.loadbalancer.nginx.metamodel.nginx.Location#getProxySetHeaders()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_ProxySetHeaders();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NginxFactory getNginxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.NginxConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxConfigImpl
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getNginxConfig()
		 * @generated
		 */
		EClass NGINX_CONFIG = eINSTANCE.getNginxConfig();

		/**
		 * The meta object literal for the '<em><b>Worker Processes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGINX_CONFIG__WORKER_PROCESSES = eINSTANCE.getNginxConfig_WorkerProcesses();

		/**
		 * The meta object literal for the '<em><b>Worker Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGINX_CONFIG__WORKER_CONNECTIONS = eINSTANCE.getNginxConfig_WorkerConnections();

		/**
		 * The meta object literal for the '<em><b>Upstreams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NGINX_CONFIG__UPSTREAMS = eINSTANCE.getNginxConfig_Upstreams();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NGINX_CONFIG__SERVERS = eINSTANCE.getNginxConfig_Servers();

		/**
		 * The meta object literal for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamImpl <em>Upstream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamImpl
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getUpstream()
		 * @generated
		 */
		EClass UPSTREAM = eINSTANCE.getUpstream();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM__NAME = eINSTANCE.getUpstream_Name();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM__ALGORITHM = eINSTANCE.getUpstream_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPSTREAM__SERVERS = eINSTANCE.getUpstream_Servers();

		/**
		 * The meta object literal for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamServerImpl <em>Upstream Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.UpstreamServerImpl
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getUpstreamServer()
		 * @generated
		 */
		EClass UPSTREAM_SERVER = eINSTANCE.getUpstreamServer();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM_SERVER__ADDRESS = eINSTANCE.getUpstreamServer_Address();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM_SERVER__WEIGHT = eINSTANCE.getUpstreamServer_Weight();

		/**
		 * The meta object literal for the '<em><b>Max Fails</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM_SERVER__MAX_FAILS = eINSTANCE.getUpstreamServer_MaxFails();

		/**
		 * The meta object literal for the '<em><b>Fail Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM_SERVER__FAIL_TIMEOUT = eINSTANCE.getUpstreamServer_FailTimeout();

		/**
		 * The meta object literal for the '<em><b>Backup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM_SERVER__BACKUP = eINSTANCE.getUpstreamServer_Backup();

		/**
		 * The meta object literal for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.ServerBlockImpl <em>Server Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.ServerBlockImpl
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getServerBlock()
		 * @generated
		 */
		EClass SERVER_BLOCK = eINSTANCE.getServerBlock();

		/**
		 * The meta object literal for the '<em><b>Listen Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_BLOCK__LISTEN_PORT = eINSTANCE.getServerBlock_ListenPort();

		/**
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_BLOCK__SERVER_NAME = eINSTANCE.getServerBlock_ServerName();

		/**
		 * The meta object literal for the '<em><b>Proxy Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_BLOCK__PROXY_PASS = eINSTANCE.getServerBlock_ProxyPass();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_BLOCK__LOCATIONS = eINSTANCE.getServerBlock_Locations();

		/**
		 * The meta object literal for the '{@link org.loadbalancer.nginx.metamodel.nginx.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.LocationImpl
		 * @see org.loadbalancer.nginx.metamodel.nginx.impl.NginxPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__PATH = eINSTANCE.getLocation_Path();

		/**
		 * The meta object literal for the '<em><b>Proxy Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__PROXY_PASS = eINSTANCE.getLocation_ProxyPass();

		/**
		 * The meta object literal for the '<em><b>Proxy Set Headers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__PROXY_SET_HEADERS = eINSTANCE.getLocation_ProxySetHeaders();

	}

} //NginxPackage
