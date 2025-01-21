# EMF-Assignment-A5-GROUP8
EMF Assignment for Model Driven Engineering at the University Of L'Aquila.

## Assignment Objective
The assignment's objective is to apply model transformations to refine, migrate, and generate outputs based on a metamodel. This involves refining a metamodel by restructuring, renaming, and modifying its elements. It also includes migrating models from the original to the refined metamodel using Model-to-Model (M2M) transformations in ATL and generating HTML outputs using Model-to-Text (M2T) transformations in Acceleo.

## Task Completion Checklist
##### Task 1. Apply different refractory operations on the metamodel defined in the A4 to create an updated version
- Concept Additions: Added three classes Facility, Library and Event
- Concept Deletions: Removed classes Centre and Service
- Concept Renaming: Renamed Proffessor to Professor and LectureHall to Classroom for correctness and easy understanding
- Structural refinements: Added OpenAccess attribute to Library, Made facility a superclass for Building and Library
- Removing features: Remove the Size attribute from Building since it is redundant.

##### Task 2. Define an M2M transformation that allows the migration of models conforming to the initial metamodel version to the one refined in task 1. For this task, use ATL
