/**
 */
package loadbalancer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import loadbalancer.Alert;
import loadbalancer.LoadbalancerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlertTest extends TestCase {

	/**
	 * The fixture for this Alert test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alert fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlertTest.class);
	}

	/**
	 * Constructs a new Alert test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Alert test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Alert fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Alert test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alert getFixture() {
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
		setFixture(LoadbalancerFactory.eINSTANCE.createAlert());
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

} //AlertTest
