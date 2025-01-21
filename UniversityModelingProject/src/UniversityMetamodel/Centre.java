/**
 */
package UniversityMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Centre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.Centre#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see UniversityMetamodel.UniversityMetamodelPackage#getCentre()
 * @model
 * @generated
 */
public interface Centre extends Department {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityMetamodel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see UniversityMetamodel.UniversityMetamodelPackage#getCentre_Services()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Service> getServices();

} // Centre
