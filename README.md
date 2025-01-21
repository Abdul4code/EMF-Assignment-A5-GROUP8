# EMF-Assignment-GROUP8
EMF Assignment for Model Driven Engineering at the University Of L'Aquila.

## Domain of Choice
The domain for this metamodel is a university system. This domain encompasses the organizational, academic, and administrative aspects involved in the functioning of a university. The metamodel is designed to represent key entities within a university, such as students, staff, departments, academic programs, and physical infrastructure, along with their relationships and attributes.

## Task Completion Checklist
##### Task 1:
- The metamodel defined as an ecore project (universityModelingProject/model/UniversitySystem.ecore) and contained 15 meta classes, 2 of which are abstract. <br>
- It includes 12  classes inheriting from NamedEntity class, Academic Department and Proffesor inheriting from Department and Staff respectively
- It includes 7 containement relationship and about 10 non-containment relationship with about 7 defined as opposite relationship.
- Three enumeration types are defined (programme type, gender and role)
- All metaclass has either or all of attributes and references.

#### Task 2:
- Gen file (universityModelingProject/model/UniversitySystem.genmodel) was generated from the metamodel.
- Java API for the model was generated (UniversityModelingProject/src)
- The edit and editor plugin projects for interacting with the model was also created.

#### Task 3:
- Plugin project was developed (UniversityModelingPlugin) which was used to instance two models (ModelA_UnivaqModel and ModelB_SE4GDModel
- In each of the plugin instance model, the create, serialize, load and validate methods are defined.

#### Task 4:
- Two model instances were created by creating dynamic instance from the ecore metamodel (University.xmi and SE4GD.xmi)

#### Task 5:
###### Constraints Defined <br>
- MustHaveCampus : University must have atleast one campus
- AtleastOneProgramme - An academic department must contain atleast one programme
- NoOverlappingCoursesInLectureHall - This ensures that no lectures are clashing in the same hall
- LimitStudentsFromSameCountryInMobilityProgrammes - Checks if a programme is a mobility programe, if true, then ensures that no country has more than three students in same programe

###### Operations Defined <br>
- TeachesCourse - Checks if a proffessor teaches a course
- isGenderBalanced - Returns true if both male and female are atleast 30% of the entire student population else false

###### Derived Fields <br>
- attribute NumberOfMaleStaff - Counts number of male staff in a department
- attribute NumberOfFemaleStaff - Counts number of female staff in a department
- attribute AverageStudentsPerCourse - Average number of students registered per course in a programme.





