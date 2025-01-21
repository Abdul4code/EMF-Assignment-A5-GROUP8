/**
 */
package UniversityMetamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.Programme#getType <em>Type</em>}</li>
 *   <li>{@link UniversityMetamodel.Programme#getDepartment <em>Department</em>}</li>
 *   <li>{@link UniversityMetamodel.Programme#getCourses <em>Courses</em>}</li>
 *   <li>{@link UniversityMetamodel.Programme#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LimitStudentsFromSameCountryInMobilityProgrammes'"
 * @generated
 */
public interface Programme extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link UniversityMetamodel.ProgrammeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see UniversityMetamodel.ProgrammeTypes
	 * @see #setType(ProgrammeTypes)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getProgramme_Type()
	 * @model
	 * @generated
	 */
	ProgrammeTypes getType();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Programme#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see UniversityMetamodel.ProgrammeTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(ProgrammeTypes value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.AcademicDepartment#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(AcademicDepartment)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getProgramme_Department()
	 * @see UniversityMetamodel.AcademicDepartment#getProgrammes
	 * @model opposite="Programmes" required="true" transient="false"
	 * @generated
	 */
	AcademicDepartment getDepartment();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Programme#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(AcademicDepartment value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityMetamodel.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getProgramme_Courses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityMetamodel.Student}.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.Student#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getProgramme_Students()
	 * @see UniversityMetamodel.Student#getProgramme
	 * @model opposite="Programme" containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            (self.Type = ProgrammeTypes::Mobility_Masters) implies\n            self.Students-&gt;forAll(s1 |\n                self.Students-&gt;select(s2 | s2.Country = s1.Country)-&gt;size() &lt;= 3\n            )'"
	 * @generated
	 */
	boolean LimitStudentsFromSameCountryInMobilityProgrammes(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Programme
