package LearningArray;

import java.util.Scanner;

public class ArrayPractise {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  your guess ");
		String guessedLetterString =  sc.next().substring(0, 1);
		char guessedLetter = guessedLetterString.charAt(0);
	boolean repeat=false;
	 String previousGuessedLetter[]=new String[20];
	 while(!repeat) {
	for(int i=0;i<20;i++) {
		
	
		 previousGuessedLetter[i]=guessedLetterString;
			System.out.println(previousGuessedLetter[i]);
		
		break;
		 
	
	}
	for(int i=0;i<20;i++) {
		
	
	if(previousGuessedLetter[i].contains(guessedLetterString)) {
		System.out.println("you already guessed this letter try new one");
		repeat=true;
		
	}
		
	}
	
	}
	

}}
