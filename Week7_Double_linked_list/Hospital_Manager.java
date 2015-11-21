public class Hospital {

	private Patient start = null;  // start is the first element in the list

	public Hospital() {
		this.start = null
	}

	public void addPatient(Patient patient) {
		if (start == null) {
			this.start = newPatient;
		} else {
				Patient current = start;
				while (current.next != null) {    //while we are not at the end of the list
			 	current = current.getNext;
			 	}
			 	current.setNext(newPatient);
		}
		
		public void removePatient(String name) {
		if (start == null) {			// list is empty
			return;
		} else if (start.getName().equals(name)){	// delete first element in the list
			start = start.getNext();
		} else {					// delete something in the middle - can't delete current, can only delete after
			Patient current = start;
			while (!current.getNext.getName().equals(name) && current.getNext()!=null){  //check we haven't reached the end of the list
				current = current.getNext();
		}
		if current.getNext() == null {
			return;
		} else {
			current.setNext(current.getNext().getNext());
	}
	
	public void launch() {
		Patien john = new Patient("John', 22, "Flu");
		this.addPatient(john);

	
	public static void main(String[] args) {
	Hospital hosptial = new Hospital();
	Hospital.launch();
	}
	
}




