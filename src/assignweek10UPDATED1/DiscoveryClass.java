package assignweek10UPDATED1;

public class DiscoveryClass extends CruiseDetails {
	
	public DiscoveryClass() {
		super("Discovery Cruise", 4, 39.99, 9.99,20);
		
	}
	private double totalAdditionalservicecharges = 0;
	
    public double AdditionalService() {
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
