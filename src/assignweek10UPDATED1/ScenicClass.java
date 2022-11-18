package assignweek10UPDATED1;

public class ScenicClass extends CruiseDetails {
public ScenicClass() {
		super("Scenic Cruise", 3, 43.99, 12.99,50);
	}

	private double totalAdditionalservicecharges = 0;

	protected double AdditionalService() {

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
