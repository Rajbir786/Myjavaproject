package LearningArray;

import java.util.Scanner;

public class Arraylength {
	public static void main(String args[]) {
		int count = 0;
		int nameArraylength;
		Scanner scn = new Scanner(System.in);

		System.out.println("how many elements would you like to enter?");
		nameArraylength = scn.nextInt();

		String[] nameList = new String[nameArraylength];
		// input array elements
		for (int i = 0; i < nameArraylength; ++i) {

			System.out.println("enter the names:");
			nameList[i] = scn.next();

		}
//display array elements
		for (int i = 0; i < nameList.length; ++i) {

			System.out.println(nameList[i]);

		}

		System.out.println("which value do you want to comapre?");
		String testElement = scn.next();

		System.out.println(testElement);

		for (int i = 0; i < nameList.length; i++) {
//entered value do you want to compare
			if (nameList[i].equals(testElement))

			{
			
				count = count + 1;
				System.out.println(testElement + "is repeated " + count + "times");
				break;
			
		
		}}
			if(count==0) {
				
			
			System.out.println("not found");
			}

		
				
		
				
			
		}}
	


/*
 * String testElement= scn.nextLine(); for(int i=0;i<4;i++) {
 * System.out.println("how many elements "); nameList[i]=scn.nextLine();
 * System.out.println(nameList[i]);
 * 
 * /*nameList[0]=scn.nextLine(); nameList[1]=scn.nextLine();
 * nameList[2]=scn.nextLine(); nameList[3]=scn.nextLine(); int count=0;
 * 
 * 
 * //System.out.println ("which element would you like to check?"); for(
 * i=0;i<nameList.length;i++)
 * 
 * {
 * 
 * 
 * 
 * if(nameList[i].equals(testElement)); {
 * 
 * 
 * System.out.println(testElement+ "is present in String and it is present"+
 * i+"location");
 */
