/**
 */
package loadbalancer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import loadbalancer.LoadBalancer;
import loadbalancer.LoadbalancerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Load Balancer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadBalancerTest extends TestCase {

	/**
	 * The fixture for this Load Balancer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoadBalancerTest.class);
	}

	/**
	 * Constructs a new Load Balancer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Load Balancer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LoadBalancer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Load Balancer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancer getFixture() {
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
		setFixture(LoadbalancerFactory.eINSTANCE.createLoadBalancer());
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

} //LoadBalancerTest
