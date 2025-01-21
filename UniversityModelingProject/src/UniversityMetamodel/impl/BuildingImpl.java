/**
 */
package UniversityMetamodel.impl;

import UniversityMetamodel.Building;
import UniversityMetamodel.Department;
import UniversityMetamodel.LectureHall;
import UniversityMetamodel.UniversityMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.impl.BuildingImpl#getSize <em>Size</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.BuildingImpl#getLectureHalls <em>Lecture Halls</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.BuildingImpl#getDepartments <em>Departments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildingImpl extends NamedEntityImpl implements Building {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLectureHalls() <em>Lecture Halls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectureHalls()
	 * @generated
	 * @ordered
	 */
	protected EList<LectureHall> lectureHalls;

	/**
	 * The cached value of the '{@link #getDepartments() <em>Departments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Department> departments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityMetamodelPackage.Literals.BUILDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.BUILDING__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LectureHall> getLectureHalls() {
		if (lectureHalls == null) {
			lectureHalls = new EObjectContainmentEList<LectureHall>(LectureHall.class, this, UniversityMetamodelPackage.BUILDING__LECTURE_HALLS);
		}
		return lectureHalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Department> getDepartments() {
		if (departments == null) {
			departments = new EObjectWithInverseResolvingEList<Department>(Department.class, this, UniversityMetamodelPackage.BUILDING__DEPARTMENTS, UniversityMetamodelPackage.DEPARTMENT__BUILDING);
		}
		return departments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityMetamodelPackage.BUILDING__DEPARTMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDepartments()).basicAdd(otherEnd, msgs);
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
			case UniversityMetamodelPackage.BUILDING__LECTURE_HALLS:
				return ((InternalEList<?>)getLectureHalls()).basicRemove(otherEnd, msgs);
			case UniversityMetamodelPackage.BUILDING__DEPARTMENTS:
				return ((InternalEList<?>)getDepartments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityMetamodelPackage.BUILDING__SIZE:
				return getSize();
			case UniversityMetamodelPackage.BUILDING__LECTURE_HALLS:
				return getLectureHalls();
			case UniversityMetamodelPackage.BUILDING__DEPARTMENTS:
				return getDepartments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityMetamodelPackage.BUILDING__SIZE:
				setSize((String)newValue);
				return;
			case UniversityMetamodelPackage.BUILDING__LECTURE_HALLS:
				getLectureHalls().clear();
				getLectureHalls().addAll((Collection<? extends LectureHall>)newValue);
				return;
			case UniversityMetamodelPackage.BUILDING__DEPARTMENTS:
				getDepartments().clear();
				getDepartments().addAll((Collection<? extends Department>)newValue);
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
			case UniversityMetamodelPackage.BUILDING__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case UniversityMetamodelPackage.BUILDING__LECTURE_HALLS:
				getLectureHalls().clear();
				return;
			case UniversityMetamodelPackage.BUILDING__DEPARTMENTS:
				getDepartments().clear();
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
			case UniversityMetamodelPackage.BUILDING__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case UniversityMetamodelPackage.BUILDING__LECTURE_HALLS:
				return lectureHalls != null && !lectureHalls.isEmpty();
			case UniversityMetamodelPackage.BUILDING__DEPARTMENTS:
				return departments != null && !departments.isEmpty();
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
		result.append(" (Size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //BuildingImpl
