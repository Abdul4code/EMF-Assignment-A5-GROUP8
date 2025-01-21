/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /UniversityModelingProject/Model/UniversitySystem.ecore
 * using:
 *   /UniversityModelingProject/Model/UniversitySystem.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package UniversityMetamodel;

// import UniversityMetamodel.UniversityMetamodelPackage;
// import UniversityMetamodel.UniversityMetamodelTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * UniversityMetamodelTables provides the dispatch tables for the UniversityMetamodel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class UniversityMetamodelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(UniversityMetamodelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_ngrmodel_univaq_it = IdManager.getNsURIPackageId("http://ngrmodel.univaq.it", null, UniversityMetamodelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AcademicDepartment = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("AcademicDepartment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Building = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Building", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Campus = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Campus", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Centre = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Centre", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Course = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Course", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Department = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Department", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LectureHall = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("LectureHall", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Proffessor = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Proffessor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Programme = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Programme", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Service = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Service", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Staff = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Staff", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Student = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("Student", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_University = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getClassId("University", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = UniversityMetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = UniversityMetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Gender = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getEnumerationId("Gender");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ProgrammeTypes = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getEnumerationId("ProgrammeTypes");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Role = UniversityMetamodelTables.PACKid_http_c_s_s_ngrmodel_univaq_it.getEnumerationId("Role");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_3 = ValueUtil.integerValueOf("3");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String_0 = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AcademicDepartment = TypeId.BAG.getSpecializedId(UniversityMetamodelTables.CLSSid_AcademicDepartment, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Mobility_Masters = UniversityMetamodelTables.ENUMid_ProgrammeTypes.getEnumerationLiteralId("Mobility_Masters");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Building = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Building, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Campus = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Campus, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Course = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Course, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Course_0 = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Course, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Department = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Department, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_LectureHall = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_LectureHall, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Proffessor = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Proffessor, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Programme = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Programme, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Service = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Service, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Staff = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Staff, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Student = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.CLSSid_Student, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_Role = TypeId.ORDERED_SET.getSpecializedId(UniversityMetamodelTables.ENUMid_Role, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			UniversityMetamodelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AcademicDepartment = new EcoreExecutorType(UniversityMetamodelPackage.Literals.ACADEMIC_DEPARTMENT, PACKAGE, 0);
		public static final EcoreExecutorType _AdministrativeDepartment = new EcoreExecutorType(UniversityMetamodelPackage.Literals.ADMINISTRATIVE_DEPARTMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Building = new EcoreExecutorType(UniversityMetamodelPackage.Literals.BUILDING, PACKAGE, 0);
		public static final EcoreExecutorType _Campus = new EcoreExecutorType(UniversityMetamodelPackage.Literals.CAMPUS, PACKAGE, 0);
		public static final EcoreExecutorType _Centre = new EcoreExecutorType(UniversityMetamodelPackage.Literals.CENTRE, PACKAGE, 0);
		public static final EcoreExecutorType _Course = new EcoreExecutorType(UniversityMetamodelPackage.Literals.COURSE, PACKAGE, 0);
		public static final EcoreExecutorType _Department = new EcoreExecutorType(UniversityMetamodelPackage.Literals.DEPARTMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Gender = new EcoreExecutorEnumeration(UniversityMetamodelPackage.Literals.GENDER, PACKAGE, 0);
		public static final EcoreExecutorType _LectureHall = new EcoreExecutorType(UniversityMetamodelPackage.Literals.LECTURE_HALL, PACKAGE, 0);
		public static final EcoreExecutorType _NamedEntity = new EcoreExecutorType(UniversityMetamodelPackage.Literals.NAMED_ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Proffessor = new EcoreExecutorType(UniversityMetamodelPackage.Literals.PROFFESSOR, PACKAGE, 0);
		public static final EcoreExecutorType _Programme = new EcoreExecutorType(UniversityMetamodelPackage.Literals.PROGRAMME, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ProgrammeTypes = new EcoreExecutorEnumeration(UniversityMetamodelPackage.Literals.PROGRAMME_TYPES, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Role = new EcoreExecutorEnumeration(UniversityMetamodelPackage.Literals.ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _Service = new EcoreExecutorType(UniversityMetamodelPackage.Literals.SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _Staff = new EcoreExecutorType(UniversityMetamodelPackage.Literals.STAFF, PACKAGE, 0);
		public static final EcoreExecutorType _Student = new EcoreExecutorType(UniversityMetamodelPackage.Literals.STUDENT, PACKAGE, 0);
		public static final EcoreExecutorType _University = new EcoreExecutorType(UniversityMetamodelPackage.Literals.UNIVERSITY, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AcademicDepartment,
			_AdministrativeDepartment,
			_Building,
			_Campus,
			_Centre,
			_Course,
			_Department,
			_Gender,
			_LectureHall,
			_NamedEntity,
			_Proffessor,
			_Programme,
			_ProgrammeTypes,
			_Role,
			_Service,
			_Staff,
			_Student,
			_University
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AcademicDepartment__AcademicDepartment = new ExecutorFragment(Types._AcademicDepartment, UniversityMetamodelTables.Types._AcademicDepartment);
		private static final ExecutorFragment _AcademicDepartment__Department = new ExecutorFragment(Types._AcademicDepartment, UniversityMetamodelTables.Types._Department);
		private static final ExecutorFragment _AcademicDepartment__NamedEntity = new ExecutorFragment(Types._AcademicDepartment, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _AcademicDepartment__OclAny = new ExecutorFragment(Types._AcademicDepartment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AcademicDepartment__OclElement = new ExecutorFragment(Types._AcademicDepartment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AdministrativeDepartment__AdministrativeDepartment = new ExecutorFragment(Types._AdministrativeDepartment, UniversityMetamodelTables.Types._AdministrativeDepartment);
		private static final ExecutorFragment _AdministrativeDepartment__Department = new ExecutorFragment(Types._AdministrativeDepartment, UniversityMetamodelTables.Types._Department);
		private static final ExecutorFragment _AdministrativeDepartment__NamedEntity = new ExecutorFragment(Types._AdministrativeDepartment, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _AdministrativeDepartment__OclAny = new ExecutorFragment(Types._AdministrativeDepartment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AdministrativeDepartment__OclElement = new ExecutorFragment(Types._AdministrativeDepartment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Building__Building = new ExecutorFragment(Types._Building, UniversityMetamodelTables.Types._Building);
		private static final ExecutorFragment _Building__NamedEntity = new ExecutorFragment(Types._Building, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _Building__OclAny = new ExecutorFragment(Types._Building, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Building__OclElement = new ExecutorFragment(Types._Building, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Campus__Campus = new ExecutorFragment(Types._Campus, UniversityMetamodelTables.Types._Campus);
		private static final ExecutorFragment _Campus__NamedEntity = new ExecutorFragment(Types._Campus, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _Campus__OclAny = new ExecutorFragment(Types._Campus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Campus__OclElement = new ExecutorFragment(Types._Campus, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Centre__Centre = new ExecutorFragment(Types._Centre, UniversityMetamodelTables.Types._Centre);
		private static final ExecutorFragment _Centre__Department = new ExecutorFragment(Types._Centre, UniversityMetamodelTables.Types._Department);
		private static final ExecutorFragment _Centre__NamedEntity = new ExecutorFragment(Types._Centre, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _Centre__OclAny = new ExecutorFragment(Types._Centre, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Centre__OclElement = new ExecutorFragment(Types._Centre, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Course__Course = new ExecutorFragment(Types._Course, UniversityMetamodelTables.Types._Course);
		private static final ExecutorFragment _Course__NamedEntity = new ExecutorFragment(Types._Course, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _Course__OclAny = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Course__OclElement = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Department__Department = new ExecutorFragment(Types._Department, UniversityMetamodelTables.Types._Department);
		private static final ExecutorFragment _Department__NamedEntity = new ExecutorFragment(Types._Department, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _Department__OclAny = new ExecutorFragment(Types._Department, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Department__OclElement = new ExecutorFragment(Types._Department, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Gender__Gender = new ExecutorFragment(Types._Gender, UniversityMetamodelTables.Types._Gender);
		private static final ExecutorFragment _Gender__OclAny = new ExecutorFragment(Types._Gender, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Gender__OclElement = new ExecutorFragment(Types._Gender, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Gender__OclEnumeration = new ExecutorFragment(Types._Gender, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Gender__OclType = new ExecutorFragment(Types._Gender, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _LectureHall__LectureHall = new ExecutorFragment(Types._LectureHall, UniversityMetamodelTables.Types._LectureHall);
		private static final ExecutorFragment _LectureHall__OclAny = new ExecutorFragment(Types._LectureHall, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LectureHall__OclElement = new ExecutorFragment(Types._LectureHall, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedEntity__NamedEntity = new ExecutorFragment(Types._NamedEntity, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _NamedEntity__OclAny = new ExecutorFragment(Types._NamedEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedEntity__OclElement = new ExecutorFragment(Types._NamedEntity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Proffessor__NamedEntity = new ExecutorFragment(Types._Proffessor, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _Proffessor__OclAny = new ExecutorFragment(Types._Proffessor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Proffessor__OclElement = new ExecutorFragment(Types._Proffessor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Proffessor__Proffessor = new ExecutorFragment(Types._Proffessor, UniversityMetamodelTables.Types._Proffessor);
		private static final ExecutorFragment _Proffessor__Staff = new ExecutorFragment(Types._Proffessor, UniversityMetamodelTables.Types._Staff);

		private static final ExecutorFragment _Programme__NamedEntity = new ExecutorFragment(Types._Programme, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _Programme__OclAny = new ExecutorFragment(Types._Programme, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Programme__OclElement = new ExecutorFragment(Types._Programme, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Programme__Programme = new ExecutorFragment(Types._Programme, UniversityMetamodelTables.Types._Programme);

		private static final ExecutorFragment _ProgrammeTypes__OclAny = new ExecutorFragment(Types._ProgrammeTypes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProgrammeTypes__OclElement = new ExecutorFragment(Types._ProgrammeTypes, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProgrammeTypes__OclEnumeration = new ExecutorFragment(Types._ProgrammeTypes, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ProgrammeTypes__OclType = new ExecutorFragment(Types._ProgrammeTypes, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _ProgrammeTypes__ProgrammeTypes = new ExecutorFragment(Types._ProgrammeTypes, UniversityMetamodelTables.Types._ProgrammeTypes);

		private static final ExecutorFragment _Role__OclAny = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Role__OclElement = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Role__OclEnumeration = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Role__OclType = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Role__Role = new ExecutorFragment(Types._Role, UniversityMetamodelTables.Types._Role);

		private static final ExecutorFragment _Service__OclAny = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Service__OclElement = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Service__Service = new ExecutorFragment(Types._Service, UniversityMetamodelTables.Types._Service);

		private static final ExecutorFragment _Staff__NamedEntity = new ExecutorFragment(Types._Staff, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _Staff__OclAny = new ExecutorFragment(Types._Staff, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Staff__OclElement = new ExecutorFragment(Types._Staff, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Staff__Staff = new ExecutorFragment(Types._Staff, UniversityMetamodelTables.Types._Staff);

		private static final ExecutorFragment _Student__NamedEntity = new ExecutorFragment(Types._Student, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _Student__OclAny = new ExecutorFragment(Types._Student, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Student__OclElement = new ExecutorFragment(Types._Student, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Student__Student = new ExecutorFragment(Types._Student, UniversityMetamodelTables.Types._Student);

		private static final ExecutorFragment _University__NamedEntity = new ExecutorFragment(Types._University, UniversityMetamodelTables.Types._NamedEntity);
		private static final ExecutorFragment _University__OclAny = new ExecutorFragment(Types._University, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _University__OclElement = new ExecutorFragment(Types._University, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _University__University = new ExecutorFragment(Types._University, UniversityMetamodelTables.Types._University);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AcademicDepartment__LectureHalls = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.ACADEMIC_DEPARTMENT__LECTURE_HALLS, Types._AcademicDepartment, 0);
		public static final ExecutorProperty _AcademicDepartment__Programmes = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.ACADEMIC_DEPARTMENT__PROGRAMMES, Types._AcademicDepartment, 1);

		public static final ExecutorProperty _AdministrativeDepartment__ClosingHour = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.ADMINISTRATIVE_DEPARTMENT__CLOSING_HOUR, Types._AdministrativeDepartment, 0);
		public static final ExecutorProperty _AdministrativeDepartment__OpeningHour = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.ADMINISTRATIVE_DEPARTMENT__OPENING_HOUR, Types._AdministrativeDepartment, 1);

		public static final ExecutorProperty _Building__Departments = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.BUILDING__DEPARTMENTS, Types._Building, 0);
		public static final ExecutorProperty _Building__LectureHalls = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.BUILDING__LECTURE_HALLS, Types._Building, 1);
		public static final ExecutorProperty _Building__Size = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.BUILDING__SIZE, Types._Building, 2);
		public static final ExecutorProperty _Building__Campus__Buildings = new ExecutorPropertyWithImplementation("Campus", Types._Building, 3, new EcoreLibraryOppositeProperty(UniversityMetamodelPackage.Literals.CAMPUS__BUILDINGS));

		public static final ExecutorProperty _Campus__Buildings = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.CAMPUS__BUILDINGS, Types._Campus, 0);
		public static final ExecutorProperty _Campus__Departments = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.CAMPUS__DEPARTMENTS, Types._Campus, 1);
		public static final ExecutorProperty _Campus__Location = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.CAMPUS__LOCATION, Types._Campus, 2);
		public static final ExecutorProperty _Campus__University__Campuses = new ExecutorPropertyWithImplementation("University", Types._Campus, 3, new EcoreLibraryOppositeProperty(UniversityMetamodelPackage.Literals.UNIVERSITY__CAMPUSES));

		public static final ExecutorProperty _Centre__Services = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.CENTRE__SERVICES, Types._Centre, 0);

		public static final ExecutorProperty _Course__Code = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.COURSE__CODE, Types._Course, 0);
		public static final ExecutorProperty _Course__LectureHalls = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.COURSE__LECTURE_HALLS, Types._Course, 1);
		public static final ExecutorProperty _Course__Proffessors = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.COURSE__PROFFESSORS, Types._Course, 2);
		public static final ExecutorProperty _Course__Time = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.COURSE__TIME, Types._Course, 3);
		public static final ExecutorProperty _Course__Title = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.COURSE__TITLE, Types._Course, 4);
		public static final ExecutorProperty _Course__Unit = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.COURSE__UNIT, Types._Course, 5);
		public static final ExecutorProperty _Course__Programme__Courses = new ExecutorPropertyWithImplementation("Programme", Types._Course, 6, new EcoreLibraryOppositeProperty(UniversityMetamodelPackage.Literals.PROGRAMME__COURSES));

		public static final ExecutorProperty _Department__Building = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.DEPARTMENT__BUILDING, Types._Department, 0);
		public static final ExecutorProperty _Department__Staffs = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.DEPARTMENT__STAFFS, Types._Department, 1);
		public static final ExecutorProperty _Department__Campus__Departments = new ExecutorPropertyWithImplementation("Campus", Types._Department, 2, new EcoreLibraryOppositeProperty(UniversityMetamodelPackage.Literals.CAMPUS__DEPARTMENTS));

		public static final ExecutorProperty _LectureHall__Code = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.LECTURE_HALL__CODE, Types._LectureHall, 0);
		public static final ExecutorProperty _LectureHall__Courses = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.LECTURE_HALL__COURSES, Types._LectureHall, 1);
		public static final ExecutorProperty _LectureHall__AcademicDepartment__LectureHalls = new ExecutorPropertyWithImplementation("AcademicDepartment", Types._LectureHall, 2, new EcoreLibraryOppositeProperty(UniversityMetamodelPackage.Literals.ACADEMIC_DEPARTMENT__LECTURE_HALLS));
		public static final ExecutorProperty _LectureHall__Building__LectureHalls = new ExecutorPropertyWithImplementation("Building", Types._LectureHall, 3, new EcoreLibraryOppositeProperty(UniversityMetamodelPackage.Literals.BUILDING__LECTURE_HALLS));

		public static final ExecutorProperty _NamedEntity__Name = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.NAMED_ENTITY__NAME, Types._NamedEntity, 0);

		public static final ExecutorProperty _Proffessor__Courses = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.PROFFESSOR__COURSES, Types._Proffessor, 0);

		public static final ExecutorProperty _Programme__Courses = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.PROGRAMME__COURSES, Types._Programme, 0);
		public static final ExecutorProperty _Programme__Department = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.PROGRAMME__DEPARTMENT, Types._Programme, 1);
		public static final ExecutorProperty _Programme__Students = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.PROGRAMME__STUDENTS, Types._Programme, 2);
		public static final ExecutorProperty _Programme__Type = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.PROGRAMME__TYPE, Types._Programme, 3);

		public static final ExecutorProperty _Service__Description = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.SERVICE__DESCRIPTION, Types._Service, 0);
		public static final ExecutorProperty _Service__Title = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.SERVICE__TITLE, Types._Service, 1);
		public static final ExecutorProperty _Service__Centre__Services = new ExecutorPropertyWithImplementation("Centre", Types._Service, 2, new EcoreLibraryOppositeProperty(UniversityMetamodelPackage.Literals.CENTRE__SERVICES));

		public static final ExecutorProperty _Staff__Email = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.STAFF__EMAIL, Types._Staff, 0);
		public static final ExecutorProperty _Staff__Gender = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.STAFF__GENDER, Types._Staff, 1);
		public static final ExecutorProperty _Staff__Role = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.STAFF__ROLE, Types._Staff, 2);
		public static final ExecutorProperty _Staff__Department__Staffs = new ExecutorPropertyWithImplementation("Department", Types._Staff, 3, new EcoreLibraryOppositeProperty(UniversityMetamodelPackage.Literals.DEPARTMENT__STAFFS));

		public static final ExecutorProperty _Student__Country = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.STUDENT__COUNTRY, Types._Student, 0);
		public static final ExecutorProperty _Student__Gender = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.STUDENT__GENDER, Types._Student, 1);
		public static final ExecutorProperty _Student__MatricNumber = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.STUDENT__MATRIC_NUMBER, Types._Student, 2);
		public static final ExecutorProperty _Student__Programme = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.STUDENT__PROGRAMME, Types._Student, 3);

		public static final ExecutorProperty _University__Address = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.UNIVERSITY__ADDRESS, Types._University, 0);
		public static final ExecutorProperty _University__Campuses = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.UNIVERSITY__CAMPUSES, Types._University, 1);
		public static final ExecutorProperty _University__Email = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.UNIVERSITY__EMAIL, Types._University, 2);
		public static final ExecutorProperty _University__Website = new EcoreExecutorProperty(UniversityMetamodelPackage.Literals.UNIVERSITY__WEBSITE, Types._University, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AcademicDepartment =
			{
				Fragments._AcademicDepartment__OclAny /* 0 */,
				Fragments._AcademicDepartment__OclElement /* 1 */,
				Fragments._AcademicDepartment__NamedEntity /* 2 */,
				Fragments._AcademicDepartment__Department /* 3 */,
				Fragments._AcademicDepartment__AcademicDepartment /* 4 */
			};
		private static final int /*@NonNull*/ [] __AcademicDepartment = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AdministrativeDepartment =
			{
				Fragments._AdministrativeDepartment__OclAny /* 0 */,
				Fragments._AdministrativeDepartment__OclElement /* 1 */,
				Fragments._AdministrativeDepartment__NamedEntity /* 2 */,
				Fragments._AdministrativeDepartment__Department /* 3 */,
				Fragments._AdministrativeDepartment__AdministrativeDepartment /* 4 */
			};
		private static final int /*@NonNull*/ [] __AdministrativeDepartment = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Building =
			{
				Fragments._Building__OclAny /* 0 */,
				Fragments._Building__OclElement /* 1 */,
				Fragments._Building__NamedEntity /* 2 */,
				Fragments._Building__Building /* 3 */
			};
		private static final int /*@NonNull*/ [] __Building = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Campus =
			{
				Fragments._Campus__OclAny /* 0 */,
				Fragments._Campus__OclElement /* 1 */,
				Fragments._Campus__NamedEntity /* 2 */,
				Fragments._Campus__Campus /* 3 */
			};
		private static final int /*@NonNull*/ [] __Campus = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Centre =
			{
				Fragments._Centre__OclAny /* 0 */,
				Fragments._Centre__OclElement /* 1 */,
				Fragments._Centre__NamedEntity /* 2 */,
				Fragments._Centre__Department /* 3 */,
				Fragments._Centre__Centre /* 4 */
			};
		private static final int /*@NonNull*/ [] __Centre = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Course =
			{
				Fragments._Course__OclAny /* 0 */,
				Fragments._Course__OclElement /* 1 */,
				Fragments._Course__NamedEntity /* 2 */,
				Fragments._Course__Course /* 3 */
			};
		private static final int /*@NonNull*/ [] __Course = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Department =
			{
				Fragments._Department__OclAny /* 0 */,
				Fragments._Department__OclElement /* 1 */,
				Fragments._Department__NamedEntity /* 2 */,
				Fragments._Department__Department /* 3 */
			};
		private static final int /*@NonNull*/ [] __Department = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Gender =
			{
				Fragments._Gender__OclAny /* 0 */,
				Fragments._Gender__OclElement /* 1 */,
				Fragments._Gender__OclType /* 2 */,
				Fragments._Gender__OclEnumeration /* 3 */,
				Fragments._Gender__Gender /* 4 */
			};
		private static final int /*@NonNull*/ [] __Gender = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LectureHall =
			{
				Fragments._LectureHall__OclAny /* 0 */,
				Fragments._LectureHall__OclElement /* 1 */,
				Fragments._LectureHall__LectureHall /* 2 */
			};
		private static final int /*@NonNull*/ [] __LectureHall = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedEntity =
			{
				Fragments._NamedEntity__OclAny /* 0 */,
				Fragments._NamedEntity__OclElement /* 1 */,
				Fragments._NamedEntity__NamedEntity /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedEntity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Proffessor =
			{
				Fragments._Proffessor__OclAny /* 0 */,
				Fragments._Proffessor__OclElement /* 1 */,
				Fragments._Proffessor__NamedEntity /* 2 */,
				Fragments._Proffessor__Staff /* 3 */,
				Fragments._Proffessor__Proffessor /* 4 */
			};
		private static final int /*@NonNull*/ [] __Proffessor = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Programme =
			{
				Fragments._Programme__OclAny /* 0 */,
				Fragments._Programme__OclElement /* 1 */,
				Fragments._Programme__NamedEntity /* 2 */,
				Fragments._Programme__Programme /* 3 */
			};
		private static final int /*@NonNull*/ [] __Programme = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProgrammeTypes =
			{
				Fragments._ProgrammeTypes__OclAny /* 0 */,
				Fragments._ProgrammeTypes__OclElement /* 1 */,
				Fragments._ProgrammeTypes__OclType /* 2 */,
				Fragments._ProgrammeTypes__OclEnumeration /* 3 */,
				Fragments._ProgrammeTypes__ProgrammeTypes /* 4 */
			};
		private static final int /*@NonNull*/ [] __ProgrammeTypes = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Role =
			{
				Fragments._Role__OclAny /* 0 */,
				Fragments._Role__OclElement /* 1 */,
				Fragments._Role__OclType /* 2 */,
				Fragments._Role__OclEnumeration /* 3 */,
				Fragments._Role__Role /* 4 */
			};
		private static final int /*@NonNull*/ [] __Role = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Service =
			{
				Fragments._Service__OclAny /* 0 */,
				Fragments._Service__OclElement /* 1 */,
				Fragments._Service__Service /* 2 */
			};
		private static final int /*@NonNull*/ [] __Service = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Staff =
			{
				Fragments._Staff__OclAny /* 0 */,
				Fragments._Staff__OclElement /* 1 */,
				Fragments._Staff__NamedEntity /* 2 */,
				Fragments._Staff__Staff /* 3 */
			};
		private static final int /*@NonNull*/ [] __Staff = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Student =
			{
				Fragments._Student__OclAny /* 0 */,
				Fragments._Student__OclElement /* 1 */,
				Fragments._Student__NamedEntity /* 2 */,
				Fragments._Student__Student /* 3 */
			};
		private static final int /*@NonNull*/ [] __Student = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _University =
			{
				Fragments._University__OclAny /* 0 */,
				Fragments._University__OclElement /* 1 */,
				Fragments._University__NamedEntity /* 2 */,
				Fragments._University__University /* 3 */
			};
		private static final int /*@NonNull*/ [] __University = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AcademicDepartment.initFragments(_AcademicDepartment, __AcademicDepartment);
			Types._AdministrativeDepartment.initFragments(_AdministrativeDepartment, __AdministrativeDepartment);
			Types._Building.initFragments(_Building, __Building);
			Types._Campus.initFragments(_Campus, __Campus);
			Types._Centre.initFragments(_Centre, __Centre);
			Types._Course.initFragments(_Course, __Course);
			Types._Department.initFragments(_Department, __Department);
			Types._Gender.initFragments(_Gender, __Gender);
			Types._LectureHall.initFragments(_LectureHall, __LectureHall);
			Types._NamedEntity.initFragments(_NamedEntity, __NamedEntity);
			Types._Proffessor.initFragments(_Proffessor, __Proffessor);
			Types._Programme.initFragments(_Programme, __Programme);
			Types._ProgrammeTypes.initFragments(_ProgrammeTypes, __ProgrammeTypes);
			Types._Role.initFragments(_Role, __Role);
			Types._Service.initFragments(_Service, __Service);
			Types._Staff.initFragments(_Staff, __Staff);
			Types._Student.initFragments(_Student, __Student);
			Types._University.initFragments(_University, __University);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AcademicDepartment__AcademicDepartment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AcademicDepartment__Department = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AcademicDepartment__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AcademicDepartment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AcademicDepartment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AdministrativeDepartment__AdministrativeDepartment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AdministrativeDepartment__Department = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AdministrativeDepartment__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AdministrativeDepartment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AdministrativeDepartment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Building__Building = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Building__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Building__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Building__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Campus__Campus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Campus__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Campus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Campus__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Centre__Centre = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Centre__Department = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Centre__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Centre__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Centre__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Course__Course = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Department__Department = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Gender__Gender = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gender__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gender__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gender__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gender__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LectureHall__LectureHall = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LectureHall__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LectureHall__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedEntity__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedEntity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedEntity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Proffessor__Proffessor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Proffessor__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Proffessor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Proffessor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Proffessor__Staff = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Programme__Programme = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Programme__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Programme__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Programme__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProgrammeTypes__ProgrammeTypes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProgrammeTypes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProgrammeTypes__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProgrammeTypes__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProgrammeTypes__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Role__Role = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Service__Service = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Staff__Staff = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Staff__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Staff__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Staff__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Student__Student = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _University__University = {};
		private static final ExecutorOperation /*@NonNull*/ [] _University__NamedEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _University__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _University__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AcademicDepartment__AcademicDepartment.initOperations(_AcademicDepartment__AcademicDepartment);
			Fragments._AcademicDepartment__Department.initOperations(_AcademicDepartment__Department);
			Fragments._AcademicDepartment__NamedEntity.initOperations(_AcademicDepartment__NamedEntity);
			Fragments._AcademicDepartment__OclAny.initOperations(_AcademicDepartment__OclAny);
			Fragments._AcademicDepartment__OclElement.initOperations(_AcademicDepartment__OclElement);

			Fragments._AdministrativeDepartment__AdministrativeDepartment.initOperations(_AdministrativeDepartment__AdministrativeDepartment);
			Fragments._AdministrativeDepartment__Department.initOperations(_AdministrativeDepartment__Department);
			Fragments._AdministrativeDepartment__NamedEntity.initOperations(_AdministrativeDepartment__NamedEntity);
			Fragments._AdministrativeDepartment__OclAny.initOperations(_AdministrativeDepartment__OclAny);
			Fragments._AdministrativeDepartment__OclElement.initOperations(_AdministrativeDepartment__OclElement);

			Fragments._Building__Building.initOperations(_Building__Building);
			Fragments._Building__NamedEntity.initOperations(_Building__NamedEntity);
			Fragments._Building__OclAny.initOperations(_Building__OclAny);
			Fragments._Building__OclElement.initOperations(_Building__OclElement);

			Fragments._Campus__Campus.initOperations(_Campus__Campus);
			Fragments._Campus__NamedEntity.initOperations(_Campus__NamedEntity);
			Fragments._Campus__OclAny.initOperations(_Campus__OclAny);
			Fragments._Campus__OclElement.initOperations(_Campus__OclElement);

			Fragments._Centre__Centre.initOperations(_Centre__Centre);
			Fragments._Centre__Department.initOperations(_Centre__Department);
			Fragments._Centre__NamedEntity.initOperations(_Centre__NamedEntity);
			Fragments._Centre__OclAny.initOperations(_Centre__OclAny);
			Fragments._Centre__OclElement.initOperations(_Centre__OclElement);

			Fragments._Course__Course.initOperations(_Course__Course);
			Fragments._Course__NamedEntity.initOperations(_Course__NamedEntity);
			Fragments._Course__OclAny.initOperations(_Course__OclAny);
			Fragments._Course__OclElement.initOperations(_Course__OclElement);

			Fragments._Department__Department.initOperations(_Department__Department);
			Fragments._Department__NamedEntity.initOperations(_Department__NamedEntity);
			Fragments._Department__OclAny.initOperations(_Department__OclAny);
			Fragments._Department__OclElement.initOperations(_Department__OclElement);

			Fragments._Gender__Gender.initOperations(_Gender__Gender);
			Fragments._Gender__OclAny.initOperations(_Gender__OclAny);
			Fragments._Gender__OclElement.initOperations(_Gender__OclElement);
			Fragments._Gender__OclEnumeration.initOperations(_Gender__OclEnumeration);
			Fragments._Gender__OclType.initOperations(_Gender__OclType);

			Fragments._LectureHall__LectureHall.initOperations(_LectureHall__LectureHall);
			Fragments._LectureHall__OclAny.initOperations(_LectureHall__OclAny);
			Fragments._LectureHall__OclElement.initOperations(_LectureHall__OclElement);

			Fragments._NamedEntity__NamedEntity.initOperations(_NamedEntity__NamedEntity);
			Fragments._NamedEntity__OclAny.initOperations(_NamedEntity__OclAny);
			Fragments._NamedEntity__OclElement.initOperations(_NamedEntity__OclElement);

			Fragments._Proffessor__NamedEntity.initOperations(_Proffessor__NamedEntity);
			Fragments._Proffessor__OclAny.initOperations(_Proffessor__OclAny);
			Fragments._Proffessor__OclElement.initOperations(_Proffessor__OclElement);
			Fragments._Proffessor__Proffessor.initOperations(_Proffessor__Proffessor);
			Fragments._Proffessor__Staff.initOperations(_Proffessor__Staff);

			Fragments._Programme__NamedEntity.initOperations(_Programme__NamedEntity);
			Fragments._Programme__OclAny.initOperations(_Programme__OclAny);
			Fragments._Programme__OclElement.initOperations(_Programme__OclElement);
			Fragments._Programme__Programme.initOperations(_Programme__Programme);

			Fragments._ProgrammeTypes__OclAny.initOperations(_ProgrammeTypes__OclAny);
			Fragments._ProgrammeTypes__OclElement.initOperations(_ProgrammeTypes__OclElement);
			Fragments._ProgrammeTypes__OclEnumeration.initOperations(_ProgrammeTypes__OclEnumeration);
			Fragments._ProgrammeTypes__OclType.initOperations(_ProgrammeTypes__OclType);
			Fragments._ProgrammeTypes__ProgrammeTypes.initOperations(_ProgrammeTypes__ProgrammeTypes);

			Fragments._Role__OclAny.initOperations(_Role__OclAny);
			Fragments._Role__OclElement.initOperations(_Role__OclElement);
			Fragments._Role__OclEnumeration.initOperations(_Role__OclEnumeration);
			Fragments._Role__OclType.initOperations(_Role__OclType);
			Fragments._Role__Role.initOperations(_Role__Role);

			Fragments._Service__OclAny.initOperations(_Service__OclAny);
			Fragments._Service__OclElement.initOperations(_Service__OclElement);
			Fragments._Service__Service.initOperations(_Service__Service);

			Fragments._Staff__NamedEntity.initOperations(_Staff__NamedEntity);
			Fragments._Staff__OclAny.initOperations(_Staff__OclAny);
			Fragments._Staff__OclElement.initOperations(_Staff__OclElement);
			Fragments._Staff__Staff.initOperations(_Staff__Staff);

			Fragments._Student__NamedEntity.initOperations(_Student__NamedEntity);
			Fragments._Student__OclAny.initOperations(_Student__OclAny);
			Fragments._Student__OclElement.initOperations(_Student__OclElement);
			Fragments._Student__Student.initOperations(_Student__Student);

			Fragments._University__NamedEntity.initOperations(_University__NamedEntity);
			Fragments._University__OclAny.initOperations(_University__OclAny);
			Fragments._University__OclElement.initOperations(_University__OclElement);
			Fragments._University__University.initOperations(_University__University);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AcademicDepartment = {
			UniversityMetamodelTables.Properties._Department__Building,
			UniversityMetamodelTables.Properties._AcademicDepartment__LectureHalls,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._AcademicDepartment__Programmes,
			UniversityMetamodelTables.Properties._Department__Staffs,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AdministrativeDepartment = {
			UniversityMetamodelTables.Properties._Department__Building,
			UniversityMetamodelTables.Properties._AdministrativeDepartment__ClosingHour,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._AdministrativeDepartment__OpeningHour,
			UniversityMetamodelTables.Properties._Department__Staffs,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Building = {
			UniversityMetamodelTables.Properties._Building__Departments,
			UniversityMetamodelTables.Properties._Building__LectureHalls,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._Building__Size,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Campus = {
			UniversityMetamodelTables.Properties._Campus__Buildings,
			UniversityMetamodelTables.Properties._Campus__Departments,
			UniversityMetamodelTables.Properties._Campus__Location,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Centre = {
			UniversityMetamodelTables.Properties._Department__Building,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._Centre__Services,
			UniversityMetamodelTables.Properties._Department__Staffs,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Course = {
			UniversityMetamodelTables.Properties._Course__Code,
			UniversityMetamodelTables.Properties._Course__LectureHalls,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._Course__Proffessors,
			UniversityMetamodelTables.Properties._Course__Time,
			UniversityMetamodelTables.Properties._Course__Title,
			UniversityMetamodelTables.Properties._Course__Unit,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Department = {
			UniversityMetamodelTables.Properties._Department__Building,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._Department__Staffs,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Gender = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LectureHall = {
			UniversityMetamodelTables.Properties._LectureHall__Code,
			UniversityMetamodelTables.Properties._LectureHall__Courses,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedEntity = {
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Proffessor = {
			UniversityMetamodelTables.Properties._Proffessor__Courses,
			UniversityMetamodelTables.Properties._Staff__Email,
			UniversityMetamodelTables.Properties._Staff__Gender,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._Staff__Role,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Programme = {
			UniversityMetamodelTables.Properties._Programme__Courses,
			UniversityMetamodelTables.Properties._Programme__Department,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._Programme__Students,
			UniversityMetamodelTables.Properties._Programme__Type,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProgrammeTypes = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Role = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Service = {
			UniversityMetamodelTables.Properties._Service__Description,
			UniversityMetamodelTables.Properties._Service__Title,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Staff = {
			UniversityMetamodelTables.Properties._Staff__Email,
			UniversityMetamodelTables.Properties._Staff__Gender,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._Staff__Role,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Student = {
			UniversityMetamodelTables.Properties._Student__Country,
			UniversityMetamodelTables.Properties._Student__Gender,
			UniversityMetamodelTables.Properties._Student__MatricNumber,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._Student__Programme,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _University = {
			UniversityMetamodelTables.Properties._University__Address,
			UniversityMetamodelTables.Properties._University__Campuses,
			UniversityMetamodelTables.Properties._University__Email,
			UniversityMetamodelTables.Properties._NamedEntity__Name,
			UniversityMetamodelTables.Properties._University__Website,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AcademicDepartment__AcademicDepartment.initProperties(_AcademicDepartment);
			Fragments._AdministrativeDepartment__AdministrativeDepartment.initProperties(_AdministrativeDepartment);
			Fragments._Building__Building.initProperties(_Building);
			Fragments._Campus__Campus.initProperties(_Campus);
			Fragments._Centre__Centre.initProperties(_Centre);
			Fragments._Course__Course.initProperties(_Course);
			Fragments._Department__Department.initProperties(_Department);
			Fragments._Gender__Gender.initProperties(_Gender);
			Fragments._LectureHall__LectureHall.initProperties(_LectureHall);
			Fragments._NamedEntity__NamedEntity.initProperties(_NamedEntity);
			Fragments._Proffessor__Proffessor.initProperties(_Proffessor);
			Fragments._Programme__Programme.initProperties(_Programme);
			Fragments._ProgrammeTypes__ProgrammeTypes.initProperties(_ProgrammeTypes);
			Fragments._Role__Role.initProperties(_Role);
			Fragments._Service__Service.initProperties(_Service);
			Fragments._Staff__Staff.initProperties(_Staff);
			Fragments._Student__Student.initProperties(_Student);
			Fragments._University__University.initProperties(_University);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Gender__Male = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.GENDER.getEEnumLiteral("Male"), Types._Gender, 0);
		public static final EcoreExecutorEnumerationLiteral _Gender__Female = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.GENDER.getEEnumLiteral("Female"), Types._Gender, 1);
		public static final EcoreExecutorEnumerationLiteral _Gender__Other = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.GENDER.getEEnumLiteral("Other"), Types._Gender, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Gender = {
			_Gender__Male,
			_Gender__Female,
			_Gender__Other
		};

		public static final EcoreExecutorEnumerationLiteral _ProgrammeTypes__Bachelors = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.PROGRAMME_TYPES.getEEnumLiteral("Bachelors"), Types._ProgrammeTypes, 0);
		public static final EcoreExecutorEnumerationLiteral _ProgrammeTypes__Masters = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.PROGRAMME_TYPES.getEEnumLiteral("Masters"), Types._ProgrammeTypes, 1);
		public static final EcoreExecutorEnumerationLiteral _ProgrammeTypes__Doctoral = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.PROGRAMME_TYPES.getEEnumLiteral("Doctoral"), Types._ProgrammeTypes, 2);
		public static final EcoreExecutorEnumerationLiteral _ProgrammeTypes__Mobility_Masters = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.PROGRAMME_TYPES.getEEnumLiteral("Mobility_Masters"), Types._ProgrammeTypes, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ProgrammeTypes = {
			_ProgrammeTypes__Bachelors,
			_ProgrammeTypes__Masters,
			_ProgrammeTypes__Doctoral,
			_ProgrammeTypes__Mobility_Masters
		};

		public static final EcoreExecutorEnumerationLiteral _Role__Director = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.ROLE.getEEnumLiteral("Director"), Types._Role, 0);
		public static final EcoreExecutorEnumerationLiteral _Role__DeputyDirector = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.ROLE.getEEnumLiteral("DeputyDirector"), Types._Role, 1);
		public static final EcoreExecutorEnumerationLiteral _Role__HeadTeachingOfficer = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.ROLE.getEEnumLiteral("HeadTeachingOfficer"), Types._Role, 2);
		public static final EcoreExecutorEnumerationLiteral _Role__Accountant = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.ROLE.getEEnumLiteral("Accountant"), Types._Role, 3);
		public static final EcoreExecutorEnumerationLiteral _Role__AcademicStaff = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.ROLE.getEEnumLiteral("AcademicStaff"), Types._Role, 4);
		public static final EcoreExecutorEnumerationLiteral _Role__NonAcademicStaff = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.ROLE.getEEnumLiteral("NonAcademicStaff"), Types._Role, 5);
		public static final EcoreExecutorEnumerationLiteral _Role__Rector = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.ROLE.getEEnumLiteral("Rector"), Types._Role, 6);
		public static final EcoreExecutorEnumerationLiteral _Role__GeneralManager = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.ROLE.getEEnumLiteral("GeneralManager"), Types._Role, 7);
		public static final EcoreExecutorEnumerationLiteral _Role__Proffessor = new EcoreExecutorEnumerationLiteral(UniversityMetamodelPackage.Literals.ROLE.getEEnumLiteral("Proffessor"), Types._Role, 8);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Role = {
			_Role__Director,
			_Role__DeputyDirector,
			_Role__HeadTeachingOfficer,
			_Role__Accountant,
			_Role__AcademicStaff,
			_Role__NonAcademicStaff,
			_Role__Rector,
			_Role__GeneralManager,
			_Role__Proffessor
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Gender.initLiterals(_Gender);
			Types._ProgrammeTypes.initLiterals(_ProgrammeTypes);
			Types._Role.initLiterals(_Role);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of UniversityMetamodelTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new UniversityMetamodelTables();
	}

	private UniversityMetamodelTables() {
		super(UniversityMetamodelPackage.eNS_URI);
	}
}
