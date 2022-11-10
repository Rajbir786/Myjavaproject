package assignweek10;

import java.util.Scanner;

public class ServiceMain1 {

	public static void main(String[] args) {
		ScenicClass scenic = new ScenicClass("Scenic Cruise", 3, 43.99, 12.99);
		SunsetClass sunst = new SunsetClass("SunSet Cruise", 1, 52.99, 15.99);
		DiscoveryClass dscvry = new DiscoveryClass("Discovery Cruise", 4, 39.99, 9.99);
		MysteryClass mystry = new MysteryClass("Mystery Cruise", 2, 45.99, 12.99);

		int numOfAttempts = 0;
		Scanner sc = new Scanner(System.in);
		String selectedCruise = "";
		String selctedAlphabetToConfirm = "";
		String customerreplyforanotherbooking = "";

		System.out.println("please  signup to book a service");// registration service
		UserDetails udtl = new UserDetails();
		udtl.setEmail();
		udtl.setPassword();
		udtl.setPhoneNum();
		udtl.setName();

		System.out.println("Thank you for registering!");

		do {

			System.out.println("Please enter the service you want to book  Cruise/Hotel Stay");
			String serviceSelc = sc.nextLine();
			while (!(serviceSelc.equalsIgnoreCase("Hotel Stay") || serviceSelc.equalsIgnoreCase("Cruise")))// invalidation
																											// handling
																											// for wrong
																											// entry
			{

				numOfAttempts++;
				if (numOfAttempts > 2) {
					System.out.println("You have entered more than 3 times invalid entry");

					System.exit(0);
				}
				System.out.println("you have selected invalid entry.please select Hotel Stay/Cruise");
				serviceSelc = sc.nextLine();

			}
			if (serviceSelc.equalsIgnoreCase("Cruise")) // if customer select cruise selction option
			{
				do {

					System.out.println("We have Four types of cruise availabale");
					System.out.println("Please enter the cruise that you want to select?\n" + "Scenic Cruise\n"
							+ "SunSet Cruise\n" + "Discovery Cruise\n" + "Mystery Cruise");
					selectedCruise = sc.nextLine();
					while (!(selectedCruise.equals("Scenic Cruise") || selectedCruise.equals("SunSet Cruise")
							|| selectedCruise.equals("Discovery Cruise") || selectedCruise.equals("Mystery Cruise")))

					{
						numOfAttempts++;
						if (numOfAttempts > 2) {
							System.out.println("You have entered more than 3 times invalid cruise name");
							System.exit(0);
						}
						System.out.println(
								"you have entered invalid cruise name ,please select from list given above only");
						selectedCruise = sc.nextLine();

					}

					if (selectedCruise.equalsIgnoreCase("Scenic Cruise")) {
						scenic.scenicselectedDisplayInfo();
					} else if ((selectedCruise.equalsIgnoreCase("Sunset Cruise"))) {
						sunst.sunsetselectedDisplayInfo();

					} else if ((selectedCruise.equalsIgnoreCase("Discovery Cruise"))) {
						dscvry.discoveryselectedDisplayInfo();

					} else if ((selectedCruise.equalsIgnoreCase("Mystery Cruise"))) {
						mystry.mysteryselectedDisplayInfo();

					}

					System.out.println(
							"Please press y if you want to continue with the selction or press any other alaphabet to select another");

					selctedAlphabetToConfirm = sc.next();// confirmation of cruise by entering y

				}

				while (!(selctedAlphabetToConfirm.equalsIgnoreCase("y")));
//calling of methods based on types of cruise selection by particular cruise's object
				switch (selectedCruise) {

				case "Scenic Cruise":

					scenic.totalNoOfUser();
					scenic.scenicselectedAdditionalService();
					scenic.cruisePricingForAdults();
					scenic.cruisePricingForChildren();
					scenic.buffetSelectionCruise();

					scenic.buffetPricingForAdults();
					scenic.buffetPricingForChildrenmoreThanFive();

					scenic.totalPricewithbuffetprice();
					scenic.hstCalucalte();
					scenic.finalTotalBillCalucalated();
					scenic.displayFinal();
					break;

				case "Sunset Cruise":

					sunst.totalNoOfUser();
					sunst.sunsetselectedAdditionalService();
					sunst.cruisePricingForAdults();
					sunst.cruisePricingForChildren();
					sunst.buffetSelectionCruise();

					sunst.buffetPricingForAdults();
					sunst.buffetPricingForChildrenmoreThanFive();

					sunst.totalPricewithbuffetprice();
					sunst.hstCalucalte();
					sunst.finalTotalBillCalucalated();
					sunst.displayFinal();
					break;
				case "Discovery Cruise":

					dscvry.totalNoOfUser();
					dscvry.discoveryselectedAdditionalService();
					dscvry.cruisePricingForAdults();
					dscvry.cruisePricingForChildren();
					dscvry.buffetSelectionCruise();

					dscvry.buffetPricingForAdults();
					dscvry.buffetPricingForChildrenmoreThanFive();

					dscvry.totalPricewithbuffetprice();
					dscvry.hstCalucalte();
					dscvry.finalTotalBillCalucalated();
					dscvry.displayFinal();
					break;
				case "Mystery Cruise":

					mystry.totalNoOfUser();
					mystry.mysteryselectedAdditionalService();
					mystry.cruisePricingForAdults();
					mystry.cruisePricingForChildren();
					mystry.buffetSelectionCruise();
					mystry.buffetPricingForAdults();
					mystry.buffetPricingForChildrenmoreThanFive();

					mystry.totalPricewithbuffetprice();
					mystry.hstCalucalte();
					mystry.finalTotalBillCalucalated();
					mystry.displayFinal();
					break;
				default:
					System.out.println(
							"\"you have entered invalid cruise name ,please select from list given above only");
				}
			}

			if (serviceSelc.equalsIgnoreCase("Hotel Stay"))// if customer selcted hotel stay option
			{

				HotelBooking hbook = new HotelBooking();
				String roomSelected = hbook.roomSelection();// selection of room
//calling of methods from selcted room's class by its object
				if (roomSelected.equalsIgnoreCase("Delux Suite")) {
					DeluxeSuite dlxsuit = new DeluxeSuite();

					dlxsuit.totalNoOfUser1();

					while ((dlxsuit.numberOfAdults > 2) || (dlxsuit.totalNumOFChildren > 2))// check selcted room can
																							// accomodate total number
																							// of guests or not
					{
						System.out.println(
								"room is not suitable for the number of guests please select again or select separate rooms one at a time. ");
						roomSelected = hbook.roomSelection();
						dlxsuit.totalNoOfUser1();
					}
					dlxsuit.priceHotelStay();
					dlxsuit.lunchSelectionHotel();
					dlxsuit.priceHotelLunchforadults();
					dlxsuit.priceHotelLunchforChildren();
					dlxsuit.totalPricewithlunchprice();
					dlxsuit.taxCalucaltion();
					dlxsuit.calFinalPrice();
					dlxsuit.displayFinal();

				}
				if (roomSelected.equalsIgnoreCase("Family Suite")) {

					FamilySuite fmlysuit = new FamilySuite();
					fmlysuit.totalNoOfUser1();

					while ((fmlysuit.numberOfAdults > 4) || (fmlysuit.totalNumOFChildren > 4)) {

						System.out.println(
								"This room is not suitable for the number of guests please select again or select separate rooms one at a time. ");
						roomSelected = hbook.roomSelection();
						fmlysuit.totalNoOfUser1();
					}

					fmlysuit.priceHotelStay();
					fmlysuit.lunchSelectionHotel();
					fmlysuit.priceHotelLunchforadults();
					fmlysuit.priceHotelLunchforChildren();
					fmlysuit.totalPricewithlunchprice();
					fmlysuit.taxCalucaltion();
					fmlysuit.calFinalPrice();
					fmlysuit.displayFinal();

				}

			}

			System.out.println("Do you want to book another Hotel Room or Cruise");// if guest want to select again any
																					// service then type y

			System.out.println("Please enter y if you want to continue");

			customerreplyforanotherbooking = sc.nextLine();
			// System.out.println("You can enjoy more services");
			customerreplyforanotherbooking = sc.nextLine();
		} while (customerreplyforanotherbooking.equalsIgnoreCase("y"));

	}

}