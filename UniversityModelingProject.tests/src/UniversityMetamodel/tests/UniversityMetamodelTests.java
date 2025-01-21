/**
 */
package UniversityMetamodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>UniversityMetamodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversityMetamodelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new UniversityMetamodelTests("UniversityMetamodel Tests");
		suite.addTestSuite(UniversityTest.class);
		suite.addTestSuite(AcademicDepartmentTest.class);
		suite.addTestSuite(CourseTest.class);
		suite.addTestSuite(ProgrammeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityMetamodelTests(String name) {
		super(name);
	}

} //UniversityMetamodelTests
