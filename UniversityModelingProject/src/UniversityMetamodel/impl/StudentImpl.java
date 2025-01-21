/**
 */
package UniversityMetamodel.impl;

import UniversityMetamodel.Gender;
import UniversityMetamodel.Programme;
import UniversityMetamodel.Student;
import UniversityMetamodel.UniversityMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.impl.StudentImpl#getMatricNumber <em>Matric Number</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.StudentImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.StudentImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.StudentImpl#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends NamedEntityImpl implements Student {
	/**
	 * The default value of the '{@link #getMatricNumber() <em>Matric Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRIC_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatricNumber() <em>Matric Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricNumber()
	 * @generated
	 * @ordered
	 */
	protected String matricNumber = MATRIC_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityMetamodelPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatricNumber() {
		return matricNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatricNumber(String newMatricNumber) {
		String oldMatricNumber = matricNumber;
		matricNumber = newMatricNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.STUDENT__MATRIC_NUMBER, oldMatricNumber, matricNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.STUDENT__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.STUDENT__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (eContainerFeatureID() != UniversityMetamodelPackage.STUDENT__PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, UniversityMetamodelPackage.STUDENT__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != UniversityMetamodelPackage.STUDENT__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, UniversityMetamodelPackage.PROGRAMME__STUDENTS, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.STUDENT__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityMetamodelPackage.STUDENT__PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramme((Programme)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityMetamodelPackage.STUDENT__PROGRAMME:
				return basicSetProgramme(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UniversityMetamodelPackage.STUDENT__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, UniversityMetamodelPackage.PROGRAMME__STUDENTS, Programme.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityMetamodelPackage.STUDENT__MATRIC_NUMBER:
				return getMatricNumber();
			case UniversityMetamodelPackage.STUDENT__COUNTRY:
				return getCountry();
			case UniversityMetamodelPackage.STUDENT__GENDER:
				return getGender();
			case UniversityMetamodelPackage.STUDENT__PROGRAMME:
				return getProgramme();
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
			case UniversityMetamodelPackage.STUDENT__MATRIC_NUMBER:
				setMatricNumber((String)newValue);
				return;
			case UniversityMetamodelPackage.STUDENT__COUNTRY:
				setCountry((String)newValue);
				return;
			case UniversityMetamodelPackage.STUDENT__GENDER:
				setGender((Gender)newValue);
				return;
			case UniversityMetamodelPackage.STUDENT__PROGRAMME:
				setProgramme((Programme)newValue);
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
			case UniversityMetamodelPackage.STUDENT__MATRIC_NUMBER:
				setMatricNumber(MATRIC_NUMBER_EDEFAULT);
				return;
			case UniversityMetamodelPackage.STUDENT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case UniversityMetamodelPackage.STUDENT__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case UniversityMetamodelPackage.STUDENT__PROGRAMME:
				setProgramme((Programme)null);
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
			case UniversityMetamodelPackage.STUDENT__MATRIC_NUMBER:
				return MATRIC_NUMBER_EDEFAULT == null ? matricNumber != null : !MATRIC_NUMBER_EDEFAULT.equals(matricNumber);
			case UniversityMetamodelPackage.STUDENT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case UniversityMetamodelPackage.STUDENT__GENDER:
				return gender != GENDER_EDEFAULT;
			case UniversityMetamodelPackage.STUDENT__PROGRAMME:
				return getProgramme() != null;
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
		result.append(" (MatricNumber: ");
		result.append(matricNumber);
		result.append(", Country: ");
		result.append(country);
		result.append(", Gender: ");
		result.append(gender);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
