package WHILEloop;

public class ForLoopStat {
	public static void main(String args[]) {
		
		int totalCapacity = 5;

		for ( int noOfDrink = 6; noOfDrink <= totalCapacity; noOfDrink++) {

			System.out.println("Drinking " + noOfDrink);
			break;
			
	
			if (noOfDrink == totalCapacity) {
			System.out.println("safe to drink");
				break;
			}

		else {
				System.out.println("stop drinking");
			}
		}

}