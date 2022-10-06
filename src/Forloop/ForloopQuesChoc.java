package Forloop;

public class ForloopQuesChoc {

	public static void main(String[] args) {
		int presentChoc;
		int maxCapacity = 63;

		for (int counter = 1; counter <= 10; counter++) {
			presentChoc = 27 + (counter * 5);

			System.out.println("now choclate box has" + presentChoc);
			if (presentChoc >= maxCapacity - 1)

			{
				System.out.println("stop adding choclates maximum limit reached");
				break;
			}
		}

	}

}
