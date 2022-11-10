package assignweek10;

import java.util.Scanner;

public class CruiseDetails extends UserDetails {

	public String cruiseName;
	public int noOfDays;
	public double priceForAdult;
	public double priceForChildrenMoreThanFiveYears;
	public double priceOfCruiseForAdults;
	double totalPrice;
	double priceOfCruiseForChildrenmoreThanFive;
	double buffetPriceForAdults;
	double buffetPriceForChildrenmoreThanFive;
	double hstCalucalted;
	double finalTotalbill;
	String customerreplyforbuffet = "";
	int numOfAttemptsforBuffetSelect = 0;

	Scanner sc = new Scanner(System.in);

	public void selectedCruiseDisplayInfo() {

		System.out.println(
				"The cruise that you have selected is " + cruiseName + "which is a         " + noOfDays + "day cruise");
		System.out.println("The cruise that you have selected is " + cruiseName
				+ " price for Adults(greater than 12)       " + priceForAdult + "per day");
		System.out.println("The cruise that you have selected is " + cruiseName + " price for children(above 5)     "
				+ priceForChildrenMoreThanFiveYears + "per day");

	}
	public void cruisePricingForAdults() // method for caluclating price of cruise for adults
	{

		priceOfCruiseForAdults = (priceForAdult * numberOfAdults * noOfDays);

	}

	public void cruisePricingForChildren()// method for caluclating price of
									// cruise for children above 5
	{

		priceOfCruiseForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * noOfDays
				* priceForChildrenMoreThanFiveYears);

	}



	public void buffetSelectionCruise()

	{
		System.out.println(
				"All our cruises have food service on board.Do you want to pre book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids,please type yes or no?");
		customerreplyforbuffet = sc.next();

		while (!(customerreplyforbuffet.equalsIgnoreCase("yes") || customerreplyforbuffet.equalsIgnoreCase("no"))) {
			System.out.println("invalid response please type yes or no");

			customerreplyforbuffet = sc.next();
			numOfAttemptsforBuffetSelect++;
			if (numOfAttemptsforBuffetSelect > 2) {
				System.out.println("You have entered more than 3 times invalid response");
				System.exit(0);
			}

		}

	}

	public void buffetPricingForAdults() {
		if (customerreplyforbuffet.equalsIgnoreCase("yes")) {

			buffetPriceForAdults = (numberOfAdults * 20.99 * noOfDays);

		} else {
			buffetPriceForAdults = 0;
		}

	}

	 public void buffetPricingForChildrenmoreThanFive() {
		if (customerreplyforbuffet.equalsIgnoreCase("yes")) {

			buffetPriceForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * 4.99 * noOfDays);

		} else {
			buffetPriceForAdults = 0;
		}

	}

	public void hstCalucalte() {
		hstCalucalted = totalPrice * 0.15;

	}

	 
	
}
