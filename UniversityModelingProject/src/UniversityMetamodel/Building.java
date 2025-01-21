/**
 */
package UniversityMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.Building#getSize <em>Size</em>}</li>
 *   <li>{@link UniversityMetamodel.Building#getLectureHalls <em>Lecture Halls</em>}</li>
 *   <li>{@link UniversityMetamodel.Building#getDepartments <em>Departments</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getBuilding()
 * @model
 * @generated
 */
public interface Building extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getBuilding_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Building#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Lecture Halls</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityMetamodel.LectureHall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture Halls</em>' containment reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getBuilding_LectureHalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<LectureHall> getLectureHalls();

	/**
	 * Returns the value of the '<em><b>Departments</b></em>' reference list.
	 * The list contents are of type {@link UniversityMetamodel.Department}.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.Department#getBuilding <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getBuilding_Departments()
	 * @see UniversityMetamodel.Department#getBuilding
	 * @model opposite="Building"
	 * @generated
	 */
	EList<Department> getDepartments();

} // Building
