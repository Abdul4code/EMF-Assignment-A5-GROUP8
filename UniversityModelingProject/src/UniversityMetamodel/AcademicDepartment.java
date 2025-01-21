/**
 */
package UniversityMetamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Academic Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.AcademicDepartment#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link UniversityMetamodel.AcademicDepartment#getLectureHalls <em>Lecture Halls</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getAcademicDepartment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtleastOneProgramme'"
 * @generated
 */
public interface AcademicDepartment extends Department {
	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityMetamodel.Programme}.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.Programme#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getAcademicDepartment_Programmes()
	 * @see UniversityMetamodel.Programme#getDepartment
	 * @model opposite="Department" containment="true"
	 * @generated
	 */
	EList<Programme> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Lecture Halls</b></em>' reference list.
	 * The list contents are of type {@link UniversityMetamodel.LectureHall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture Halls</em>' reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getAcademicDepartment_LectureHalls()
	 * @model
	 * @generated
	 */
	EList<LectureHall> getLectureHalls();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            self.Programmes-&gt;notEmpty()'"
	 * @generated
	 */
	boolean AtleastOneProgramme(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AcademicDepartment
