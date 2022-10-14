package asign6;

import java.util.Scanner;

public class BrandSelectMobile {

	Scanner scn = new Scanner(System.in);
	String customerSelectedBrand = "";
	String customerSelectedModel = "";
	int numAttemptsForBrand = 0;
	int numAttemptsForModel = 0;
	String customerSelectedPlan;
	int numAttemptsForPlan = 0;

	int monthlyPlanCharges = 0;
	int phoneTabPrice = 0;

	public String mobBrandSelected() {

		customerSelectedBrand = scn.next();
		while (!(customerSelectedBrand.equals("Apple") || customerSelectedBrand.equals("Samsung"))) {

			System.out.println("invalid selection of Brand pls try again");
			customerSelectedBrand = scn.next();
			numAttemptsForBrand++;
			if (numAttemptsForBrand > 2) {
				System.out.println("You already entered 3 wrong attampts");
				System.exit(0);
			}

		}

		return (customerSelectedBrand);

	}

	public String mobModelSelect() {

		if (customerSelectedBrand.equals("Samsung")) {
			System.out.println("Follwing is list of Samsung Models");
			System.out.println("S22,  " + "S22+,  " + "S22Ultra,   " + "S22FE,   ");
			System.out.println("Enter model would you like to buy?");
			customerSelectedModel = scn.next();
			while (!(customerSelectedModel.equals("S22") || customerSelectedModel.equals("S22+")
					|| customerSelectedModel.equals("S22Ultra") || customerSelectedModel.equals("S22FE"))) {

				System.out.println("Wrong model of Samsung try again");
				customerSelectedModel = scn.next();
				numAttemptsForModel++;
				if (numAttemptsForModel > 2) {
					System.out.println("You already entered 3 wrong attampts");
					System.exit(0);
				}

			}
		}

		else if (customerSelectedBrand.equals("Apple")) {
			System.out.println("Follwing is list of Apple Models");
			System.out.println("IPhone14,  " + "IPhone14pro,  " + "IPhone14promax,   " + "IPhone14mini,   ");

			System.out.println("Enter model would you like to buy?");
			customerSelectedModel = scn.next();
			while (!(customerSelectedModel.equals("IPhone14") || customerSelectedModel.equals("IPhone14pro")
					|| customerSelectedModel.equals("IPhone14promax")
					|| customerSelectedModel.equals("IPhone14mini"))) {

				System.out.println("Wrong model of Apple try again");
				customerSelectedModel = scn.next();
				numAttemptsForModel++;
				if (numAttemptsForModel > 2) {
					System.out.println("You already entered 3 wrong attampts");
					System.exit(0);
				}
			}

		}

		return (customerSelectedModel);
	}

	public String monthlyPlanSelect() {
		System.out.println("We have three types of monthly plans");

		System.out.println("Rogers,  " + "Telus,  " + "Bell,  ");
		customerSelectedPlan = scn.next();

		while (!(customerSelectedPlan.equals("Rogers") || customerSelectedPlan.equals("Telus")
				|| customerSelectedPlan.equals("Bell"))) {

			System.out.println("Please select only from above given list of monthly plans");
			customerSelectedPlan = scn.next();

			numAttemptsForPlan++;
			if (numAttemptsForPlan > 2) {
				System.out.println("You already entered 3 wrong attampts");
				System.exit(0);

			}
		}

		return (customerSelectedPlan);
	}

	public int priceOfTab() {
		switch (customerSelectedModel) {
		case "IPhone14":
			phoneTabPrice = 30;
			System.out.println("This phone tab's price is" + phoneTabPrice);
			break;
		case "IPhone14pro":
			phoneTabPrice = 40;
			System.out.println("This phone tab's price is" + phoneTabPrice);
			break;
		case "IPhone14promax":
			phoneTabPrice = 65;
			System.out.println("This phone tab's price is" + phoneTabPrice);
			break;
		case "IPhone14mini":
			phoneTabPrice = 25;
			System.out.println("This phone tab's price is" + phoneTabPrice);
			break;
		case "S22":
			phoneTabPrice = 25;
			System.out.println("This phone tab's price is" + phoneTabPrice);
			break;
		case "S22+":
			phoneTabPrice = 35;
			System.out.println("This phone tab's price is" + phoneTabPrice);
			break;
		case "S22Ultra":
			phoneTabPrice = 55;
			System.out.println("This phone tab's price is" + phoneTabPrice);
			break;
		case "S22FE":
			phoneTabPrice = 20;
			System.out.println("This phone tab's price is" + phoneTabPrice);
			break;

		default:
			System.out.println("invalid type of model select again");
			break;

		}

		return (phoneTabPrice);
	}

	public int planChargesMonthly() {
 if(customerSelectedPlan .equals("Rogers")) 
 {
 				
 	monthlyPlanCharges =  70;
 				System.out.println("Rogers has monthlyplan in" +monthlyPlanCharges);
 			}
 				else if(customerSelectedPlan.equals("Telus"))
 				{
 					monthlyPlanCharges =  80;
 				System.out.println("Telus has monthlyplan in" + monthlyPlanCharges);
 			}

 				else if(customerSelectedPlan.equals( "Bell")) {
 				monthlyPlanCharges = monthlyPlanCharges + 75;
 				System.out.println("Bell has monthlyplan in" + monthlyPlanCharges);
 				}
 return(monthlyPlanCharges);
}}
