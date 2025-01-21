package UniversityModel;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import java.io.File;


import UniversityMetamodel.*;

public class ModelA_UnivaqModel {

    public static University create() {
    	
        //*************************** Instantiating Concepts ********************************************************//
    	
    	//Create university
        University university = UniversityMetamodelFactory.eINSTANCE.createUniversity();
	        university.setName("University of L'Aquila");
	        university.setAddress("Palazzo Camponeschi, piazza Santa Margherita 2, 67100, L'Aquila");
	        university.setEmail("sestuin@strutture.univaq.it");
	        university.setWebsite("http://www.univaq.it");
	   
        // Create Rio Campus
        Campus rio_campus = UniversityMetamodelFactory.eINSTANCE.createCampus();
	        rio_campus.setName("Roio");
	        rio_campus.setLocation("City Center");
	        
	  // Create Coppito Campus
	    Campus Coppito_campus = UniversityMetamodelFactory.eINSTANCE.createCampus();
		    Coppito_campus.setName("Coppito");
		    Coppito_campus.setLocation("via Vetoio, L'Aquila");

        // Create buildings in Rio campus
        Building rio_building1 = UniversityMetamodelFactory.eINSTANCE.createBuilding();
	        rio_building1.setName("Ottorino Pomilio Building Block A");
	        rio_building1.setSize("1200sqm");
	        
        Building rio_building2 = UniversityMetamodelFactory.eINSTANCE.createBuilding();
	        rio_building2.setName("Palazzo Camponeschi");
	        rio_building2.setSize("970sqm");
	        
        Building rio_building3 = UniversityMetamodelFactory.eINSTANCE.createBuilding();
	        rio_building3.setName("Ottorino Pomilio Building Block B");
	        rio_building3.setSize("740smq");
	        
	     // Create buildings in Coppito campus
        Building coppito_building1 = UniversityMetamodelFactory.eINSTANCE.createBuilding();
        	coppito_building1.setName("Edificio Renato Ricamo");
        	coppito_building1.setSize("1000smq");
        	
    	Building coppito_building2 = UniversityMetamodelFactory.eINSTANCE.createBuilding();
        	coppito_building2.setName("Edificio Angelo Camillo De Meis");
        	coppito_building2.setSize("740smq"); 
	    
    	Building coppito_building3 = UniversityMetamodelFactory.eINSTANCE.createBuilding();
        	coppito_building3.setName("Academica");
        	coppito_building3.setSize("1400smq");
        	
        // Create Halls
        LectureHall A1 = UniversityMetamodelFactory.eINSTANCE.createLectureHall();
        	A1.setCode("A1");
        LectureHall A2 = UniversityMetamodelFactory.eINSTANCE.createLectureHall();
        	A2.setCode("A2");
        LectureHall A3 = UniversityMetamodelFactory.eINSTANCE.createLectureHall();
        	A3.setCode("A3");
    	LectureHall A4 = UniversityMetamodelFactory.eINSTANCE.createLectureHall();
        	A4.setCode("A4");
        	
        // Create Departments
        AdministrativeDepartment HR = UniversityMetamodelFactory.eINSTANCE.createAdministrativeDepartment();
        	HR.setName("Human Resource Department");
        	HR.setBuilding(rio_building2);
        	
        AdministrativeDepartment Offices = UniversityMetamodelFactory.eINSTANCE.createAdministrativeDepartment();
        	Offices.setName("Offices");
        	Offices.setBuilding(rio_building3);
        	
        AcademicDepartment dept1 = UniversityMetamodelFactory.eINSTANCE.createAcademicDepartment();
        	dept1.setName("Information Engineering Computer Science and Mathematics");
        	dept1.setBuilding(coppito_building1);
        
        AcademicDepartment dept2 = UniversityMetamodelFactory.eINSTANCE.createAcademicDepartment();
        	dept2.setName("Biotechnological and Applied Clinical Sciences");
        	dept2.setBuilding(coppito_building2);
        	
        Centre sports = UniversityMetamodelFactory.eINSTANCE.createCentre();
        	sports.setName("Sports Center");
        	sports.setBuilding(rio_building1);
        	
        // Create service for Centre
        Service sportService = UniversityMetamodelFactory.eINSTANCE.createService();
        	sportService.setTitle("Sport Service");
        	sportService.setDescription("Responsible for managing students sporting activities and for ensuring health compliance among athletes");

	    // Create Staff for Departments
        Staff Nardecchia = UniversityMetamodelFactory.eINSTANCE.createStaff();
        	Nardecchia.setGender(Gender.MALE);
        	Nardecchia.setName("Nardecchia Annamaria");
        	Nardecchia.getRole().add(Role.DIRECTOR);
        	Nardecchia.getEmail().add("Nardecchia@staff.univaq.it");
        	
    	Staff Edoardo = UniversityMetamodelFactory.eINSTANCE.createStaff();
    		Edoardo.setGender(Gender.MALE);
    		Edoardo.setName("Prof Edoardo Alesse");
    		Edoardo.getRole().add(Role.RECTOR);
    		Edoardo.getEmail().add("Edoardo@staff.univaq.it");
        	
        
        Proffessor Muncini = UniversityMetamodelFactory.eINSTANCE.createProffessor();
        	Muncini.setGender(Gender.MALE);
        	Muncini.setName("Proffessor Henry Muncini");
        	Muncini.getRole().add(Role.ACADEMIC_STAFF);
        	Muncini.getRole().add(Role.PROFFESSOR);
        	Muncini.getEmail().add("muncini@staff.univaq.it");
        	
        Proffessor Alfonso = UniversityMetamodelFactory.eINSTANCE.createProffessor();
        	Alfonso.setGender(Gender.MALE);
        	Alfonso.setName("Proffessor Alfonso Pierantonio");
        	Alfonso.getRole().add(Role.ACADEMIC_STAFF);
        	Alfonso.getRole().add(Role.PROFFESSOR);
        	Alfonso.getEmail().add("alfonso@staff.univaq.it");
        	
        Proffessor Juri = UniversityMetamodelFactory.eINSTANCE.createProffessor();
        	Juri.setGender(Gender.MALE);
        	Juri.setName("Juri Di Rocco");
        	Juri.getRole().add(Role.ACADEMIC_STAFF);
        	Juri.getRole().add(Role.PROFFESSOR);
        	Juri.getEmail().add("Juri@staff.univaq.it");
        	
        Proffessor mathew = UniversityMetamodelFactory.eINSTANCE.createProffessor();
        	mathew.setGender(Gender.MALE);
        	mathew.setName("Prof. Mathew Modelus");
        	mathew.getRole().add(Role.ACADEMIC_STAFF);
        	mathew.getRole().add(Role.PROFFESSOR);
        	mathew.getEmail().add("mathew@staff.univaq.it");
        	
        Staff Luigi = UniversityMetamodelFactory.eINSTANCE.createStaff();
        	Luigi.setGender(Gender.FEMALE);
        	Luigi.setName("Luigi Cavali");
        	Luigi.getRole().add(Role.ACCOUNTANT);
        	Luigi.getEmail().add("Luigi@staff.univaq.it");
    		
		Staff Francesca = UniversityMetamodelFactory.eINSTANCE.createStaff();
			Francesca.setGender(Gender.FEMALE);
			Francesca.setName("Prof Francesca Zazzeroni");
			Francesca.getRole().add(Role.DIRECTOR);
			Francesca.getEmail().add("Francesca@staff.univaq.it");
			
		
		// create Academic programmes
		Programme computer_scienceProgramme = UniversityMetamodelFactory.eINSTANCE.createProgramme();
			computer_scienceProgramme.setName("Computer Science");
			computer_scienceProgramme.setType(ProgrammeTypes.BACHELORS);
			
		
        Programme mathematicsProgramme = UniversityMetamodelFactory.eINSTANCE.createProgramme();
        	mathematicsProgramme.setName("Mathematics");
			mathematicsProgramme.setType(ProgrammeTypes.MASTERS);
			
		//create courses 
		Course software_architectureCourse = UniversityMetamodelFactory.eINSTANCE.createCourse();
			software_architectureCourse.setCode("SA");
			software_architectureCourse.setName("Software Architecture");
			software_architectureCourse.setTitle("Software Architecture");
			software_architectureCourse.setUnit(6);
			software_architectureCourse.getTime().add("8:00 Mondays");
			software_architectureCourse.getTime().add("9:30 Fridays");
			software_architectureCourse.getLectureHalls().add(A1);
			software_architectureCourse.getProffessors().add(Muncini);
			
			
		Course model_drivenCourse = UniversityMetamodelFactory.eINSTANCE.createCourse();
			model_drivenCourse.setCode("MDE");
			model_drivenCourse.setName("Model Driven Engineering");
			model_drivenCourse.setTitle("MDE 442");
			model_drivenCourse.setUnit(6);
			model_drivenCourse.getTime().add("16:30 Tuesdays");
			model_drivenCourse.getTime().add("11:30 Wednesdays");
			model_drivenCourse.getLectureHalls().add(A2);
			model_drivenCourse.getLectureHalls().add(A3);
			model_drivenCourse.getProffessors().add(Alfonso);
			model_drivenCourse.getProffessors().add(Juri);
			
		Course mathmodelCourse = UniversityMetamodelFactory.eINSTANCE.createCourse();
			mathmodelCourse.setCode("MMD");
			mathmodelCourse.setName("Mathematical Modelling");
			mathmodelCourse.setTitle("MMD 524");
			mathmodelCourse.setUnit(6);
			mathmodelCourse.getTime().add("12:30 Tuesdays");
			mathmodelCourse.getTime().add("14:30 Wednesdays");
			mathmodelCourse.getLectureHalls().add(A4);
			mathmodelCourse.getProffessors().add(mathew);
			
		Student abdulkadirStudent = UniversityMetamodelFactory.eINSTANCE.createStudent();
			abdulkadirStudent.setName("Abdulkadir Abubakar");
			abdulkadirStudent.setCountry("Nigeria");
			abdulkadirStudent.setGender(Gender.MALE);
			abdulkadirStudent.setMatricNumber("301125");
			abdulkadirStudent.setProgramme(computer_scienceProgramme);
			
		Student victorStudent = UniversityMetamodelFactory.eINSTANCE.createStudent();
			victorStudent.setName("Victor Moboluwarin Olasehinde");
			victorStudent.setCountry("Nigeria");
			victorStudent.setGender(Gender.MALE);
			victorStudent.setMatricNumber("301147");
			victorStudent.setProgramme(computer_scienceProgramme);

        	
        //***************************** Defining References among concepts *******************************************//
		 // Add the campuses to the university
	     university.getCampuses().add(rio_campus);
	     university.getCampuses().add(Coppito_campus);
	     
        // Add buildings to the Rio campus
        rio_campus.getBuildings().add(rio_building1);
        rio_campus.getBuildings().add(rio_building2);
        rio_campus.getBuildings().add(rio_building3);
        
     // Add buildings to the Coppito campus
        Coppito_campus.getBuildings().add(coppito_building1);
        Coppito_campus.getBuildings().add(coppito_building2);
        Coppito_campus.getBuildings().add(coppito_building3);
        
       // Add halls to buildings
        rio_building1.getLectureHalls().add(A1);
        rio_building2.getLectureHalls().add(A2);
        coppito_building1.getLectureHalls().add(A3);
        coppito_building2.getLectureHalls().add(A4);
        
        //Add departments to campuses
        rio_campus.getDepartments().add(HR);
        rio_campus.getDepartments().add(Offices);
        rio_campus.getDepartments().add(sports);
        Coppito_campus.getDepartments().add(dept1);
        Coppito_campus.getDepartments().add(dept2);
        
        //Add sport service to sport department
        sports.getServices().add(sportService);
        
        //Add staff to departments
        HR.getStaffs().add(Nardecchia);
        Offices.getStaffs().add(Edoardo);
        dept1.getStaffs().add(Muncini);
        dept1.getStaffs().add(Alfonso);
        dept1.getStaffs().add(Juri);
        dept1.getStaffs().add(mathew);
        dept2.getStaffs().add(Francesca);
        dept2.getStaffs().add(Luigi);
        
        
        //Add programme to department
        dept1.getProgrammes().add(computer_scienceProgramme);
        dept2.getProgrammes().add(mathematicsProgramme);
        
        //Add course to programme
        computer_scienceProgramme.getCourses().add(software_architectureCourse);
        computer_scienceProgramme.getCourses().add(model_drivenCourse);
        mathematicsProgramme.getCourses().add(mathmodelCourse);
      
        return university;
    }

