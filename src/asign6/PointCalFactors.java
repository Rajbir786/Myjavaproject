package asign6;

import java.util.Scanner;

public class PointCalFactors {

	Scanner scn = new Scanner(System.in);
	String eduLevelSelected;
	int numAttemptsForEdu = 0;
	int numAttemptsForExp = 0;
	int numAttemptsForAge = 0;
	int numAttemptsForRelatives = 0;
	int numAttemptsForStudyCan = 0;
	int numAttemptsForWorkCan = 0;
	String relativePrAndCit = "yes";
	String relativePrAndCitiN = "no";
	String stuInCan = "yes";
	String stuInCanN = "no";
	String workInCan = "yes";
	int relativePrAndCitiPoint = 0;
	int studyCanadaPoint = 0;
	int workCanadaPoint = 0;

	public int eduPoint() {
		int eduPoints = 0;

		System.out.println("here is list of education you can selct education ");
		System.out.println("PhD\n" + "Master’s Degree\n"
				+ "Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration\n"
				+ "12th+Three Years or longer Degree /Three Years or longer Diploma");

		System.out.println("Please enter your education");

		String eduLevelSelected = scn.nextLine();
		while (!(eduLevelSelected.equals("PhD") || eduLevelSelected.equals("Master’s Degree")
				|| eduLevelSelected.equals(
						"Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration")
				|| eduLevelSelected.equals("12th+Three Years or longer Degree /Three Years or longer Diploma"))) {
			numAttemptsForEdu++;

			if (numAttemptsForEdu > 2) {
				System.out.println("You already entered 3 times wrong");
				System.exit(0);
			}
			System.out.println("invalid entry");
			eduLevelSelected = scn.nextLine();

		}
		switch (eduLevelSelected) {
		case ("PhD"):
			eduPoints = 25;

			break;
		case ("Master’s Degree"):
			eduPoints = 23;
			break;
		case ("Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration"):

			eduPoints = 22;

			break;

		case ("12th+Three Years or longer Degree /Three Years or longer Diploma"):
			eduPoints = 21;
			break;

		default:

			System.out.println("invalid entry");

		}
		return (eduPoints);
	}

	public int expPoints() {
		int exPoints = 0;
		System.out.println("Please enter your experience in years");

		int expLevelSelected = scn.nextInt();
		while (!(expLevelSelected == 4 || expLevelSelected == 5 || expLevelSelected >= 6)) {

			numAttemptsForExp++;

			if (numAttemptsForExp > 2) {
				System.out.println("You already entered 3 times wrong");
				System.exit(0);
			}

			System.out.println("Minimum 4 years experience is required to get points");
			expLevelSelected = scn.nextInt();

		}
		if (expLevelSelected == 4 || expLevelSelected >= 5) {
			exPoints = 13;

		}
		if (expLevelSelected <= 6) {
			exPoints = 15;
		}

		return (exPoints);
	}

	public int agePoints() {
		int agePoints = 0;
		System.out.println("Please enter your age.");
		int ageSelected = scn.nextInt();
		while (ageSelected < 18 || ageSelected > 46) {

			numAttemptsForAge++;
			if (numAttemptsForAge > 2) {
				System.out.println("You already entered 3 times wrong");
				System.exit(0);
			}

			System.out.println("age should be in between 18-46 to get points");
			ageSelected = scn.nextInt();
		}

		if (ageSelected >= 18 && ageSelected <= 35) {

			agePoints = 12;

		} else {
			switch (ageSelected) {

			case (36):

				agePoints = 11;
				break;
			case (37):

				agePoints = 10;
				break;
			case (38):

				agePoints = 9;
				break;
			case (39):

				agePoints = 8;
				break;
			case (40):

				agePoints = 7;
				break;
			case (41):

				agePoints = 6;
				break;
			case (42):

				agePoints = 5;
				break;
			case (43):

				agePoints = 4;
				break;
			case (44):

				agePoints = 3;
				break;
			case (45):

				agePoints = 2;
				break;
			case (46):

				agePoints = 1;
				break;

			}
		}

		return (agePoints);
	}

	public int relativePrAndCiti() {

		System.out.println("Do you have relatives in Canada/n"
				+ "Parents,Grandparents,Brother,Sister,Aunt,Uncle,Nephew,or Niece/n)"
				+ "who is Canadian Citizen or PR holder?");
		String relativePrAndCitir = scn.next();
		while (!(relativePrAndCitir.equals("yes") || relativePrAndCitir.equals("no"))) {

			numAttemptsForRelatives++;

			if (numAttemptsForRelatives > 2) {
				System.out.println("You already entered 3 times wrong");
				System.exit(0);
			}

			System.out.println("Please enter either yes or no");
			relativePrAndCitir = scn.next();

		}

		if (relativePrAndCit.equals(relativePrAndCitir)) {
			relativePrAndCitiPoint = 5;
		}
		if (relativePrAndCitiN.equals(relativePrAndCitir)) {
			relativePrAndCitiPoint = 0;

		}

		return (relativePrAndCitiPoint);
	}

	public int studyCanada() {
		System.out.println("Do you have atleast 2 years study in Canada?");
		String studyCanada2Year = scn.next();
		while (!(studyCanada2Year.equals("yes") || studyCanada2Year.equals("no"))) {
			numAttemptsForStudyCan++;

			if (numAttemptsForStudyCan > 2) {
				System.out.println("You already entered 3 times wrong");
				System.exit(0);
			}

			System.out.println("You should type either yes or no");
			studyCanada2Year = scn.next();
		}
		if (studyCanada2Year.equals("yes")) {
			studyCanadaPoint = 5;
		}
		if (studyCanada2Year.equals("no")) {

			studyCanadaPoint = 0;

		}
		return (studyCanadaPoint);
	}

	public int workCand() {
		System.out.println("Do you have atleast 1 year work in Canada with NOC 0,A,B?");
		String workInCan = scn.next();
		while (!(workInCan.equals("yes") || workInCan.equals("no"))) {

			numAttemptsForWorkCan++;

			if (numAttemptsForWorkCan > 2) {
				System.out.println("You already entered 3 times wrong");
				System.exit(0);
			}

			System.out.println("You should type either yes or no");
			workInCan = scn.next();
		}
		if (workInCan.equals("yes")) {

			workCanadaPoint = 10;
		}
		if (workInCan.equals("no")) {
			workCanadaPoint = 0;

		}

		return (workCanadaPoint);

	}

}
