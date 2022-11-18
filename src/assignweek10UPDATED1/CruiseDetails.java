package assignweek10UPDATED1;

public class CruiseDetails extends UserDetails {
	private double priceOfCruiseForAdults, totalPrice, totalAdditionalservicecharges,
			priceOfCruiseForChildrenmoreThanFive, buffetPriceForAdults, buffetPriceForChildrenmoreThanFive;
	private double hstCalucalted, finalTotalbill;
	public double priceForAdult, priceForChildrenMoreThanFiveYears;
	private String customerreplyforbuffet = "";
	private int numOfAttemptsforBuffetSelect, numOfAttempts = 0;
	public String cruiseName;
	public int noOfDays;

	public CruiseDetails(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years,
			double totalAdditionalservicechargeforoneperson) {
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;
		totalAdditionalservicecharges = totalAdditionalservicechargeforoneperson;

	}

	public String cruiseSelction() {

		System.out.println("We have Four types of cruise availabale");
		System.out.println("Please enter the cruise that you want to select?\n" + "Scenic Cruise\n" + "SunSet Cruise\n"
				+ "Discovery Cruise\n" + "Mystery Cruise");
		String selectedCruise = sc.nextLine();
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

	public void buffetSelectionCruise()

	{
		System.out.println(
				"All our cruises have food service on board.Do you want to pre book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids,please type yes or no?");
		String customerreplyforbuffet = sc.next();

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

	public void finalTotalBillCalucalated(int numberOfAdults, int numberOfChildrenMoreThanFiveYears) {
		priceOfCruiseForAdults = (priceForAdult * numberOfAdults * noOfDays);
		priceOfCruiseForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * noOfDays
				* priceForChildrenMoreThanFiveYears);
		if (customerreplyforbuffet.equals("yes")) {

			buffetPriceForAdults = (numberOfAdults * 20.99 * noOfDays);
			buffetPriceForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * 4.99 * noOfDays);
		} else {
			buffetPriceForAdults = 0;
			buffetPriceForChildrenmoreThanFive = 0;
		}

		totalAdditionalservicecharges = (numberOfAdults * totalAdditionalservicecharges);
		totalPrice = priceOfCruiseForAdults + priceOfCruiseForChildrenmoreThanFive + buffetPriceForAdults
				+ buffetPriceForChildrenmoreThanFive + totalAdditionalservicecharges;
		hstCalucalted = totalPrice * 0.15;
		finalTotalbill = totalPrice + hstCalucalted;

	}

	public void displayFinal(int numberOfAdults, int numberOfChildrenMoreThanFiveYears) {
		System.out.println(cruiseName + "Adults            @   " + numberOfAdults + "   $" + priceOfCruiseForAdults);
		System.out.println(cruiseName + "Children abovefiveyears@   " + numberOfChildrenMoreThanFiveYears + "   $"
				+ priceOfCruiseForChildrenmoreThanFive);
		System.out.println(
				"buffet specail price adults            @   " + numberOfAdults + "   $" + buffetPriceForAdults);
		System.out.println("Buffet Special price children above 5    @    " + numberOfChildrenMoreThanFiveYears + "$"
				+ buffetPriceForChildrenmoreThanFive);
		System.out.println("Additional services" + numberOfAdults + "   $   " + totalAdditionalservicecharges);
		System.out.println("Total price:                 $" + totalPrice);
		System.out.println("HST@15%:                 $" + hstCalucalted);
		System.out.println("Final Price:                 $" + finalTotalbill);

	}

}