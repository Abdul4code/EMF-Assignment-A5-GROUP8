/**
 */
package UniversityMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.Campus#getLocation <em>Location</em>}</li>
 *   <li>{@link UniversityMetamodel.Campus#getBuildings <em>Buildings</em>}</li>
 *   <li>{@link UniversityMetamodel.Campus#getDepartments <em>Departments</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getCampus()
 * @model
 * @generated
 */
public interface Campus extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCampus_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Campus#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Buildings</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityMetamodel.Building}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildings</em>' containment reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCampus_Buildings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Building> getBuildings();

	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityMetamodel.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCampus_Departments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Department> getDepartments();

} // Campus
