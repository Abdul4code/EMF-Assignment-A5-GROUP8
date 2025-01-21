/**
 */
package UniversityMetamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lecture Hall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.LectureHall#getCode <em>Code</em>}</li>
 *   <li>{@link UniversityMetamodel.LectureHall#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getLectureHall()
 * @model
 * @generated
 */
public interface LectureHall extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getLectureHall_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.LectureHall#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link UniversityMetamodel.Course}.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.Course#getLectureHalls <em>Lecture Halls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getLectureHall_Courses()
	 * @see UniversityMetamodel.Course#getLectureHalls
	 * @model opposite="LectureHalls"
	 * @generated
	 */
	EList<Course> getCourses();

} // LectureHall
