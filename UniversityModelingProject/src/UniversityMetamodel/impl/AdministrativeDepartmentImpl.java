/**
 */
package UniversityMetamodel.impl;

import UniversityMetamodel.AdministrativeDepartment;
import UniversityMetamodel.UniversityMetamodelPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrative Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.impl.AdministrativeDepartmentImpl#getOpeningHour <em>Opening Hour</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.AdministrativeDepartmentImpl#getClosingHour <em>Closing Hour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministrativeDepartmentImpl extends DepartmentImpl implements AdministrativeDepartment {
	/**
	 * The default value of the '{@link #getOpeningHour() <em>Opening Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningHour()
	 * @generated
	 * @ordered
	 */
	protected static final Date OPENING_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpeningHour() <em>Opening Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningHour()
	 * @generated
	 * @ordered
	 */
	protected Date openingHour = OPENING_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosingHour() <em>Closing Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingHour()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSING_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosingHour() <em>Closing Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingHour()
	 * @generated
	 * @ordered
	 */
	protected Date closingHour = CLOSING_HOUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrativeDepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityMetamodelPackage.Literals.ADMINISTRATIVE_DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOpeningHour() {
		return openingHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningHour(Date newOpeningHour) {
		Date oldOpeningHour = openingHour;
		openingHour = newOpeningHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__OPENING_HOUR, oldOpeningHour, openingHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getClosingHour() {
		return closingHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingHour(Date newClosingHour) {
		Date oldClosingHour = closingHour;
		closingHour = newClosingHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__CLOSING_HOUR, oldClosingHour, closingHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__OPENING_HOUR:
				return getOpeningHour();
			case UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__CLOSING_HOUR:
				return getClosingHour();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__OPENING_HOUR:
				setOpeningHour((Date)newValue);
				return;
			case UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__CLOSING_HOUR:
				setClosingHour((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__OPENING_HOUR:
				setOpeningHour(OPENING_HOUR_EDEFAULT);
				return;
			case UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__CLOSING_HOUR:
				setClosingHour(CLOSING_HOUR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__OPENING_HOUR:
				return OPENING_HOUR_EDEFAULT == null ? openingHour != null : !OPENING_HOUR_EDEFAULT.equals(openingHour);
			case UniversityMetamodelPackage.ADMINISTRATIVE_DEPARTMENT__CLOSING_HOUR:
				return CLOSING_HOUR_EDEFAULT == null ? closingHour != null : !CLOSING_HOUR_EDEFAULT.equals(closingHour);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (OpeningHour: ");
		result.append(openingHour);
		result.append(", ClosingHour: ");
		result.append(closingHour);
		result.append(')');
		return result.toString();
	}

} //AdministrativeDepartmentImpl
