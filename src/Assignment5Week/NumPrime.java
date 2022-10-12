//Write a program to check if the number is prime or not

package Assignment5Week;

public class NumPrime {
	public static void main(String args[]) {
		int num = 7;

		int countFactors = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {

				countFactors = countFactors + 1;

			}
		}
		if (countFactors == 1) {
			System.out.println("num is either 0 or 1");
		} else if (countFactors == 2) {
			System.out.println("num is PRIME");
		}

		else {
			System.out.println("num is non-PRIME");
		}

	}

}
