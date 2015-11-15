// Spy main code - see Spy.java

import java.util.Scanner;

public class Spy_main { // classname here has to be same as the filename.  will automatically find other classes in same folder
	// every public class must be in a separate file

	 public static void main(String[] args) {	
	  
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println ("Please enter the id of the first spy");
	 String str1 = in.nextLine();
	 int int1 = Integer.parseInt(str1);
	 Spy spy001 = new Spy(int1); // trying a calculation where you read the ID of the spy from the user
	 
	 Spy spy002 = new Spy(002); // creating the new spies each time
	 Spy spy003 = new Spy(003);
	 Spy spy004 = new Spy(004);
	 Spy spy005 = new Spy(005);
	 Spy spy006 = new Spy(006);
	 
	 spy004.spyDie();
	 spy002.spyDie();
	 
	 }
	 
}


	 
	 