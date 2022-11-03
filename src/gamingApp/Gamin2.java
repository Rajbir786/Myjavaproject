package gamingApp;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
public class Gamin2 {
	
	
	  
	    static Scanner input;
	    public static void game()
	    {
	        input = new Scanner(System.in);
	    	String fileName = ("C:\\Users\\Rajbir\\Downloads\\NameList.txt");

			BufferedReader br = new BufferedReader(new FileReader(fileName));
			ArrayList<String> allNames = new ArrayList<String>();
			Random r = new Random();

			BufferedReader in = new BufferedReader(new FileReader(fileName));
			while (in.ready()) {
				allNames.add(in.readLine());
			}
			in.close();

			String randomName = allNames.get(r.nextInt(allNames.size()));

			// System.out.println(randomName);
			System.out.println("Randamoly picked name is  \n " + randomName.replaceAll("\\w", "*")
					+ " \nNow you have to guess which name is this");
			 System.out.println("This name has "+randomName.length()+" letters");
	      
	        // play the game
	        System.out.println("let's play the game");
	        startGame(word, word1);
	    }
	    public static void startGame(String word, String word1)
	    {
	        // total guesses
	        int guess_ = 0;
	  
	        // number of wrong guesses
	        int wrong = 0;
	  
	        // for each guess
	        String guess;
	  
	        // stores the guessed letter
	        char letter;
	  
	        // stores if the letter was
	        // already guessed
	        boolean guessescontainsguess;
	        String guesses = "";
	        boolean guessinword;
	  
	        // while loop starts here
	        while (wrong < 5 && word1.contains("_")) {
	  
	            System.out.println(word1 + "\n");
	            int temp = 5 - wrong;
	            if (wrong != 0) {
	  
	                // for picture 1
	                System.out.println("You have " + temp
	                                   + " guesses left.");
	            }
	  
	            System.out.print("Your Guess:");
	  
	            // takes guess input
	            guess = input.nextLine();
	  
	            // converts to uppercase
	            // for comparison
	            guess = guess.toUpperCase();
	  
	            // gets the first letter
	            // as guessed letter
	            letter = guess.charAt(0);
	  
	            guessescontainsguess
	                = (guesses.indexOf(letter)) != -1;
	  
	            // stores every letter
	            // guessed in guesses
	            guesses += letter;
	  
	            // converts to uppercase for
	            // comparison
	            letter = Character.toUpperCase(letter);
	            System.out.println();
	  
	            // if letter already guessed
	            if (guessescontainsguess == true) {
	  
	                // already guessed letter
	                System.out.println("You ALREADY guessed "
	                                   + letter + ". \n");
	            }
	  
	            // guessed letter is in the word
	            guessinword = (word.indexOf(letter)) != -1;
	  
	            // if statement begins
	            if (guessinword == true) {
	  
	                // print the letter
	                System.out.println(
	                    letter + " is present in the word.");
	                System.out.print("\n");
	  
	                // find the letter positions
	                // replace dashes with those
	                // letter at valid positions
	                for (int position = 0;
	                     position < word.length(); position++) {
	  
	                    // guessed letter is equal to
	                    // letter at position in word
	                    // and word1 has previously does not
	                    // have that letter
	                    if (word.charAt(position) == letter
	                        && word1.charAt(position)
	                               != letter) {
	  
	                        word1 = word1.replaceAll("_ ", "_");
	                        String word2;
	                        word2 = word1.substring(0, position)
	                                + letter
	                                + word1.substring(position
	                                                  + 1);
	                        word2 = word2.replaceAll("_", "_ ");
	                        word1 = word2;
	                    }

}
