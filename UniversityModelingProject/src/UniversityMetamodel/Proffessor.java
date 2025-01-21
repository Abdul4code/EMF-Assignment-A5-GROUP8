/**
 */
package UniversityMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proffessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.Proffessor#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getProffessor()
 * @model
 * @generated
 */
public interface Proffessor extends Staff {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link UniversityMetamodel.Course}.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.Course#getProffessors <em>Proffessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getProffessor_Courses()
	 * @see UniversityMetamodel.Course#getProffessors
	 * @model opposite="Proffessors"
	 * @generated
	 */
	EList<Course> getCourses();

} // Proffessor
