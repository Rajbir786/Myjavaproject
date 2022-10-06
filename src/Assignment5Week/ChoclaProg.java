package Assignment5Week;

public class ChoclaProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alreadyChoc = 27;
		int presentChoc;
		int maxCapacity = 63;

		for (int counter = 1; counter <= 10; counter++) {
			presentChoc = alreadyChoc + (counter * 5);

			System.out.println("now choclate box has" + presentChoc);
			if (presentChoc >= (maxCapacity -1))

			{
				System.out.println("stop adding choclates maximum limit reached");
				break;
			}
		}

	}

}
