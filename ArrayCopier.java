// D06 Exercise 2 Arrays

// define complex Class Calculator
// generally classes are public so they can be used in other programs
// generally methods are public so they can be called from others
// generally fields within methods are private 

public class ArrayCopier {										// define class ArrayCopier
	
	public int[] copyArray (int[] srcArray, int[] destArray) { 		// method copyArray
																	// don't define the arrays here, define them in the main code
		
		int srclength = srcArray.length;
		int destlength = destArray.length; 		
		
		System.out.println("The length of the source array is" + srclength);
		System.out.println("The length of the destination array is" + destlength);
		
		if (srclength == destlength) {			// source and destination are equal
		
		System.out.println("Starting array copier, source and destination arrays are same length");
		destArray = srcArray;
		System.out.println("The length of both arrays is " + destlength);
		
		} else if (srclength > destlength){		// e.g. src 12345, dest xyz, dest' 123
		
			System.out.println("Starting array copier, source is longer than destination so will truncate array");
		
			for (int i=0; i<(destlength); i++) {
			destArray[i] = srcArray[i];
			}
		
		System.out.println("The source array is " + srcArray);      
		System.out.println("The destination array is now " + destArray);
		
		} else {	// e.g. src 123, dest vwxyz, dest' 12300
			
			System.out.println("Starting array copier, source is shorter than destination so will add zeros");
		
			for (int i=0; i<(srclength); i++) {
			destArray[i] = srcArray[i];
			}
			
			for (int j=0; j>(destlength); j++) {
			destArray[j] = 0;
			}
			
		System.out.println("The source array is " + srcArray);
		System.out.println("The destination array is now " + destArray);

		}
		
		return destArray;
	}
}
		
		
		
		
	