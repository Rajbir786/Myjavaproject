package AssignmentWeek6;

import java.util.Scanner;

public class AdaptabilityScore {
	String relativePrAndCit = "yes";
	String stuInCan = "yes";
	String workInCan = "yes";
	int relativePrAndCitiPoint = 0;
	int studyCanadaPoint = 0;
	int workCanadaPoint = 0;
	Scanner scn = new Scanner(System.in);

	public int relativePrAndCiti() {

		System.out.println("Do you have relatives in Canada/n"
				+ "Parents,Grandparents,Brother,Sister,Aunt,Uncle,Nephew,or Niece/n)"
				+ "who is Canadian Citizen or PR holder?");
		String relativePrAndCitir = scn.next();
		if (relativePrAndCit.equals(relativePrAndCitir)) {
			relativePrAndCitiPoint = 5;
		} else {
			relativePrAndCitiPoint = 0;
		}

		return (relativePrAndCitiPoint);
	}

	public int studyCanada() {
		System.out.println("Do you have atleast 2 years study in Canada?");
		String studyCanada2Yearsr = scn.next();
		if (stuInCan.equals(studyCanada2Yearsr)) {
			studyCanadaPoint = 5;
		} else {
			studyCanadaPoint = 0;
		}
		return (studyCanadaPoint);
	}

	public int workCand() {
		System.out.println("Do you have atleast 1 year work in Canada with NOC 0,A,B?");
		String workCand1Year = scn.next();
		if (workInCan.equals(workCand1Year)) {
			workCanadaPoint = 10;
		} else {
			workCanadaPoint = 0;
		}
		return (workCanadaPoint);
	}
}