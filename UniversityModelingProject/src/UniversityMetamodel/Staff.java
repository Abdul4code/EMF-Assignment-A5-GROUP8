/**
 */
package UniversityMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.Staff#getRole <em>Role</em>}</li>
 *   <li>{@link UniversityMetamodel.Staff#getEmail <em>Email</em>}</li>
 *   <li>{@link UniversityMetamodel.Staff#getGender <em>Gender</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getStaff()
 * @model
 * @generated
 */
public interface Staff extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute list.
	 * The list contents are of type {@link UniversityMetamodel.Role}.
	 * The literals are from the enumeration {@link UniversityMetamodel.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute list.
	 * @see UniversityMetamodel.Role
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getStaff_Role()
	 * @model
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getStaff_Email()
	 * @model
	 * @generated
	 */
	EList<String> getEmail();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link UniversityMetamodel.Gender}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see UniversityMetamodel.Gender
	 * @see #setGender(Gender)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getStaff_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Staff#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see UniversityMetamodel.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

} // Staff
