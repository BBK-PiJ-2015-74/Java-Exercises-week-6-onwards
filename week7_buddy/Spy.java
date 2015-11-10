public class Spy {

	private static int spyCount = 0;
	private int id;

	public Spy (int id) {
		System.out.println("Created a new spy...");
		spyCount++;
		this.id = id;
		System.out.println(spyCount);
		System.out.println(id);
	}

	public void die () {
		System.out.println("Killed a spy id " + this.id);
		spyCount--;
		System.out.println(spyCount);
	}



}