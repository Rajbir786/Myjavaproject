package asign6;

import java.util.Scanner;

import AssignmentWeek6.MobileOsBrandSelection;
import AssignmentWeek6.MonthlyPlans;

public class MobiBrandSelec {

	public static void main(String[] args) {
		
		System.out.println("*Welcome to Mobile Shop*");
		Scanner scn = new Scanner(System.in);
		MobileOsBrandSelection mBrndSel = new MobileOsBrandSelection();
		String customerSelectedPhone = mBrndSel.mobBrandSel();
		System.out.println("customer selected"+customerSelectedPhone);
		System.out.println("Please enter which model of Apple do you like? ");
		
		System.out.println("Follwing is list of Apple phones?");

		System.out.println("IPhone14,  " + "IPhone14pro,  " + "IPhone14promax,   " + "IPhone14mini,   ");
	   String	customerSelectedModelofPhone1  = scn.next();

		int phoneTabPrice = 0;

		switch (customerSelectedModelofPhone1) {
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

		System.out.println("Which monthly plan would you prefer?");
		MonthlyPlans mp = new MonthlyPlans();
		int monthlyCharges = mp.monthlyPlanCharges();

		int totalMonthlyCharges = monthlyCharges + phoneTabPrice;
		System.out.println("Total Monthly amount is" + totalMonthlyCharges);
	}

}

