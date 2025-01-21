/**
 */
package UniversityMetamodel.impl;

import UniversityMetamodel.AcademicDepartment;
import UniversityMetamodel.LectureHall;
import UniversityMetamodel.Programme;
import UniversityMetamodel.UniversityMetamodelPackage;

import UniversityMetamodel.UniversityMetamodelTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Academic Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.impl.AcademicDepartmentImpl#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.AcademicDepartmentImpl#getLectureHalls <em>Lecture Halls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcademicDepartmentImpl extends DepartmentImpl implements AcademicDepartment {
	/**
	 * The cached value of the '{@link #getProgrammes() <em>Programmes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammes()
	 * @generated
	 * @ordered
	 */
	protected EList<Programme> programmes;

	/**
	 * The cached value of the '{@link #getLectureHalls() <em>Lecture Halls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectureHalls()
	 * @generated
	 * @ordered
	 */
	protected EList<LectureHall> lectureHalls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcademicDepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityMetamodelPackage.Literals.ACADEMIC_DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Programme> getProgrammes() {
		if (programmes == null) {
			programmes = new EObjectContainmentWithInverseEList<Programme>(Programme.class, this, UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__PROGRAMMES, UniversityMetamodelPackage.PROGRAMME__DEPARTMENT);
		}
		return programmes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LectureHall> getLectureHalls() {
		if (lectureHalls == null) {
			lectureHalls = new EObjectResolvingEList<LectureHall>(LectureHall.class, this, UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__LECTURE_HALLS);
		}
		return lectureHalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean AtleastOneProgramme(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AcademicDepartment::AtleastOneProgramme";
		try {
			/**
			 *
			 * inv AtleastOneProgramme:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.Programmes->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, UniversityMetamodelPackage.Literals.ACADEMIC_DEPARTMENT___ATLEAST_ONE_PROGRAMME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, UniversityMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Programme> Programmes = this.getProgrammes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_Programmes = idResolver.createOrderedSetOfAll(UniversityMetamodelTables.ORD_CLSSid_Programme, Programmes);
				final /*@NonInvalid*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_Programmes).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, UniversityMetamodelTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__PROGRAMMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProgrammes()).basicAdd(otherEnd, msgs);
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
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__PROGRAMMES:
				return ((InternalEList<?>)getProgrammes()).basicRemove(otherEnd, msgs);
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
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__PROGRAMMES:
				return getProgrammes();
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__LECTURE_HALLS:
				return getLectureHalls();
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
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__PROGRAMMES:
				getProgrammes().clear();
				getProgrammes().addAll((Collection<? extends Programme>)newValue);
				return;
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__LECTURE_HALLS:
				getLectureHalls().clear();
				getLectureHalls().addAll((Collection<? extends LectureHall>)newValue);
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
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__PROGRAMMES:
				getProgrammes().clear();
				return;
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__LECTURE_HALLS:
				getLectureHalls().clear();
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
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__PROGRAMMES:
				return programmes != null && !programmes.isEmpty();
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__LECTURE_HALLS:
				return lectureHalls != null && !lectureHalls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UniversityMetamodelPackage.ACADEMIC_DEPARTMENT___ATLEAST_ONE_PROGRAMME__DIAGNOSTICCHAIN_MAP:
				return AtleastOneProgramme((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AcademicDepartmentImpl
