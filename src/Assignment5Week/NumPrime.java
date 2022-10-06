package Assignment5Week;

public class NumPrime {
	public static void main(String args[]) {
		int num = 25;// we take value more than 1

		int countFactors = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {

				countFactors = countFactors + 1;

			}
		}
		if (countFactors == 2) {
			System.out.println("num is  prime");
		} else {
			System.out.println("num is not prime");
		}

	}

}
