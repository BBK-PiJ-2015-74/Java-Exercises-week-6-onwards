// Week 8 Supermarket Queue
// This file implements the file PersonQueue
// must contain the methods 'insert' and 'retrieve'


public class PersonQueueImpl implements PersonQueue {

	private Person headPerson;
	
	public PersonQueueImpl (Person headPerson) { // constructor method PersonQueueImpl
		this.headPerson = headPerson; 
	}

	public void insert (Person anotherPerson) { // iterative method insert, inserts anotherPerson at the back of the queue
		if (headPerson == null) {
			headPerson = anotherPerson;
		} else if (headPerson.getNextPerson() == null) { 
			headPerson.setNextPerson(anotherPerson); 
		} else {
			// set the pointer of anotherPerson
			headPerson.setNextPerson(anotherPerson);  // link personHead to the nextPerson field of anotherPerson
			anotherPerson.setNextPerson(anotherPerson.getNextPerson()); //link the nextPerson field of anotherPerson to the nextPerson of the one behind, another anotherPerson
		}
		System.out.println("The person " + anotherPerson.getName() + "was added to the queue");
	}
	
	// public void insert (Person anotherPerson) { // calls recursive method addPerson from the person.java file
// 			headPerson.addPerson(anotherPerson);
// 			System.out.println("The person " + anotherPerson.getName() + "was added to the queue");
// 		} 
	
	public Person retrieve() { // method retrieve, removes the person at the head of the queue - IS THIS CORRECT?
		Person personToBeRetrieved = headPerson;
		if (headPerson == null) {
			System.out.println("The queue is empty");
		}
		if (headPerson.getNextPerson() == null ){
			this.headPerson = null; // make headPerson null
			System.out.println("The queue is now empty because I've retrieved the first person");
		} else {
			headPerson = headPerson.getNextPerson(); 
		}
		return personToBeRetrieved;
	}		
	
	public void printPersonQueue() { // this has a flag through which you can choose recursive or iterative printing
		boolean recursivePrinting = true;
		if (recursivePrinting) {
			printPersonQueueRecursively();
		} else {
			printPersonQueueIteratively();
		}	
	}
		
	private void printPersonQueueIteratively() {  // parameters are inputs, return value is output. To print on screen just need void
		if (headPerson == null) {
			System.out.println("The list is empty!");
		}  else {
			System.out.println(headPerson.getName());
			Person current = headPerson;			// use a temporary variable current for headPerson and move along the queue printing each element
			while (current.getNextPerson() != null) {
				current = current.getNextPerson();
				System.out.println(current.getName()); 
			}
		}
	}
	
	private void printPersonQueueRecursively() {  // parameters are inputs, return value is output. To print on screen just need void
		if (headPerson == null) {
			System.out.println("The list is empty!");
		}  else {
			headPerson.printYourselfAndWhoeverComesAfter();  // also known as printList() - see Person.java file. Has to be implemented inside
		}
	}
	
	
	
	
	// 	System.out.println(anotherPerson.toString());  
// 		Person nextPerson = anotherPerson.getNextPerson();
// 		while (nextPerson != null) {
// 			System.out.println(nextPerson.toString());
// 			nextPerson = nextPerson.getNextPerson();
// 		}
// 		return anotherPerson;
// 	}
		
}

