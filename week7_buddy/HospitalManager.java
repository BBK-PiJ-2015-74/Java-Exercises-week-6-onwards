
public class HospitalManager { 
	private Patient patientListStart = null;
	public static void main(String[] args) { //main method is static which is bad and we dont want anything static so we create a new object and launch method instead
	 	HospitalManager hm = new HospitalManager();
		hm.launch();
	 }
		
	public void launch() {
		Patient patient1 = new Patient("John", 32, "Cold");
		patientListStart = patient1;
		patientListStart.addPatient(new Patient("Mary",21,"Cancer"));
		patientListStart.addPatient(new Patient("Lucie", 41, "Leukaemia"));
		patientListStart.addPatient(new Patient("Sebastian", 60, "Flu"));
		patientListStart.addPatient(new Patient("David",43,"Broken leg"));
		patientListStart.printPatientList(patientListStart);
	}
}