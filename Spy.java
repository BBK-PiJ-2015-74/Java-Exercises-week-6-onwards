// Week 7 Ex1 - Spy class

//Complete the example given in the notes with a class called Spy. Your class must have:
// one and only one static variable, and int called spyCount.
//an instance variable of type int for the spy’s ID.
// a constructor method that receives the ID of the spy as an argument, increases spyCount(int) by one, and prints on the screen the ID of this spy plus the total number of spies so far.
//a die() method that prints on the screen “Spy XX has been detected and eliminated” (where XX is the spy’s ID), decrements the spy counter and prints on the screen the total number of spies so far.
// a main method in which several objects of class Spy are created and some of them killed (their method die() is called).
// Observe how the static variable is accessed by different objects both to increment and to decrement it.

public class Spy {										//define public class Spy
	
	private static int spycount = 0;					//define and initialise static variable spyCount (not entirely sure why this is a static variable?)
	private int spyid;
		
	public Spy (int spyid) {							// starting spyConstructor constructor method. No return type in a constructor method
		System.out.println("Starting spy constructor method");  // constructor method is called the same name as the class. Use the keyword 'new' in the main file
		this.spyid = spyid;
		spycount = spycount + 1;
		System.out.println("The ID of the spy just constructed is " + this.spyid);
		System.out.println("the total number of spies is now " + spycount);
	}
	
	public void spyDie() {
		System.out.println("Spy " + this.spyid + " has been detected and eliminated");
		spycount = spycount - 1;
		System.out.println("The total number of spies is now " + spycount);
	}
	
} // end of class Spy	