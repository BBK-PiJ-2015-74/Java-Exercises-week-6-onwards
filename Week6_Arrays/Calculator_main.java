// Calculator main code

import java.util.Scanner;

public class Calculator_main { // classname here has to be same as the filename.  will automatically find other classes in same folder
	// every public class must be in a separate file

	 public static void main(String[] args) {	
	  
	 Scanner in = new Scanner(System.in);
	  
	 Calculator lucieCalc = new Calculator();
	 
	 System.out.println ("Please enter the first operand");
	 String num1 = in.nextLine();
	 int int1 = Integer.parseInt(num1);
	 
	 System.out.println ("Please enter the second operand");
	 String num2 = in.nextLine();
	 int int2 = Integer.parseInt(num2);
	 int result = 0;
	 double resultdouble = 0;
	 
	 System.out.println ("Please choose which calculator operation you would like to perform:");
	 System.out.println ("For addition please enter 1"); 
	 System.out.println ("For subtraction please enter 2");
	 System.out.println ("For multiplication please enter 3");
	 System.out.println ("For division please enter 4");
	 System.out.println ("For modulus please enter 5");
	 
        
    int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println(lucieCalc.add(int1,int2));
                break;
            case 2:
                System.out.println(lucieCalc.subtract(int1,int2));
                break;
            case 3:
                System.out.println(lucieCalc.multiply(int1,int2));
                break;
            case 4:
                System.out.println(lucieCalc.divide(int1,int2));
                break;
            case 5:
                System.out.println(lucieCalc.modulo(int1,int2));
                break;
            default:
                System.out.println ("Error - you must enter an option 1, 2, 3, 4 or 5");
                break;
        }
        
        
	}
}
