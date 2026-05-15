/**
 */
package loadbalancer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Persistence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see loadbalancer.LoadbalancerPackage#getPersistenceType()
 * @model
 * @generated
 */
public enum PersistenceType implements Enumerator {
	/**
	 * The '<em><b>COOKIE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOKIE_VALUE
	 * @generated
	 * @ordered
	 */
	COOKIE(0, "COOKIE", "COOKIE"),

	/**
	 * The '<em><b>IP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_VALUE
	 * @generated
	 * @ordered
	 */
	IP(1, "IP", "IP"),

	/**
	 * The '<em><b>HEADER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	HEADER(2, "HEADER", "HEADER");

	/**
	 * The '<em><b>COOKIE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOKIE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COOKIE_VALUE = 0;

	/**
	 * The '<em><b>IP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP_VALUE = 1;

	/**
	 * The '<em><b>HEADER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEADER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Persistence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PersistenceType[] VALUES_ARRAY =
		new PersistenceType[] {
			COOKIE,
			IP,
			HEADER,
		};

	/**
	 * A public read-only list of all the '<em><b>Persistence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PersistenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Persistence Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersistenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersistenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Persistence Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersistenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersistenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Persistence Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersistenceType get(int value) {
		switch (value) {
			case COOKIE_VALUE: return COOKIE;
			case IP_VALUE: return IP;
			case HEADER_VALUE: return HEADER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PersistenceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PersistenceType
