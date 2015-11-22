// Week 7 Exercise 3 - Patient and HospitalManager example

public class Patient {	
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient (String name, int age, String illness) { // constructor method Patient
		System.out.println("This is a constructor of a new patient " + name);
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;  
	}

	public Patient getNextPatient() {		
		return nextPatient;				
	}
	
	public String getName() {
	return name;
	}
	
	public void addPatient (Patient newPatient) { // add Patient method
		if (this.nextPatient == null) { 
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient); 
		}
	} // end of method addPatient
	
	public Patient printPatientList() { // method printPatientList returns a variable of type Patient
		System.out.println("**********************************");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Illness: " + this.illness);
		if (this.nextPatient != null) { // i.e. if we are not at the end of the list
			this.nextPatient.printPatientList(); // call method recursively, on the next patient, until you reach the end of the list
		}
		return this.nextPatient;
	}	// end of method printPatientList
	
	public int countPatientsRecursive() { // count patients recursively
		int numberofpatients = 1;
		if (this.nextPatient == null) { //i.e. we are at the end of the list
			return numberofpatients;
		} else {
			numberofpatients = 1 + countPatientsRecursive();
			return numberofpatients; 
		}
	}
	
	public int countPatientsIterative() {
        int result = 0;
        do {
            result++;
            this.nextPatient = this.nextPatient.getNextPatient();
        } while (this.nextPatient != null);
        return result;
    }
	
	
	public boolean deletePatient (String name) {		// returns true if the patient was found and pointer removed, false otherwise
		System.out.println("Calling method deletePatient");
		if (this.nextPatient.name == null) { // patient to remove was not found
			return false;
		} else if (this.nextPatient.name.equals(name)) { // we found it! This is the next one. Now link this patient to the one after the next
			this.nextPatient = nextPatient.nextPatient; //re-sets the pointer around the object we want to delete
			return true;
		} else {
			return this.nextPatient.deletePatient(name);
		}
	}
		
}		// end of class Patient


