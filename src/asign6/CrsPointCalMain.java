package asign6;

import AssignmentWeek6.CandidateEducationCaluclate;
import AssignmentWeek6.IletsScore;

public class CrsPointCalMain {

	public static void main(String[] args) {
		System.out.println("Welcome to CRS Caluclator ");
		PointCalFactors pcf = new PointCalFactors();//create instance of Class PointCalFactors
		int eduPoints = pcf.eduPoint();//invoke method EduPoint() in class  PointCalFactors

		int expPoints = pcf.expPoints();//invoke method expPoint() in class  PointCalFactors

		int agePoints = pcf.agePoints();//invoke method agePoints() in PointCalFactors

		IletsScore iScore = new IletsScore();// create instance of Class
		int listeningPoints = iScore.listeningModule();//invoking method listeningModule() present in  Class IletsScore

		int speakingPoints = iScore.speakingModule();//invoke method  speakingModule() present in IletsScore

		int readingPoints = iScore.readingModule();//invoke method  readingModule() present in IletsScore

		int writingPoints = iScore.writingModule();//invoke method  writingModule() present in IletsScore

		int relativePrAndCitiPoint = pcf.relativePrAndCiti();//invoke method relativePrAndCiti in class  PointCalFactors
		int studyCanadaPoint = pcf.studyCanada();//invoke method studyCanada() in class  PointCalFactors
		int workCanadaPoint = pcf.workCand();//invoke method workCanada() in class  PointCalFactors
		int TotalPoints = (eduPoints + expPoints + agePoints + listeningPoints + speakingPoints + readingPoints
				+ writingPoints + relativePrAndCitiPoint + studyCanadaPoint + workCanadaPoint);//(combine all points from different methods)
		System.out.println("your total points are" + TotalPoints);
		if (TotalPoints >= 67) {
			System.out.println("You qualify to submit an Expression of Interest(EOI) to Immigration Canada");

		} else {
			System.out.println("you are not eligible to submit  an Expression of Interest(EOI) to Immigration Canada");
		}
	}


	
}