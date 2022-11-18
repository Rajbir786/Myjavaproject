package assignweek10UPDATED;

public class CruiseDetails extends UserDetails {
	private double priceOfCruiseForAdults;
	private double totalPrice;
	private double priceOfCruiseForChildrenmoreThanFive;
	private double buffetPriceForAdults;
	private double buffetPriceForChildrenmoreThanFive;
	private double hstCalucalted;
	private double finalTotalbill;
	private String customerreplyforbuffet = "";
	private int numOfAttemptsforBuffetSelect = 0;
	private int numOfAttempts = 0;
	public String cruiseName;
	public int noOfDays;
	public double priceForAdult;
	public double priceForChildrenMoreThanFiveYears;

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

	public void cruisePricingForAdults() {

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

	public void buffetPricingForAdults() {
		if (customerreplyforbuffet.equalsIgnoreCase("yes")) {

			buffetPriceForAdults = (numberOfAdults * 20.99 * noOfDays);

		} else {
			buffetPriceForAdults = 0;
		}

	}

	public void buffetPricingForChildrenmoreThanFive() {
		if (customerreplyforbuffet.equalsIgnoreCase("yes")) {

			buffetPriceForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * 4.99 * noOfDays);

		} else {
			buffetPriceForChildrenmoreThanFive = 0;
		}

	}

	public void hstCalucalte() {
		hstCalucalted = totalPrice * 0.15;
	}

	public double totalPricewithbuffetprice(double totalAdditionalservicecharges) {
		totalPrice = priceOfCruiseForAdults + priceOfCruiseForChildrenmoreThanFive + buffetPriceForAdults
				+ buffetPriceForChildrenmoreThanFive + totalAdditionalservicecharges;
		return totalPrice;

	}

	public void finalTotalBillCalucalated() {
		finalTotalbill = totalPrice + hstCalucalted;

	}

	public void displayFinal(double totalAdditionalservicecharges) {
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