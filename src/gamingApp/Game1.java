package gamingApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
	Scanner sc = new Scanner(System.in);
	char guessedLetter;
	int wrongAttempts = 0;
	
	public static void main(String[] args) throws Exception {
		// pass the path to the file as a parameter
		File file = new File("C:\\\\Users\\\\Rajbir\\\\Downloads\\\\NameList.txt");

		ArrayList<String> allNames = new ArrayList<String>();//
		Random r = new Random();//object of randomclass

		BufferedReader readFile = new BufferedReader(new FileReader(file));
		while (readFile.ready()) {
			allNames.add(readFile.readLine());
		}
		readFile.close();

		String randomName = allNames.get(r.nextInt(allNames.size()));

		Game1 gM = new Game1();
		gM.gameNameguess(randomName);

	}

	public void gameNameguess(String randomName) {

		boolean letterMatch = false;
		
		String maskedName = randomName.replaceAll("\\w", "_");
		System.out.println("Randomly picked name is  \n " + maskedName + " \nNow you have to guess which name is this");
		System.out.println("This Studentname has " + randomName.length() + " letters ");
		char[] randamNameCharArray = randomName.toLowerCase().toCharArray();

		char[] maskedNameCharArray = maskedName.toLowerCase().toCharArray();
		System.out.println("You are guessing   ");

		while (!String.valueOf(maskedNameCharArray).equalsIgnoreCase(randomName)) {

			for (int i = 0; i < randomName.length(); i++) {
				System.out.print(maskedNameCharArray[i]);

			}

			System.out.println("Enter  your guess ");
			String guessedLetterString = sc.next();

			guessedLetter = guessedLetterString.charAt(0);
			
			int chance = 0;
			String WronguessedLetter = "";

			for (int i = 0; i < randomName.length(); i++) {

				if ( randamNameCharArray[i] == guessedLetter) {
					chance++;

					maskedNameCharArray[i] = guessedLetter;

					letterMatch = true;
					

				}

			}
			if (letterMatch) {
				System.out.println("The letter " + guessedLetter + " is in the StudentName ! There are " + chance + " "
						+ guessedLetter + " 's in the word");
				System.out.println("You have guessed  " + (wrongAttempts) + "  wrong letters   " + WronguessedLetter);

			} else {
				System.out.println("Sorry, the letter  " + guessedLetter + "  is not in the StudentName.  ");
				wrongAttempts++;
				WronguessedLetter += " " + guessedLetter;
				System.out.println("You have guessed  " + (wrongAttempts) + "  wrong letters   " + WronguessedLetter);
			}}
			
				if (wrongAttempts == 5) {
					System.out.println(
							"you have already guessed five wrong letters and you lose the game,best of luck for next time");

					System.exit(0);
				}

			
		
		if (String.valueOf(maskedNameCharArray).equalsIgnoreCase(randomName)) {
			System.out.println("You guessed the Full StudentName ***" + randomName + " ******correctly!" + "You win\n");

		}
	}

}