// Ex 5 doubly linked lists

public class Patient {

	private String name;
	private int age;
	private String illness;
	private Patient.nextPatient


	public Patient (String n, int a, String illness) {
		this.name = n;
		this.age = a;
		this.illness = i;
	}

public Patient getNext() {				// allows Hospital.java to get Patient
	return next;
}

public void setNext(Patient next) {					// allows Hospital.java to set Patient
	this.next = nextPatient;
}