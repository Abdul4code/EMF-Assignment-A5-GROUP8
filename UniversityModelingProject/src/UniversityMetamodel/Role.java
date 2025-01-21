/**
 */
package UniversityMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see UniversityMetamodel.UniversityMetamodelPackage#getRole()
 * @model
 * @generated
 */
public enum Role implements Enumerator {
	/**
	 * The '<em><b>Director</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTOR(0, "Director", "Director"),

	/**
	 * The '<em><b>Deputy Director</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPUTY_DIRECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DEPUTY_DIRECTOR(1, "DeputyDirector", "DeputyDirector"),

	/**
	 * The '<em><b>Head Teaching Officer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TEACHING_OFFICER_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_TEACHING_OFFICER(2, "HeadTeachingOfficer", "HeadTeachingOfficer"),

	/**
	 * The '<em><b>Accountant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTANT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNTANT(3, "Accountant", "Accountant"),

	/**
	 * The '<em><b>Academic Staff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACADEMIC_STAFF_VALUE
	 * @generated
	 * @ordered
	 */
	ACADEMIC_STAFF(4, "AcademicStaff", "AcademicStaff"),

	/**
	 * The '<em><b>Non Academic Staff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_ACADEMIC_STAFF_VALUE
	 * @generated
	 * @ordered
	 */
	NON_ACADEMIC_STAFF(5, "NonAcademicStaff", "NonAcademicStaff"),

	/**
	 * The '<em><b>Rector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	RECTOR(6, "Rector", "Rector"),

	/**
	 * The '<em><b>General Manager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_MANAGER(7, "GeneralManager", "GeneralManager"),

	/**
	 * The '<em><b>Proffessor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFFESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	PROFFESSOR(8, "Proffessor", "Proffessor");

	/**
	 * The '<em><b>Director</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTOR
	 * @model name="Director"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTOR_VALUE = 0;

	/**
	 * The '<em><b>Deputy Director</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPUTY_DIRECTOR
	 * @model name="DeputyDirector"
	 * @generated
	 * @ordered
	 */
	public static final int DEPUTY_DIRECTOR_VALUE = 1;

	/**
	 * The '<em><b>Head Teaching Officer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TEACHING_OFFICER
	 * @model name="HeadTeachingOfficer"
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_TEACHING_OFFICER_VALUE = 2;

	/**
	 * The '<em><b>Accountant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTANT
	 * @model name="Accountant"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTANT_VALUE = 3;

	/**
	 * The '<em><b>Academic Staff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACADEMIC_STAFF
	 * @model name="AcademicStaff"
	 * @generated
	 * @ordered
	 */
	public static final int ACADEMIC_STAFF_VALUE = 4;

	/**
	 * The '<em><b>Non Academic Staff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_ACADEMIC_STAFF
	 * @model name="NonAcademicStaff"
	 * @generated
	 * @ordered
	 */
	public static final int NON_ACADEMIC_STAFF_VALUE = 5;

	/**
	 * The '<em><b>Rector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTOR
	 * @model name="Rector"
	 * @generated
	 * @ordered
	 */
	public static final int RECTOR_VALUE = 6;

	/**
	 * The '<em><b>General Manager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_MANAGER
	 * @model name="GeneralManager"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_MANAGER_VALUE = 7;

	/**
	 * The '<em><b>Proffessor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFFESSOR
	 * @model name="Proffessor"
	 * @generated
	 * @ordered
	 */
	public static final int PROFFESSOR_VALUE = 8;

	/**
	 * An array of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Role[] VALUES_ARRAY =
		new Role[] {
			DIRECTOR,
			DEPUTY_DIRECTOR,
			HEAD_TEACHING_OFFICER,
			ACCOUNTANT,
			ACADEMIC_STAFF,
			NON_ACADEMIC_STAFF,
			RECTOR,
			GENERAL_MANAGER,
			PROFFESSOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Role> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Role result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Role get(int value) {
		switch (value) {
			case DIRECTOR_VALUE: return DIRECTOR;
			case DEPUTY_DIRECTOR_VALUE: return DEPUTY_DIRECTOR;
			case HEAD_TEACHING_OFFICER_VALUE: return HEAD_TEACHING_OFFICER;
			case ACCOUNTANT_VALUE: return ACCOUNTANT;
			case ACADEMIC_STAFF_VALUE: return ACADEMIC_STAFF;
			case NON_ACADEMIC_STAFF_VALUE: return NON_ACADEMIC_STAFF;
			case RECTOR_VALUE: return RECTOR;
			case GENERAL_MANAGER_VALUE: return GENERAL_MANAGER;
			case PROFFESSOR_VALUE: return PROFFESSOR;
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
	private Role(int value, String name, String literal) {
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
	
} //Role