    public static void serializeModel(University university, String fileName) {
        // Ensure the directory exists before saving the file
        File file = new File(fileName);
        File parentDir = file.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs();  // Creates the directory if it doesn't exist
        }

        // Register the XMI resource factory for the .xmi extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl()); // Corrected: Use FactoryImpl

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Create a resource (EMF internally handles the correct factory)
        Resource resource = resSet.createResource(URI.createFileURI(fileName));
        resource.getContents().add(university);

        // Save the content using the XMIResource factory
        try {
            System.out.println("Saving model to: " + fileName);
            resource.save(Collections.EMPTY_MAP); // EMF will use the correct XMI resource factory internally
            System.out.println("Model saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public static University load(String fileName) {
        // Register the package
        EPackage.Registry.INSTANCE.put(UniversityMetamodelPackage.eNS_URI, UniversityMetamodelPackage.eINSTANCE);

        // Load the model
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(URI.createFileURI(fileName), true);

        if (resource == null || resource.getContents().isEmpty()) {
            throw new RuntimeException("Failed to load the model from file: " + fileName);
        }

        return (University) resource.getContents().get(0);
    }

    public static Diagnostic validate(University university) {
        return Diagnostician.INSTANCE.validate(university);
    }

    public static void main(String[] args) {
        final String FILENAME = "UniversityOfLaquilaModel.xmi"; // Make sure this path is correct

        // Create and serialize the model
        University university = create();
        serializeModel(university, FILENAME);

        // Load the model back
        University loadedUniversity = load(FILENAME);

        // Validate the model
        Diagnostic diagnostic = validate(loadedUniversity);
        if (diagnostic.getSeverity() == Diagnostic.OK) {
            System.out.println("The model is valid");
            System.out.println("The model has been saved as a file named UniversityOfLaquila.xmi");
        } else {
            System.out.println("The model is invalid");
            diagnostic.getChildren().forEach(child -> System.out.println(child.getMessage()));
        }
        
    }
}
