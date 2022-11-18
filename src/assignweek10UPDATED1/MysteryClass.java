package assignweek10UPDATED1;

public class MysteryClass extends CruiseDetails {
	public MysteryClass() {
		super("Mystery Cruise", 2, 45.99, 12.99,20);
		
	}



	private double totalAdditionalservicecharges = 0;

	

	protected double AdditionalService() {

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
