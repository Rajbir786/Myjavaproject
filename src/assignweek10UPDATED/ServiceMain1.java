package assignweek10UPDATED;

import java.util.Scanner;

public class ServiceMain1 {
	public static void main(String[] args) {
		ScenicClass scenic = new ScenicClass("Scenic Cruise", 3, 43.99, 12.99);
		SunsetClass sunst = new SunsetClass("SunSet Cruise", 1, 52.99, 15.99);
		DiscoveryClass dscvry = new DiscoveryClass("Discovery Cruise", 4, 39.99, 9.99);
		MysteryClass mystry = new MysteryClass("Mystery Cruise", 2, 45.99, 12.99);
		CruiseDetails cruiseDetails[] = { scenic, sunst, dscvry, mystry };
		DeluxeSuite dlxsuit = new DeluxeSuite("Delux Suite", 180);
		FamilySuite fmlysuit = new FamilySuite("Family Suite", 230);
		HotelBooking hbooking[] = { dlxsuit, fmlysuit };

		CruiseDetails crsdtl = new CruiseDetails();
		int numOfAttempt = 0;
		String customerreplyforanotherbooking = "";
		String selectedCruise = "";
		Scanner sc = new Scanner(System.in);
		UserDetails udtl = new UserDetails();
		double totalAdditionalservicecharges = 0;
		udtl.Signup();
		int i = 0;
		do {
			String selctedAlphabetToConfirm = "";
			System.out.println("Please enter the service you want to book  Hotel Stay/Cruise");
			String serviceSelc = sc.nextLine();
			while (!(serviceSelc.equalsIgnoreCase("Hotel Stay") || serviceSelc.equalsIgnoreCase("Cruise"))) {
				numOfAttempt++;
				if (numOfAttempt > 2) {
					System.out.println("You have entered more than 3 times invalid entry");

					System.exit(0);
				}
				System.out.println("you have selected invalid entry.please select Hotel Stay/Cruise");
				serviceSelc = sc.nextLine();

			}
			if (serviceSelc.equalsIgnoreCase("Cruise")) // if customer select cruise selction option
			{
				do {

					selectedCruise = crsdtl.cruiseSelction();
					for (int index = 0; index < cruiseDetails.length; index++) {

						if (selectedCruise.equalsIgnoreCase(cruiseDetails[i].cruiseName)) {

							System.out.println("The cruise that you have selected is " + selectedCruise
									+ "which is a         " + cruiseDetails[i].noOfDays + "day cruise");
							System.out.println("The cruise that you have selected is " + selectedCruise
									+ " price for Adults(greater than 12)       " + cruiseDetails[i].priceForAdult
									+ "per day");
							System.out.println("The cruise that you have selected is " + selectedCruise
									+ " price for children(above 5)     "
									+ cruiseDetails[i].priceForChildrenMoreThanFiveYears + "per day");
							i = index;
						}
						break;
					}
					System.out.println(
							"Please press Y if you want to continue with the selction or press any other alaphabet to select another");

					selctedAlphabetToConfirm = sc.next();

				}

				while (!(selctedAlphabetToConfirm.equalsIgnoreCase("Y")));

				cruiseDetails[i].totalNoOfUser();

				switch (selectedCruise) {
				case "Scenic Cruise":
					totalAdditionalservicecharges = scenic.scenicselectedAdditionalService();
					break;
				case "Sunset Cruise":
					totalAdditionalservicecharges = sunst.sunsetselectedAdditionalService();
					break;
				case "Discovery Cruise":
					totalAdditionalservicecharges = dscvry.discoveryselectedAdditionalService();
					break;
				case "Mystery Cruise":
					totalAdditionalservicecharges = mystry.mysteryselectedAdditionalService();
					break;
				default:
					System.out.println("invalid input");
					break;
				}

				if (selectedCruise.equals(cruiseDetails[i].cruiseName)) {
					cruiseDetails[i].cruisePricingForAdults();
					cruiseDetails[i].cruisePricingForChildren();
					cruiseDetails[i].buffetSelectionCruise();
					cruiseDetails[i].buffetPricingForAdults();
					cruiseDetails[i].buffetPricingForChildrenmoreThanFive();
					cruiseDetails[i].totalPricewithbuffetprice(totalAdditionalservicecharges);
					cruiseDetails[i].hstCalucalte();
					cruiseDetails[i].finalTotalBillCalucalated();
					cruiseDetails[i].displayFinal(totalAdditionalservicecharges);

				}
			}

			if (serviceSelc.equalsIgnoreCase("Hotel Stay")) {
				HotelBooking hbook = new HotelBooking();
				String roomSelected = hbook.roomSelection();

				for (int j = 0; j <= hbooking.length; j++) {
					if (roomSelected.equals("Delux Suite") || roomSelected.equals("Family Suite")) {
						hbooking[j].totalNoOfUser1();
						double priceHotelStay = hbooking[j].priceHotelStay1();
						hbooking[j].lunchSelectionHotel();
						double priceHotelLunchforadults = hbooking[j].priceHotelLunchforadults();
						double priceHotelLunchforChildren = hbooking[j].priceHotelLunchforChildren();
						double totalPrice = hbooking[j].totalPricewithlunchprice(priceHotelStay,
								priceHotelLunchforadults, priceHotelLunchforChildren);
						double taxCalucaltion = hbooking[j].taxCalucaltion(totalPrice);
						double finalTotalbill = hbooking[j].calFinalPrice(taxCalucaltion, totalPrice);
						hbooking[j].displayFinal(priceHotelStay, roomSelected, priceHotelLunchforadults,
								priceHotelLunchforChildren, totalPrice, taxCalucaltion, finalTotalbill);

					}
					break;

				}
			}
			System.out.println("Do you want to book another Hotel Room or Cruise");
			System.out.println("Please enter y if you want to continue");
			System.out.println("You can enjoy more services");
			customerreplyforanotherbooking = sc.nextLine();

		} while (customerreplyforanotherbooking.equalsIgnoreCase("y"));

	}
}
