// Week 9 Trees Exercise 1

public class IntegerTreeNode { // setting up the class and class variables
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode (int newValue) { // constructor method
		this.value = newValue;
		this.left = null;
		this.right = null;
	}

	public void add (int newNumber) {
		if (newNumber > this.value) { // check whether the number to be added should be added to the left or the right
			if (right == null) {  // is there something already on the right?
				right = new IntegerTreeNode(newNumber); // create a new element 
			} else { // right is not null
				right.add(newNumber); // then tell the right node to add an element
			}
		} else {
			if (left == null) { // does the left exist
				left = new IntegerTreeNode(newNumber); // left is a new element
			} else {
				left.add(newNumber); // add the new number to the element
			}
		}
	}
	
	public boolean contains (int numbertofind) { // n is the number to find
		boolean result = false;
		if (this.value == numbertofind) { // then we have found the number
			return true;
		} else if (numbertofind > this.value) { // if it's greater look on the right
			if (right != null) {
				return right.contains(numbertofind);
			} else {
				if (left != null) {
				return left.contains(numbertofind);
				}
			}
		}
		return false;
	}
	
	public int getMax() {
		int max = -1; // not sure if we need to initialise?
			if (right == null) {// if there is nothing on the right then this value must be the highest value)
				return this.value;
			} else {
				return right.getMax();
			}
	}
				
	public int getMin() {
		int min = -1;
			if (right == null) {// if there is nothing on the right then this value must be the highest value)
				return this.value;
			} else {
				return right.getMax();
			}
	}
	
	public int getDepth() { // go down both roots and check the max number of steps we go down - so very similar to calculating the length of the list
		int leftDepth = 0;
		if (left != null) {
			int leftDepth = left.getDepth(); //
		}
		int rightDepth = 0;
		if (right != null) {
			rightDepth = right.getDepth();
		}
		if (leftDepth > rightDepth) {
			return 1 + leftDepth;
		} else {
			return 1 + rightDepth;
		}
	}
		
			
			
		if (left == null) { // check the length of the list on the left
			return 1;
		} else {
			return 1 + left.getDepth();
			
		if (right == null) {
			return 1;
		} else {
			return 1 + right.getDepth();
		
			 
			
			

}	// end of public class IntegerTreeNode
	

