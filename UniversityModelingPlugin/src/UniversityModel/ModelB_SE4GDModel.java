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

public class ModelB_SE4GDModel {

    public static AcademicDepartment create() {
    	
        //*************************** Instantiating Concepts ********************************************************//
	        
    				 
    	// create the Department
		AcademicDepartment ComputerScience = UniversityMetamodelFactory.eINSTANCE.createAcademicDepartment();
			 ComputerScience.setName("Information Engineering Computer Science and Mathematics");
			 
		
		// create the programme
		Programme SE4GDProgramme = UniversityMetamodelFactory.eINSTANCE.createProgramme();
			SE4GDProgramme.setName("Software Engineering for Green Deal (SE4GD)");
			
		// create Staff
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
        	
        Proffessor Pasquale = UniversityMetamodelFactory.eINSTANCE.createProffessor();
        	Pasquale.setGender(Gender.MALE);
        	Pasquale.setName("Pasquale Caianiello");
        	Pasquale.getRole().add(Role.ACADEMIC_STAFF);
        	Pasquale.getRole().add(Role.PROFFESSOR);
        	Pasquale.getEmail().add("Pasquale@staff.univaq.it");
        	
        Proffessor Giovanni = UniversityMetamodelFactory.eINSTANCE.createProffessor();
        	Giovanni.setGender(Gender.MALE);
        	Giovanni.setName("Giovanni Stilo");
        	Giovanni.getRole().add(Role.ACADEMIC_STAFF);
        	Giovanni.getRole().add(Role.PROFFESSOR);
        	Giovanni.getEmail().add("Giovanni@staff.univaq.it");
        	
    	Proffessor Cortellessa = UniversityMetamodelFactory.eINSTANCE.createProffessor();
    		Cortellessa.setGender(Gender.MALE);
    		Cortellessa.setName("Vittorio Cortellessa");
    		Cortellessa.getRole().add(Role.ACADEMIC_STAFF);
    		Cortellessa.getRole().add(Role.PROFFESSOR);
    		Cortellessa.getEmail().add("Cortellessa@staff.univaq.it");
    	
		Proffessor Davide = UniversityMetamodelFactory.eINSTANCE.createProffessor();
			Davide.setGender(Gender.MALE);
			Davide.setName("Davide Di Ruscio");
			Davide.getRole().add(Role.ACADEMIC_STAFF);
			Davide.getRole().add(Role.PROFFESSOR);
			Davide.getEmail().add("Cortellessa@staff.univaq.it");
			
			
		// create the courses
		Course software_architectureCourse = UniversityMetamodelFactory.eINSTANCE.createCourse();
			software_architectureCourse.setCode("SA");
			software_architectureCourse.setName("Software Architecture");
			software_architectureCourse.setTitle("Software Architecture");
			software_architectureCourse.setUnit(6);
			software_architectureCourse.getTime().add("8:00 Mondays");
			software_architectureCourse.getTime().add("9:30 Fridays");
			software_architectureCourse.getProffessors().add(Muncini);
			
			
		Course model_drivenCourse = UniversityMetamodelFactory.eINSTANCE.createCourse();
			model_drivenCourse.setCode("MDE");
			model_drivenCourse.setName("Model Driven Engineering");
			model_drivenCourse.setTitle("MDE 442");
			model_drivenCourse.setUnit(6);
			model_drivenCourse.getTime().add("16:30 Tuesdays");
			model_drivenCourse.getTime().add("11:30 Wednesdays");
			model_drivenCourse.getProffessors().add(Alfonso);
			model_drivenCourse.getProffessors().add(Juri);
		
		Course aiCourse = UniversityMetamodelFactory.eINSTANCE.createCourse();
			aiCourse.setCode("AI");
			aiCourse.setName("Artificial Intelligence");
			aiCourse.setTitle("AI 432");
			aiCourse.setUnit(6);
			aiCourse.getTime().add("11:30 Mondays");
			aiCourse.getTime().add("16:30 Thursdays");
			aiCourse.getProffessors().add(Giovanni);
			aiCourse.getProffessors().add(Pasquale);
			
		Course sqe = UniversityMetamodelFactory.eINSTANCE.createCourse();
			sqe.setCode("SQE");
			sqe.setName("Software Quality Engineering");
			sqe.setTitle("SUE 432");
			sqe.setUnit(6);
			sqe.getTime().add("11:30 Fridays");
			sqe.getTime().add("14:30 Thursdays");
			sqe.getProffessors().add(Cortellessa);
			
		Course iot = UniversityMetamodelFactory.eINSTANCE.createCourse();
			iot.setCode("SE4IOT");
			iot.setName("Software Architecture for Internet of Things");
			iot.setTitle("SE4IOT 432");
			iot.setUnit(6);
			iot.getTime().add("8:30 Monday");
			iot.getTime().add("9:30 Thursdays");
			iot.getProffessors().add(Davide);
			
		// Create Students
		Student abdulkadirStudent = UniversityMetamodelFactory.eINSTANCE.createStudent();
			abdulkadirStudent.setName("Abdulkadir Abubakar");
			abdulkadirStudent.setCountry("Nigeria");
			abdulkadirStudent.setGender(Gender.MALE);
			abdulkadirStudent.setMatricNumber("301125");
			abdulkadirStudent.setProgramme(SE4GDProgramme);
			
		Student victorStudent = UniversityMetamodelFactory.eINSTANCE.createStudent();
			victorStudent.setName("Victor Moboluwarin Olasehinde");
			victorStudent.setCountry("Nigeria");
			victorStudent.setGender(Gender.MALE);
			victorStudent.setMatricNumber("301147");
			victorStudent.setProgramme(SE4GDProgramme);
			
		Student salimStudent = UniversityMetamodelFactory.eINSTANCE.createStudent();
			salimStudent.setName("Salim Lawal Kamaludeen");
			salimStudent.setCountry("Nigeria");
			salimStudent.setGender(Gender.MALE);
			salimStudent.setMatricNumber("301198");
			salimStudent.setProgramme(SE4GDProgramme);
			
		Student abdusStudent = UniversityMetamodelFactory.eINSTANCE.createStudent();
			abdusStudent.setName("M Abdus Samad");
			abdusStudent.setCountry("Bangladesh");
			abdusStudent.setGender(Gender.MALE);
			abdusStudent.setMatricNumber("301186");
			abdusStudent.setProgramme(SE4GDProgramme);
			
		Student pracStudent = UniversityMetamodelFactory.eINSTANCE.createStudent();
			pracStudent.setName("Prachi Singhal");
			pracStudent.setCountry("India");
			pracStudent.setGender(Gender.FEMALE);
			pracStudent.setMatricNumber("301154");
			pracStudent.setProgramme(SE4GDProgramme);
			
		Student marcStudent = UniversityMetamodelFactory.eINSTANCE.createStudent();
			marcStudent.setName("Marcia Rodriquez");
			marcStudent.setCountry("India");
			marcStudent.setGender(Gender.FEMALE);
			marcStudent.setMatricNumber("301154");
			marcStudent.setProgramme(SE4GDProgramme);
		
		Student nabihaStudent = UniversityMetamodelFactory.eINSTANCE.createStudent();
			nabihaStudent.setName("Nabiha Chaudry");
			nabihaStudent.setCountry("India");
			nabihaStudent.setGender(Gender.FEMALE);
			nabihaStudent.setMatricNumber("301154");
			nabihaStudent.setProgramme(SE4GDProgramme);
			
		//***************************** Defining References among concepts *******************************************//
        // Add the programme to department
		ComputerScience.getProgrammes().add(SE4GDProgramme);
		
		
		//Add proffessors to department
		ComputerScience.getStaffs().add(Giovanni);
		ComputerScience.getStaffs().add(Davide);
		ComputerScience.getStaffs().add(Cortellessa);
		ComputerScience.getStaffs().add(Pasquale);
		ComputerScience.getStaffs().add(Juri);
		ComputerScience.getStaffs().add(Alfonso);
		ComputerScience.getStaffs().add(Muncini);

		
		// Add courses to programme
		SE4GDProgramme.getCourses().add(sqe);
		SE4GDProgramme.getCourses().add(aiCourse);
		SE4GDProgramme.getCourses().add(model_drivenCourse);
		SE4GDProgramme.getCourses().add(software_architectureCourse);
		SE4GDProgramme.getCourses().add(iot);
			
		return ComputerScience;
    }

