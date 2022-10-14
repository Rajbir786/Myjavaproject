package AssignmentWeek6;//Question1 Class2

import java.util.Scanner;

public class MonthlyPlans {

	String monthlyPlan[] = { "Rogers", "Bell", "Telus" };
	int monthlyCharges = 0;
	Scanner scn = new Scanner(System.in);

	public int monthlyPlanCharges() {
		System.out.println("We have three types of monthly plans");

		System.out.println("Rogers,  " + "Telus,  " + "Bell,  ");

		String customerSelectedPlan = scn.next();
		switch (customerSelectedPlan) {

		case "Rogers":
			monthlyCharges = monthlyCharges + 70;
			System.out.println("Rogers has monthlyplan in" + monthlyCharges);
			break;
		case "Telus":
			monthlyCharges = monthlyCharges + 75;
			System.out.println("Telus has monthlyplan in" + monthlyCharges);
			break;

		case "Bell":
			monthlyCharges = monthlyCharges + 80;
			System.out.println("Bell has monthlyplan in" + monthlyCharges);
			break;

		default:
			System.out.println("Please select only from above given list of monthly plans" + monthlyCharges);

		}
		return (monthlyCharges);
	}

}
