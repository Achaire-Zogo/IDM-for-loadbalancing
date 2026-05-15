/**
 */
package loadbalancer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import loadbalancer.LoadbalancerFactory;
import loadbalancer.Server;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link loadbalancer.Server#validPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Port</em>}</li>
 *   <li>{@link loadbalancer.Server#positiveWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Weight</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ServerTest extends TestCase {

	/**
	 * The fixture for this Server test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Server fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerTest.class);
	}

	/**
	 * Constructs a new Server test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Server test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Server fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Server test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Server getFixture() {
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
		setFixture(LoadbalancerFactory.eINSTANCE.createServer());
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

	/**
	 * Tests the '{@link loadbalancer.Server#validPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.Server#validPort(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidPort__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link loadbalancer.Server#positiveWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Weight</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see loadbalancer.Server#positiveWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testPositiveWeight__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ServerTest
