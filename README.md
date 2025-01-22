# EMF-Assignment-A5-GROUP8
EMF Assignment A5 for Model Driven Engineering at the University Of L'Aquila.

# Project Completion Checklist for Assignment A5 (Transformations)

#### Project Overview
This project involves the use of model transformations in the context of a university domain. The assignment is split into three primary tasks:

#### Task 1: Refactor the original metamodel to create a refined version.
 ###### Deletion and Addition of Concepts:
- Concepts such as Library and Event were added as part of the refined metamodel. The Campus class now includes a new Libraries property, and University includes an Events property.
- Facility was added as an abstract class

 ###### Concept Renaming:
- Renamed LectureHall to Classroom to better match the domain terminology.
- Centre is now renamed to Support.
- Proffessor was changed to Professor

###### Structural Refinements:
- The facility class was added as a superclass for building and Library
- The people class was also added as a superclass for student and staff
- The University class now includes a SummaryTable to provide summarized statistics.
- Added a new Library class to represent libraries within the campus.
- Added a Support class as a refined version of Centre.

###### Changed Attributes:
- University now includes an additional attribute for SummaryTable and Events.
- Building now represents classrooms with the Classrooms property.


#### Task 2: M2M Transformation (ATL) - Define a Model-to-Model (M2M) transformation using ATL (Atlas Transformation Language) to migrate models from the initial metamodel to the refined version.
Source: UniversitySystemMetamodel
Target: NewUniversitySystemMetamodel

###### 2.2 ATL Transformation Rules
 University to University Transformation:
- Transformation of the University class from the source metamodel to the target metamodel.
- Added a derived SummaryTable for university-wide statistics.
 
 Campus to Campus and Library Transformation:
- Transformation of Campus and creation of a new Library class in the target metamodel.

Building to Building Transformation:
- Building class transformations to target Building and related Classroom properties.

Department Transformation:
- Refined transformation rules for Department, including its subclasses (AcademicDepartment, AdministrativeDepartment, Support).
- Used abstract transformation for the base class and extended for specialized subclasses.

Course Transformation:
-Transformation of the Course class, including its professors and lecture hall associations.
- Staff and Professor Transformation:

Transformation from Staff and Professor in the source model to the target model, preserving roles and attributes.
- LectureHall to Classroom Transformation:

Transformation to convert LectureHall into Classroom and handle courses associated with it.
- Programme and Student Transformation:

Transformation of Programme and Student with attributes and relationships maintained.

 #### Task 2: M2T Transformation (MTT) - Define a Model-to-Model (M2T) transformation using Acceleo.
University Overview: Displays university name, address, email, and website.
Links to Campuses, Buildings, Departments, and Programs: Generated dynamically.
Back Navigation: Includes a "Back to main page" link.
3. Page Templates
Campus Pages: Displays campus details, buildings, and departments.
Building Pages: Lists building size and associated departments.
Department Pages: Shows department details, staff, and associated building.
Staff Pages: Displays staff details (name, role, email).
Program Pages: Lists program details and courses.
Course Pages: Displays course details (name, code, description).


