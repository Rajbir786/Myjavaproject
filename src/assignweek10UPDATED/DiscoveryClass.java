package assignweek10UPDATED;

public class DiscoveryClass extends CruiseDetails {
	private double totalAdditionalservicecharges = 0;

	DiscoveryClass(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years) {
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;

	}

	public double discoveryselectedAdditionalService() {
		System.out.println(
				"Discovery cruise has additional service of Adventure Games  only for adults, would you like to book it? yes or no,it will be charged $20per person.");
		String customereply = sc.nextLine();
		if (customereply.equals("yes")) {
			totalAdditionalservicecharges = (20 * numberOfAdults);

		} else {
			totalAdditionalservicecharges = 0;
		}
		return totalAdditionalservicecharges;
	}
}
