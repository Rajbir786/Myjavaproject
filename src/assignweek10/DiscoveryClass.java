package assignweek10;

public class DiscoveryClass extends CruiseDetails {
	String customereply = "";
	double totalAdditionalservicecharges = 0;

	DiscoveryClass(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years) {
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;

	}

	protected double discoveryselectedAdditionalService() {
		System.out.println(
				"Discovery cruise has additional service of Adventure Games  only for adults, would you like to book it? yes or no,it will be charged $20per person.");
		customereply = sc.nextLine();
		if (customereply.equals("yes")) {
			totalAdditionalservicecharges = (50 * numberOfAdults);

		} else {
			totalAdditionalservicecharges = 0;
		}
		return totalAdditionalservicecharges;

	}
}
