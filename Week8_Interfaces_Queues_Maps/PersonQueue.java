// Week 8 Supermarket Queue
// This file is an interface of PersonQueue


public interface PersonQueue {

/**
* Adds another person to the queue
*/ 

	void insert (Person person);

/**
* Removes a person from the queue
*/ 

	Person retrieve(); // method retrieve() returns a Person
	
/**
* Prints the queue of Persons
*/

	void printPersonQueue();

}

