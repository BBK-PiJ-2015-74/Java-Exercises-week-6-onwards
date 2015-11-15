// D06 Exercise 3 Matrices and constructor methods

// define complex Class matrix
// generally classes are public so they can be used in other programs
// generally methods are public so they can be called from others
// generally fields within methods are private 

import java.util.Arrays; 									// used to print arrays

public class Matrix {										//define public class Matrix
	
	private int[][] matrix;									//define variable matrix as two arrays of integers within class Matrix
		
	public Matrix (int rows, int columns) {				// starting Matrix constructor methods. No return statement in a constructor method
		matrix = new int [rows][columns];
		System.out.println("\nStarting 'Matrix' constructor method\n"); // use \n if there are quotes in the println statement
		System.out.println("\nCreating matrix (" + rows + "," + columns + "). Initialising each element to 1\n");
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) { 
			this.matrix[i][j]=1;
			}
		}
	}													// end of Constructor method matrix
		
	public void setElement (int rowindex, int columnindex, int value){   //rowindex is the position of the row i.e. [i]
		System.out.println("\nStarting setElement method\n");
		if (rowindex > this.getRowLength()) {					// not this.matrix.getRowLength because getRowLength is already operating on matrix
			System.out.println("Exception: there are " + this.getRowLength() + "rows whereas you have specified an index of" + rowindex);
	
		} else if (columnindex > this.getColumnLength()) {
			 	System.out.println("Exception: there are " + this.getColumnLength() + "columns whereas you have specified an index of" + columnindex);
			
		} else {
			this.matrix[rowindex][columnindex] = value;
		}
	} 		
		
	public int getRowLength() {
		int result = matrix.length;  // why isn't this matrix[][0].length
		return result;
	}
			
	public int getColumnLength() {
		int result = matrix[0].length;  //why isn't this matrix[0][].length
		return result; 
	}

	
	public void setRow (int rowindex, String rowinput) { // take an arbitrary string rowvalues and make the values of the string the row of the matrix at index rowindex

		System.out.println("Starting method setRow:");
		int commacount = countCommas(rowinput);
		int rowvalidate = rowinput.length - commacount;  // rowvalidate = length of input string less number of commas
		int matrixcolumn = 0;
		
		if (rowvalidate != this.getColumnLength) {
			System.out.println("There is an error. The row input string has more elements than the constructed matrix.");
		} else {
		
		// now set the elements in the given row, rowindex
		// first of all take out the commas and turn this into a new string
		
		String rowoutput = "";
		for (int i = 0; i<rowinput.length; i++){
			if (rowinput.charAt(i) == ",") {
				rowoutput = "";
			} else {
				rowoutput = rowoutput+rowinput.charAt(i);
			}
		}
		
		for (matrixcolumn = 0; matrixcolumn < rowoutput.length; matrixcolumn++) { // start at matrixcolumn 0 and move along each time
			char rowelementchar = rowoutput.charAt(matrixcolumn);
			String rowelementstr = Character.getNumericValue(rowelementchar);
			int rowelement = Integer.parseInt(rowelementstr);
			this.matrix[rows][matrixcolumn] = rowelement;
		}
		
	} // setRow method finishes here
	
	private int countCommas (String rowinput) { // count the commas in the string e.g. 1,2,3 and then check the index is not > (number of characters in the string less the commas)
		int result = 0;
			for (int i = 0; i<rowinput.length; i++) {  
				if (rowinput.charAt(i) == ",") {
					result = result + 1;
				}
			}
			return result;				// returns the number of commas in the string rowvalues		
	} // countCommas method finishes here

		
	public void setColumn (int columnindex, String columninput) { // take an arbitrary string rowvalues and make the values of the string the row of the matrix at index rowindex

		System.out.println("Starting method setColumn:");
		int commacount = countCommas(columninput);
		int columnvalidate = columninput.length - commacount;  // rowvalidate = length of input string less number of commas
		int matrixrow = 0;
		
		if (rowvalidate != this.getRowLength) {
			System.out.println("There is an error. The column input string has more elements than the constructed matrix.");
		} else {
		
		// now set the elements in the given column, columnindex
		// first of all take out the commas and turn this into a new string
		
		String columnoutput = "";
		for (int i = 0; i<columninput.length; i++){
			if (columninput.charAt(i) == ",") {
				columnoutput = "";
			} else {
				columnoutput = columnoutput + columninput.charAt(i);
			}
		}
		
		for (matrixrow = 0; matrixrow < columnoutput.length; matrixrow++) { // start at matrixcolumn 0 and move along each time
			char columnelementchar = columnoutput.charAt(matrixrow);
			String columnelementstr = Character.getNumericValue(columnelementchar);
			int columnelement = Integer.parseInt(columnelementstr);
			this.matrix[matrixrow][columns] = columnelement;
		}
		
	} // setColumn method finishes here

	public String matrixToString() {
	
		System.out.println("Starting matrixToString method which returns array as a string");
		String str = "";
		for (int rows=0;rows<this.getRowLength();row++) { //for each row
			for (int columns=0; columns <this.getColumnLength();column++) { //for each column in each row 
				str = "[" + this.matrix[rows][columns] + str + "]";
				while (columns<this.getColumnLength()-1 {  //or should this be -1?
					str = str + ","; 		//add comma on the column loop unless it's the last column
				}
			}
			while (rows<this.getRowLength()-1){
				str = str + ";"; //  add semicolon to show row break for each loop of the row unless it's the last row
			}
		}
		return str;
		
	} // End of public method matrixToString
	
	public void prettyPrint() {
		System.out.println("Starting pretty print method");
		System.out.println("Dimensions (" +  this.getRowLength() + "," + this.getColumnLength() + ")");
		for (int i=0; i<this.getRowLength(); i++) { //for each row
			System.out.println(Arrays.toString(matrix[i])); // print the array at that row
	} // End of prettyPrint method
		

} //End of public class Matrix



