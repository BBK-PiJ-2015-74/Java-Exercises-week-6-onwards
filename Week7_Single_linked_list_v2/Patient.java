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

public Patient getNextPatient() {			// getPatient method just returns the next Patient pointer - nextPatient is private so 
	return nextPatient;				// "this" means of the object of the class
	}
	
public String getName() {
	return name;
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
	
	public Patient printPatientList() { // method to print the list of patients, public, returns a complex variable of type Patient
		System.out.println("**********************************");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Illness: " + this.illness);
		if (this.nextPatient != null) { // i.e. if we are not at the end of the list
			this.nextPatient.printPatientList(); // call method recursively, on the next patient, until you reach the end of the list
		}
		return this.nextPatient;
	}	// end of method printPatientList
	
	// now for removing patients. This is a member method, of class Patient
	// returns true if the patient was found and removed, false otherwise
	
	public boolean deletePatient (String name) {
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
	
	// newFirstItem.previous = null; // if you're accessing the instance variables directly.	
		
}		// end of class Patient


