import java.util.Arrays; // required to be able to print arrays

public class Week6_main { // classname here has to be same as the filename.  will automatically find other classes in same folder
	// every public class must be in a separate file

	 public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int result;
		double resultDouble;
		System.out.println(calc.add(3,4));
		System.out.println(calc.subtract(3,4));
		System.out.println(calc.multiply(3,4));
		System.out.println(calc.divide(3,4));
		System.out.println(calc.modulus(4,3));
		
		int [] array1 = {4,2,3,4,5,99,55,66,77,88};
		int [] array2 ;
		array2 = new int[]{1,2,3,5,7,8};

		System.out.println(Arrays.toString(array1));  //using arrays package to print the array
		System.out.println(Arrays.toString(array2));

		
		ArrayCopier arrayCopyObject = new ArrayCopier();
		arrayCopyObject.copy(array1,array2);

		Matrix matrixObject1 = new Matrix(3,3);
		matrixObject1.prettyPrint();

		Matrix matrixObject2 = new Matrix(8,10);
		matrixObject1.prettyPrint();
		
		matrixObject1.setElement(2,2,3);
		matrixObject1.setElement(0,0,6);
		matrixObject1.setElement(1,1,8);	
		matrixObject1.prettyPrint();

		matrixObject2.setElement(1,1,8);
		matrixObject2.prettyPrint();

		matrixObject1.setRow(1,"98,97,96");
		matrixObject1.prettyPrint();

		matrixObject2.setColumn(0,"1,2,3,4,5,6,7,8");
		matrixObject2.prettyPrint();

		String stringVersion = matrixObject1.toString();
		System.out.println(stringVersion);

		stringVersion = matrixObject2.toString();
		System.out.println(stringVersion);


		}

}
