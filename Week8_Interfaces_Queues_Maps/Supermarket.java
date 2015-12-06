/** Week 8 Supermarket exercise
* This file defines a class Supermarket 
* with a complex object of type PersonQueueImpl called queue
* This doesn't add much but is required by the question
* Could just have called PersonQueueImpl from the main method instead
*/

public class Supermarket {

    private PersonQueue queue;

    public Supermarket() {  // constructor method of Supermarket class, does not have a return type
        queue = new PersonQueueImpl();
    }

    public void insertPerson(Person newPerson) {
        queue.insert(newPerson);
    }

    public Person servePerson() {
        return queue.retrieve();   
    }
    
    public void printSupermarketQueue() {
    	return queue.printPersonQueue();
    }
    
}
