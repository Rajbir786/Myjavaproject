package assignweek10UPDATED;

public class MysteryClass extends CruiseDetails {
	private double totalAdditionalservicecharges = 0;

	MysteryClass(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years) {
		
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;

	}

	protected double mysteryselectedAdditionalService() {

		System.out.println(
				"Mystery cruise has additional service of casino(only for adults) would you like to book it? yes or no,it will be charged $20per person.");
		 String customereply = sc.nextLine();
		if (customereply.equals("yes")) {
			totalAdditionalservicecharges = (20 * numberOfAdults);

		} else {
			totalAdditionalservicecharges = 0;
		}
		return totalAdditionalservicecharges;
	}

}
