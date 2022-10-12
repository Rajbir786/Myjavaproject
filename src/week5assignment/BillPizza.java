package week5assignment;

import java.util.Scanner;

public class BillPizza {

	public static void main(String[] args) {

		int bill = 0;
		String addExtraPepproni="yes";
		
		Boolean exChsAddY;
		System.out.println("welcome to pizza shop ,which size of pizza would you like to order?");
		Scanner scn = new Scanner(System.in);

	String pizzaSize = scn.next();
		System.out.print("Customer selected  " + pizzaSize);

		switch (pizzaSize) {
		case ("small"):
			bill = bill + 15;

			System.out.println("do You to add extra pepproni? ");
			 String peppYesOrNo=scn.next();
			//addExtraPepproni = scn.nextBoolean();
			System.out.print("Customer selected  " + peppYesOrNo);

			if (addExtraPepproni.equals(peppYesOrNo))

			{
				bill = bill + 2;
			}

			System.out.println("do You to add extra cheese? ");
			exChsAddY = scn.nextBoolean();

			System.out.print("Customer selected  " + exChsAddY);
			if (exChsAddY) {

				bill = bill + 1;
				
			}
	break;
		case ("medium"):
			bill = bill + 20;

			System.out.println("do You to add extra pepproni? ");
			 peppYesOrNo=scn.next();
		//addExtraPepproni = scn.nextBoolean();
			System.out.print("Customer selected  " + peppYesOrNo);

			if (addExtraPepproni.equals(peppYesOrNo))

			{
				bill = bill + 3;
			}

			System.out.println("do You to add extra cheese? ");
			exChsAddY = scn.nextBoolean();

			System.out.print("Customer selected  " + exChsAddY);
			if (exChsAddY == true) {

				bill = bill + 1;
			
			}
			break;
		case ("large"):
			bill = bill + 25;

			System.out.println("do You to add extra pepproni? ");
			 peppYesOrNo=scn.next();
			System.out.print("Customer selected  " +peppYesOrNo );

			if (addExtraPepproni.equals(peppYesOrNo))

			{
				bill = bill + 3;
			}

			System.out.println("do You to add extra cheese? ");
			exChsAddY = scn.nextBoolean();

			System.out.print("Customer selected  " + exChsAddY);
			if (exChsAddY == true) {

				bill = bill + 1;
			
			}
			break;
		default:
			System.out.println("enter correct size of pizza");

		}
		System.out.println("your total bill is " + bill);
		
	}}

