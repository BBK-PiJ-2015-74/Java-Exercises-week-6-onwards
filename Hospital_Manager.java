// week 7 Patient and Hospital Manager example (Hospital Manager is the main code)

public class Hospital_Manager {
	
	private Patient patientListStart = null; //patientListStart is a variable of class Patient which is initialised to null
	
	public static void main(String[] args) { 
	//main method is static which is bad and we don't want static variables so we create a new object and launch method instead
	
		Hospital_Manager hm = new Hospital_Manager();
		hm.launch();
	}
	
	public void launch() {
	
		Patient patient1 = new Patient ("Lucie", 41, "broken leg");
		patientListStart = patient1;
		Patient patient2 = new Patient ("John", 33, "Tuberculosis");
		patientListStart.addPatient(patient2); 	// call the method addPatient(Patient) at any point in the list
		Patient patient3 = new Patient ("Chris", 75, "Influenza");
		patientListStart.addPatient(patient3); 	// call the method addPatient(Patient) at any point in the list
		Patient patient4 = new Patient ("Oliver", 46, "Influenza");
		patientListStart.addPatient(patient4); 	// call the method addPatient(Patient) at any point in the list
		Patient patient5 = new Patient ("Mary", 91, "Dementia");
		patientListStart.addPatient(patient5); 	// call the method addPatient(Patient) at any point in the list
		Patient patient6 = new Patient ("Paul", 35, "Aids");
		patientListStart.addPatient(patient6); 	// call the method addPatient(Patient) at any point in the list
		
		patientListStart.printPatientList(patientListStart); // call method printPatientList on object patientListStart with argument patientListStart i.e. call the method recursively
	}
	
} // End of class HospitalManager
	
	
	
	
	
	
	