/**
 */
package UniversityMetamodel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrative Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.AdministrativeDepartment#getOpeningHour <em>Opening Hour</em>}</li>
 *   <li>{@link UniversityMetamodel.AdministrativeDepartment#getClosingHour <em>Closing Hour</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getAdministrativeDepartment()
 * @model
 * @generated
 */
public interface AdministrativeDepartment extends Department {
	/**
	 * Returns the value of the '<em><b>Opening Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Hour</em>' attribute.
	 * @see #setOpeningHour(Date)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getAdministrativeDepartment_OpeningHour()
	 * @model
	 * @generated
	 */
	Date getOpeningHour();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.AdministrativeDepartment#getOpeningHour <em>Opening Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Hour</em>' attribute.
	 * @see #getOpeningHour()
	 * @generated
	 */
	void setOpeningHour(Date value);

	/**
	 * Returns the value of the '<em><b>Closing Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Hour</em>' attribute.
	 * @see #setClosingHour(Date)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getAdministrativeDepartment_ClosingHour()
	 * @model
	 * @generated
	 */
	Date getClosingHour();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.AdministrativeDepartment#getClosingHour <em>Closing Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Hour</em>' attribute.
	 * @see #getClosingHour()
	 * @generated
	 */
	void setClosingHour(Date value);

} // AdministrativeDepartment
