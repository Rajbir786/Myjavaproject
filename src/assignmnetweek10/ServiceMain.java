package assignmnetweek10;

import java.util.Scanner;

public class ServiceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CruiseClass scenicruise = new CruiseClass("Scenic Cruise", 3, 43.99, 12.99);
		CruiseClass sunstcruise = new CruiseClass("SunSet Cruise", 1, 52.99, 15.99);
		CruiseClass discvrycruise = new CruiseClass("Discovery Cruise", 4, 39.99, 9.99);
		CruiseClass mystrycruise = new CruiseClass("Mystery Cruise", 2, 45.99, 12.99);
		CruiseClass cruiseDetails[] = { scenicruise, sunstcruise, discvrycruise, mystrycruise };
		int numOfAttempts=0;
		String selectedCruise;
	String	customerreplyforbuffet="";
		
		int numOfAttemptsforBuffetSelect = 0;
		int numberOfAdults = 0;
		int numberOfChildrenMoreThanFiveYears = 0;
		String selctedAlphabetToConfirm = "";
		int index = 0;
		int inputCustomerEntered;

		int j;

		System.out.println("please  signup to book a service");
		UserDetailClass udtl=new UserDetailClass();
	
        udtl.setEmail();
		 udtl.setPassword();
		 udtl.setPhoneNum();
		 udtl.setName();
		
		 System.out.println("Thank you for registering!");
	        System.out.println("Please enter the service you want to book Hotel Stay/ Cruise");
			String serviceSelc=sc.nextLine();
			while(!(serviceSelc.equalsIgnoreCase("Hotel Stay")||serviceSelc.equalsIgnoreCase("Cruise"))) {
				
				numOfAttempts++;
				if (numOfAttempts > 2) {
					System.out.println("You have entered more than 3 times invalid entry");
							
					System.exit(0);
				}
				System.out.println("you have selected invalid entry.please select Hotel Stay/ Cruise");
				serviceSelc = sc.nextLine();
			}
		
if(serviceSelc.equalsIgnoreCase("Hotel Stay")){
	
	HotelBooking hbook=new HotelBooking ();
	hbook.totalNoOfUser();
	hbook.roomSelection();
    hbook.priceHotelStay();
	hbook.lunchSelectionHotel();
	hbook.priceHotelLunchforadults();
	hbook.priceHotelLunchforChildren();
	hbook.totalPricewithlunchprice();
	hbook.taxCalucaltion();
	hbook.calFinalPrice();
	hbook. displayFinal();
	
	
	
}
if(serviceSelc.equalsIgnoreCase("Cruise")) {
	System.out.println("We have Four types of cruise availabale\n");
	System.out.println("Please enter the cruise that you want to select?");
	do {
		for (j = 0; j < cruiseDetails.length; j++) {

			System.out.println(cruiseDetails[j].cruiseName);
		}

		selectedCruise = sc.nextLine();
		while (!(selectedCruise.equals("Scenic Cruise") || selectedCruise.equals("SunSet Cruise")
				|| selectedCruise.equals("Discovery Cruise") || selectedCruise.equals("Mystery Cruise")))// loop to
																											// handle
																											// invalid
																											// entry
																											// o //
																											// cruisename

		{
			numOfAttempts++;
			if (numOfAttempts > 2) {
				System.out.println("You have entered more than 3 times invalid cruise name");
				System.exit(0);
			}
			System.out.println("you have entered invalid cruise name ,please select from list given above only");
			selectedCruise = sc.nextLine();

		}

		for (int i = 0; i < cruiseDetails.length; i++) {

			if (selectedCruise.equals(cruiseDetails[i].cruiseName)) {

				System.out.println("The cruise that you have selected is " + selectedCruise + "which is a         "
						+ cruiseDetails[i].noOfDays + "day cruise");
				System.out.println("The cruise that you have selected is " + selectedCruise
						+ " price for Adults(greater than 12)       " + cruiseDetails[i].priceForAdult + "per day");
				System.out.println("The cruise that you have selected is " + selectedCruise
						+ " price for children(above 5)     " + cruiseDetails[i].priceForChildrenMoreThanFiveYears
						+ "per day");
				index = i;

				break;

			}

		}

		System.out.println(
				"Please press Y if you want to continue with the selction or press any other alaphabet to select another");

		selctedAlphabetToConfirm = sc.next();

	}

	while (!(selctedAlphabetToConfirm.equalsIgnoreCase("Y")));

	sunstcruise .totalNoOfUser();
	
	
	System.out.println(
			"All our cruises have food service on board.Do you want to pre book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids,please type yes or no?");
	 customerreplyforbuffet = sc.next();

	while (!(customerreplyforbuffet.equalsIgnoreCase("yes") || customerreplyforbuffet.equalsIgnoreCase("no"))) {
		System.out.println("invalid response please type yes or no");

		customerreplyforbuffet = sc.next();
		numOfAttemptsforBuffetSelect++;
		if (numOfAttemptsforBuffetSelect > 2) {
			System.out.println("You have entered more than 3 times invalid response");
			System.exit(0);
		}

	}
	if ((selectedCruise.equals(cruiseDetails[index].cruiseName))) {
		
		
		
			cruiseDetails[index].
			cruiseDetails[index].cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);
			cruiseDetails[index].buffetPricingForAdults(numberOfAdults);
			cruiseDetails[index].buffetPricingForChildrenmoreThanFive(numberOfChildrenMoreThanFiveYears);
			cruiseDetails[index].totalPricewithbuffetprice();
			cruiseDetails[index].hstCalucalte();
			cruiseDetails[index].finalTotalBillCalucalated();
			cruiseDetails[index].displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

		}

		else if (customerreplyforbuffet.equals("no")) {
			cruiseDetails[index].cruisePricingForAdults(numberOfAdults);
			cruiseDetails[index].cruisePricingForChildren(numberOfChildrenMoreThanFiveYears);

			cruiseDetails[index].totalPricewithoutMeal();
			cruiseDetails[index].hstCalucalte();
			cruiseDetails[index].finalTotalBillCalucalated();
			cruiseDetails[index].displayFinal(numberOfAdults, numberOfChildrenMoreThanFiveYears);

		}

	}
	
	
}
	

	}




	}


