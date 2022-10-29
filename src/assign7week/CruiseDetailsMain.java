package assign7week;

import java.util.Scanner;

import AssignmnetWeek7.CruiseDetails;

public class CruiseDetailsMain {

	public static void main(String[] args) {
		CruiseDetails scenicruise = new CruiseDetails("Scenic Cruise", 3, 43.99, 12.99);
		CruiseDetails sunstcruise = new CruiseDetails("SunSet Cruise", 1, 52.99, 15.99);
		CruiseDetails discvrycruise = new CruiseDetails("Discovery Cruise", 4, 39.99, 9.99);
		CruiseDetails mystrycruise = new CruiseDetails("Mystery Cruise", 2, 45.99, 12.99);
		String selectedCruise;
		int numOfAttempts = 0;
		int numOfAttemptsforBuffetSelect = 0;
		int numberOfAdults = 0;
		int numberOfChildrenMoreThanFiveYears = 0;
		String selctedAlphabetToConfirm = "";
		int index = 0;
		int numOfAttemptsforSignupSelect = 0;
		String reenteredPassword;
		String enteredPassword = "";
		String enteredEmail = "";

		long enteredPhonenum = 0;
		int i;

		Scanner sc = new Scanner(System.in);
		SignUp sup = new SignUp();

		CruiseDetails cruiseDetails[] = { scenicruise, sunstcruise, discvrycruise, mystrycruise };
		System.out.println("	Welcome to Cruise Website. please type signup to book a cruise");
		String customerSelectedSignup = sc.nextLine();
		while (!(customerSelectedSignup.equalsIgnoreCase("signup"))) {
			System.out.println("invalid response please type signup");
			customerSelectedSignup = sc.nextLine();

			if (numOfAttemptsforSignupSelect > 2) {
				System.out.println("You have entered more than 3 times invalid response");
				System.exit(0);
			}

		}
		if (customerSelectedSignup.equalsIgnoreCase("signup")) {

			System.out.println("Enter your name");
			String enteredname = sc.nextLine();
			if(enteredname.equals("")){
				System.out.println("Name field cannot be empty");
				System.exit(0);	
			}
			else {
				

			sup.setname(enteredname);
			sup.getname();
			}
			System.out.println("Enter your email  ");
			enteredEmail = sc.next();
			sup.setuserEmail(enteredEmail);

			System.out.println("Enter your PhoneNumber");
			enteredPhonenum = sc.nextLong();

			sup.setphoneNumber(enteredPhonenum);
			do {
				System.out.println("Enter your password");
				enteredPassword = sc.next();
				System.out.println("Please reenter your password");

				reenteredPassword = sc.next();
				if (enteredPassword.equals(reenteredPassword)) {
					sup.setpassword(enteredPassword);
				} else {
					System.out.println("Password does not match try Again");
				}
			} while (!(enteredPassword.equals(reenteredPassword)));
			System.out.println(enteredname + "has been registered,now you can sign-in to book your cruises");
		}
		System.out.println("Now you can  login");
		System.out.println("Enter your  registered Email");
		String enteredUsernameLogin = sc.next();
		System.out.println("Enter your password");
		String enteredPasswordForLogin = sc.next();

		sup.loginFunc(enteredUsernameLogin, enteredPasswordForLogin);
		System.out.println("We have Four types of cruise availabale\n");
		System.out.println("Please enter the cruise that you want to select?");
		do {
			for ( i = 0; i < cruiseDetails.length; i++) {

				System.out.println(cruiseDetails[i].cruiseName);
			}

			selectedCruise = sc.next();
			while (!selectedCruise.equals("Scenic Cruise")&&!selectedCruise.equals("SunSet Cruise")&&!selectedCruise.equals("Discovery Cruise ")&&!selectedCruise.equals("Mystery Cruise"))
																																																			
				{
				System.out.println("you have entered invalid cruise name ,please select from list given above only");
				selectedCruise = sc.nextLine();
				numOfAttempts++;
				if (numOfAttempts > 2) {
					System.out.println("You have entered more than 3 times invalid cruise name");
					System.exit(0);
				}
				
			}
			selectedCruise = sc.nextLine();
			for ( i = 0; i < cruiseDetails.length; i++) {

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

		System.out.println("Enter number of adults");
		numberOfAdults = sc.nextInt();
		System.out.println("Enter number of children");
		int totalNumOFChildren = sc.nextInt();
		int ageOfChildren[] = new int[totalNumOFChildren];
		if (totalNumOFChildren > 0) {
			for (int j = 0; j < totalNumOFChildren; j++) {
				System.out.println("Enter the age of child" + (j + 1));
				ageOfChildren[j] = sc.nextInt();

				if (ageOfChildren[j] > 5) {
					numberOfChildrenMoreThanFiveYears = numberOfChildrenMoreThanFiveYears + 1;

				}
			}
		}
		System.out.println(
				"All our cruises have food service on board.Do you want to pre book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids,please type yes or no?");
		String customerreplyforbuffet = sc.next();

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
			if (customerreplyforbuffet.equals("yes")) {
				cruiseDetails[index].cruisePricingForAdults(numberOfAdults);
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
		System.out.println(
				"Do you want to change your personal information.Press Y to change.Press any other alphabet to exit");
		String entryToChangeInfo = sc.next();
		if (entryToChangeInfo.equalsIgnoreCase("Y")) {
			System.out.println("Please enter the  number,that information you want to change.\n" + "1.password \n"
					+ "2.phonenumber \n" + "3.Email \n");
			int inputCustomerEntered = sc.nextInt();

			if (inputCustomerEntered == 1) {
				sup.setupdatePassword(enteredPassword);
			}
			if (inputCustomerEntered == 2)

			{
				sup.setUpdatePhonenum(enteredPhonenum);
			}
			if (inputCustomerEntered == 3) {
				sup.UpdateEmail(enteredEmail);
			}
		}

		else {
			System.exit(0);
			System.out.println("Thank you for using the service");
		}
		System.out.println("Thank you for using the service");

	}
}
