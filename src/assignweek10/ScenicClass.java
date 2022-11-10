package assignweek10;

public class ScenicClass extends CruiseDetails {

	ScenicClass(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years) {
		// Constructor to initialize variables
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;

	}

	String customereply = "";
	double totalAdditionalservicecharges = 0;

	public void scenicselectedDisplayInfo() {

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

	public void cruisePricingForChildren()// method for caluclating price of
											// cruise for children above 5
	{

		priceOfCruiseForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * noOfDays
				* priceForChildrenMoreThanFiveYears);

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

	}

	public void finalTotalBillCalucalated() {
		finalTotalbill = totalPrice + hstCalucalted;

	}

}
