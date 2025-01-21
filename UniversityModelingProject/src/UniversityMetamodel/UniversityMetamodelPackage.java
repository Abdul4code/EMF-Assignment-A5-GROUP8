/**
 */
package UniversityMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UniversityMetamodel.UniversityMetamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface UniversityMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UniversityMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ngrmodel.univaq.it";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversityMetamodelPackage eINSTANCE = UniversityMetamodel.impl.UniversityMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.NamedEntityImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.UniversityImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__ADDRESS = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__EMAIL = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__WEBSITE = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Campuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__CAMPUSES = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Must Have Campus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY___MUST_HAVE_CAMPUS__DIAGNOSTICCHAIN_MAP = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.CampusImpl <em>Campus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.CampusImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getCampus()
	 * @generated
	 */
	int CAMPUS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__LOCATION = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buildings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__BUILDINGS = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__DEPARTMENTS = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Campus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Campus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.BuildingImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__SIZE = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lecture Halls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LECTURE_HALLS = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__DEPARTMENTS = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.DepartmentImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Staffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STAFFS = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Building</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__BUILDING = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.AcademicDepartmentImpl <em>Academic Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.AcademicDepartmentImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getAcademicDepartment()
	 * @generated
	 */
	int ACADEMIC_DEPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_DEPARTMENT__NAME = DEPARTMENT__NAME;

	/**
	 * The feature id for the '<em><b>Staffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_DEPARTMENT__STAFFS = DEPARTMENT__STAFFS;

	/**
	 * The feature id for the '<em><b>Building</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_DEPARTMENT__BUILDING = DEPARTMENT__BUILDING;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_DEPARTMENT__PROGRAMMES = DEPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lecture Halls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_DEPARTMENT__LECTURE_HALLS = DEPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Academic Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_DEPARTMENT_FEATURE_COUNT = DEPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Atleast One Programme</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_DEPARTMENT___ATLEAST_ONE_PROGRAMME__DIAGNOSTICCHAIN_MAP = DEPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Academic Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_DEPARTMENT_OPERATION_COUNT = DEPARTMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.AdministrativeDepartmentImpl <em>Administrative Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.AdministrativeDepartmentImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getAdministrativeDepartment()
	 * @generated
	 */
	int ADMINISTRATIVE_DEPARTMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DEPARTMENT__NAME = DEPARTMENT__NAME;

	/**
	 * The feature id for the '<em><b>Staffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DEPARTMENT__STAFFS = DEPARTMENT__STAFFS;

	/**
	 * The feature id for the '<em><b>Building</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DEPARTMENT__BUILDING = DEPARTMENT__BUILDING;

	/**
	 * The feature id for the '<em><b>Opening Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DEPARTMENT__OPENING_HOUR = DEPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Closing Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DEPARTMENT__CLOSING_HOUR = DEPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Administrative Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DEPARTMENT_FEATURE_COUNT = DEPARTMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Administrative Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DEPARTMENT_OPERATION_COUNT = DEPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.CentreImpl <em>Centre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.CentreImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getCentre()
	 * @generated
	 */
	int CENTRE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRE__NAME = DEPARTMENT__NAME;

	/**
	 * The feature id for the '<em><b>Staffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRE__STAFFS = DEPARTMENT__STAFFS;

	/**
	 * The feature id for the '<em><b>Building</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRE__BUILDING = DEPARTMENT__BUILDING;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRE__SERVICES = DEPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Centre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRE_FEATURE_COUNT = DEPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Centre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRE_OPERATION_COUNT = DEPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.CourseImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TITLE = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__UNIT = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TIME = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Proffessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__PROFFESSORS = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lecture Halls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LECTURE_HALLS = NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>No Overlapping Courses In Lecture Hall</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___NO_OVERLAPPING_COURSES_IN_LECTURE_HALL__DIAGNOSTICCHAIN_MAP = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.StaffImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__ROLE = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__EMAIL = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__GENDER = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.ProffessorImpl <em>Proffessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.ProffessorImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getProffessor()
	 * @generated
	 */
	int PROFFESSOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFFESSOR__NAME = STAFF__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFFESSOR__ROLE = STAFF__ROLE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFFESSOR__EMAIL = STAFF__EMAIL;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFFESSOR__GENDER = STAFF__GENDER;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFFESSOR__COURSES = STAFF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proffessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFFESSOR_FEATURE_COUNT = STAFF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proffessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFFESSOR_OPERATION_COUNT = STAFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.LectureHallImpl <em>Lecture Hall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.LectureHallImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getLectureHall()
	 * @generated
	 */
	int LECTURE_HALL = 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_HALL__CODE = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_HALL__COURSES = 1;

	/**
	 * The number of structural features of the '<em>Lecture Hall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_HALL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lecture Hall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_HALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.ProgrammeImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__TYPE = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__DEPARTMENT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__COURSES = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__STUDENTS = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Limit Students From Same Country In Mobility Programmes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME___LIMIT_STUDENTS_FROM_SAME_COUNTRY_IN_MOBILITY_PROGRAMMES__DIAGNOSTICCHAIN_MAP = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.StudentImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Matric Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__MATRIC_NUMBER = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__COUNTRY = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__GENDER = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PROGRAMME = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.impl.ServiceImpl
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.Gender
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 15;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.ProgrammeTypes <em>Programme Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.ProgrammeTypes
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getProgrammeTypes()
	 * @generated
	 */
	int PROGRAMME_TYPES = 16;

	/**
	 * The meta object id for the '{@link UniversityMetamodel.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityMetamodel.Role
	 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 17;


	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see UniversityMetamodel.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UniversityMetamodel.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see UniversityMetamodel.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.University#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see UniversityMetamodel.University#getAddress()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Address();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.University#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see UniversityMetamodel.University#getEmail()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Email();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.University#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see UniversityMetamodel.University#getWebsite()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Website();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityMetamodel.University#getCampuses <em>Campuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campuses</em>'.
	 * @see UniversityMetamodel.University#getCampuses()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Campuses();

	/**
	 * Returns the meta object for the '{@link UniversityMetamodel.University#MustHaveCampus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Have Campus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Have Campus</em>' operation.
	 * @see UniversityMetamodel.University#MustHaveCampus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUniversity__MustHaveCampus__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campus</em>'.
	 * @see UniversityMetamodel.Campus
	 * @generated
	 */
	EClass getCampus();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Campus#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see UniversityMetamodel.Campus#getLocation()
	 * @see #getCampus()
	 * @generated
	 */
	EAttribute getCampus_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityMetamodel.Campus#getBuildings <em>Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildings</em>'.
	 * @see UniversityMetamodel.Campus#getBuildings()
	 * @see #getCampus()
	 * @generated
	 */
	EReference getCampus_Buildings();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityMetamodel.Campus#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departments</em>'.
	 * @see UniversityMetamodel.Campus#getDepartments()
	 * @see #getCampus()
	 * @generated
	 */
	EReference getCampus_Departments();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see UniversityMetamodel.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Building#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see UniversityMetamodel.Building#getSize()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityMetamodel.Building#getLectureHalls <em>Lecture Halls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lecture Halls</em>'.
	 * @see UniversityMetamodel.Building#getLectureHalls()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_LectureHalls();

	/**
	 * Returns the meta object for the reference list '{@link UniversityMetamodel.Building#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Departments</em>'.
	 * @see UniversityMetamodel.Building#getDepartments()
	 * @see #getBuilding()
	 * @generated
	 */
	EReference getBuilding_Departments();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see UniversityMetamodel.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityMetamodel.Department#getStaffs <em>Staffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staffs</em>'.
	 * @see UniversityMetamodel.Department#getStaffs()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Staffs();

	/**
	 * Returns the meta object for the reference '{@link UniversityMetamodel.Department#getBuilding <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Building</em>'.
	 * @see UniversityMetamodel.Department#getBuilding()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Building();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.AcademicDepartment <em>Academic Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Academic Department</em>'.
	 * @see UniversityMetamodel.AcademicDepartment
	 * @generated
	 */
	EClass getAcademicDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityMetamodel.AcademicDepartment#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see UniversityMetamodel.AcademicDepartment#getProgrammes()
	 * @see #getAcademicDepartment()
	 * @generated
	 */
	EReference getAcademicDepartment_Programmes();

	/**
	 * Returns the meta object for the reference list '{@link UniversityMetamodel.AcademicDepartment#getLectureHalls <em>Lecture Halls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lecture Halls</em>'.
	 * @see UniversityMetamodel.AcademicDepartment#getLectureHalls()
	 * @see #getAcademicDepartment()
	 * @generated
	 */
	EReference getAcademicDepartment_LectureHalls();

	/**
	 * Returns the meta object for the '{@link UniversityMetamodel.AcademicDepartment#AtleastOneProgramme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Atleast One Programme</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atleast One Programme</em>' operation.
	 * @see UniversityMetamodel.AcademicDepartment#AtleastOneProgramme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAcademicDepartment__AtleastOneProgramme__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.AdministrativeDepartment <em>Administrative Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Department</em>'.
	 * @see UniversityMetamodel.AdministrativeDepartment
	 * @generated
	 */
	EClass getAdministrativeDepartment();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.AdministrativeDepartment#getOpeningHour <em>Opening Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Hour</em>'.
	 * @see UniversityMetamodel.AdministrativeDepartment#getOpeningHour()
	 * @see #getAdministrativeDepartment()
	 * @generated
	 */
	EAttribute getAdministrativeDepartment_OpeningHour();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.AdministrativeDepartment#getClosingHour <em>Closing Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Hour</em>'.
	 * @see UniversityMetamodel.AdministrativeDepartment#getClosingHour()
	 * @see #getAdministrativeDepartment()
	 * @generated
	 */
	EAttribute getAdministrativeDepartment_ClosingHour();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Centre <em>Centre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centre</em>'.
	 * @see UniversityMetamodel.Centre
	 * @generated
	 */
	EClass getCentre();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityMetamodel.Centre#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see UniversityMetamodel.Centre#getServices()
	 * @see #getCentre()
	 * @generated
	 */
	EReference getCentre_Services();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see UniversityMetamodel.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Course#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see UniversityMetamodel.Course#getTitle()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Title();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see UniversityMetamodel.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Course#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see UniversityMetamodel.Course#getUnit()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Unit();

	/**
	 * Returns the meta object for the attribute list '{@link UniversityMetamodel.Course#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time</em>'.
	 * @see UniversityMetamodel.Course#getTime()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Time();

	/**
	 * Returns the meta object for the reference list '{@link UniversityMetamodel.Course#getProffessors <em>Proffessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proffessors</em>'.
	 * @see UniversityMetamodel.Course#getProffessors()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Proffessors();

	/**
	 * Returns the meta object for the reference list '{@link UniversityMetamodel.Course#getLectureHalls <em>Lecture Halls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lecture Halls</em>'.
	 * @see UniversityMetamodel.Course#getLectureHalls()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_LectureHalls();

	/**
	 * Returns the meta object for the '{@link UniversityMetamodel.Course#NoOverlappingCoursesInLectureHall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Overlapping Courses In Lecture Hall</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Overlapping Courses In Lecture Hall</em>' operation.
	 * @see UniversityMetamodel.Course#NoOverlappingCoursesInLectureHall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCourse__NoOverlappingCoursesInLectureHall__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see UniversityMetamodel.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute list '{@link UniversityMetamodel.Staff#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see UniversityMetamodel.Staff#getRole()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Role();

	/**
	 * Returns the meta object for the attribute list '{@link UniversityMetamodel.Staff#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email</em>'.
	 * @see UniversityMetamodel.Staff#getEmail()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Email();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Staff#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see UniversityMetamodel.Staff#getGender()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Gender();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Proffessor <em>Proffessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proffessor</em>'.
	 * @see UniversityMetamodel.Proffessor
	 * @generated
	 */
	EClass getProffessor();

	/**
	 * Returns the meta object for the reference list '{@link UniversityMetamodel.Proffessor#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see UniversityMetamodel.Proffessor#getCourses()
	 * @see #getProffessor()
	 * @generated
	 */
	EReference getProffessor_Courses();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.LectureHall <em>Lecture Hall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lecture Hall</em>'.
	 * @see UniversityMetamodel.LectureHall
	 * @generated
	 */
	EClass getLectureHall();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.LectureHall#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see UniversityMetamodel.LectureHall#getCode()
	 * @see #getLectureHall()
	 * @generated
	 */
	EAttribute getLectureHall_Code();

	/**
	 * Returns the meta object for the reference list '{@link UniversityMetamodel.LectureHall#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see UniversityMetamodel.LectureHall#getCourses()
	 * @see #getLectureHall()
	 * @generated
	 */
	EReference getLectureHall_Courses();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see UniversityMetamodel.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Programme#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see UniversityMetamodel.Programme#getType()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Type();

	/**
	 * Returns the meta object for the container reference '{@link UniversityMetamodel.Programme#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see UniversityMetamodel.Programme#getDepartment()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Department();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityMetamodel.Programme#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see UniversityMetamodel.Programme#getCourses()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityMetamodel.Programme#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see UniversityMetamodel.Programme#getStudents()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Students();

	/**
	 * Returns the meta object for the '{@link UniversityMetamodel.Programme#LimitStudentsFromSameCountryInMobilityProgrammes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Limit Students From Same Country In Mobility Programmes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Limit Students From Same Country In Mobility Programmes</em>' operation.
	 * @see UniversityMetamodel.Programme#LimitStudentsFromSameCountryInMobilityProgrammes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProgramme__LimitStudentsFromSameCountryInMobilityProgrammes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see UniversityMetamodel.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Student#getMatricNumber <em>Matric Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matric Number</em>'.
	 * @see UniversityMetamodel.Student#getMatricNumber()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_MatricNumber();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Student#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see UniversityMetamodel.Student#getCountry()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Country();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Student#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see UniversityMetamodel.Student#getGender()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Gender();

	/**
	 * Returns the meta object for the container reference '{@link UniversityMetamodel.Student#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see UniversityMetamodel.Student#getProgramme()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Programme();

	/**
	 * Returns the meta object for class '{@link UniversityMetamodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see UniversityMetamodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Service#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see UniversityMetamodel.Service#getTitle()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Title();

	/**
	 * Returns the meta object for the attribute '{@link UniversityMetamodel.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see UniversityMetamodel.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for enum '{@link UniversityMetamodel.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see UniversityMetamodel.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link UniversityMetamodel.ProgrammeTypes <em>Programme Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programme Types</em>'.
	 * @see UniversityMetamodel.ProgrammeTypes
	 * @generated
	 */
	EEnum getProgrammeTypes();

	/**
	 * Returns the meta object for enum '{@link UniversityMetamodel.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see UniversityMetamodel.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniversityMetamodelFactory getUniversityMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.NamedEntityImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.UniversityImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__ADDRESS = eINSTANCE.getUniversity_Address();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__EMAIL = eINSTANCE.getUniversity_Email();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__WEBSITE = eINSTANCE.getUniversity_Website();

		/**
		 * The meta object literal for the '<em><b>Campuses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__CAMPUSES = eINSTANCE.getUniversity_Campuses();

		/**
		 * The meta object literal for the '<em><b>Must Have Campus</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSITY___MUST_HAVE_CAMPUS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUniversity__MustHaveCampus__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.CampusImpl <em>Campus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.CampusImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getCampus()
		 * @generated
		 */
		EClass CAMPUS = eINSTANCE.getCampus();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPUS__LOCATION = eINSTANCE.getCampus_Location();

		/**
		 * The meta object literal for the '<em><b>Buildings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPUS__BUILDINGS = eINSTANCE.getCampus_Buildings();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPUS__DEPARTMENTS = eINSTANCE.getCampus_Departments();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.BuildingImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__SIZE = eINSTANCE.getBuilding_Size();

		/**
		 * The meta object literal for the '<em><b>Lecture Halls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__LECTURE_HALLS = eINSTANCE.getBuilding_LectureHalls();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING__DEPARTMENTS = eINSTANCE.getBuilding_Departments();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.DepartmentImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Staffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STAFFS = eINSTANCE.getDepartment_Staffs();

		/**
		 * The meta object literal for the '<em><b>Building</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__BUILDING = eINSTANCE.getDepartment_Building();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.AcademicDepartmentImpl <em>Academic Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.AcademicDepartmentImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getAcademicDepartment()
		 * @generated
		 */
		EClass ACADEMIC_DEPARTMENT = eINSTANCE.getAcademicDepartment();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACADEMIC_DEPARTMENT__PROGRAMMES = eINSTANCE.getAcademicDepartment_Programmes();

		/**
		 * The meta object literal for the '<em><b>Lecture Halls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACADEMIC_DEPARTMENT__LECTURE_HALLS = eINSTANCE.getAcademicDepartment_LectureHalls();

		/**
		 * The meta object literal for the '<em><b>Atleast One Programme</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACADEMIC_DEPARTMENT___ATLEAST_ONE_PROGRAMME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAcademicDepartment__AtleastOneProgramme__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.AdministrativeDepartmentImpl <em>Administrative Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.AdministrativeDepartmentImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getAdministrativeDepartment()
		 * @generated
		 */
		EClass ADMINISTRATIVE_DEPARTMENT = eINSTANCE.getAdministrativeDepartment();

		/**
		 * The meta object literal for the '<em><b>Opening Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_DEPARTMENT__OPENING_HOUR = eINSTANCE.getAdministrativeDepartment_OpeningHour();

		/**
		 * The meta object literal for the '<em><b>Closing Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_DEPARTMENT__CLOSING_HOUR = eINSTANCE.getAdministrativeDepartment_ClosingHour();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.CentreImpl <em>Centre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.CentreImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getCentre()
		 * @generated
		 */
		EClass CENTRE = eINSTANCE.getCentre();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRE__SERVICES = eINSTANCE.getCentre_Services();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.CourseImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TITLE = eINSTANCE.getCourse_Title();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__UNIT = eINSTANCE.getCourse_Unit();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TIME = eINSTANCE.getCourse_Time();

		/**
		 * The meta object literal for the '<em><b>Proffessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__PROFFESSORS = eINSTANCE.getCourse_Proffessors();

		/**
		 * The meta object literal for the '<em><b>Lecture Halls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__LECTURE_HALLS = eINSTANCE.getCourse_LectureHalls();

		/**
		 * The meta object literal for the '<em><b>No Overlapping Courses In Lecture Hall</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE___NO_OVERLAPPING_COURSES_IN_LECTURE_HALL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCourse__NoOverlappingCoursesInLectureHall__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.StaffImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__ROLE = eINSTANCE.getStaff_Role();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__EMAIL = eINSTANCE.getStaff_Email();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__GENDER = eINSTANCE.getStaff_Gender();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.ProffessorImpl <em>Proffessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.ProffessorImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getProffessor()
		 * @generated
		 */
		EClass PROFFESSOR = eINSTANCE.getProffessor();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFFESSOR__COURSES = eINSTANCE.getProffessor_Courses();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.LectureHallImpl <em>Lecture Hall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.LectureHallImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getLectureHall()
		 * @generated
		 */
		EClass LECTURE_HALL = eINSTANCE.getLectureHall();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LECTURE_HALL__CODE = eINSTANCE.getLectureHall_Code();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LECTURE_HALL__COURSES = eINSTANCE.getLectureHall_Courses();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.ProgrammeImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__TYPE = eINSTANCE.getProgramme_Type();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__DEPARTMENT = eINSTANCE.getProgramme_Department();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__COURSES = eINSTANCE.getProgramme_Courses();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__STUDENTS = eINSTANCE.getProgramme_Students();

		/**
		 * The meta object literal for the '<em><b>Limit Students From Same Country In Mobility Programmes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAMME___LIMIT_STUDENTS_FROM_SAME_COUNTRY_IN_MOBILITY_PROGRAMMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProgramme__LimitStudentsFromSameCountryInMobilityProgrammes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.StudentImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Matric Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__MATRIC_NUMBER = eINSTANCE.getStudent_MatricNumber();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__COUNTRY = eINSTANCE.getStudent_Country();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__GENDER = eINSTANCE.getStudent_Gender();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__PROGRAMME = eINSTANCE.getStudent_Programme();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.impl.ServiceImpl
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TITLE = eINSTANCE.getService_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.Gender
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.ProgrammeTypes <em>Programme Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.ProgrammeTypes
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getProgrammeTypes()
		 * @generated
		 */
		EEnum PROGRAMME_TYPES = eINSTANCE.getProgrammeTypes();

		/**
		 * The meta object literal for the '{@link UniversityMetamodel.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityMetamodel.Role
		 * @see UniversityMetamodel.impl.UniversityMetamodelPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

	}

} //UniversityMetamodelPackage
