//D06 Calculator Java class

// define complex Class Calculator
// generally classes are public so they can be used in other programs
// generally methods are public so they can be called from others
// generally fields within methods are private 

public class Calculator {

	public int add(int intA, int intB) {
		int result = intA + intB;
		return result; 
	}

	public int subtract(int intA, int intB) {
		int result = intA + intB;
		return result; 
	}

	public int multiply(int intA, int intB) {
		int result = intA * intB;
		return result; 
	}

	public double divide(int intA, int intB) {
		double numA = (double) intA;
		double numB = (double) intB;
		double resultdouble = numA/numB;
		return resultdouble; 
	}

	public int modulo(int intA, int intB) {
		int result = intA % intB;
		return result; 
	}


}	

