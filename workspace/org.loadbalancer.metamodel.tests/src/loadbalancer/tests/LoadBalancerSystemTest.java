/**
 */
package loadbalancer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import loadbalancer.LoadBalancerSystem;
import loadbalancer.LoadbalancerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Load Balancer System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadBalancerSystemTest extends TestCase {

	/**
	 * The fixture for this Load Balancer System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoadBalancerSystemTest.class);
	}

	/**
	 * Constructs a new Load Balancer System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancerSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Load Balancer System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LoadBalancerSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Load Balancer System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LoadbalancerFactory.eINSTANCE.createLoadBalancerSystem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LoadBalancerSystemTest
