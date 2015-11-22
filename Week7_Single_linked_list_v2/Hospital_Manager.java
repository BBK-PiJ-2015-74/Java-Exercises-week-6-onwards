// week 7 Patient and Hospital Manager example (Hospital Manager is the main code)
// see also Patient.java

public class Hospital_Manager {
	
	private Patient patientListStart = null; //patientList is a variable of class Patient which is initialised to null, File looks for class Patient
	
	public static void main(String[] args) { 
	//main method is static which is bad and we don't want static variables so we create a new object and launch method instead
	
		Hospital_Manager hm = new Hospital_Manager(); // Hospital_manager is a list of patients and methods that allow you to add and delete patients from the list
		hm.launch();
	}
	
	public void launch() {
	
		this.acceptPatient ("Lucie", 41, "broken leg");
		this.acceptPatient ("John", 33, "Tuberculosis");
		this.acceptPatient ("Chris", 75, "Influenza");
		this.acceptPatient ("Mary", 91, "Dementia");
		this.acceptPatient ("Paul", 35, "Aids");
		this.acceptPatient ("Oliver", 46, "Influenza");
		
		
		this.printAllPatients(); // call method printAllPatients on this Hospital Manager
		this.removeDeadPatient("Lucie");
		this.removeDeadPatient("Mary"); 
		this.removeDeadPatient("Paul"); 
		
		this.printAllPatients();
		
	}
	
	public void printAllPatients() {
		patientListStart.printPatientList();
	}
	
	public void acceptPatient(String name, int age, String illness) { // accept patients to the list which have been added in the patient file
		Patient newPatient = new Patient(name, age, illness);
		if (patientListStart == null) { // if the list is empty, create it with a new Patient object
			patientListStart = newPatient; 
		} else {
			patientListStart.addPatient(newPatient);
		}
	}
	
	public void removeDeadPatient(String name) {
		if (patientListStart == null) {
			System.out.println("The list is empty");
		} else if (name.equals(patientListStart.getName())) {
			System.out.println("Deleting first patient " + name);
			patientListStart = patientListStart.getNextPatient(); // delete first patient by updating pointer to the next one
		} else { 
			System.out.println("Deleting patient " + name);
			patientListStart.deletePatient(name); // running deletePatient on a list that starts with patientListStart
		}
	}		

	
} // End of class HospitalManager
	
// Hint: Note that you cannot delete the first element from inside the list 
// because you need to update the pointer patientListStart. 
// To add or delete the first element of a list, you must do it from outside the list.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	