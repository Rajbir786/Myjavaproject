package assignmnetWeek9;

import java.io.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class GamingApp {
	public static void main(String[] args)

			throws IOException {
		Set<String> prevGuesses = new HashSet<>();

		System.out.println("Welcome to StudentName guessing game");
		int index = 0;
		int wrongAttempts = 0;

		Scanner sc = new Scanner(System.in);
		String fileName = ("C:\\Users\\Rajbir\\Downloads\\NameList.txt");

		ArrayList<String> allNames = new ArrayList<String>();
		Random r = new Random();

		BufferedReader in = new BufferedReader(new FileReader(fileName));
		while (in.ready()) {
			allNames.add(in.readLine());
		}
		in.close();

		String randomName = allNames.get(r.nextInt(allNames.size()));

		System.out.println("Randamoly picked name is  \n " + randomName.replaceAll("\\w", "*")
				+ " \nNow you have to guess which name is this");
		System.out.println(
				"This Studentname has " + randomName.length() + " letters " + "  first letter is always capital");

		int length = randomName.length();

		char[] wordToGuessChars = randomName.toCharArray(); // creates character array of strings
		char[] censor = randomName.toCharArray();
		System.out.println("You are guessing: "); // prints an array of chars with the same length as string
		for (int i = 0; i < length; i++) {
			censor[i] = '_';
		}

		while (!String.valueOf(censor).equals(randomName)) {
			// Initialize all variables in loop
			boolean correct = false; // lets the user know if the letter is in the word or not
			boolean repeated = false;// check if user guessed the same letter twice
			for (int i = 0; i < length; i++) {
				System.out.print(censor[i]);// prints the censored secret Name
			}
			System.out.print("  Guess a letter:   ");
			String currentGuess = sc.next().substring(0, 1);

			char currentGuessChar = currentGuess.charAt(0); // gets char data from scanner
			if (prevGuesses.contains(currentGuess)) // checks if user already guessed the letter previously
			{
				System.out.println("You already guessed this letter! Try again.  ");

				repeated = true;
			}
			prevGuesses.add(currentGuess);
			// if the guess is not a duplicated guess, it checks if the guessed letter is in
			// the word*/
			if (!repeated) {
				int times = 0; // number of times a letter is in the word
				for (int i = 0; i < length; i++) {
					if (wordToGuessChars[i] == currentGuessChar) {
						censor[i] = currentGuessChar; // replaces _ with guessed letter in caps
						correct = true;
						times++;
					}

				}

				if (correct) {
					System.out.println("The letter " + currentGuessChar + " is in the StudentName ! There are " + times
							+ " " + currentGuessChar + " 's in the word");

					System.out.println("You have guessed  " + (wrongAttempts) + "  wrong letters   ");

				} else {
					System.out.println("Sorry, the letter  " + currentGuessChar + "  is not in the StudentName.  ");
					wrongAttempts++;
					char wrongChar = currentGuessChar;

					System.out.println("You have guessed  " + (wrongAttempts) + "  wrong letters   " + wrongChar);

				}

				if (wrongAttempts == 5) {
					System.out.println(
							"you have already guessed five wrong letters and you lose the game,best of luck for next time");

					System.exit(0);
				}

			}

		}

		System.out.println(
				"You guessed the Full StudentName **********" + randomName + " ***********correctly!" + "You win\n");
	}
}
