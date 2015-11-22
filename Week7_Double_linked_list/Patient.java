// Week 7 Exercise 5 - Double linked lists
// A doubly-linked list is a dynamic list in which each element is connected to two other elements instead of just one. 
// The one before and the one after it. In this exercise, you must create a doubly-linked list using the “hospital and patients” example as a starting point.
// 1. Create the doubly-linked list and add several elements to it (around 10 is fine). 2. Traverse it forwards and backwards printing out the content of each element.
// 3. Delete a couple of elements from the list.
// 4. Traverse it forwards and backwards printing out the content of each element.
// 5. Add a new element to the list. Try to delete an element that is NOT in the list. 6. Traverse it forwards and backwards printing out the content of each element.
// Hint: First you need to add a new field to Patient for the pointer going “backwards”. Then you need to modify the add and delete methods to make sure you do not have loose pointers.


public class Patient {		//setting up fields of class Patient
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;
	
	public Patient (String name, int age, String illness) { // constructor method Patient
		System.out.println("This is a constructor of a new patient " + name);
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; 
		this.previousPatient = null;  
	}

	public Patient getNextPatient() {			
		return nextPatient;				
	}
	
	public Patient getPreviousPatient() {
		return previousPatient;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIllness() {
		return illness;
	}
	
	public Patient setNextPatient() {
		return nextPatient;
	}
	
	public Patient setPreviousPatient() {
		return previousPatient;
	}
	
	// add a patient to the list
	
	public void addPatient (Patient newPatient) {
		if (this.nextPatient == null) { // if the last patient in the list
		this.nextPatient = newPatient;
		newPatient.previousPatient = this; // set the pointer for previousPatient of newPatient to be this Patient
		} else {
			this.nextPatient.addPatient(newPatient); // add a new Patient
		}
	}
	
	// delete patients from the list
	
	public boolean deletePatient (String name) {
		System.out.println("Calling method deletePatient");
		if (this.nextPatient.name == null) { // patient to remove was not found
			return false;
		} else if (this.nextPatient.name.equals(name)) { // we found it! This is the next one. Now link this patient to the one after the next
			this.nextPatient = nextPatient.nextPatient; //re-sets the pointer around the object we want to delete
			nextPatient.previousPatient = this;
			return true;
		} else {
			return this.nextPatient.deletePatient(name);
		}
	}

	// print patients in the list

	public Patient printPatientList() { 
		System.out.println("**********************************");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Illness: " + this.illness);
		if (this.nextPatient != null) { // i.e. if we are not at the end of the list
			this.nextPatient.printPatientList(); 
		}
		return this.nextPatient;
	}	// end of method printPatientList

		
}		// end of class Patient


