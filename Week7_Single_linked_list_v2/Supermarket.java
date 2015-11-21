// Supermarkets

// 3 layers: Supermarket, queue, person

public class IntegerQueue implements Queue{

	private IntegerNode head;
	
	public void insert (int n) {
		IntegerNode node = new IntegerNode(n);
		if head == null { // head is pointing to 4
			head = node;
		} else {
			node.setNext(head);
			head.setPrev(node);
			head = node;
	}
	
	public int retrieve() {
	if (head == null) {
		return null;
	} else {
		IntegerNode current = head;
		while (current.getNext() != null {
			current = current.getNext();
		}
		current.getPrev().setNext(null);
		return current.getvalue();
	}
}
		
		


// public class Supermarket {
 private PersonQueue queue = null;
 
 public void addPerson(Person person) {
 	queue.insert(person);
 }
 
 public void servePerson() {
 	Person personToServer = queue.retrieve();
 	personToServe.getshopping();
 	personToServe.charge();		
		
// could be public class PointerPersonQueue implements PersonQueue{
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// when we construct a new IntegerNode, assume it's set to null
		// create new IntegerNode 4
		//