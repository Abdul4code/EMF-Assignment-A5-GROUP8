/**
 */
package UniversityMetamodel.impl;

import UniversityMetamodel.AcademicDepartment;
import UniversityMetamodel.Course;
import UniversityMetamodel.Programme;
import UniversityMetamodel.ProgrammeTypes;
import UniversityMetamodel.Student;
import UniversityMetamodel.UniversityMetamodelPackage;

import UniversityMetamodel.UniversityMetamodelTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.impl.ProgrammeImpl#getType <em>Type</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.ProgrammeImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.ProgrammeImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.ProgrammeImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends NamedEntityImpl implements Programme {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammeTypes TYPE_EDEFAULT = ProgrammeTypes.BACHELORS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeTypes type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityMetamodelPackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ProgrammeTypes newType) {
		ProgrammeTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.PROGRAMME__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcademicDepartment getDepartment() {
		if (eContainerFeatureID() != UniversityMetamodelPackage.PROGRAMME__DEPARTMENT) return null;
		return (AcademicDepartment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(AcademicDepartment newDepartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepartment, UniversityMetamodelPackage.PROGRAMME__DEPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartment(AcademicDepartment newDepartment) {
		if (newDepartment != eInternalContainer() || (eContainerFeatureID() != UniversityMetamodelPackage.PROGRAMME__DEPARTMENT && newDepartment != null)) {
			if (EcoreUtil.isAncestor(this, newDepartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__PROGRAMMES, AcademicDepartment.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.PROGRAMME__DEPARTMENT, newDepartment, newDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, UniversityMetamodelPackage.PROGRAMME__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentWithInverseEList<Student>(Student.class, this, UniversityMetamodelPackage.PROGRAMME__STUDENTS, UniversityMetamodelPackage.STUDENT__PROGRAMME);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean LimitStudentsFromSameCountryInMobilityProgrammes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Programme::LimitStudentsFromSameCountryInMobilityProgrammes";
		try {
			/**
			 *
			 * inv LimitStudentsFromSameCountryInMobilityProgrammes:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.Type = ProgrammeTypes::Mobility_Masters implies
			 *         self.Students->forAll(s1 |
			 *           self.Students->select(s2 | (s2.Country = s1.Country))
			 *           ->size() <= 3)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, UniversityMetamodelPackage.Literals.PROGRAMME___LIMIT_STUDENTS_FROM_SAME_COUNTRY_IN_MOBILITY_PROGRAMMES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, UniversityMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Student> Students = this.getStudents();
					final /*@NonInvalid*/ OrderedSetValue BOXED_Students = idResolver.createOrderedSetOfAll(UniversityMetamodelTables.ORD_CLSSid_Student, Students);
					final /*@NonInvalid*/ ProgrammeTypes Type = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_Type = Type == null ? null : UniversityMetamodelTables.ENUMid_ProgrammeTypes.getEnumerationLiteralId(ClassUtil.nonNullState(Type.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_Type == UniversityMetamodelTables.ELITid_Mobility_Masters;
					final /*@Thrown*/ Boolean result;
					if (!eq) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_s1 = BOXED_Students.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_s1.hasNext()) {
								if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Student s1 = (Student)ITERATOR_s1.next();
							/**
							 *
							 * self.Students->select(s2 | (s2.Country = s1.Country))
							 * ->size() <= 3
							 */
							/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(UniversityMetamodelTables.ORD_CLSSid_Student);
							Iterator<Object> ITERATOR_s2 = BOXED_Students.iterator();
							/*@NonInvalid*/ OrderedSetValue select;
							while (true) {
								if (!ITERATOR_s2.hasNext()) {
									select = accumulator_0;
									break;
								}
								/*@NonInvalid*/ Student s2 = (Student)ITERATOR_s2.next();
								/**
								 * s2.Country = s1.Country
								 */
								final /*@NonInvalid*/ String Country = s2.getCountry();
								final /*@NonInvalid*/ String Country_0 = s1.getCountry();
								final /*@NonInvalid*/ boolean eq_0 = Country.equals(Country_0);
								//
								if (eq_0) {
									accumulator_0.add(s2);
								}
							}
							final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
							final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, UniversityMetamodelTables.INT_3).booleanValue();
							//
							if (!le_0) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (le_0) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (forAll == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, UniversityMetamodelTables.INT_0).booleanValue();
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
			case UniversityMetamodelPackage.PROGRAMME__DEPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepartment((AcademicDepartment)otherEnd, msgs);
			case UniversityMetamodelPackage.PROGRAMME__STUDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudents()).basicAdd(otherEnd, msgs);
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
			case UniversityMetamodelPackage.PROGRAMME__DEPARTMENT:
				return basicSetDepartment(null, msgs);
			case UniversityMetamodelPackage.PROGRAMME__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case UniversityMetamodelPackage.PROGRAMME__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
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
			case UniversityMetamodelPackage.PROGRAMME__DEPARTMENT:
				return eInternalContainer().eInverseRemove(this, UniversityMetamodelPackage.ACADEMIC_DEPARTMENT__PROGRAMMES, AcademicDepartment.class, msgs);
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
			case UniversityMetamodelPackage.PROGRAMME__TYPE:
				return getType();
			case UniversityMetamodelPackage.PROGRAMME__DEPARTMENT:
				return getDepartment();
			case UniversityMetamodelPackage.PROGRAMME__COURSES:
				return getCourses();
			case UniversityMetamodelPackage.PROGRAMME__STUDENTS:
				return getStudents();
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
			case UniversityMetamodelPackage.PROGRAMME__TYPE:
				setType((ProgrammeTypes)newValue);
				return;
			case UniversityMetamodelPackage.PROGRAMME__DEPARTMENT:
				setDepartment((AcademicDepartment)newValue);
				return;
			case UniversityMetamodelPackage.PROGRAMME__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case UniversityMetamodelPackage.PROGRAMME__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
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
			case UniversityMetamodelPackage.PROGRAMME__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UniversityMetamodelPackage.PROGRAMME__DEPARTMENT:
				setDepartment((AcademicDepartment)null);
				return;
			case UniversityMetamodelPackage.PROGRAMME__COURSES:
				getCourses().clear();
				return;
			case UniversityMetamodelPackage.PROGRAMME__STUDENTS:
				getStudents().clear();
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
			case UniversityMetamodelPackage.PROGRAMME__TYPE:
				return type != TYPE_EDEFAULT;
			case UniversityMetamodelPackage.PROGRAMME__DEPARTMENT:
				return getDepartment() != null;
			case UniversityMetamodelPackage.PROGRAMME__COURSES:
				return courses != null && !courses.isEmpty();
			case UniversityMetamodelPackage.PROGRAMME__STUDENTS:
				return students != null && !students.isEmpty();
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
			case UniversityMetamodelPackage.PROGRAMME___LIMIT_STUDENTS_FROM_SAME_COUNTRY_IN_MOBILITY_PROGRAMMES__DIAGNOSTICCHAIN_MAP:
				return LimitStudentsFromSameCountryInMobilityProgrammes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
