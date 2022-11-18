package assignweek10UPDATED;

public class ScenicClass extends CruiseDetails {

	ScenicClass(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years) {
		// Constructor to initialize variables
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;

	}

	
	private double totalAdditionalservicecharges = 0;

	protected double scenicselectedAdditionalService() {

		System.out.println(
				"scenic cruise has additional service of spa (only for adults)would you like to book it? yes or no,it will be charged $50 per person.");
		 String customereply = sc.nextLine();
		if (customereply.equals("yes")) {
			totalAdditionalservicecharges = (50 * numberOfAdults);

		} else {
			totalAdditionalservicecharges = 0;
		}

		return totalAdditionalservicecharges;

	}

}
