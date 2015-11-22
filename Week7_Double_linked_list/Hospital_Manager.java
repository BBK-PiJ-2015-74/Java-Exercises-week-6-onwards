// week 7 Ex 5 doubly linked lists
// see also Patient.java

public class Hospital_Manager {
	
	private Patient patientListStart = null; //patientList is a variable of class Patient which is initialised to null, File looks for class Patient
	
	public static void main(String[] args) { 
	
		Hospital_Manager hm = new Hospital_Manager(); // Hospital_manager is a list of patients and methods that allow you to add and delete patients
		hm.launch();
	}
	
	public void launch() {
	
		this.acceptPatient ("Lucie", 41, "broken leg");
		this.acceptPatient ("John", 33, "Tuberculosis");
		this.acceptPatient ("Chris", 75, "Influenza");
		this.acceptPatient ("Mary", 91, "Dementia");
		this.acceptPatient ("Paul", 35, "Aids");
		this.acceptPatient ("Oliver", 46, "Influenza");
		this.acceptPatient ("Clementine", 4, "Naughtiness");
		this.acceptPatient ("Noah", 9, "Addiction to ipads");
		
		int numpatientsiterative = countPatientsIterative();
		System.out.println("The number of patients counted iteratively is: " + numpatientsiterative);
		int numpatientsrecursive = countPatientsRecursive(patientListStart);
		System.out.println("The number of patients counted recursively is: " + numpatientsrecursive);
		
		System.out.println("Printing the list of patients");
		this.printAllPatients(); // call method printAllPatients on this Hospital Manager
		
		this.removeDeadPatient("Lucie");
		this.removeDeadPatient("Mary"); 
		this.removeDeadPatient("Paul"); 
		
		int countiterative = countPatientsIterative();
		System.out.println("The number of patients counted iteratively is now: " + countiterative);
		int countrecursive = countPatientsRecursive(patientListStart);
		System.out.println("The number of patients counted recursively is now: " + countrecursive);
		
		System.out.println("Printing the list of patients");
		this.printAllPatients();
		
	} // end of launch method
	
	// more methods go here
	
	public void printAllPatients() {
		patientListStart.printPatientList();
	}
	
	public void acceptPatient(String name, int age, String illness) { // accept patients to the list, gets launched above
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

	private int countPatientsRecursive(Patient anotherPatient) { // count patients recursively, must be private because in the main method
		int result = 1;
		if (anotherPatient.getNextPatient() == null) { //i.e. we are at the end of the list and we've counted them all
			return result;
		} else {
			result = 1 + countPatientsRecursive(anotherPatient.getNextPatient());
			return result; 
		}
	}
	
	private int countPatientsIterative() {
        int result = 0;
        Patient nextPatient = patientListStart; 
        do {
            result++;
            nextPatient = nextPatient.getNextPatient();
        } while (nextPatient != null);
        return result;
    }
	
} // End of class HospitalManager
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	