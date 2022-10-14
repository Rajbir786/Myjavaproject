package AssignmentWeek6;//Question2 MainClass

public class CrsCaluclation {

	public static void main(String[] args) {
		System.out.println("Welcome to CRS Caluclator ");
		CandidateEducationCaluclate cEdCal = new CandidateEducationCaluclate();

		int eduPoints1 = cEdCal.canEduPoint();


		int exPoint1 = cEdCal.canExpPoints();
		
		int agePoints = cEdCal.canAgePoints();
		

		IletsScore iScore = new IletsScore();
		int listeningPoints = iScore.listeningModule();
	

		int speakingPoints = iScore.speakingModule();
		
		int readingPoints = iScore.readingModule();
		
		int writingPoints = iScore.writingModule();
		
		AdaptabilityScore adPoint = new AdaptabilityScore();
		int relativePrAndCitiPointy = adPoint.relativePrAndCiti();
		
		int studyCanadaPoint1 = adPoint.studyCanada();
		
		int workCanadaScore1 = adPoint.workCand();
		
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