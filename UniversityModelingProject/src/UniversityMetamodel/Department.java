/**
 */
package UniversityMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.Department#getStaffs <em>Staffs</em>}</li>
 *   <li>{@link UniversityMetamodel.Department#getBuilding <em>Building</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getDepartment()
 * @model abstract="true"
 * @generated
 */
public interface Department extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Staffs</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityMetamodel.Staff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staffs</em>' containment reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getDepartment_Staffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Staff> getStaffs();

	/**
	 * Returns the value of the '<em><b>Building</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.Building#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building</em>' reference.
	 * @see #setBuilding(Building)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getDepartment_Building()
	 * @see UniversityMetamodel.Building#getDepartments
	 * @model opposite="Departments"
	 * @generated
	 */
	Building getBuilding();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Department#getBuilding <em>Building</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building</em>' reference.
	 * @see #getBuilding()
	 * @generated
	 */
	void setBuilding(Building value);

} // Department
