// Week 8 Supermarket Exercise
// Then create a class Supermarket that has two methods: insertPerson(Person) and servePerson()
// These methods must call the appropriate methods of PersonQueue

public class SupermarketTest {
		
	public static void main(String[] args) { 	
		SupermarketTest script = new SupermarketTest(); // Hospital_manager is a list of patients and methods that allow you to add and delete patients from the list
		script.launch();
	}
	
	public void launch() {
	
		Supermarket waitrose = new Supermarket();
		
		Person person1 = new Person ("Amy", 21, "Groceries");
		waitrose.insertPerson(person1);
		Person person2 = new Person ("Bob", 50, "Bread");
		waitrose.insertPerson(person2);
		Person person3 = new Person ("Lucie", 41, "Weekly shop");
		waitrose.insertPerson(person3);	
		Person person4 = new Person ("Oliver", 45, "Wine");
		waitrose.insertPerson(person4);
		
		Person personToServe = waitrose.servePerson();
		System.out.println("Serving: " + personToServe.getName());
		personToServe = waitrose.servePerson();
		System.out.println("Serving: " + personToServe.getName());
		
		Person person5 = new Person ("Jimmy", 70, "Tins of soup");
		waitrose.insertPerson(person5);
		Person person6 = new Person ("Francesca", 35, "Baby goods");
		waitrose.insertPerson(person6);
		
		personToServe = waitrose.servePerson();
		System.out.println("Serving: " + personToServe.getName());
		personToServe = waitrose.servePerson();
		System.out.println("Serving: " + personToServe.getName());
		personToServe = waitrose.servePerson();
		System.out.println("Serving: " + personToServe.getName());	
		personToServe = waitrose.servePerson();
		System.out.println("Serving: " + personToServe.getName());	
		personToServe = waitrose.servePerson();
		System.out.println("Serving: " + personToServe.getName());	
	}

}
	
