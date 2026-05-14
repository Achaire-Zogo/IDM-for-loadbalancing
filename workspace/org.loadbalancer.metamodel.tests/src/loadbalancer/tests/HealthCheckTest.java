/**
 */
package loadbalancer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import loadbalancer.HealthCheck;
import loadbalancer.LoadbalancerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Health Check</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthCheckTest extends TestCase {

	/**
	 * The fixture for this Health Check test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthCheck fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HealthCheckTest.class);
	}

	/**
	 * Constructs a new Health Check test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthCheckTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Health Check test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HealthCheck fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Health Check test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthCheck getFixture() {
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
		setFixture(LoadbalancerFactory.eINSTANCE.createHealthCheck());
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

} //HealthCheckTest
