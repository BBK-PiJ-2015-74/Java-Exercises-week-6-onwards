// Week 7 Exercise 3 - Patient and HospitalManager example

public class Patient {		//setting up fields of class Patient
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient (String name, int age, String illness) { // constructor method Patient
		System.out.println("This is a constructor of a new patient " + name);
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;   // a linked list of patients is a sequence of patients in which each patient links to the next one
									// and the last one points to null
	}
	// other methods come here ...
	
	// ************ ask, could I just use anotherPatient here instead of newPatient? I guess so, because the methods don't change the objects??
	
	public void addPatient (Patient newPatient) { // adding patients to the list: this is a member method of class Patient
		if (this.nextPatient == null) { // this means the last patient in the list. Can use == because we are using pointers
		this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient); // recursively use method addPatient on this.nextPatient, with variable newPatient
		}
	} // end of method addPatient
	
	public Patient printPatientList(Patient anotherPatient) { // method to print the list of patients, public, returns a complex variable of type Patient
		System.out.println("**********************************");
		System.out.println("Name: " + anotherPatient.name);
		System.out.println("Age: " + anotherPatient.age);
		System.out.println("Illness: " + anotherPatient.illness);
		if (anotherPatient.nextPatient != null) { // i.e. if we are not at the end of the list
			printPatientList(anotherPatient.nextPatient); // call method recursively, on the next patient, until you reach the end of the list
		}
		return anotherPatient;
	}	// end of method printPatientList
	
	// now for removing patients. This is a member method, of class Patient
	// returns true if the patient was found and removed, false otherwise
	
	public boolean deletePatient (Patient anotherPatient) {
		System.out.println("Calling method deletePatient");
		if (this.nextPatient == null) { // patient to remove was not found
			return false;
		} else if (this.nextPatient.equals(anotherPatient)) { // we found it! This is the next one. Now link this patient to the one after the next
			this.nextPatient = nextPatient.nextPatient; // ************ this code does not make sense?? Ask
			return true;
		} else {
			return this.nextPatient.deletePatient(anotherPatient);
		}
	}
		
		
}		// end of class Patient


