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

	void buffetSelectionCruise()

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

	void buffetPricingForAdults() {
		if (customerreplyforbuffet.equalsIgnoreCase("yes")) {

			buffetPriceForAdults = (numberOfAdults * 20.99 * noOfDays);

		} else {
			buffetPriceForAdults = 0;
		}

	}

	void buffetPricingForChildrenmoreThanFive() {
		if (customerreplyforbuffet.equalsIgnoreCase("yes")) {

			buffetPriceForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * 4.99 * noOfDays);

		} else {
			buffetPriceForAdults = 0;
		}

	}

	void hstCalucalte() {
		hstCalucalted = totalPrice * 0.15;

	}

	void finalTotalBillCalucalated() {
		finalTotalbill = totalPrice + hstCalucalted;

	}

}
