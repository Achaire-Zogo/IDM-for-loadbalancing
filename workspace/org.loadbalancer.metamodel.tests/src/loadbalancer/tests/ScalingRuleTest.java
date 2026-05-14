/**
 */
package loadbalancer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import loadbalancer.LoadbalancerFactory;
import loadbalancer.ScalingRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scaling Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalingRuleTest extends TestCase {

	/**
	 * The fixture for this Scaling Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingRule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScalingRuleTest.class);
	}

	/**
	 * Constructs a new Scaling Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingRuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Scaling Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ScalingRule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Scaling Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingRule getFixture() {
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
		setFixture(LoadbalancerFactory.eINSTANCE.createScalingRule());
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

} //ScalingRuleTest
