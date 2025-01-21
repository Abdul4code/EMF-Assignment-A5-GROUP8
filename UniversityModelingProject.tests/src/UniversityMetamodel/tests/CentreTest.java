/**
 */
package UniversityMetamodel.tests;

import UniversityMetamodel.Centre;
import UniversityMetamodel.UniversityMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Centre</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CentreTest extends DepartmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CentreTest.class);
	}

	/**
	 * Constructs a new Centre test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentreTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Centre test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Centre getFixture() {
		return (Centre)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UniversityMetamodelFactory.eINSTANCE.createCentre());
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

} //CentreTest
