package gamingApp;


import java.io.File;

import java.util.UUID;


	
	
	 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandamPickname {
	
	public static void main(String[] args) 
			throws IOException
	{String fileName1 = "C:\\Users\\Rajbir\\Downloads\\NameList.txt";
    ArrayList<String> allNames = new ArrayList<String>();
    Random r = new Random();

    BufferedReader in = new BufferedReader(new FileReader(fileName1)); 
    while (in.ready()) { 
         allNames.add( in.readLine() );
    }
    in.close();

    String randomName = allNames.get(r.nextInt(allNames.size()));
    System.out.println( randomName);
    System.out.println(randomName.replaceAll("\\w","*"));
    wrongAttempts++;
	System.out.println("You have guessed " + (wrongAttempts) + "wrong letters:");
	if (wrongAttempts == 5) {
		System.out.println(
				"You already guessed five wrong letters and you lose your points and Sorry you lose the game.Good luck next time");
		System.exit(0);
	}

}}
if (prevGuesses.contains(currentGuess)) // checks if user already guessed the letter previously
{
	System.out.println("You already guessed this letter! Try again. Your previous guesses were: ");
	System.out.println(prevGuesses.stream().reduce("", String::concat));
	repeated = true;
}
prevGuesses.add(currentGuess);

