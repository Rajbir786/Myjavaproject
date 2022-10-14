package AssignmentWeek6;

import java.util.Scanner;

public class IletsScore {

	float listeningModuleScore = 0;
	float speakingModuleScore = 0;
	int pointsFromlisteningModuleScore = 0;
	int pointsFromSpeakingModuleScore = 0;
	float readingModuleScore = 0;
	int pointsFromReadingModuleScore = 0;
	float writingModuleScore = 0;
	int pointsFromWritingModule = 0;
	Scanner scn = new Scanner(System.in);

	public int listeningModule() {

		System.out.println("Enter your score in Listening");

		listeningModuleScore = scn.nextFloat();
		if (listeningModuleScore >= 8) {
			pointsFromlisteningModuleScore = 6;
		} else if (listeningModuleScore == 7.5) {
			pointsFromlisteningModuleScore = 5;
		} else {
		System.out.println("Ilets score should be ");
			System.exit(0);
		}

		return (pointsFromlisteningModuleScore);
	}

	public int speakingModule() {

		System.out.println("Enter your score in Speaking");

		speakingModuleScore = scn.nextFloat();
		if (speakingModuleScore >= 7) {
			pointsFromSpeakingModuleScore = 6;
		} else if (speakingModuleScore == 6.5) {
			pointsFromSpeakingModuleScore = 5;
		} else {
			pointsFromSpeakingModuleScore = 0;
		}

		return (pointsFromSpeakingModuleScore);
	}

	public int readingModule() {

		System.out.println("Enter your score in Reading");

		readingModuleScore = scn.nextFloat();
		if (readingModuleScore >= 7) {
			pointsFromSpeakingModuleScore = 6;
		} else if (readingModuleScore == 6.5) {
			pointsFromReadingModuleScore = 5;
		} else {
			pointsFromReadingModuleScore = 0;
		}

		return (pointsFromReadingModuleScore);
	}

	public int writingModule() {

		System.out.println("Enter your score in Writing");

		writingModuleScore = scn.nextFloat();
		if (writingModuleScore >= 7) {
			pointsFromWritingModule = 6;
		} else if (writingModuleScore == 6.5) {
			pointsFromWritingModule = 5;
		} else {
			pointsFromWritingModule = 0;
		}

		return (pointsFromWritingModule);
	}

}