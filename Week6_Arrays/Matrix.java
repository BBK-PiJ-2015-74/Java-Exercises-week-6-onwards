// D06 Exercise 3 Matrices and constructor methods

// define complex Class matrix
// generally classes are public so they can be used in other programs
// generally methods are public so they can be called from others
// generally fields within methods are private 

import java.util.Arrays; 									// used to print arrays

public class Matrix {										//define public class Matrix
	
	private int[][] myMatrix;									//define variable matrix as two arrays of integers within class Matrix
		
	public Matrix (int rows, int columns) {				// starting Matrix constructor methods. No return statement in a constructor method. Constructor methods must be public
		myMatrix = new int [rows][columns];
		System.out.println("Starting Matrix constructor method"); // use \n if there are quotes in the println statement
		System.out.println("Creating my Matrix (" + rows + "," + columns + "). Initialising each element to 1");
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) { 
			this.myMatrix[i][j]=1;
			}
		}
	}													// end of Constructor method matrix
		
	private void setElement (int rowindex, int columnindex, int value){   //rowindex is the position [i], columnindex is position [j], value = i,j
		System.out.println("\nStarting setElement method\n");
		if (rowindex != this.getRowLength()) {					// getRowLength() operates on the matrix constructed = 'this'
			System.out.println("Exception: there are " + this.getRowLength() + "rows whereas you have specified an index of" + rowindex);
	
		} else if (columnindex != this.getColumnLength()) {
			 System.out.println("Exception: there are " + this.getColumnLength() + "columns whereas you have specified an index of" + columnindex);
			
		} else {
			this.myMatrix[rowindex][columnindex] = value; // sets the element [i][j] to the value given
		}
	} // end of method setElement 		
		
	public int getRowLength() {
		int result = myMatrix.length;  // why isn't this matrix[][0].length
		return result;
	}
			
	public int getColumnLength() {
		int result = myMatrix[0].length;  //why isn't this matrix[0][].length
		return result; 
	}

	public int countCommas (String rowinput) { // count the commas in the string e.g. 1,2,3 and then check the index is not > (number of characters in the string less the commas)
		int result = 0;
			for (int i = 0; i<rowinput.length(); i++) {  
				if (rowinput.charAt(i) == (",")) {
					result = result + 1;
				}
			}
			return result;				// returns the number of commas in the string rowinput		
	} // countCommas method finishes here
	
	
	private void setRow (int rowindex, String rowinput) { // take an arbitrary string rowinput 1,2,3 and make the row of the matrix at index rowindex, equal to the string without the commas
		System.out.println("Starting method setRow:");
		int commacount = countCommas(rowinput);
		int rowvalidate = rowinput.length() - commacount;  // rowvalidate = length of input string less number of commas
		int matrixcolumn = 0;
		String rowoutput = "";
		
		if (rowvalidate != this.getColumnLength()) {
			System.out.println("There is an error. The row input string has more elements than the constructed matrix.");
		} else {
		
			for (int i = 0; i<rowinput.length(); i++){ // first of all take out the commas and turn this into a new string
				if (rowinput.charAt(i) == ",") {
					rowoutput = "";
				} else {
					rowoutput = rowoutput+rowinput.charAt(i);
				}
			}
		}
		
		for (matrixcolumn = 0; matrixcolumn < rowoutput.length(); matrixcolumn++) { // start at matrixcolumn 0 and move along each time
			char rowelementchar = rowoutput.charAt(matrixcolumn);
			String rowelementstr = Character.getNumericValue(rowelementchar);
			int rowelement = Integer.parseInt(rowelementstr);
			this.myMatrix[rows][matrixcolumn] = rowelement;
		}
		
	} // setRow method finishes here
	

	private void setColumn (int columnindex, String columninput) { // take an arbitrary string columninput and make the values of the string the row of the matrix at index rowindex

		System.out.println("Starting method setColumn:");
		int commacount = countCommas(columninput);
		int columnvalidate = columninput.length() - commacount;  // columnvalidate = length of input string less number of commas
		int matrixrow = 0;
		String columnoutput = "";
		
		if (columnvalidate != this.getRowLength()) {
			System.out.println("There is an error. The column input string has more elements than the constructed matrix.");
		} else {
		
			for (int j = 0; j<columninput.length(); j++){ // first of all take out the commas and turn this into a new string
				if ((columninput.charAt(j)) == ",") {
				columnoutput = "";
				} else {
					columnoutput = columnoutput + columninput.charAt(j);
				}
			}	
		}																// now set the elements in the given column, columnindex
		
		for (matrixrow = 0; matrixrow < columnoutput.length(); matrixrow++) { // start at matrixcolumn 0 and move along each time
			char columnelementchar = columnoutput.charAt(matrixrow);
			String columnelementstr = Character.getNumericValue(columnelementchar);
			int columnelement = Integer.parseInt(columnelementstr);
			this.myMatrix[matrixrow][columns] = columnelement;
		}
		
	} // setColumn method finishes here

	private String matrixToString() {
	
		System.out.println("Starting matrixToString method which returns array as a string");
		String str = "";
		for (int rows=0;rows<this.getRowLength();rows++) { //for each row
			for (int columns=0; columns <this.getColumnLength();columns++) { //for each column in each row 
				str = "[" + this.myMatrix[rows][columns] + str + "]";
				while (columns<(this.getColumnLength()-1)) { 
					str = str + ","; 		//add comma on the column loop unless it's the last column
				}
			}
			while (rows<(this.getRowLength()-1)) {
				str = str + ";"; //  add semicolon to show row break for each loop of the row unless it's the last row
			}
		}
		return str;

	} // End of public method matrixToString
	
	public void prettyPrint() {
		System.out.println("Starting pretty print method");
		System.out.println("Dimensions (" +  this.getRowLength() + "," + this.getColumnLength() + ")");
		for (int i=0; i<this.getRowLength(); i++) { //for each row
			System.out.println(Arrays.toString(myMatrix[i])); // print the array at that row
		}
	} // End of prettyPrint method
		

} //End of public class Matrix



