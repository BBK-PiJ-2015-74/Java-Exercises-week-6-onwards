public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;

	public Patient(String name, int age, String illness) { //this is the constructor method
		System.out.println("Constructor: " + name);
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}

	public Patient printPatientList(Patient patient) {
			System.out.println("========================");
			System.out.println("Patient: " + patient.name);
			System.out.println("Age: " + patient.age);
			System.out.println("Illness: " + patient.illness);	
		if(patient.nextPatient!=null) { // ie if this is not the last patient
			printPatientList(patient.nextPatient); //call the method again recursively, on the next patient, until you reach the last patient
		}
		return patient;		
	}

	public void addPatient(Patient newPatient) {
	if (this.nextPatient == null) { // this means this is the last patient in the list
		this.nextPatient = newPatient;
		} 
	else {
		this.nextPatient.addPatient(newPatient);
		}
	}
}