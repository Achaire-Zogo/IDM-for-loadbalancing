/**
 */
package loadbalancer.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>loadbalancer</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadbalancerTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new LoadbalancerTests("loadbalancer Tests");
		suite.addTestSuite(LoadBalancerSystemTest.class);
		suite.addTestSuite(ClusterTest.class);
		suite.addTestSuite(ServerTest.class);
		suite.addTestSuite(HealthCheckTest.class);
		suite.addTestSuite(ListenerTest.class);
		suite.addTestSuite(SessionPersistenceTest.class);
		suite.addTestSuite(ScalingRuleTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadbalancerTests(String name) {
		super(name);
	}

} //LoadbalancerTests
