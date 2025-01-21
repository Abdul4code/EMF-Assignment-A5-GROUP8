/**
 */
package UniversityMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.Student#getMatricNumber <em>Matric Number</em>}</li>
 *   <li>{@link UniversityMetamodel.Student#getCountry <em>Country</em>}</li>
 *   <li>{@link UniversityMetamodel.Student#getGender <em>Gender</em>}</li>
 *   <li>{@link UniversityMetamodel.Student#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Matric Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matric Number</em>' attribute.
	 * @see #setMatricNumber(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getStudent_MatricNumber()
	 * @model required="true"
	 * @generated
	 */
	String getMatricNumber();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Student#getMatricNumber <em>Matric Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matric Number</em>' attribute.
	 * @see #getMatricNumber()
	 * @generated
	 */
	void setMatricNumber(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getStudent_Country()
	 * @model required="true"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Student#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link UniversityMetamodel.Gender}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see UniversityMetamodel.Gender
	 * @see #setGender(Gender)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getStudent_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Student#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see UniversityMetamodel.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UniversityMetamodel.Programme#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getStudent_Programme()
	 * @see UniversityMetamodel.Programme#getStudents
	 * @model opposite="Students" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.Student#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

} // Student
