package assignweek10UPDATED;

public class SunsetClass extends CruiseDetails {

	private double totalAdditionalservicecharges = 0;

	SunsetClass(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years) {
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;

	}

	protected double sunsetselectedAdditionalService() {

		System.out.println(
				"sunset cruise has additional service of candle light dinner would you like to book it? yes or no,it will be charged $45 per person.");
		String customereply = sc.nextLine();
		if (customereply.equals("yes")) {
			totalAdditionalservicecharges = (45 * numberOfAdults);

		} else {
			totalAdditionalservicecharges = 0;
		}
		return totalAdditionalservicecharges;

	}

}
