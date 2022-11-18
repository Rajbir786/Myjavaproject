package assignweek10;

public class MysteryClass extends CruiseDetails {
	double totalAdditionalservicecharges = 0;
	String customereply = "";

	MysteryClass(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years) {
		// Constructor to initialize variables
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;

	}

	public void mysteryselectedDisplayInfo() {

		System.out.println(
				"The cruise that you have selected is " + cruiseName + "which is a         " + noOfDays + "day cruise");
		System.out.println("The cruise that you have selected is " + cruiseName
				+ " price for Adults(greater than 12)       " + priceForAdult + "per day");
		System.out.println("The cruise that you have selected is " + cruiseName + " price for children(above 5)     "
				+ priceForChildrenMoreThanFiveYears + "per day");

	}

	

	public double mysteryselectedAdditionalService() {

		System.out.println(
				"Mystery cruise has additional service of casino(only for adults) would you like to book it? yes or no,it will be charged $20per person.");
		customereply = sc.nextLine();
		if (customereply.equals("yes")) {
			totalAdditionalservicecharges = (20 * numberOfAdults);

		} else {
			totalAdditionalservicecharges = 0;
		}
		return totalAdditionalservicecharges;
	}



	public void totalPricewithbuffetprice() {
		totalPrice = priceOfCruiseForAdults + priceOfCruiseForChildrenmoreThanFive + buffetPriceForAdults
				+ buffetPriceForChildrenmoreThanFive + totalAdditionalservicecharges;

	}

	public void finalTotalBillCalucalated() {
		finalTotalbill = totalPrice + hstCalucalted;

	}

}
