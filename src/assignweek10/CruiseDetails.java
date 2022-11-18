package assignweek10;

import java.util.Scanner;

public class CruiseDetails extends UserDetails {

	public String cruiseName;
	public int noOfDays;
	public double priceForAdult;
	public double priceForChildrenMoreThanFiveYears;
	public double priceOfCruiseForAdults;
	double totalPrice;
	double priceOfCruiseForChildrenmoreThanFive;
	double buffetPriceForAdults;
	double buffetPriceForChildrenmoreThanFive;
	double hstCalucalted;
	double finalTotalbill;
	String customerreplyforbuffet = "";
	int numOfAttemptsforBuffetSelect = 0;
	String selectedCruise = "";
	int numOfAttempts = 0;

	String customereply = "";
	double totalAdditionalservicecharges = 0;


	Scanner sc = new Scanner(System.in);

	public String cruiseSelction() {

		System.out.println("We have Four types of cruise availabale");
		System.out.println("Please enter the cruise that you want to select?\n" + "Scenic Cruise\n" + "SunSet Cruise\n"
				+ "Discovery Cruise\n" + "Mystery Cruise");
		selectedCruise = sc.nextLine();
		while (!(selectedCruise.equalsIgnoreCase("Scenic Cruise") || selectedCruise.equalsIgnoreCase("SunSet Cruise")
				|| selectedCruise.equalsIgnoreCase("Discovery Cruise")
				|| selectedCruise.equalsIgnoreCase("Mystery Cruise")))

		{
			numOfAttempts++;
			if (numOfAttempts > 2) {
				System.out.println("You have entered more than 3 times invalid cruise name");
				System.exit(0);
			}
			System.out.println("you have entered invalid cruise name ,please select from list given above only");
			selectedCruise = sc.nextLine();

		}
		return selectedCruise;
	}

	public void selectedCruiseDisplayInfo() {

		System.out.println(
				"The cruise that you have selected is " + cruiseName + "which is a         " + noOfDays + "day cruise");
		System.out.println("The cruise that you have selected is " + cruiseName
				+ " price for Adults(greater than 12)       " + priceForAdult + "per day");
		System.out.println("The cruise that you have selected is " + cruiseName + " price for children(above 5)     "
				+ priceForChildrenMoreThanFiveYears + "per day");

	}

	public void cruisePricingForAdults() // method for caluclating price of cruise for adults
	{

		priceOfCruiseForAdults = (priceForAdult * numberOfAdults * noOfDays);

	}

	public void cruisePricingForChildren() {

		priceOfCruiseForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * noOfDays
				* priceForChildrenMoreThanFiveYears);

	}

	public void buffetSelectionCruise()

	{
		System.out.println(
				"All our cruises have food service on board.Do you want to pre book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids,please type yes or no?");
		customerreplyforbuffet = sc.next();

		while (!(customerreplyforbuffet.equalsIgnoreCase("yes") || customerreplyforbuffet.equalsIgnoreCase("no"))) {
			System.out.println("invalid response please type yes or no");

			customerreplyforbuffet = sc.next();
			numOfAttemptsforBuffetSelect++;
			if (numOfAttemptsforBuffetSelect > 2) {
				System.out.println("You have entered more than 3 times invalid response");
				System.exit(0);
			}

		}

	}
	public void scenicselectedAdditionalService() {
		System.out.println(
				"scenic cruise has additional service of spa (only for adults)would you like to book it? yes or no,it will be charged $50 per person.");
		customereply = sc.nextLine();
		if (customereply.equals("yes")) {
			totalAdditionalservicecharges = (50 * numberOfAdults);

		} else {
			totalAdditionalservicecharges = 0;
		}
	}

	public void displayFinal() {
		System.out.println(cruiseName + "Adults            @   " + numberOfAdults + "   $" + priceOfCruiseForAdults);
		System.out.println(cruiseName + "Children abovefiveyears@   " + numberOfChildrenMoreThanFiveYears + "   $"
				+ priceOfCruiseForChildrenmoreThanFive);
		System.out.println(
				"buffet specail price adults            @   " + numberOfAdults + "   $" + buffetPriceForAdults);
		System.out.println("Buffet Special price children above 5    @    " + numberOfChildrenMoreThanFiveYears + "$"
				+ buffetPriceForChildrenmoreThanFive);
		System.out.println(
				"Additional charges for Spa services    " + numberOfAdults + "   $   " + totalAdditionalservicecharges);
		System.out.println("Total price:                 $" + totalPrice);
		System.out.println("HST@15%:                 $" + hstCalucalted);
		System.out.println("Final Price:                 $" + finalTotalbill);
	}

	public void totalPricewithbuffetprice() {
		totalPrice = priceOfCruiseForAdults + priceOfCruiseForChildrenmoreThanFive + buffetPriceForAdults
				+ buffetPriceForChildrenmoreThanFive + totalAdditionalservicecharges;
		System.out.println("HI");

	}

	
	public void buffetPricingForAdults() {
		if (customerreplyforbuffet.equalsIgnoreCase("yes")) {

			buffetPriceForAdults = (numberOfAdults * 20.99 * noOfDays);

		} else {
			buffetPriceForAdults = 0;
		}

	}
	public void finalTotalBillCalucalated() {
		finalTotalbill = totalPrice + hstCalucalted;
		System.out.println("HELLO");

	}

	public void buffetPricingForChildrenmoreThanFive() {
		if (customerreplyforbuffet.equalsIgnoreCase("yes")) {

			buffetPriceForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * 4.99 * noOfDays);

		} else {
			buffetPriceForAdults = 0;
		}

	}

	public void hstCalucalte() {
		hstCalucalted = totalPrice * 0.15;

	}

}