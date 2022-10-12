//Write a program that will keep adding 5 chocolates to a box which already has 27 chocolates and add a mechanism that number of chocolates should never go above 63

package Assignment5Week;

public class ChoclaProg {

	public static void main(String[] args) {
		int maximumChoclatesCanBoxHold = 63;

		for (int currentChocInBox = 27; currentChocInBox <= 100; currentChocInBox += 5) {
			//if (currentChocInBox >= maximumChoclatesCanBoxHold) {
				//System.out.println("maximum capacity reached stop adding chocolates");
				//break;
			//}

			System.out.println("Number of Chocolates in Box" + currentChocInBox);
			
				if (currentChocInBox +5>= maximumChoclatesCanBoxHold) {
					System.out.println("maximum capacity reached stop adding chocolates");
					break;
				}

		}
	}

}