    public static void serializeModel(AcademicDepartment department, String fileName) {
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
        resource.getContents().add(department);

        // Save the content using the XMIResource factory
        try {
            System.out.println("Saving model to: " + fileName);
            resource.save(Collections.EMPTY_MAP); // EMF will use the correct XMI resource factory internally
            System.out.println("Model saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AcademicDepartment load(String fileName) {
        // Register the package
        EPackage.Registry.INSTANCE.put(UniversityMetamodelPackage.eNS_URI, UniversityMetamodelPackage.eINSTANCE);

        // Load the model
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(URI.createFileURI(fileName), true);

        if (resource == null || resource.getContents().isEmpty()) {
            throw new RuntimeException("Failed to load the model from file: " + fileName);
        }

        return (AcademicDepartment) resource.getContents().get(0);
    }

    public static Diagnostic validate(AcademicDepartment department) {
        return Diagnostician.INSTANCE.validate(department);
    }

    public static void main(String[] args) {
        final String FILENAME = "SE4GD.xmi"; // Make sure this path is correct

        // Create and serialize the model
        AcademicDepartment department = create();
        serializeModel(department, FILENAME);

        // Load the model back
        AcademicDepartment loadedDepartment = load(FILENAME);

        // Validate the model
        Diagnostic diagnostic = validate(loadedDepartment);
        if (diagnostic.getSeverity() == Diagnostic.OK) {
            System.out.println("The model is valid");
            System.out.println("The model has been saved as a file named UniversityOfLaquila.xmi");
        } else {
            System.out.println("The model is invalid");
            diagnostic.getChildren().forEach(child -> System.out.println(child.getMessage()));
        }

    }
}
