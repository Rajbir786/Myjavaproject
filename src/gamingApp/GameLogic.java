package gamingApp;

import java.util.Scanner;

public class GameLogic {
	Scanner sc = new Scanner(System.in);

	int wrongguessedLetterNum = 0;

	
	
	int count=0;
	int index=0;
	char wrongGuessedChar;
	 //char wrongGuessedChar[]=new char[5];

	public void gameLogic(String randomName) {

		System.out.println("Your Randomly picked name is   " + randomName.replaceAll("\\w", "_"));
		System.out.println("Randomly picked name's length is " + randomName.length());
		char[] randomNameCharArray2 = randomName.toCharArray();
		char[] randomNameCharArray = randomName.toCharArray();
		System.out.println("You are guessing  ");
		for (int i = 0; i < randomName.length(); i++) {
			randomNameCharArray[i] = '_';
		}

		while (!String.valueOf(randomNameCharArray).equalsIgnoreCase(randomName)) {
			boolean lettermatch = false;
			boolean repeat=false;
			for (int i = 0; i < randomName.length(); i++) {
				System.out.print(randomNameCharArray[i]);// prints the hidden Randomly picked Name
			}
			System.out.print("  Guess a letter:   ");
			String guessedLetterString = sc.next().substring(0, 1);

			char guessedLetter = guessedLetterString.charAt(0);

			int chance = 0;
			
			
			
		
			for (int i = 0; i < randomName.length(); i++) {

				if (randomNameCharArray2[i] == guessedLetter) {
					chance++;

					randomNameCharArray[i] = guessedLetter;

					lettermatch = true;
					

				}

			}
			if (lettermatch) {
				System.out.println("The letter " + guessedLetter + " is in the StudentName ! There are " + chance + " "
						+ guessedLetter + " 's in the word");

				System.out.println("You have guessed  " + (wrongguessedLetterNum) + "  wrong letters   ");
			}
			else{
				System.out.println("Sorry, the letter  " + guessedLetter + "  is not in the StudentName.  ");
				wrongguessedLetterNum++;
				
			
					
					System.out.println("You have guessed  " + (wrongguessedLetterNum) + "  wrong letters   "+guessedLetter );
				 
				
			}

			if (wrongguessedLetterNum == 5) {
				System.out.println(
						"you have already guessed five wrong letters and you lose the game,best of luck for next time");

				System.exit(0);

			}

		}
		System.out.println(
				"You guessed the Full StudentName **********" + randomName + " ***********correctly!" + "You win\n");
	}

}