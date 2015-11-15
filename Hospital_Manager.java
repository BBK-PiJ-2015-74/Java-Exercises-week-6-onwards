// week 7 Patient and Hospital Manager example (Hospital Manager is the main code)
// see also Patient.java

public class Hospital_Manager {
	
	private Patient patientList = null; //patientList is a variable of class Patient which is initialised to null, File looks for class Patient
	
	public static void main(String[] args) { 
	//main method is static which is bad and we don't want static variables so we create a new object and launch method instead
	
		Hospital_Manager hm = new Hospital_Manager();
		hm.launch();
	}
	
	public void launch() {
	
		Patient patient1 = new Patient ("Lucie", 41, "broken leg");
		patientList = patient1;
		Patient patient2 = new Patient ("John", 33, "Tuberculosis");
		patientList.addPatient(patient2); 	// call the method addPatient(Patient) at any point in the list
		Patient patient3 = new Patient ("Chris", 75, "Influenza");
		patientList.addPatient(patient3); 	// call the method addPatient(Patient) at any point in the list
		Patient patient4 = new Patient ("Oliver", 46, "Influenza");
		patientList.addPatient(patient4); 	// call the method addPatient(Patient) at any point in the list
		Patient patient5 = new Patient ("Mary", 91, "Dementia");
		patientList.addPatient(patient5); 	// call the method addPatient(Patient) at any point in the list
		Patient patient6 = new Patient ("Paul", 35, "Aids");
		patientList.addPatient(patient6); 	// call the method addPatient(Patient) at any point in the list
		
		patientList.printPatientList(patientList); // call method printPatientList on object patientListStart with argument patientListStart i.e. call the method recursively
		
		
		patientList.deletePatient(patient2);  // why is the method called three times although only 2 patients are deleted?
		patientList.deletePatient(patient4);
		
		patientList.printPatientList(patientList);
		
	}
	
} // End of class HospitalManager
	
// Hint: Note that you cannot delete the first element from inside the list 
// because you need to update the pointer patientListStart. 
// To add or delete the first element of a list, you must do it from outside the list.
	
	
	
	
	