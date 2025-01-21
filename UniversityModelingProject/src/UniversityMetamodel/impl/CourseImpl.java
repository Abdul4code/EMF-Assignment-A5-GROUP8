/**
 */
package UniversityMetamodel.impl;

import UniversityMetamodel.Course;
import UniversityMetamodel.LectureHall;
import UniversityMetamodel.Proffessor;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityMetamodel.impl.CourseImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.CourseImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.CourseImpl#getTime <em>Time</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.CourseImpl#getProffessors <em>Proffessors</em>}</li>
 *   <li>{@link UniversityMetamodel.impl.CourseImpl#getLectureHalls <em>Lecture Halls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends NamedEntityImpl implements Course {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final int UNIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected int unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected EList<String> time;

	/**
	 * The cached value of the '{@link #getProffessors() <em>Proffessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProffessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Proffessor> proffessors;

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
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityMetamodelPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.COURSE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(int newUnit) {
		int oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityMetamodelPackage.COURSE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTime() {
		if (time == null) {
			time = new EDataTypeUniqueEList<String>(String.class, this, UniversityMetamodelPackage.COURSE__TIME);
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Proffessor> getProffessors() {
		if (proffessors == null) {
			proffessors = new EObjectWithInverseResolvingEList.ManyInverse<Proffessor>(Proffessor.class, this, UniversityMetamodelPackage.COURSE__PROFFESSORS, UniversityMetamodelPackage.PROFFESSOR__COURSES);
		}
		return proffessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LectureHall> getLectureHalls() {
		if (lectureHalls == null) {
			lectureHalls = new EObjectWithInverseResolvingEList.ManyInverse<LectureHall>(LectureHall.class, this, UniversityMetamodelPackage.COURSE__LECTURE_HALLS, UniversityMetamodelPackage.LECTURE_HALL__COURSES);
		}
		return lectureHalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoOverlappingCoursesInLectureHall(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Course::NoOverlappingCoursesInLectureHall";
		try {
			/**
			 *
			 * inv NoOverlappingCoursesInLectureHall:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.LectureHalls->forAll(hall |
			 *           hall.Courses->forAll(c1, c2 | c1 <> c2 implies
			 *             c1.Time->intersection(c2.Time)
			 *             ->isEmpty()))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, UniversityMetamodelPackage.Literals.COURSE___NO_OVERLAPPING_COURSES_IN_LECTURE_HALL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, UniversityMetamodelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<LectureHall> LectureHalls = this.getLectureHalls();
					final /*@NonInvalid*/ OrderedSetValue BOXED_LectureHalls = idResolver.createOrderedSetOfAll(UniversityMetamodelTables.ORD_CLSSid_LectureHall, LectureHalls);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_hall = BOXED_LectureHalls.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_hall.hasNext()) {
							if (accumulator == null) {
								result = null;
							}
							else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator;
							}
							break;
						}
						/*@NonInvalid*/ LectureHall hall = (LectureHall)ITERATOR_hall.next();
						/**
						 * hall.Courses->forAll(c1, c2 | c1 <> c2 implies
						 *   c1.Time->intersection(c2.Time)
						 *   ->isEmpty())
						 */
						final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ List<Course> Courses = hall.getCourses();
							final /*@NonInvalid*/ OrderedSetValue BOXED_Courses = idResolver.createOrderedSetOfAll(UniversityMetamodelTables.ORD_CLSSid_Course, Courses);
							final org.eclipse.ocl.pivot.Class TYPE_forAll_0 = executor.getStaticTypeOfValue(null, BOXED_Courses);
							final LibraryIterationExtension IMPL_forAll_0 = (LibraryIterationExtension)TYPE_forAll_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
							final /*@NonNull*/ Object ACC_forAll_0 = IMPL_forAll_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
							/**
							 * Implementation of the iterator body.
							 */
							final AbstractSimpleOperation BODY_forAll_0 = new AbstractSimpleOperation() {
								/**
								 * c1 <> c2 implies c1.Time->intersection(c2.Time)->isEmpty()
								 */
								@Override
								public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
									final /*@NonInvalid*/ OrderedSetValue BOXED_Courses = (OrderedSetValue)sourceAndArgumentValues[0];
									final /*@NonInvalid*/ Object c1 = sourceAndArgumentValues[1];
									final /*@NonInvalid*/ Object c2 = sourceAndArgumentValues[2];
									/*@Caught*/ Object CAUGHT_implies;
									try {
										final /*@NonInvalid*/ Course CAST_null = (Course)c1;
										final /*@NonInvalid*/ Course CAST_null_0 = (Course)c2;
										final /*@NonInvalid*/ boolean ne = (CAST_null != null) ? !CAST_null.equals(CAST_null_0) : (CAST_null_0 != null);
										final /*@Thrown*/ Boolean implies;
										if (!ne) {
											implies = ValueUtil.TRUE_VALUE;
										}
										else {
											/*@Caught*/ Object CAUGHT_isEmpty;
											try {
												if (CAST_null == null) {
													throw new InvalidValueException("Null source for \'\'http://ngrmodel.univaq.it\'::Course::Time\'");
												}
												final /*@Thrown*/ List<String> Time = CAST_null.getTime();
												final /*@Thrown*/ OrderedSetValue BOXED_Time = idResolver.createOrderedSetOfAll(UniversityMetamodelTables.ORD_PRIMid_String, Time);
												if (CAST_null_0 == null) {
													throw new InvalidValueException("Null source for \'\'http://ngrmodel.univaq.it\'::Course::Time\'");
												}
												final /*@Thrown*/ List<String> Time_0 = CAST_null_0.getTime();
												final /*@Thrown*/ OrderedSetValue BOXED_Time_0 = idResolver.createOrderedSetOfAll(UniversityMetamodelTables.ORD_PRIMid_String, Time_0);
												if (BOXED_Time_0 instanceof InvalidValueException) {
													throw (InvalidValueException)BOXED_Time_0;
												}
												final /*@Thrown*/ SetValue intersection = (SetValue)CollectionIntersectionOperation.INSTANCE.evaluate(BOXED_Time, BOXED_Time_0);
												final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(intersection).booleanValue();
												CAUGHT_isEmpty = isEmpty;
											}
											catch (Exception e) {
												CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_isEmpty == ValueUtil.TRUE_VALUE) {
												implies = ValueUtil.TRUE_VALUE;
											}
											else {
												if (CAUGHT_isEmpty instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_isEmpty;
												}
												implies = ValueUtil.FALSE_VALUE;
											}
										}
										CAUGHT_implies = implies;
									}
									catch (Exception e) {
										CAUGHT_implies = ValueUtil.createInvalidValue(e);
									}
									return CAUGHT_implies;
								}
							};
							final ExecutorMultipleIterationManager MGR_forAll_0 = new ExecutorMultipleIterationManager(executor, 2, false, TypeId.BOOLEAN, BODY_forAll_0, BOXED_Courses, ACC_forAll_0);
							final /*@Thrown*/ Boolean forAll = (Boolean)IMPL_forAll_0.evaluateIteration(MGR_forAll_0);
							CAUGHT_forAll = forAll;
						}
						catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else if (CAUGHT_forAll == null) {								// Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null;										// Cache a null failure
							}
						}
						else if (CAUGHT_forAll instanceof InvalidValueException) {		// Abnormal exception evaluation result
							accumulator = CAUGHT_forAll;									// Cache an exception failure
						}
						else {															// Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
			case UniversityMetamodelPackage.COURSE__PROFFESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProffessors()).basicAdd(otherEnd, msgs);
			case UniversityMetamodelPackage.COURSE__LECTURE_HALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLectureHalls()).basicAdd(otherEnd, msgs);
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
			case UniversityMetamodelPackage.COURSE__PROFFESSORS:
				return ((InternalEList<?>)getProffessors()).basicRemove(otherEnd, msgs);
			case UniversityMetamodelPackage.COURSE__LECTURE_HALLS:
				return ((InternalEList<?>)getLectureHalls()).basicRemove(otherEnd, msgs);
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
			case UniversityMetamodelPackage.COURSE__TITLE:
				return getTitle();
			case UniversityMetamodelPackage.COURSE__CODE:
				return getCode();
			case UniversityMetamodelPackage.COURSE__UNIT:
				return getUnit();
			case UniversityMetamodelPackage.COURSE__TIME:
				return getTime();
			case UniversityMetamodelPackage.COURSE__PROFFESSORS:
				return getProffessors();
			case UniversityMetamodelPackage.COURSE__LECTURE_HALLS:
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
			case UniversityMetamodelPackage.COURSE__TITLE:
				setTitle((String)newValue);
				return;
			case UniversityMetamodelPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case UniversityMetamodelPackage.COURSE__UNIT:
				setUnit((Integer)newValue);
				return;
			case UniversityMetamodelPackage.COURSE__TIME:
				getTime().clear();
				getTime().addAll((Collection<? extends String>)newValue);
				return;
			case UniversityMetamodelPackage.COURSE__PROFFESSORS:
				getProffessors().clear();
				getProffessors().addAll((Collection<? extends Proffessor>)newValue);
				return;
			case UniversityMetamodelPackage.COURSE__LECTURE_HALLS:
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
			case UniversityMetamodelPackage.COURSE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case UniversityMetamodelPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case UniversityMetamodelPackage.COURSE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case UniversityMetamodelPackage.COURSE__TIME:
				getTime().clear();
				return;
			case UniversityMetamodelPackage.COURSE__PROFFESSORS:
				getProffessors().clear();
				return;
			case UniversityMetamodelPackage.COURSE__LECTURE_HALLS:
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
			case UniversityMetamodelPackage.COURSE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case UniversityMetamodelPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case UniversityMetamodelPackage.COURSE__UNIT:
				return unit != UNIT_EDEFAULT;
			case UniversityMetamodelPackage.COURSE__TIME:
				return time != null && !time.isEmpty();
			case UniversityMetamodelPackage.COURSE__PROFFESSORS:
				return proffessors != null && !proffessors.isEmpty();
			case UniversityMetamodelPackage.COURSE__LECTURE_HALLS:
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
			case UniversityMetamodelPackage.COURSE___NO_OVERLAPPING_COURSES_IN_LECTURE_HALL__DIAGNOSTICCHAIN_MAP:
				return NoOverlappingCoursesInLectureHall((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (Title: ");
		result.append(title);
		result.append(", Code: ");
		result.append(code);
		result.append(", Unit: ");
		result.append(unit);
		result.append(", Time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
