/**
 */
package UniversityMetamodel.util;

import UniversityMetamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see UniversityMetamodel.UniversityMetamodelPackage
 * @generated
 */
public class UniversityMetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UniversityMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityMetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = UniversityMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UniversityMetamodelPackage.NAMED_ENTITY: {
				NamedEntity namedEntity = (NamedEntity)theEObject;
				T result = caseNamedEntity(namedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.UNIVERSITY: {
				University university = (University)theEObject;
				T result = caseUniversity(university);
				if (result == null) result = caseNamedEntity(university);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.CAMPUS: {
				Campus campus = (Campus)theEObject;
				T result = caseCampus(campus);
				if (result == null) result = caseNamedEntity(campus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.BUILDING: {
				Building building = (Building)theEObject;
				T result = caseBuilding(building);
				if (result == null) result = caseNamedEntity(building);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.DEPARTMENT: {
				Department department = (Department)theEObject;
				T result = caseDepartment(department);
				if (result == null) result = caseNamedEntity(department);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT: {
				AcademicDepartment academicDepartment = (AcademicDepartment)theEObject;
				T result = caseAcademicDepartment(academicDepartment);
				if (result == null) result = caseDepartment(academicDepartment);
				if (result == null) result = caseNamedEntity(academicDepartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT: {
				AdministrativeDepartment administrativeDepartment = (AdministrativeDepartment)theEObject;
				T result = caseAdministrativeDepartment(administrativeDepartment);
				if (result == null) result = caseDepartment(administrativeDepartment);
				if (result == null) result = caseNamedEntity(administrativeDepartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.CENTRE: {
				Centre centre = (Centre)theEObject;
				T result = caseCentre(centre);
				if (result == null) result = caseDepartment(centre);
				if (result == null) result = caseNamedEntity(centre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.COURSE: {
				Course course = (Course)theEObject;
				T result = caseCourse(course);
				if (result == null) result = caseNamedEntity(course);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.STAFF: {
				Staff staff = (Staff)theEObject;
				T result = caseStaff(staff);
				if (result == null) result = caseNamedEntity(staff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.PROFFESSOR: {
				Proffessor proffessor = (Proffessor)theEObject;
				T result = caseProffessor(proffessor);
				if (result == null) result = caseStaff(proffessor);
				if (result == null) result = caseNamedEntity(proffessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.LECTURE_HALL: {
				LectureHall lectureHall = (LectureHall)theEObject;
				T result = caseLectureHall(lectureHall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.PROGRAMME: {
				Programme programme = (Programme)theEObject;
				T result = caseProgramme(programme);
				if (result == null) result = caseNamedEntity(programme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.STUDENT: {
				Student student = (Student)theEObject;
				T result = caseStudent(student);
				if (result == null) result = caseNamedEntity(student);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UniversityMetamodelPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>University</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversity(University object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampus(Campus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilding(Building object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Department</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartment(Department object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Academic Department</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Academic Department</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcademicDepartment(AcademicDepartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Department</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Department</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeDepartment(AdministrativeDepartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentre(Centre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse(Course object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaff(Staff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proffessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proffessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProffessor(Proffessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lecture Hall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lecture Hall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLectureHall(LectureHall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramme(Programme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent(Student object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UniversityMetamodelSwitch
