public class Person {
	private String lastName;
	public String firstName;
	
	public String getLastName() {  // need a getter because lastName is private
		return lastName;
	}
	
	public void setLastName (String lastName) { // set it back once you've done something with it
		this.lastName = lastName;
	}	
	
}

