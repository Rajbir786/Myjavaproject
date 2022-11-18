package assignweek10UPDATED1;

public class SunsetClass extends CruiseDetails {
public SunsetClass() {
		super("Sunset Cruise", 1, 52.99, 15.99,45);
		
	}

protected double AdditionalService() {

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
