// Week 8 Interfaces and data structures
// Implement a simple class that executes the former code in its main method
// Change the class AdultPerson for class KidPerson and verify that it still compiles and runs

public interface Person {
	public void move (int distance); // interface method 'move'
	public void say (String message); // interface method 'say'
}

public class AdultPerson implements Person {
	private int situation;
	private int energy;
	private Leg leftLeg;
	private Leg rightLeg;
	
	public void move (int distance) {
		if rightLeg.isHealthy() &&

// New class file Leg

	public class Leg {
		private boolean healthy = true;
		public void break() {
			this.healthy = false
		}	
		public void getBetter() {
			this.healthy = true;
		}
		public boolean isHealthy() {
			return this.healthy;
		}
	}

