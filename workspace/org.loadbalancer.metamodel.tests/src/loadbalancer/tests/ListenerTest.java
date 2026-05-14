/**
 */
package loadbalancer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import loadbalancer.Listener;
import loadbalancer.LoadbalancerFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Listener</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListenerTest extends TestCase {

	/**
	 * The fixture for this Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Listener fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ListenerTest.class);
	}

	/**
	 * Constructs a new Listener test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Listener fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Listener test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Listener getFixture() {
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
		setFixture(LoadbalancerFactory.eINSTANCE.createListener());
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

} //ListenerTest
