package AssignmentWeek6;//Question2 MainClass

public class CrsCaluclation {

	public static void main(String[] args) {
		System.out.println("Welcome to CRS Caluclator ");
		CandidateEducationCaluclate cEdCal = new CandidateEducationCaluclate();

		int eduPoints1 = cEdCal.canEduPoint();
//System.out.println("Candidate has education points"+eduPoints1);

		int exPoint1 = cEdCal.canExpPoints();
		// System.out.println("Candidate has experience points"+exPoint1);
		int agePoints = cEdCal.canAgePoints();
		// System.out.println("Candidate has age points"+agePoints1);

		IletsScore iScore = new IletsScore();
		int listeningPoints = iScore.listeningModule();
		// System.out.println("Your listening points are"+listeningPoints);

		int speakingPoints = iScore.speakingModule();
		// System.out.println("Your listening points are"+speakingPoints);
		int readingPoints = iScore.readingModule();
		// System.out.println("Your listening points are"+readingPoints);
		int writingPoints = iScore.writingModule();
		// System.out.println("Your listening points are"+writingPoints);
		AdaptabilityScore adPoint = new AdaptabilityScore();
		int relativePrAndCitiPointy = adPoint.relativePrAndCiti();
		// System.out.println("Candidate has points due to
		// relatives"+relativePrAndCitiPointy);
		int studyCanadaPoint1 = adPoint.studyCanada();
		// System.out.println("Candidate has points due to study in
		// Canada"+studyCanadaPoint1);
		int workCanadaScore1 = adPoint.workCand();
		// System.out.println("Candidate has points due to work in
		// Canada"+workCanadaScore1);
		int TotalPoints = (eduPoints1 + exPoint1 + agePoints + listeningPoints + speakingPoints + readingPoints
				+ writingPoints + relativePrAndCitiPointy + studyCanadaPoint1 + workCanadaScore1);
		System.out.println("your total points are" + TotalPoints);
		if (TotalPoints >= 67) {
			System.out.println("You qualify to submit an Expression of Interest(EOI) to Immigration Canada");

		} else {
			System.out.println("you are not eligible to submit  an Expression of Interest(EOI) to Immigration Canada");
		}
	}
}