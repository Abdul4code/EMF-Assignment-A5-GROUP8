/**
 */
package UniversityMetamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.University#getAddress <em>Address</em>}</li>
 *   <li>{@link UniversityMetamodel.University#getEmail <em>Email</em>}</li>
 *   <li>{@link UniversityMetamodel.University#getWebsite <em>Website</em>}</li>
 *   <li>{@link UniversityMetamodel.University#getCampuses <em>Campuses</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getUniversity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustHaveCampus'"
 * @generated
 */
public interface University extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getUniversity_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.University#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getUniversity_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.University#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getUniversity_Website()
	 * @model
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link UniversityMetamodel.University#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>Campuses</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityMetamodel.Campus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campuses</em>' containment reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getUniversity_Campuses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Campus> getCampuses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n            self.Campuses-&gt;notEmpty()'"
	 * @generated
	 */
	boolean MustHaveCampus(DiagnosticChain diagnostics, Map<Object, Object> context);

} // University
