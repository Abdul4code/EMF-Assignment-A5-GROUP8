/**
 */
package UniversityMetamodel.tests;

import UniversityMetamodel.AdministrativeDepartment;
import UniversityMetamodel.UniversityMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Administrative Department</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdministrativeDepartmentTest extends DepartmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdministrativeDepartmentTest.class);
	}

	/**
	 * Constructs a new Administrative Department test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeDepartmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Administrative Department test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AdministrativeDepartment getFixture() {
		return (AdministrativeDepartment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UniversityMetamodelFactory.eINSTANCE.createAdministrativeDepartment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AdministrativeDepartmentTest
