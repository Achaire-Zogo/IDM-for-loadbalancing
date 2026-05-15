/**
 */
package loadbalancer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see loadbalancer.LoadbalancerPackage#getMetric()
 * @model
 * @generated
 */
public enum Metric implements Enumerator {
	/**
	 * The '<em><b>CPU USAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_USAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_USAGE(0, "CPU_USAGE", "CPU_USAGE"),

	/**
	 * The '<em><b>MEMORY USAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_USAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_USAGE(1, "MEMORY_USAGE", "MEMORY_USAGE"),

	/**
	 * The '<em><b>REQUEST COUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_COUNT(2, "REQUEST_COUNT", "REQUEST_COUNT"),

	/**
	 * The '<em><b>RESPONSE TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE_TIME(3, "RESPONSE_TIME", "RESPONSE_TIME"),

	/**
	 * The '<em><b>ERROR RATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_RATE_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_RATE(4, "ERROR_RATE", "ERROR_RATE");

	/**
	 * The '<em><b>CPU USAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_USAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CPU_USAGE_VALUE = 0;

	/**
	 * The '<em><b>MEMORY USAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_USAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_USAGE_VALUE = 1;

	/**
	 * The '<em><b>REQUEST COUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_COUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_COUNT_VALUE = 2;

	/**
	 * The '<em><b>RESPONSE TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_TIME_VALUE = 3;

	/**
	 * The '<em><b>ERROR RATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_RATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_RATE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Metric[] VALUES_ARRAY =
		new Metric[] {
			CPU_USAGE,
			MEMORY_USAGE,
			REQUEST_COUNT,
			RESPONSE_TIME,
			ERROR_RATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Metric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metric get(int value) {
		switch (value) {
			case CPU_USAGE_VALUE: return CPU_USAGE;
			case MEMORY_USAGE_VALUE: return MEMORY_USAGE;
			case REQUEST_COUNT_VALUE: return REQUEST_COUNT;
			case RESPONSE_TIME_VALUE: return RESPONSE_TIME;
			case ERROR_RATE_VALUE: return ERROR_RATE;
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
	private Metric(int value, String name, String literal) {
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
	
} //Metric
