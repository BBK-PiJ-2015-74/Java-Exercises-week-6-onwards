// Week 8 Super market queue
// Person class file, singly linked list



public class Person {	
	private String name;
	private int age;
	private String shopping;
	private Person nextPerson;
	
	public Person (String name, int age, String shopping) { // constructor method Person
		System.out.println("This is a constructor of a new person " + name);
		this.name = name;
		this.age = age;
		this.shopping = shopping;
		this.nextPerson = null;  
	}

	public Person getNextPerson() {		 // returns the nextPerson of person
		return nextPerson;				
	}
		
	public void setNextPerson(Person anotherPerson) { // sets the nextPerson of the instance of Person to be anotherPerson
        nextPerson = anotherPerson;
    }
    
    public void addPerson (Person newPerson) { // add Patient method
		if (this.nextPerson == null) { 
			this.nextPerson = newPerson;
		} else {
			this.nextPerson.addPerson(newPerson); 
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getShopping() {
		return shopping;
	}

	public String toString() {
		String str = "";
		str = "Name: /t" + this.name + "Age: /t: " + this.age + "Shopping: /t: " + this.shopping + "/n" ; 
		return str;
	}			
	
	public void printYourselfAndWhoeverComesAfter() {
		System.out.println(this.name);
		if (this.nextPerson != null) {
			this.nextPerson.printYourselfAndWhoeverComesAfter();
		}
	}	

}		// end of class Person


