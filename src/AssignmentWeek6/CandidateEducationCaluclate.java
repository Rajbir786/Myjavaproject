package AssignmentWeek6;

import java.util.Scanner;

public class CandidateEducationCaluclate {
	Scanner scn = new Scanner(System.in);

	public int canEduPoint() {
		int eduPoints = 0;
		String eduLevel[] = { "PhD", "Master’s Degree", "Two or more university degrees",
				"diplomas at the bachelor’s level one of which is a three year or longer duration", "12th",
				"Three Years or longer Degree", "Three Years or longer Diploma" };
		System.out.println("here is list of education you can selct education ");
		System.out.println("PhD\n" + "Master’s Degree\n"
				+ "Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration\n"
				+ "12th+Three Years or longer Degree\n" + "12th+Three Years or longer Diploma\n");

		System.out.println("Please enter your education");

		String eduLevelSelected = scn.nextLine();
		switch (eduLevelSelected) {
		case ("PhD"):
			eduPoints = 25;

			break;
		case ("Master’s Degree"):
			eduPoints = 23;
			break;
		case ("Two or more university degrees"):
			eduPoints = 22;

			break;
		case ("diplomas at the bachelor’s level one of which is a three year or longer duration"):
			eduPoints = 22;
			break;

		case ("12th+Three Years or longer Degree"):
			eduPoints = 21;
			break;
		case ("12th+Three Years or longer Diploma"):
			eduPoints = 21;

			break;

		default:
			System.out.println("invalid entry");
			System.exit(0);

		}
		return (eduPoints);
	}

	public int canExpPoints() {
		int exPoints = 0;
		System.out.println("Please enter your experience in years");

		int expLevelSelected = scn.nextInt();
		if (expLevelSelected == 4 || expLevelSelected == 5) {
			exPoints = 13;

		} else if (expLevelSelected >= 6) {
			exPoints = 15;
		} else {
			System.out.println("Minimum 4 years experience is required");
			System.exit(0);
		}

		return (exPoints);
	}

	public int canAgePoints() {
		int agePoints = 0;
		System.out.println("Please enter your age.");
		int ageSelected = scn.nextInt();

		if (ageSelected >= 18 && ageSelected <= 35) {

			agePoints = 12;

		} else if (ageSelected == 36) {
			agePoints = 11;
		} else if (ageSelected == 37) {
			agePoints = 10;
		} else if (ageSelected == 38) {
			agePoints = 9;
		} else if (ageSelected == 39) {
			agePoints = 8;
		} else if (ageSelected == 40) {
			agePoints = 7;
		} else if (ageSelected == 41) {
			agePoints = 6;
		} else if (ageSelected == 42) {
			agePoints = 5;
		} else if (ageSelected == 43) {
			agePoints = 4;
		} else if (ageSelected == 44) {
			agePoints = 3;
		} else if (ageSelected == 45) {
			agePoints = 2;
		} else if (ageSelected == 46) {
			agePoints = 1;
		} else if (ageSelected == 47) {
			agePoints = 0;
		} else {

			System.out.println("Age should be in between 18-46 to get score" + agePoints);
			System.exit(0);
			System.out.println("try again");
		}

		return (agePoints);
	}
}
