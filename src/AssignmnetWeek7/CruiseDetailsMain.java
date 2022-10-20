package AssignmnetWeek7;

import java.util.Scanner;

import constructor.LibraryBookDetails;

public class CruiseDetailsMain {
	public static void main(String[] args) {
		CruiseDetails scenicruise = new CruiseDetails("Scenic Cruise", 3, 43.99, 12.99);
		CruiseDetails sunstcruise = new CruiseDetails("SunSet Cruise", 1, 52.99, 15.99);
		CruiseDetails discvrycruise = new CruiseDetails("Discovery Cruise", 4, 39.99, 9.99);
		CruiseDetails mystrycruise = new CruiseDetails("Mystery Cruise", 2, 45.99, 12.99);
		String selctedAlphabetToConfirm = "";
		Scanner sc = new Scanner(System.in);
		String selectedCruise;
		int numOfAttempts = 0;
		int numOfAttemptsforBuffetSelect = 0;
		int numberOfAdults = 0;
		int numberOfChildrenMoreThanFiveYears = 0;

		do {

			System.out.println("We have Four types of cruise availabale\n" + "Scenic Cruise\n" + "SunSet Cruise\n"
					+ "Discovery Cruise\n" + "Mystery Cruise");
			System.out.println("Please enter the cruise that you want to select?");

			selectedCruise = sc.nextLine();
			while (!(selectedCruise.equals("Scenic Cruise") || selectedCruise.equals("SunSet Cruise")
					|| selectedCruise.equals("Discovery Cruise") || selectedCruise.equals("Mystery Cruise")))//loop to handle invalid entry of cruisename

			{
				numOfAttempts++;
				if (numOfAttempts > 2) {
					System.out.println("You have entered more than 3 times invalid cruise name");
					System.exit(0);
				}
				System.out.println("you have entered invalid cruise name ,please select from list given above only");
				selectedCruise = sc.nextLine();
			}
			if (selectedCruise.equals("Scenic Cruise")) {
				System.out.println("The cruise that you have selected is " + selectedCruise + "which is a         "
						+ scenicruise.noOfDays + "day cruise");
				System.out.println("The cruise that you have selected is " + selectedCruise
						+ " price for Adults(greater than 12)       " + scenicruise.priceForAdult + "per day");
				System.out.println(
						"The cruise that you have selected is " + selectedCruise + " price for children(above 5)     "
								+ scenicruise.priceForChildrenMoreThanFiveYears + "per day");
			} else if (selectedCruise.equals("SunSet Cruise")) {
				System.out.println("The cruise that you have selected is " + selectedCruise + "which is a         "
						+ sunstcruise.noOfDays + "day cruise");
				System.out.println("The cruise that you have selected is " + selectedCruise
						+ " price for Adults(greater than 12)       " + sunstcruise.priceForAdult + "per day");
				System.out.println(
						"The cruise that you have selected is " + selectedCruise + " price for children(above 5)     "
								+ sunstcruise.priceForChildrenMoreThanFiveYears + "per day");
			} else if (selectedCruise.equals("Discovery Cruise")) {
				System.out.println("The cruise that you have selected is " + selectedCruise + "which is a         "
						+ discvrycruise.noOfDays + "day cruise");
				System.out.println("The cruise that you have selected is " + selectedCruise
						+ " price for Adults(greater than 12)       " + discvrycruise.priceForAdult + "per day");
				System.out.println(
						"The cruise that you have selected is " + selectedCruise + " price for children(above 5)     "
								+ discvrycruise.priceForChildrenMoreThanFiveYears + "per day");
			} else if (selectedCruise.equals("Mystery Cruise")) {
				System.out.println("The cruise that you have selected is " + selectedCruise + "which is a         "
						+ mystrycruise.noOfDays + "day cruise");
				System.out.println("The cruise that you have selected is " + selectedCruise
						+ " price for Adults(greater than 12)       " + mystrycruise.priceForAdult + "per day");
				System.out.println(
						"The cruise that you have selected is " + selectedCruise + " price for children(above 5)     "
								+ mystrycruise.priceForChildrenMoreThanFiveYears + "per day");
			}

			System.out.println(
					"Please press Y if you want to continue with the selction or press any other alaphabetto selcect another");

			selctedAlphabetToConfirm = sc.next();

		}

		while (!(selctedAlphabetToConfirm.equals("Y")));//loop to handle invalid entry to confirm buffet meal or not//entry should be yes or no
		System.out.println("Enter number of adults");
		numberOfAdults = sc.nextInt();
		System.out.println("Enter number of children");
		int totalNumOFChildren=sc.nextInt();
	   int	ageOfChildren[]=new int[totalNumOFChildren];
	  if(totalNumOFChildren>0) {
			for(int j=0;j<totalNumOFChildren;j++) {
				System.out.println("Enter the age of child"+(j));
				ageOfChildren[j]=	sc.nextInt();
			}
			for(int j=0;j<totalNumOFChildren;j++)
			{
		if(ageOfChildren[j]>5) {
			numberOfChildrenMoreThanFiveYears=	numberOfChildrenMoreThanFiveYears+1;
			
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
		if (customerreplyforbuffet.equals("yes")) {
			if (selectedCruise.equals("Scenic Cruise")) {

				scenicruise.cruisePricingForAdults(numberOfAdults);
				scenicruise.cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);

				scenicruise.buffetPricingForAdults(numberOfAdults);
				scenicruise.buffetPricingForChildrenmoreThanFive(numberOfChildrenMoreThanFiveYears);
				scenicruise.totalPricewithbuffetprice();
				scenicruise.hstCalucalte();
				scenicruise.finalTotalBillCalucalated();
				scenicruise.displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);
			} else if (selectedCruise.equals("SunSet Cruise")) {
				sunstcruise.cruisePricingForAdults(numberOfAdults);
				sunstcruise.cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);
				sunstcruise.buffetPricingForAdults(numberOfAdults);
				sunstcruise.buffetPricingForChildrenmoreThanFive(numberOfChildrenMoreThanFiveYears);
				sunstcruise.totalPricewithbuffetprice();
				sunstcruise.hstCalucalte();
				sunstcruise.finalTotalBillCalucalated();
				sunstcruise.displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

			} else if (selectedCruise.equals("Discovery Cruise")) {
				discvrycruise.cruisePricingForAdults(numberOfAdults);
				discvrycruise.cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);
				discvrycruise.buffetPricingForAdults(numberOfAdults);

				discvrycruise.buffetPricingForChildrenmoreThanFive(numberOfChildrenMoreThanFiveYears);
				discvrycruise.totalPricewithbuffetprice();
				discvrycruise.hstCalucalte();
				discvrycruise.finalTotalBillCalucalated();
				discvrycruise.displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

			} else if (selectedCruise.equals("Mystery Cruise")) {
				mystrycruise.cruisePricingForAdults(numberOfAdults);
				mystrycruise.cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);
				mystrycruise.buffetPricingForAdults(numberOfAdults);

				mystrycruise.buffetPricingForChildrenmoreThanFive(numberOfChildrenMoreThanFiveYears);
				mystrycruise.totalPricewithbuffetprice();
				mystrycruise.hstCalucalte();
				mystrycruise.finalTotalBillCalucalated();
				mystrycruise.displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

			}
		}

		else if (customerreplyforbuffet.equals("no")) {

			switch (selectedCruise) {
			case "Scenic Cruise":
				scenicruise.cruisePricingForAdults(numberOfAdults);
				scenicruise.cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);

				scenicruise.totalPricewithoutMeal();
				scenicruise.hstCalucalte();
				scenicruise.finalTotalBillCalucalated();
				scenicruise.displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

				break;
			case "SunSet Cruise":
				sunstcruise.cruisePricingForAdults(numberOfAdults);
				sunstcruise.cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);

				sunstcruise.totalPricewithoutMeal();
				sunstcruise.hstCalucalte();
				sunstcruise.finalTotalBillCalucalated();
				sunstcruise.displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

				break;
			case "Discovery Cruise":
				discvrycruise.cruisePricingForAdults(numberOfAdults);
				discvrycruise.cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);

				discvrycruise.totalPricewithoutMeal();
				discvrycruise.hstCalucalte();
				discvrycruise.finalTotalBillCalucalated();
				discvrycruise.displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

				break;
			case "Mystery Cruise":
				mystrycruise.cruisePricingForAdults(numberOfAdults);
				mystrycruise.cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);

				mystrycruise.totalPricewithoutMeal();
				mystrycruise.hstCalucalte();
				mystrycruise.finalTotalBillCalucalated();
				scenicruise.displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

				break;
			default:
				System.out.println("Wrong cruise type selected");

			}

		}

	}
}