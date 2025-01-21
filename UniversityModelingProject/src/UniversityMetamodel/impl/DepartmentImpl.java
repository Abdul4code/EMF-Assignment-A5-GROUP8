/**
 */
package UniversityMetamodel.impl;

import UniversityMetamodel.Building;
import UniversityMetamodel.Department;
import UniversityMetamodel.Staff;
import UniversityMetamodel.UniversityMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.impl.DepartmentImpl#getStaffs <em>Staffs</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.DepartmentImpl#getBuilding <em>Building</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DepartmentImpl extends NamedEntityImpl implements Department {
	/**
	 * The cached value of the '{@link #getStaffs() <em>Staffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Staff> staffs;

	/**
	 * The cached value of the '{@link #getBuilding() <em>Building</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilding()
	 * @generated
	 * @ordered
	 */
	protected Building building;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityMetamodelPackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Staff> getStaffs() {
		if (staffs == null) {
			staffs = new EObjectContainmentEList<Staff>(Staff.class, this, UniversityMetamodelPackage.DEPARTMENT__STAFFS);
		}
		return staffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Building getBuilding() {
		if (building != null && building.eIsProxy()) {
			InternalEObject oldBuilding = (InternalEObject)building;
			building = (Building)eResolveProxy(oldBuilding);
			if (building != oldBuilding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityMetamodelPackage.DEPARTMENT__BUILDING, oldBuilding, building));
			}
		}
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Building basicGetBuilding() {
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuilding(Building newBuilding, NotificationChain msgs) {
		Building oldBuilding = building;
		building = newBuilding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.DEPARTMENT__BUILDING, oldBuilding, newBuilding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuilding(Building newBuilding) {
		if (newBuilding != building) {
			NotificationChain msgs = null;
			if (building != null)
				msgs = ((InternalEObject)building).eInverseRemove(this, UniversityMetamodelPackage.BUILDING__DEPARTMENTS, Building.class, msgs);
			if (newBuilding != null)
				msgs = ((InternalEObject)newBuilding).eInverseAdd(this, UniversityMetamodelPackage.BUILDING__DEPARTMENTS, Building.class, msgs);
			msgs = basicSetBuilding(newBuilding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.DEPARTMENT__BUILDING, newBuilding, newBuilding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityMetamodelPackage.DEPARTMENT__BUILDING:
				if (building != null)
					msgs = ((InternalEObject)building).eInverseRemove(this, UniversityMetamodelPackage.BUILDING__DEPARTMENTS, Building.class, msgs);
				return basicSetBuilding((Building)otherEnd, msgs);
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
			case UniversityMetamodelPackage.DEPARTMENT__STAFFS:
				return ((InternalEList<?>)getStaffs()).basicRemove(otherEnd, msgs);
			case UniversityMetamodelPackage.DEPARTMENT__BUILDING:
				return basicSetBuilding(null, msgs);
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
			case UniversityMetamodelPackage.DEPARTMENT__STAFFS:
				return getStaffs();
			case UniversityMetamodelPackage.DEPARTMENT__BUILDING:
				if (resolve) return getBuilding();
				return basicGetBuilding();
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
			case UniversityMetamodelPackage.DEPARTMENT__STAFFS:
				getStaffs().clear();
				getStaffs().addAll((Collection<? extends Staff>)newValue);
				return;
			case UniversityMetamodelPackage.DEPARTMENT__BUILDING:
				setBuilding((Building)newValue);
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
			case UniversityMetamodelPackage.DEPARTMENT__STAFFS:
				getStaffs().clear();
				return;
			case UniversityMetamodelPackage.DEPARTMENT__BUILDING:
				setBuilding((Building)null);
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
			case UniversityMetamodelPackage.DEPARTMENT__STAFFS:
				return staffs != null && !staffs.isEmpty();
			case UniversityMetamodelPackage.DEPARTMENT__BUILDING:
				return building != null;
		}
		return super.eIsSet(featureID);
	}

} //DepartmentImpl
