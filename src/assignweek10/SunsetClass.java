package assignweek10;

public class SunsetClass extends CruiseDetails {
	String customereply = "";
	double totalAdditionalservicecharges = 0;

	SunsetClass(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years) {
		// Constructor to initialize variables
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;

	}

	void cruisePricingForAdults() // method for caluclating price of cruise for adults
	{

		priceOfCruiseForAdults = (priceForAdult * numberOfAdults * noOfDays);

	}

	void cruisePricingForChildren()// method for caluclating price of
									// cruise for children above 5
	{

		priceOfCruiseForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * noOfDays
				* priceForChildrenMoreThanFiveYears);

	}

	void sunsetselectedDisplayInfo() {

		System.out.println(
				"The cruise that you have selected is " + cruiseName + "which is a         " + noOfDays + "day cruise");
		System.out.println("The cruise that you have selected is " + cruiseName
				+ " price for Adults(greater than 12)       " + priceForAdult + "per day");
		System.out.println("The cruise that you have selected is " + cruiseName + " price for children(above 5)     "
				+ priceForChildrenMoreThanFiveYears + "per day");

	}

	void sunsetselectedAdditionalService() {

		System.out.println(
				"scenic cruise has additional service of candle light dinner would you like to book it? yes or no,it will be charged $45 per person.");
		String customereply = sc.nextLine();
		if (customereply.equals("yes")) {
			totalAdditionalservicecharges = (50 * numberOfAdults);

		} else {
			totalAdditionalservicecharges = 0;
		}

	}

	void displayFinal() {
		System.out.println(cruiseName + "Adults            @   " + numberOfAdults + "   $" + priceOfCruiseForAdults);
		System.out.println(cruiseName + "Children abovefiveyears@   " + numberOfChildrenMoreThanFiveYears + "   $"
				+ priceOfCruiseForChildrenmoreThanFive);
		System.out.println(
				"buffet specail price adults            @   " + numberOfAdults + "   $" + buffetPriceForAdults);
		System.out.println("Buffet Special price children above 5    @    " + numberOfChildrenMoreThanFiveYears + "$"
				+ buffetPriceForChildrenmoreThanFive);
		System.out.println(
				"Additional charges for Candle light" + +numberOfAdults + "   $   " + totalAdditionalservicecharges);
		System.out.println("Total price:                 $" + totalPrice);
		System.out.println("HST@15%:                 $" + hstCalucalted);
		System.out.println("Final Price:                 $" + finalTotalbill);
	}

	void totalPricewithbuffetprice() {
		totalPrice = priceOfCruiseForAdults + priceOfCruiseForChildrenmoreThanFive + buffetPriceForAdults
				+ buffetPriceForChildrenmoreThanFive + totalAdditionalservicecharges;

	}

	void finalTotalBillCalucalated() {
		finalTotalbill = totalPrice + hstCalucalted;

	}

}
