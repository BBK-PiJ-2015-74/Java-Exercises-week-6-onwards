// ArrayCopier main code

import java.util.Arrays;	// required to be able to print arrays

public class ArrayCopier_main { // classname here has to be same as the filename.  will automatically find other classes in same folder
	// every public class must be in a separate file

	public static void main(String[] args) {	
	  
		int[] arraya = {1,2,3,4,5};
		int[] arrayb = {6,7,8,9,10};
		
		int[] arrayc = {12,13,14,14,16,17,18};
		int[] arrayd = {1,2,3};
		
		int[] arraye = {123,55,14,642,243};
		int[] arrayf = {55,23,45,67,78,89,1,0,34,56,2,76,467,88,12};
		
	  
	 	ArrayCopier copyThing = new ArrayCopier(); //ArrayCopier is a class, copyThing is an instantiation of a complex object of the class
	 
	 // run method copyArray on class instantiation copyThing
	 
	 	copyThing.copyArray(arraya, arrayb);
	 	copyThing.copyArray(arrayc, arrayd);
	 	copyThing.copyArray(arraye, arrayf);
	    
		System.out.println(Arrays.toString(arraya));  //using arrays package to print the array
		System.out.println(Arrays.toString(arrayb));
	
		System.out.println(Arrays.toString(arrayc));  //using arrays package to print the array
		System.out.println(Arrays.toString(arrayd));
	
		System.out.println(Arrays.toString(arraye));  //using arrays package to print the array
		System.out.println(Arrays.toString(arrayf));
	}
}
