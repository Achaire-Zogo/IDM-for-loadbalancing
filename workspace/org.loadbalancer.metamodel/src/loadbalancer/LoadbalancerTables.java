/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.loadbalancer.metamodel/model/loadbalancer.ecore
 * using:
 *   /org.loadbalancer.metamodel/model/loadbalancer.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package loadbalancer;

import java.lang.String;
// import loadbalancer.LoadbalancerPackage;
// import loadbalancer.LoadbalancerTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * LoadbalancerTables provides the dispatch tables for the loadbalancer for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class LoadbalancerTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(LoadbalancerPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_loadbalancer = IdManager.getNsURIPackageId("http://www.example.org/loadbalancer", null, LoadbalancerPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Alert = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getClassId("Alert", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Cluster = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getClassId("Cluster", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_HealthCheck = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getClassId("HealthCheck", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Listener = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getClassId("Listener", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LoadBalancer = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getClassId("LoadBalancer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LoadBalancerSystem = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getClassId("LoadBalancerSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ScalingRule = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getClassId("ScalingRule", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Server = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getClassId("Server", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SessionPersistence = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getClassId("SessionPersistence", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = LoadbalancerTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = LoadbalancerTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Algorithm = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getEnumerationId("Algorithm");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Metric = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getEnumerationId("Metric");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PersistenceType = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getEnumerationId("PersistenceType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Protocol = LoadbalancerTables.PACKid_http_c_s_s_www_example_org_s_loadbalancer.getEnumerationId("Protocol");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_65535 = ValueUtil.integerValueOf("65535");
	public static final /*@NonInvalid*/ String STR_ = "";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Listener = TypeId.BAG.getSpecializedId(LoadbalancerTables.CLSSid_Listener, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_COOKIE = LoadbalancerTables.ENUMid_PersistenceType.getEnumerationLiteralId("COOKIE");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_WEIGHTED_ROUND_ROBIN = LoadbalancerTables.ENUMid_Algorithm.getEnumerationLiteralId("WEIGHTED_ROUND_ROBIN");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Alert = TypeId.ORDERED_SET.getSpecializedId(LoadbalancerTables.CLSSid_Alert, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Cluster = TypeId.ORDERED_SET.getSpecializedId(LoadbalancerTables.CLSSid_Cluster, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Listener = TypeId.ORDERED_SET.getSpecializedId(LoadbalancerTables.CLSSid_Listener, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Server = TypeId.ORDERED_SET.getSpecializedId(LoadbalancerTables.CLSSid_Server, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			LoadbalancerTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Alert = new EcoreExecutorType(LoadbalancerPackage.Literals.ALERT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Algorithm = new EcoreExecutorEnumeration(LoadbalancerPackage.Literals.ALGORITHM, PACKAGE, 0);
		public static final EcoreExecutorType _Cluster = new EcoreExecutorType(LoadbalancerPackage.Literals.CLUSTER, PACKAGE, 0);
		public static final EcoreExecutorType _HealthCheck = new EcoreExecutorType(LoadbalancerPackage.Literals.HEALTH_CHECK, PACKAGE, 0);
		public static final EcoreExecutorType _Listener = new EcoreExecutorType(LoadbalancerPackage.Literals.LISTENER, PACKAGE, 0);
		public static final EcoreExecutorType _LoadBalancer = new EcoreExecutorType(LoadbalancerPackage.Literals.LOAD_BALANCER, PACKAGE, 0);
		public static final EcoreExecutorType _LoadBalancerSystem = new EcoreExecutorType(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Metric = new EcoreExecutorEnumeration(LoadbalancerPackage.Literals.METRIC, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PersistenceType = new EcoreExecutorEnumeration(LoadbalancerPackage.Literals.PERSISTENCE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Protocol = new EcoreExecutorEnumeration(LoadbalancerPackage.Literals.PROTOCOL, PACKAGE, 0);
		public static final EcoreExecutorType _ScalingRule = new EcoreExecutorType(LoadbalancerPackage.Literals.SCALING_RULE, PACKAGE, 0);
		public static final EcoreExecutorType _Server = new EcoreExecutorType(LoadbalancerPackage.Literals.SERVER, PACKAGE, 0);
		public static final EcoreExecutorType _SessionPersistence = new EcoreExecutorType(LoadbalancerPackage.Literals.SESSION_PERSISTENCE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Alert,
			_Algorithm,
			_Cluster,
			_HealthCheck,
			_Listener,
			_LoadBalancer,
			_LoadBalancerSystem,
			_Metric,
			_PersistenceType,
			_Protocol,
			_ScalingRule,
			_Server,
			_SessionPersistence
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Alert__Alert = new ExecutorFragment(Types._Alert, LoadbalancerTables.Types._Alert);
		private static final ExecutorFragment _Alert__OclAny = new ExecutorFragment(Types._Alert, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Alert__OclElement = new ExecutorFragment(Types._Alert, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Algorithm__Algorithm = new ExecutorFragment(Types._Algorithm, LoadbalancerTables.Types._Algorithm);
		private static final ExecutorFragment _Algorithm__OclAny = new ExecutorFragment(Types._Algorithm, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Algorithm__OclElement = new ExecutorFragment(Types._Algorithm, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Algorithm__OclEnumeration = new ExecutorFragment(Types._Algorithm, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Algorithm__OclType = new ExecutorFragment(Types._Algorithm, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Cluster__Cluster = new ExecutorFragment(Types._Cluster, LoadbalancerTables.Types._Cluster);
		private static final ExecutorFragment _Cluster__OclAny = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Cluster__OclElement = new ExecutorFragment(Types._Cluster, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _HealthCheck__HealthCheck = new ExecutorFragment(Types._HealthCheck, LoadbalancerTables.Types._HealthCheck);
		private static final ExecutorFragment _HealthCheck__OclAny = new ExecutorFragment(Types._HealthCheck, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HealthCheck__OclElement = new ExecutorFragment(Types._HealthCheck, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Listener__Listener = new ExecutorFragment(Types._Listener, LoadbalancerTables.Types._Listener);
		private static final ExecutorFragment _Listener__OclAny = new ExecutorFragment(Types._Listener, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Listener__OclElement = new ExecutorFragment(Types._Listener, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LoadBalancer__LoadBalancer = new ExecutorFragment(Types._LoadBalancer, LoadbalancerTables.Types._LoadBalancer);
		private static final ExecutorFragment _LoadBalancer__OclAny = new ExecutorFragment(Types._LoadBalancer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LoadBalancer__OclElement = new ExecutorFragment(Types._LoadBalancer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LoadBalancerSystem__LoadBalancerSystem = new ExecutorFragment(Types._LoadBalancerSystem, LoadbalancerTables.Types._LoadBalancerSystem);
		private static final ExecutorFragment _LoadBalancerSystem__OclAny = new ExecutorFragment(Types._LoadBalancerSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LoadBalancerSystem__OclElement = new ExecutorFragment(Types._LoadBalancerSystem, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Metric__Metric = new ExecutorFragment(Types._Metric, LoadbalancerTables.Types._Metric);
		private static final ExecutorFragment _Metric__OclAny = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Metric__OclElement = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Metric__OclEnumeration = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Metric__OclType = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _PersistenceType__OclAny = new ExecutorFragment(Types._PersistenceType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PersistenceType__OclElement = new ExecutorFragment(Types._PersistenceType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PersistenceType__OclEnumeration = new ExecutorFragment(Types._PersistenceType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PersistenceType__OclType = new ExecutorFragment(Types._PersistenceType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PersistenceType__PersistenceType = new ExecutorFragment(Types._PersistenceType, LoadbalancerTables.Types._PersistenceType);

		private static final ExecutorFragment _Protocol__OclAny = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Protocol__OclElement = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Protocol__OclEnumeration = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Protocol__OclType = new ExecutorFragment(Types._Protocol, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Protocol__Protocol = new ExecutorFragment(Types._Protocol, LoadbalancerTables.Types._Protocol);

		private static final ExecutorFragment _ScalingRule__OclAny = new ExecutorFragment(Types._ScalingRule, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ScalingRule__OclElement = new ExecutorFragment(Types._ScalingRule, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ScalingRule__ScalingRule = new ExecutorFragment(Types._ScalingRule, LoadbalancerTables.Types._ScalingRule);

		private static final ExecutorFragment _Server__OclAny = new ExecutorFragment(Types._Server, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Server__OclElement = new ExecutorFragment(Types._Server, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Server__Server = new ExecutorFragment(Types._Server, LoadbalancerTables.Types._Server);

		private static final ExecutorFragment _SessionPersistence__OclAny = new ExecutorFragment(Types._SessionPersistence, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SessionPersistence__OclElement = new ExecutorFragment(Types._SessionPersistence, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SessionPersistence__SessionPersistence = new ExecutorFragment(Types._SessionPersistence, LoadbalancerTables.Types._SessionPersistence);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Alert__action = new EcoreExecutorProperty(LoadbalancerPackage.Literals.ALERT__ACTION, Types._Alert, 0);
		public static final ExecutorProperty _Alert__metric = new EcoreExecutorProperty(LoadbalancerPackage.Literals.ALERT__METRIC, Types._Alert, 1);
		public static final ExecutorProperty _Alert__name = new EcoreExecutorProperty(LoadbalancerPackage.Literals.ALERT__NAME, Types._Alert, 2);
		public static final ExecutorProperty _Alert__threshold = new EcoreExecutorProperty(LoadbalancerPackage.Literals.ALERT__THRESHOLD, Types._Alert, 3);
		public static final ExecutorProperty _Alert__LoadBalancerSystem__alerts = new ExecutorPropertyWithImplementation("LoadBalancerSystem", Types._Alert, 4, new EcoreLibraryOppositeProperty(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM__ALERTS));

		public static final ExecutorProperty _Cluster__healthCheck = new EcoreExecutorProperty(LoadbalancerPackage.Literals.CLUSTER__HEALTH_CHECK, Types._Cluster, 0);
		public static final ExecutorProperty _Cluster__loadBalancer = new EcoreExecutorProperty(LoadbalancerPackage.Literals.CLUSTER__LOAD_BALANCER, Types._Cluster, 1);
		public static final ExecutorProperty _Cluster__maxConnections = new EcoreExecutorProperty(LoadbalancerPackage.Literals.CLUSTER__MAX_CONNECTIONS, Types._Cluster, 2);
		public static final ExecutorProperty _Cluster__name = new EcoreExecutorProperty(LoadbalancerPackage.Literals.CLUSTER__NAME, Types._Cluster, 3);
		public static final ExecutorProperty _Cluster__scalingRule = new EcoreExecutorProperty(LoadbalancerPackage.Literals.CLUSTER__SCALING_RULE, Types._Cluster, 4);
		public static final ExecutorProperty _Cluster__servers = new EcoreExecutorProperty(LoadbalancerPackage.Literals.CLUSTER__SERVERS, Types._Cluster, 5);
		public static final ExecutorProperty _Cluster__Listener__targetCluster = new ExecutorPropertyWithImplementation("Listener", Types._Cluster, 6, new EcoreLibraryOppositeProperty(LoadbalancerPackage.Literals.LISTENER__TARGET_CLUSTER));
		public static final ExecutorProperty _Cluster__LoadBalancerSystem__clusters = new ExecutorPropertyWithImplementation("LoadBalancerSystem", Types._Cluster, 7, new EcoreLibraryOppositeProperty(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM__CLUSTERS));

		public static final ExecutorProperty _HealthCheck__healthyThreshold = new EcoreExecutorProperty(LoadbalancerPackage.Literals.HEALTH_CHECK__HEALTHY_THRESHOLD, Types._HealthCheck, 0);
		public static final ExecutorProperty _HealthCheck__interval = new EcoreExecutorProperty(LoadbalancerPackage.Literals.HEALTH_CHECK__INTERVAL, Types._HealthCheck, 1);
		public static final ExecutorProperty _HealthCheck__path = new EcoreExecutorProperty(LoadbalancerPackage.Literals.HEALTH_CHECK__PATH, Types._HealthCheck, 2);
		public static final ExecutorProperty _HealthCheck__protocol = new EcoreExecutorProperty(LoadbalancerPackage.Literals.HEALTH_CHECK__PROTOCOL, Types._HealthCheck, 3);
		public static final ExecutorProperty _HealthCheck__timeout = new EcoreExecutorProperty(LoadbalancerPackage.Literals.HEALTH_CHECK__TIMEOUT, Types._HealthCheck, 4);
		public static final ExecutorProperty _HealthCheck__unhealthyThreshold = new EcoreExecutorProperty(LoadbalancerPackage.Literals.HEALTH_CHECK__UNHEALTHY_THRESHOLD, Types._HealthCheck, 5);
		public static final ExecutorProperty _HealthCheck__Cluster__healthCheck = new ExecutorPropertyWithImplementation("Cluster", Types._HealthCheck, 6, new EcoreLibraryOppositeProperty(LoadbalancerPackage.Literals.CLUSTER__HEALTH_CHECK));

		public static final ExecutorProperty _Listener__name = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LISTENER__NAME, Types._Listener, 0);
		public static final ExecutorProperty _Listener__port = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LISTENER__PORT, Types._Listener, 1);
		public static final ExecutorProperty _Listener__protocol = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LISTENER__PROTOCOL, Types._Listener, 2);
		public static final ExecutorProperty _Listener__targetCluster = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LISTENER__TARGET_CLUSTER, Types._Listener, 3);
		public static final ExecutorProperty _Listener__LoadBalancerSystem__listeners = new ExecutorPropertyWithImplementation("LoadBalancerSystem", Types._Listener, 4, new EcoreLibraryOppositeProperty(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM__LISTENERS));

		public static final ExecutorProperty _LoadBalancer__algorithm = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER__ALGORITHM, Types._LoadBalancer, 0);
		public static final ExecutorProperty _LoadBalancer__name = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER__NAME, Types._LoadBalancer, 1);
		public static final ExecutorProperty _LoadBalancer__sessionPersistence = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER__SESSION_PERSISTENCE, Types._LoadBalancer, 2);
		public static final ExecutorProperty _LoadBalancer__stickySession = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER__STICKY_SESSION, Types._LoadBalancer, 3);
		public static final ExecutorProperty _LoadBalancer__Cluster__loadBalancer = new ExecutorPropertyWithImplementation("Cluster", Types._LoadBalancer, 4, new EcoreLibraryOppositeProperty(LoadbalancerPackage.Literals.CLUSTER__LOAD_BALANCER));

		public static final ExecutorProperty _LoadBalancerSystem__alerts = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM__ALERTS, Types._LoadBalancerSystem, 0);
		public static final ExecutorProperty _LoadBalancerSystem__clusters = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM__CLUSTERS, Types._LoadBalancerSystem, 1);
		public static final ExecutorProperty _LoadBalancerSystem__description = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM__DESCRIPTION, Types._LoadBalancerSystem, 2);
		public static final ExecutorProperty _LoadBalancerSystem__listeners = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM__LISTENERS, Types._LoadBalancerSystem, 3);
		public static final ExecutorProperty _LoadBalancerSystem__name = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM__NAME, Types._LoadBalancerSystem, 4);
		public static final ExecutorProperty _LoadBalancerSystem__version = new EcoreExecutorProperty(LoadbalancerPackage.Literals.LOAD_BALANCER_SYSTEM__VERSION, Types._LoadBalancerSystem, 5);

		public static final ExecutorProperty _ScalingRule__maxInstances = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SCALING_RULE__MAX_INSTANCES, Types._ScalingRule, 0);
		public static final ExecutorProperty _ScalingRule__metric = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SCALING_RULE__METRIC, Types._ScalingRule, 1);
		public static final ExecutorProperty _ScalingRule__minInstances = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SCALING_RULE__MIN_INSTANCES, Types._ScalingRule, 2);
		public static final ExecutorProperty _ScalingRule__name = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SCALING_RULE__NAME, Types._ScalingRule, 3);
		public static final ExecutorProperty _ScalingRule__scaleDownThreshold = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SCALING_RULE__SCALE_DOWN_THRESHOLD, Types._ScalingRule, 4);
		public static final ExecutorProperty _ScalingRule__scaleUpThreshold = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SCALING_RULE__SCALE_UP_THRESHOLD, Types._ScalingRule, 5);
		public static final ExecutorProperty _ScalingRule__Cluster__scalingRule = new ExecutorPropertyWithImplementation("Cluster", Types._ScalingRule, 6, new EcoreLibraryOppositeProperty(LoadbalancerPackage.Literals.CLUSTER__SCALING_RULE));

		public static final ExecutorProperty _Server__enabled = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SERVER__ENABLED, Types._Server, 0);
		public static final ExecutorProperty _Server__host = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SERVER__HOST, Types._Server, 1);
		public static final ExecutorProperty _Server__maxConnections = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SERVER__MAX_CONNECTIONS, Types._Server, 2);
		public static final ExecutorProperty _Server__name = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SERVER__NAME, Types._Server, 3);
		public static final ExecutorProperty _Server__port = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SERVER__PORT, Types._Server, 4);
		public static final ExecutorProperty _Server__weight = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SERVER__WEIGHT, Types._Server, 5);
		public static final ExecutorProperty _Server__Cluster__servers = new ExecutorPropertyWithImplementation("Cluster", Types._Server, 6, new EcoreLibraryOppositeProperty(LoadbalancerPackage.Literals.CLUSTER__SERVERS));

		public static final ExecutorProperty _SessionPersistence__cookieName = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SESSION_PERSISTENCE__COOKIE_NAME, Types._SessionPersistence, 0);
		public static final ExecutorProperty _SessionPersistence__ttl = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SESSION_PERSISTENCE__TTL, Types._SessionPersistence, 1);
		public static final ExecutorProperty _SessionPersistence__type = new EcoreExecutorProperty(LoadbalancerPackage.Literals.SESSION_PERSISTENCE__TYPE, Types._SessionPersistence, 2);
		public static final ExecutorProperty _SessionPersistence__LoadBalancer__sessionPersistence = new ExecutorPropertyWithImplementation("LoadBalancer", Types._SessionPersistence, 3, new EcoreLibraryOppositeProperty(LoadbalancerPackage.Literals.LOAD_BALANCER__SESSION_PERSISTENCE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Alert =
			{
				Fragments._Alert__OclAny /* 0 */,
				Fragments._Alert__OclElement /* 1 */,
				Fragments._Alert__Alert /* 2 */
			};
		private static final int /*@NonNull*/ [] __Alert = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Algorithm =
			{
				Fragments._Algorithm__OclAny /* 0 */,
				Fragments._Algorithm__OclElement /* 1 */,
				Fragments._Algorithm__OclType /* 2 */,
				Fragments._Algorithm__OclEnumeration /* 3 */,
				Fragments._Algorithm__Algorithm /* 4 */
			};
		private static final int /*@NonNull*/ [] __Algorithm = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Cluster =
			{
				Fragments._Cluster__OclAny /* 0 */,
				Fragments._Cluster__OclElement /* 1 */,
				Fragments._Cluster__Cluster /* 2 */
			};
		private static final int /*@NonNull*/ [] __Cluster = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _HealthCheck =
			{
				Fragments._HealthCheck__OclAny /* 0 */,
				Fragments._HealthCheck__OclElement /* 1 */,
				Fragments._HealthCheck__HealthCheck /* 2 */
			};
		private static final int /*@NonNull*/ [] __HealthCheck = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Listener =
			{
				Fragments._Listener__OclAny /* 0 */,
				Fragments._Listener__OclElement /* 1 */,
				Fragments._Listener__Listener /* 2 */
			};
		private static final int /*@NonNull*/ [] __Listener = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LoadBalancer =
			{
				Fragments._LoadBalancer__OclAny /* 0 */,
				Fragments._LoadBalancer__OclElement /* 1 */,
				Fragments._LoadBalancer__LoadBalancer /* 2 */
			};
		private static final int /*@NonNull*/ [] __LoadBalancer = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LoadBalancerSystem =
			{
				Fragments._LoadBalancerSystem__OclAny /* 0 */,
				Fragments._LoadBalancerSystem__OclElement /* 1 */,
				Fragments._LoadBalancerSystem__LoadBalancerSystem /* 2 */
			};
		private static final int /*@NonNull*/ [] __LoadBalancerSystem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Metric =
			{
				Fragments._Metric__OclAny /* 0 */,
				Fragments._Metric__OclElement /* 1 */,
				Fragments._Metric__OclType /* 2 */,
				Fragments._Metric__OclEnumeration /* 3 */,
				Fragments._Metric__Metric /* 4 */
			};
		private static final int /*@NonNull*/ [] __Metric = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PersistenceType =
			{
				Fragments._PersistenceType__OclAny /* 0 */,
				Fragments._PersistenceType__OclElement /* 1 */,
				Fragments._PersistenceType__OclType /* 2 */,
				Fragments._PersistenceType__OclEnumeration /* 3 */,
				Fragments._PersistenceType__PersistenceType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PersistenceType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Protocol =
			{
				Fragments._Protocol__OclAny /* 0 */,
				Fragments._Protocol__OclElement /* 1 */,
				Fragments._Protocol__OclType /* 2 */,
				Fragments._Protocol__OclEnumeration /* 3 */,
				Fragments._Protocol__Protocol /* 4 */
			};
		private static final int /*@NonNull*/ [] __Protocol = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ScalingRule =
			{
				Fragments._ScalingRule__OclAny /* 0 */,
				Fragments._ScalingRule__OclElement /* 1 */,
				Fragments._ScalingRule__ScalingRule /* 2 */
			};
		private static final int /*@NonNull*/ [] __ScalingRule = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Server =
			{
				Fragments._Server__OclAny /* 0 */,
				Fragments._Server__OclElement /* 1 */,
				Fragments._Server__Server /* 2 */
			};
		private static final int /*@NonNull*/ [] __Server = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SessionPersistence =
			{
				Fragments._SessionPersistence__OclAny /* 0 */,
				Fragments._SessionPersistence__OclElement /* 1 */,
				Fragments._SessionPersistence__SessionPersistence /* 2 */
			};
		private static final int /*@NonNull*/ [] __SessionPersistence = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Alert.initFragments(_Alert, __Alert);
			Types._Algorithm.initFragments(_Algorithm, __Algorithm);
			Types._Cluster.initFragments(_Cluster, __Cluster);
			Types._HealthCheck.initFragments(_HealthCheck, __HealthCheck);
			Types._Listener.initFragments(_Listener, __Listener);
			Types._LoadBalancer.initFragments(_LoadBalancer, __LoadBalancer);
			Types._LoadBalancerSystem.initFragments(_LoadBalancerSystem, __LoadBalancerSystem);
			Types._Metric.initFragments(_Metric, __Metric);
			Types._PersistenceType.initFragments(_PersistenceType, __PersistenceType);
			Types._Protocol.initFragments(_Protocol, __Protocol);
			Types._ScalingRule.initFragments(_ScalingRule, __ScalingRule);
			Types._Server.initFragments(_Server, __Server);
			Types._SessionPersistence.initFragments(_SessionPersistence, __SessionPersistence);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Alert__Alert = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Alert__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Alert__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Algorithm__Algorithm = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Algorithm__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Algorithm__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Algorithm__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Algorithm__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Cluster__Cluster = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Cluster__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Cluster__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _HealthCheck__HealthCheck = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HealthCheck__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HealthCheck__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Listener__Listener = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Listener__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Listener__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LoadBalancer__LoadBalancer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LoadBalancer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LoadBalancer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LoadBalancerSystem__LoadBalancerSystem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LoadBalancerSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LoadBalancerSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Metric__Metric = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Metric__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Metric__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Metric__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Metric__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceType__PersistenceType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PersistenceType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__Protocol = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Protocol__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ScalingRule__ScalingRule = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ScalingRule__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ScalingRule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Server__Server = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Server__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Server__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SessionPersistence__SessionPersistence = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SessionPersistence__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SessionPersistence__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Alert__Alert.initOperations(_Alert__Alert);
			Fragments._Alert__OclAny.initOperations(_Alert__OclAny);
			Fragments._Alert__OclElement.initOperations(_Alert__OclElement);

			Fragments._Algorithm__Algorithm.initOperations(_Algorithm__Algorithm);
			Fragments._Algorithm__OclAny.initOperations(_Algorithm__OclAny);
			Fragments._Algorithm__OclElement.initOperations(_Algorithm__OclElement);
			Fragments._Algorithm__OclEnumeration.initOperations(_Algorithm__OclEnumeration);
			Fragments._Algorithm__OclType.initOperations(_Algorithm__OclType);

			Fragments._Cluster__Cluster.initOperations(_Cluster__Cluster);
			Fragments._Cluster__OclAny.initOperations(_Cluster__OclAny);
			Fragments._Cluster__OclElement.initOperations(_Cluster__OclElement);

			Fragments._HealthCheck__HealthCheck.initOperations(_HealthCheck__HealthCheck);
			Fragments._HealthCheck__OclAny.initOperations(_HealthCheck__OclAny);
			Fragments._HealthCheck__OclElement.initOperations(_HealthCheck__OclElement);

			Fragments._Listener__Listener.initOperations(_Listener__Listener);
			Fragments._Listener__OclAny.initOperations(_Listener__OclAny);
			Fragments._Listener__OclElement.initOperations(_Listener__OclElement);

			Fragments._LoadBalancer__LoadBalancer.initOperations(_LoadBalancer__LoadBalancer);
			Fragments._LoadBalancer__OclAny.initOperations(_LoadBalancer__OclAny);
			Fragments._LoadBalancer__OclElement.initOperations(_LoadBalancer__OclElement);

			Fragments._LoadBalancerSystem__LoadBalancerSystem.initOperations(_LoadBalancerSystem__LoadBalancerSystem);
			Fragments._LoadBalancerSystem__OclAny.initOperations(_LoadBalancerSystem__OclAny);
			Fragments._LoadBalancerSystem__OclElement.initOperations(_LoadBalancerSystem__OclElement);

			Fragments._Metric__Metric.initOperations(_Metric__Metric);
			Fragments._Metric__OclAny.initOperations(_Metric__OclAny);
			Fragments._Metric__OclElement.initOperations(_Metric__OclElement);
			Fragments._Metric__OclEnumeration.initOperations(_Metric__OclEnumeration);
			Fragments._Metric__OclType.initOperations(_Metric__OclType);

			Fragments._PersistenceType__OclAny.initOperations(_PersistenceType__OclAny);
			Fragments._PersistenceType__OclElement.initOperations(_PersistenceType__OclElement);
			Fragments._PersistenceType__OclEnumeration.initOperations(_PersistenceType__OclEnumeration);
			Fragments._PersistenceType__OclType.initOperations(_PersistenceType__OclType);
			Fragments._PersistenceType__PersistenceType.initOperations(_PersistenceType__PersistenceType);

			Fragments._Protocol__OclAny.initOperations(_Protocol__OclAny);
			Fragments._Protocol__OclElement.initOperations(_Protocol__OclElement);
			Fragments._Protocol__OclEnumeration.initOperations(_Protocol__OclEnumeration);
			Fragments._Protocol__OclType.initOperations(_Protocol__OclType);
			Fragments._Protocol__Protocol.initOperations(_Protocol__Protocol);

			Fragments._ScalingRule__OclAny.initOperations(_ScalingRule__OclAny);
			Fragments._ScalingRule__OclElement.initOperations(_ScalingRule__OclElement);
			Fragments._ScalingRule__ScalingRule.initOperations(_ScalingRule__ScalingRule);

			Fragments._Server__OclAny.initOperations(_Server__OclAny);
			Fragments._Server__OclElement.initOperations(_Server__OclElement);
			Fragments._Server__Server.initOperations(_Server__Server);

			Fragments._SessionPersistence__OclAny.initOperations(_SessionPersistence__OclAny);
			Fragments._SessionPersistence__OclElement.initOperations(_SessionPersistence__OclElement);
			Fragments._SessionPersistence__SessionPersistence.initOperations(_SessionPersistence__SessionPersistence);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Alert = {
			LoadbalancerTables.Properties._Alert__action,
			LoadbalancerTables.Properties._Alert__metric,
			LoadbalancerTables.Properties._Alert__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LoadbalancerTables.Properties._Alert__threshold
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Algorithm = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Cluster = {
			LoadbalancerTables.Properties._Cluster__healthCheck,
			LoadbalancerTables.Properties._Cluster__loadBalancer,
			LoadbalancerTables.Properties._Cluster__maxConnections,
			LoadbalancerTables.Properties._Cluster__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LoadbalancerTables.Properties._Cluster__scalingRule,
			LoadbalancerTables.Properties._Cluster__servers
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HealthCheck = {
			LoadbalancerTables.Properties._HealthCheck__healthyThreshold,
			LoadbalancerTables.Properties._HealthCheck__interval,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LoadbalancerTables.Properties._HealthCheck__path,
			LoadbalancerTables.Properties._HealthCheck__protocol,
			LoadbalancerTables.Properties._HealthCheck__timeout,
			LoadbalancerTables.Properties._HealthCheck__unhealthyThreshold
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Listener = {
			LoadbalancerTables.Properties._Listener__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LoadbalancerTables.Properties._Listener__port,
			LoadbalancerTables.Properties._Listener__protocol,
			LoadbalancerTables.Properties._Listener__targetCluster
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LoadBalancer = {
			LoadbalancerTables.Properties._LoadBalancer__algorithm,
			LoadbalancerTables.Properties._LoadBalancer__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LoadbalancerTables.Properties._LoadBalancer__sessionPersistence,
			LoadbalancerTables.Properties._LoadBalancer__stickySession
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LoadBalancerSystem = {
			LoadbalancerTables.Properties._LoadBalancerSystem__alerts,
			LoadbalancerTables.Properties._LoadBalancerSystem__clusters,
			LoadbalancerTables.Properties._LoadBalancerSystem__description,
			LoadbalancerTables.Properties._LoadBalancerSystem__listeners,
			LoadbalancerTables.Properties._LoadBalancerSystem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LoadbalancerTables.Properties._LoadBalancerSystem__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Metric = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PersistenceType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Protocol = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ScalingRule = {
			LoadbalancerTables.Properties._ScalingRule__maxInstances,
			LoadbalancerTables.Properties._ScalingRule__metric,
			LoadbalancerTables.Properties._ScalingRule__minInstances,
			LoadbalancerTables.Properties._ScalingRule__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LoadbalancerTables.Properties._ScalingRule__scaleDownThreshold,
			LoadbalancerTables.Properties._ScalingRule__scaleUpThreshold
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Server = {
			LoadbalancerTables.Properties._Server__enabled,
			LoadbalancerTables.Properties._Server__host,
			LoadbalancerTables.Properties._Server__maxConnections,
			LoadbalancerTables.Properties._Server__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LoadbalancerTables.Properties._Server__port,
			LoadbalancerTables.Properties._Server__weight
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SessionPersistence = {
			LoadbalancerTables.Properties._SessionPersistence__cookieName,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LoadbalancerTables.Properties._SessionPersistence__ttl,
			LoadbalancerTables.Properties._SessionPersistence__type
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Alert__Alert.initProperties(_Alert);
			Fragments._Algorithm__Algorithm.initProperties(_Algorithm);
			Fragments._Cluster__Cluster.initProperties(_Cluster);
			Fragments._HealthCheck__HealthCheck.initProperties(_HealthCheck);
			Fragments._Listener__Listener.initProperties(_Listener);
			Fragments._LoadBalancer__LoadBalancer.initProperties(_LoadBalancer);
			Fragments._LoadBalancerSystem__LoadBalancerSystem.initProperties(_LoadBalancerSystem);
			Fragments._Metric__Metric.initProperties(_Metric);
			Fragments._PersistenceType__PersistenceType.initProperties(_PersistenceType);
			Fragments._Protocol__Protocol.initProperties(_Protocol);
			Fragments._ScalingRule__ScalingRule.initProperties(_ScalingRule);
			Fragments._Server__Server.initProperties(_Server);
			Fragments._SessionPersistence__SessionPersistence.initProperties(_SessionPersistence);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Algorithm__ROUND_ROBIN = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.ALGORITHM.getEEnumLiteral("ROUND_ROBIN"), Types._Algorithm, 0);
		public static final EcoreExecutorEnumerationLiteral _Algorithm__WEIGHTED_ROUND_ROBIN = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.ALGORITHM.getEEnumLiteral("WEIGHTED_ROUND_ROBIN"), Types._Algorithm, 1);
		public static final EcoreExecutorEnumerationLiteral _Algorithm__LEAST_CONNECTIONS = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.ALGORITHM.getEEnumLiteral("LEAST_CONNECTIONS"), Types._Algorithm, 2);
		public static final EcoreExecutorEnumerationLiteral _Algorithm__IP_HASH = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.ALGORITHM.getEEnumLiteral("IP_HASH"), Types._Algorithm, 3);
		public static final EcoreExecutorEnumerationLiteral _Algorithm__RANDOM = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.ALGORITHM.getEEnumLiteral("RANDOM"), Types._Algorithm, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Algorithm = {
			_Algorithm__ROUND_ROBIN,
			_Algorithm__WEIGHTED_ROUND_ROBIN,
			_Algorithm__LEAST_CONNECTIONS,
			_Algorithm__IP_HASH,
			_Algorithm__RANDOM
		};

		public static final EcoreExecutorEnumerationLiteral _Metric__CPU_USAGE = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.METRIC.getEEnumLiteral("CPU_USAGE"), Types._Metric, 0);
		public static final EcoreExecutorEnumerationLiteral _Metric__MEMORY_USAGE = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.METRIC.getEEnumLiteral("MEMORY_USAGE"), Types._Metric, 1);
		public static final EcoreExecutorEnumerationLiteral _Metric__REQUEST_COUNT = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.METRIC.getEEnumLiteral("REQUEST_COUNT"), Types._Metric, 2);
		public static final EcoreExecutorEnumerationLiteral _Metric__RESPONSE_TIME = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.METRIC.getEEnumLiteral("RESPONSE_TIME"), Types._Metric, 3);
		public static final EcoreExecutorEnumerationLiteral _Metric__ERROR_RATE = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.METRIC.getEEnumLiteral("ERROR_RATE"), Types._Metric, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Metric = {
			_Metric__CPU_USAGE,
			_Metric__MEMORY_USAGE,
			_Metric__REQUEST_COUNT,
			_Metric__RESPONSE_TIME,
			_Metric__ERROR_RATE
		};

		public static final EcoreExecutorEnumerationLiteral _PersistenceType__COOKIE = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.PERSISTENCE_TYPE.getEEnumLiteral("COOKIE"), Types._PersistenceType, 0);
		public static final EcoreExecutorEnumerationLiteral _PersistenceType__IP = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.PERSISTENCE_TYPE.getEEnumLiteral("IP"), Types._PersistenceType, 1);
		public static final EcoreExecutorEnumerationLiteral _PersistenceType__HEADER = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.PERSISTENCE_TYPE.getEEnumLiteral("HEADER"), Types._PersistenceType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PersistenceType = {
			_PersistenceType__COOKIE,
			_PersistenceType__IP,
			_PersistenceType__HEADER
		};

		public static final EcoreExecutorEnumerationLiteral _Protocol__HTTP = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.PROTOCOL.getEEnumLiteral("HTTP"), Types._Protocol, 0);
		public static final EcoreExecutorEnumerationLiteral _Protocol__HTTPS = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.PROTOCOL.getEEnumLiteral("HTTPS"), Types._Protocol, 1);
		public static final EcoreExecutorEnumerationLiteral _Protocol__TCP = new EcoreExecutorEnumerationLiteral(LoadbalancerPackage.Literals.PROTOCOL.getEEnumLiteral("TCP"), Types._Protocol, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Protocol = {
			_Protocol__HTTP,
			_Protocol__HTTPS,
			_Protocol__TCP
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Algorithm.initLiterals(_Algorithm);
			Types._Metric.initLiterals(_Metric);
			Types._PersistenceType.initLiterals(_PersistenceType);
			Types._Protocol.initLiterals(_Protocol);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LoadbalancerTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new LoadbalancerTables();
	}

	private LoadbalancerTables() {
		super(LoadbalancerPackage.eNS_URI);
	}
}
