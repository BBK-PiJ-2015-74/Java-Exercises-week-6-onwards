// Week 8 Supermarket exercise

public class Supermarket {

    private PersonQueueImpl queue;

    public Supermarket() {  // constructor method of Supermarket class, does not have a return type
        queue = new PersonQueue();
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
