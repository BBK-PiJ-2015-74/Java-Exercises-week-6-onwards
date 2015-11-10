import java.util.Arrays; // required to be able to print arrays

public class Matrix {

	private int [][] intArray; //put the [][] before the variable name, not after, as it shows it's an array of ints

	public Matrix(int rows, int columns) { // constructor method always looks like this and does not have a return type not even void. It's always called when a new object is created. Always public.
		intArray = new int [rows][columns];
		System.out.println("\nStarting 'Matrix' method (i.e. constructor).  Creating matrix (" + rows + "," + columns + ") Filling with 1s\n");
		for (int i=0;i<rows;i++) { // for each row
			for (int j=0;j<columns;j++){ //for each column on each row
				this.intArray[i][j] = 1; // write the value as a 1
				}
			}
		}

	public void setElement (int row, int col, int value) {
		System.out.println("Starting set element method");
		if(row>this.getRows()) {
			System.out.println("Row out of range - there are " + this.getRows());
		}
		else if(row>this.getCols()) {
			System.out.println("Row out of range - there are " + this.getCols());
		}
		else {
			this.intArray[row][col] = value;
		}

	}

	public void prettyPrint() {
		System.out.println("\nStarting pretty print method.");
		System.out.println("Dimensions (" +  this.getRows() + "," + this.getCols() + ")\n");
		for (int loop=0;loop<this.getRows();loop++) { //for each row
			System.out.println(Arrays.toString(intArray[loop])); // print the array at that row
	}
	}

	public int getRows () {
		return intArray.length;
	}

	public int getCols () {
		return intArray[0].length;
		}

	public void setRow(int row, String input) {
		System.out.println("Starting set row method");
		int commas = countCommas(input);
		int arrayColToAddTo = 0;
		if (commas + 1 != this.getCols()) {
			System.out.println("Incorrect number of items.  Input rejected. " + input);
			}
		
		else {
			int thisCharIndex;
			String thisValue = "";
			for(thisCharIndex = 0;thisCharIndex<=input.length()-1;thisCharIndex++) { // for each char in input string
				if(input.charAt(thisCharIndex) != ',') { // if we find a comma, add value from previous chars to array
					thisValue = thisValue + input.charAt(thisCharIndex); //building up a string until we reach the next comma
					}
				if(input.charAt(thisCharIndex) == ',' || thisCharIndex == input.length()-1) { //if we reach a comma or end of string, add what we have before then to the array
					this.intArray[row][arrayColToAddTo] = Integer.parseInt(thisValue);
					thisValue = ""; // then reset this value so we have it empty for the next loop
					arrayColToAddTo++;
					}			
				}

			}
		}
public void setColumn(int col, String input) {
		System.out.println("Starting set column method"); 
		int commas = countCommas(input);
		int arrayRowToAddTo = 0;
		if (commas + 1 != this.getRows()) {
			System.out.println("Incorrect number of items.  Input rejected. " + input);
			}
		
		else {
			int thisCharIndex;
			String thisValue = "";
			for(thisCharIndex = 0;thisCharIndex<=input.length()-1;thisCharIndex++) { // for each char in input string
				if(input.charAt(thisCharIndex) != ',') { // if we find a comma, add value from previous chars to array
					thisValue = thisValue + input.charAt(thisCharIndex); //building up a string until we reach the next comma
					}
				if(input.charAt(thisCharIndex) == ',' || thisCharIndex == input.length()-1) { //if we reach a comma or end of string, add what we have before then to the array
					this.intArray[arrayRowToAddTo][col] = Integer.parseInt(thisValue);
					thisValue = ""; // then reset this value so we have it empty for the next loop
					arrayRowToAddTo++;
					}			
				}
			}
		}

	private int countCommas(String input) {
		// System.out.println("Counting commas in string length " + input.length() + " String: " + input);
		int commas = 0; 
		for(int thisCol = 0;thisCol<input.length();thisCol++) { // for each char in input string
			// System.out.println("Commas: " + commas);
			// System.out.println("this col: " + thisCol);
			// System.out.println("this char: " + input.charAt(thisCol) + "\n");
			if(input.charAt(thisCol) == ',') {
				commas++;
				}
			}
			System.out.println("Found commas: " + commas);
		return commas;
		}

	public String toString() {
		String output = "";
		System.out.println("\nStarting to string method.");
		System.out.println("Dimensions (" +  this.getRows() + "," + this.getCols() + ")\n");
		output = output + "["; // open [ to start
		for (int row=0;row<this.getRows();row++) { //for each row
			for (int col=0;col<this.getCols();col++) { //for each int (column) in row
				output = output + this.intArray[row][col];
				if(col<this.getCols()-1){
					output = output + ","; //want to add comma unless it's the last col
					}
				}
				if(row<this.getRows()-1){
					output = output + ":"; //want to add semicolon to show row break unless it's the last row
					}
			}
			output = output + "]"; // close ] to end
			return output;

	}
	

}