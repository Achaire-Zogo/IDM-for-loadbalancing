/**
 */
package loadbalancer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import loadbalancer.LoadbalancerFactory;
import loadbalancer.SessionPersistence;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Session Persistence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SessionPersistenceTest extends TestCase {

	/**
	 * The fixture for this Session Persistence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionPersistence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SessionPersistenceTest.class);
	}

	/**
	 * Constructs a new Session Persistence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionPersistenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Session Persistence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SessionPersistence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Session Persistence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionPersistence getFixture() {
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
		setFixture(LoadbalancerFactory.eINSTANCE.createSessionPersistence());
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

} //SessionPersistenceTest
