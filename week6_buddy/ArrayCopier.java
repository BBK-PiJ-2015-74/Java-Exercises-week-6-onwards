import java.util.Arrays; // required to be able to print arrays

public class ArrayCopier {

	public int [] copy (int [] src, int [] dst) {
		System.out.println("\nStarting arraycopier.copy method");

		int lengthSrc = src.length;
		int lengthDst = dst.length;

		System.out.println("Source length: " + lengthSrc);
		System.out.println("Dest length: " + lengthDst);


		if(lengthSrc == lengthDst) {
			dst = src;
			System.out.println("Arrays are equal.  Overwriting Destination with source.");
		}
		else if (lengthSrc < lengthDst) {
			System.out.println("Source is shorter.  Overwriting then filling with zeros");	
			for (int i=0;i<lengthSrc;i++) { // overwrite dest with source as far as source lasts
				dst[i] = src[i];
			}
			for (int j=lengthSrc;j<lengthDst;j++) {
				dst[j] = 0;
			}
		}
		else {
			System.out.println("Destination is shorter.  Overwriting to length of original destination");	
			for (int i=0;i<lengthDst;i++) { // overwrite dest with source as far as dest lasts
				dst[i] = src[i];
			}
		}
		
		System.out.println(Arrays.toString(src));  //using arrays package to print the array
		System.out.println(Arrays.toString(dst));

		return dst;
	}
}