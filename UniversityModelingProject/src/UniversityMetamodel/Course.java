/**
 */
package UniversityMetamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.Course#getTitle <em>Title</em>}</li>
 *   <li>{@link UniversityMetamodel.Course#getCode <em>Code</em>}</li>
 *   <li>{@link UniversityMetamodel.Course#getUnit <em>Unit</em>}</li>
 *   <li>{@link UniversityMetamodel.Course#getTime <em>Time</em>}</li>
 *   <li>{@link UniversityMetamodel.Course#getProffessors <em>Proffessors</em>}</li>
 *   <li>{@link UniversityMetamodel.Course#getLectureHalls <em>Lecture Halls</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoOverlappingCoursesInLectureHall'"
 * @generated
 */
public interface Course extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCourse_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Course#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(int)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCourse_Unit()
	 * @model required="true"
	 * @generated
	 */
	int getUnit();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Course#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCourse_Time()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTime();

	/**
	 * Returns the value of the '<em><b>Proffessors</b></em>' reference list.
	 * The list contents are of type {@link UniversityMetamodel.Proffessor}.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.Proffessor#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proffessors</em>' reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCourse_Proffessors()
	 * @see UniversityMetamodel.Proffessor#getCourses
	 * @model opposite="Courses" required="true"
	 * @generated
	 */
	EList<Proffessor> getProffessors();

	/**
	 * Returns the value of the '<em><b>Lecture Halls</b></em>' reference list.
	 * The list contents are of type {@link UniversityMetamodel.LectureHall}.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.LectureHall#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture Halls</em>' reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCourse_LectureHalls()
	 * @see UniversityMetamodel.LectureHall#getCourses
	 * @model opposite="Courses"
	 * @generated
	 */
	EList<LectureHall> getLectureHalls();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            self.LectureHalls-&gt;forAll(hall |\n                hall.Courses-&gt;forAll(c1, c2 |\n                    c1 &lt;&gt; c2 implies c1.Time-&gt;intersection(c2.Time)-&gt;isEmpty()\n                )\n            )'"
	 * @generated
	 */
	boolean NoOverlappingCoursesInLectureHall(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Course
