
public class WhileStat {

	public static void main(String[] args) {
		int number = 1;
		while (number <= 100) {

			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println(number);

			}

			number++;

		}
	}

}
