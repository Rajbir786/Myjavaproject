package gamingApp;

import java.io.BufferedReader; //reads text from a character-input stream, 








//buffering characters so as to provide for the efficient reading of characters, arrays, and lines
import java.io.File;//The File class is Java’s representation of a file or directory pathname.
import java.io.FileReader;//The Java FileReader class, java.io.FileReader makes it possible to read the contents of a file as a stream of characters. 
import java.util.ArrayList;//

import java.util.Random;//
import java.util.Scanner;

import assignmentWeek11.Item;
import assignmentWeek11.R1;
import assignmentWeek11.Rocket;

public class GamingMain {
	Scanner sc = new Scanner(System.in);
	char guessedLetter;
	int wrongAttempts = 0;

	String WronguessedLetter = "";

	String upDatedName = "";

	public static void main(String[] args) throws Exception {
		// pass the path to the file as a parameter
		File file = new File("C:\\\\Users\\\\Rajbir\\\\Downloads\\\\NameList.txt");

		ArrayList<String> allNames = new ArrayList<String>();//
		Random random = new Random();//

		BufferedReader readFile = new BufferedReader(new FileReader(file));
		while (readFile.ready()) // It checks if the file reader is ready to be read.
		{
			allNames.add(readFile.readLine());//
		}
		readFile.close();//

		String randomName = allNames.get(random.nextInt(allNames.size()));

		GamingMain gMain = new GamingMain();
		gMain.gameNameguess(randomName);

	}

	public void gameNameguess(String randomName) {

		String maskedName = randomName.replaceAll("\\w", "_");// randamNmae,masked namehidden,updatedname
		
		System.out
				.println("Randamoly picked name is  \n " + maskedName + " \nNow you have to guess which name is this");
		System.out.println("This Studentname has " + randomName.length() + " letters ");
		char[] randamNameCharArray = randomName.toLowerCase().toCharArray();

		char[] maskedNameCharArray = maskedName.toLowerCase().toCharArray();
		System.out.println("You are guessing   ");

		while (!String.valueOf(maskedNameCharArray).equalsIgnoreCase(randomName)) {
			boolean letterMatch = false;
			boolean repeated=false;

			for (int i = 0; i < randomName.length(); i++) {
				System.out.print(maskedNameCharArray[i]);

			}

			System.out.println("Enter  your guess ");
			String guessedLetterString = sc.next();
			guessedLetter = guessedLetterString.charAt(0);
			
			
		

			
			

			int chances = 0;
			for (int i = 0; i < randomName.length(); i++) {
				if (randamNameCharArray[i] == guessedLetterString.charAt(0)) {

					maskedNameCharArray[i] = guessedLetter;
					chances++;
					letterMatch = true;
				
				}

			}
			if (letterMatch) {
				System.out.println("The letter " + guessedLetter + " is in the StudentName ! There are " + chances + " "
						+ guessedLetter + " 's in the word");
				System.out.println("You have guessed  " + (wrongAttempts) + "  wrong letters   " + WronguessedLetter);

			}
			if (!letterMatch) {

				System.out.println("Sorry, the letter  " + guessedLetter + "  is not in the StudentName.  ");
				wrongAttempts++;
				WronguessedLetter += " " + guessedLetter;
				System.out.println("You have guessed  " + (wrongAttempts) + "  wrong letters   " + WronguessedLetter);

				if (wrongAttempts == 5) {
					System.out.println(
							"you have already guessed five wrong letters and you lose the game,best of luck for next time");

					System.exit(0);
				}

			}
		}

		if (String.valueOf(maskedNameCharArray).equalsIgnoreCase(randomName)) {
			System.out.println("You guessed the Full StudentName ***" + randomName + " ******correctly!" + "You win\n");

		}
	}
}
