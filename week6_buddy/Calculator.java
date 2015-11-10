public class Calculator {
//generally fields always private, methods often public	

public int add (int inp1, int inp2) {
	int result = inp1 + inp2;
	return result;
}

public int subtract (int inp1, int inp2) {
	int result = inp1 - inp2;
	return result;
}

public int multiply (int inp1, int inp2) {
	int result = inp1 * inp2;
	return result;
}

public double divide (int inp1, int inp2) {
	double inp1d = inp1;
	double inp2d = inp2;
	double result = inp1d / inp2d;
	return result;
}

public int modulus (int inp1, int inp2) {
	int result = inp1 % inp2;
	return result;
}




}