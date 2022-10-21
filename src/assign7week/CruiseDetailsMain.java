package assign7week;

import java.util.Scanner;

import AssignmnetWeek7.CruiseDetails;

public class CruiseDetailsMain {

	public static void main(String[] args) {
		CruiseDetails scenicruise = new CruiseDetails("Scenic Cruise", 3, 43.99, 12.99);
		CruiseDetails sunstcruise = new CruiseDetails("SunSet Cruise", 1, 52.99, 15.99);
		CruiseDetails discvrycruise = new CruiseDetails("Discovery Cruise", 4, 39.99, 9.99);
		CruiseDetails mystrycruise = new CruiseDetails("Mystery Cruise", 2, 45.99, 12.99);
		String selectedCruise;
		int numOfAttempts = 0;
		int numOfAttemptsforBuffetSelect = 0;
		int numberOfAdults = 0;
		int numberOfChildrenMoreThanFiveYears = 0;
		String selctedAlphabetToConfirm = "";
		int index = 0;
		Scanner sc = new Scanner(System.in);

		CruiseDetails cruiseDetails[] = { scenicruise, sunstcruise, discvrycruise, mystrycruise };
		do {

			System.out.println("We have Four types of cruise availabale\n" + "Scenic Cruise\n" + "SunSet Cruise\n"
					+ "Discovery Cruise\n" + "Mystery Cruise");
			System.out.println("Please enter the cruise that you want to select?");

			selectedCruise = sc.nextLine();
			while (!(selectedCruise.equals("Scenic Cruise") || selectedCruise.equals("SunSet Cruise")
					|| selectedCruise.equals("Discovery Cruise") || selectedCruise.equals("Mystery Cruise")))			{
				numOfAttempts++;
				if (numOfAttempts > 2) {
					System.out.println("You have entered more than 3 times invalid cruise name");
					System.exit(0);
				}
				System.out.println("you have entered invalid cruise name ,please select from list given above only");
				selectedCruise = sc.nextLine();
			}
			for (int i = 0; i < cruiseDetails.length; i++) {

				if (selectedCruise.equals(cruiseDetails[i].cruiseName)) {

					System.out.println("The cruise that you have selected is " + selectedCruise + "which is a         "
							+ cruiseDetails[i].noOfDays + "day cruise");
					System.out.println("The cruise that you have selected is " + selectedCruise
							+ " price for Adults(greater than 12)       " + cruiseDetails[i].priceForAdult + "per day");
					System.out.println("The cruise that you have selected is " + selectedCruise
							+ " price for children(above 5)     " + cruiseDetails[i].priceForChildrenMoreThanFiveYears
							+ "per day");
					index = i;
				}

			}
			System.out.println(
					"Please press Y if you want to continue with the selction or press any other alaphabetto selcect another");

			selctedAlphabetToConfirm = sc.next();

		}

		while (!(selctedAlphabetToConfirm.equals("Y")));

		System.out.println("Enter number of adults");
		numberOfAdults = sc.nextInt();
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
		System.out.println(
				"All our cruises have food service on board.Do you want to pre book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids,please type yes or no?");
		String customerreplyforbuffet = sc.next();

		while (!(customerreplyforbuffet.equals("yes") || customerreplyforbuffet.equals("no"))) {
			System.out.println("invalid response please type yes or no");

			customerreplyforbuffet = sc.next();
			numOfAttemptsforBuffetSelect++;
			if (numOfAttemptsforBuffetSelect > 2) {
				System.out.println("You have entered more than 3 times invalid response");
				System.exit(0);
			}

		}
		{

			if ((selectedCruise.equals(cruiseDetails[index].cruiseName))) {
				if (customerreplyforbuffet.equals("yes")) {
					cruiseDetails[index].cruisePricingForAdults(numberOfAdults);
					cruiseDetails[index].cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);
					cruiseDetails[index].buffetPricingForAdults(numberOfAdults);
										cruiseDetails[index].buffetPricingForChildrenmoreThanFive(numberOfChildrenMoreThanFiveYears);
					cruiseDetails[index].totalPricewithbuffetprice();
					cruiseDetails[index].hstCalucalte();
					cruiseDetails[index].finalTotalBillCalucalated();
					cruiseDetails[index].displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

				}

				else if (customerreplyforbuffet.equals("no")) {
					cruiseDetails[index].cruisePricingForAdults(numberOfAdults);
					cruiseDetails[index].cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);

					cruiseDetails[index].totalPricewithoutMeal();
					cruiseDetails[index].hstCalucalte();
					cruiseDetails[index].finalTotalBillCalucalated();
					cruiseDetails[index].displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

				}

			}

		}

	}
}
