package assignweek10UPDATED1;

import java.util.Scanner;

public class ServiceMain1 {
	public static void main(String[] args) {
		CruiseDetails crsDtl = new CruiseDetails(null, 0, 0, 0, 0);
		int numberOfChildrenMoreThanFiveYears = 0;
		HotelBooking hbook = new HotelBooking(null, 0);
		int numOfAttempt = 0;
		String customerreplyforanotherbooking = "";
		String selectedCruise = "";
		Scanner sc = new Scanner(System.in);
		UserDetails udtl = new UserDetails();
		udtl.Signup();

		do {
			String selctedAlphabetToConfirm = "";
			System.out.println("Please enter the service you want to book  Hotel Stay/Cruise");
			String serviceSelc = sc.nextLine();
			while (!(serviceSelc.equalsIgnoreCase("Hotel Stay") || serviceSelc.equalsIgnoreCase("Cruise"))) {
				numOfAttempt++;
				if (numOfAttempt > 2) {
					System.out.println("You have entered more than 3 times invalid entry");

					System.exit(0);
				}
				System.out.println("you have selected invalid entry.please select Hotel Stay/Cruise");
				serviceSelc = sc.nextLine();

			}
			if (serviceSelc.equalsIgnoreCase("Cruise")) // if customer select cruise selction option
			{
				do {

					selectedCruise = crsDtl.cruiseSelction();

					switch (selectedCruise) {
					case ("Scenic Cruise"):
						crsDtl = new ScenicClass();
						break;
					case ("SunSet Cruise"):
						crsDtl = new SunsetClass();
						break;
					case ("Discovery Cruise"):
						crsDtl = new MysteryClass();
						break;
					case ("Mystery Cruise"):
						crsDtl = new DiscoveryClass();
						break;
					default:
						System.out.println("INVALID TYPE");

					}

					System.out.println("The cruise that you have selected is " + crsDtl.cruiseName
							+ "which is a         " + +crsDtl.noOfDays + "day cruise");
					System.out.println("The cruise that you have selected is " + crsDtl.cruiseName
							+ " price for Adults(greater than 12)       " + crsDtl.priceForAdult + "per day");
					System.out.println("The cruise that you have selected is " + crsDtl.cruiseName
							+ " price for children(above 5)     " + crsDtl.priceForChildrenMoreThanFiveYears
							+ "per day");

					System.out.println(
							"Please press Y if you want to continue with the selction or press any other alaphabet to select another");

					selctedAlphabetToConfirm = sc.next();

				}

				while (!(selctedAlphabetToConfirm.equalsIgnoreCase("Y")));
				System.out.println("Enter number of adults");
				int numberOfAdults = sc.nextInt();
				System.out.println("Enter number of children");
				int totalNumOFChildren = sc.nextInt();
				int ageOfChildren[] = new int[totalNumOFChildren];
				if (totalNumOFChildren > 0) {
					for (int j = 0; j < totalNumOFChildren; j++) {
						System.out.println("Enter the age of child" + (j + 1));
						ageOfChildren[j] = sc.nextInt();
						if (ageOfChildren[j] > 5) {
							numberOfChildrenMoreThanFiveYears = numberOfChildrenMoreThanFiveYears + 1;
						}
					}
				}

				crsDtl.buffetSelectionCruise();
				crsDtl.finalTotalBillCalucalated(numberOfAdults, numberOfChildrenMoreThanFiveYears);
				crsDtl.displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

			}

			if (serviceSelc.equalsIgnoreCase("Hotel Stay")) {

				String roomSelected = hbook.roomSelection();
				switch (roomSelected) {
				case ("Delux Suite"):
					hbook = new DeluxeSuite();
					break;
				case ("Family Suite"):
					hbook = new FamilySuite();
					break;
				default:
					System.out.println("invalid choice");
				}
				System.out.println("Enter number of adults");
				int numberOfAdults = sc.nextInt();
				System.out.println("Enter number of children");
				int totalNumOFChildren = sc.nextInt();
				// hbook.checkEligibiltyOfRoom();
				hbook.lunchSelectionHotel();
				hbook.totalFinalBill(numberOfAdults, totalNumOFChildren);
				hbook.displayFinal(numberOfAdults, totalNumOFChildren);
			}
			System.out.println("Do you want to book another Hotel Room or Cruise");
			System.out.println("Please enter y if you want to continue");
			System.out.println("You can enjoy more services");
			customerreplyforanotherbooking = sc.nextLine();

		} while (customerreplyforanotherbooking.equalsIgnoreCase("y"));

	}
}
