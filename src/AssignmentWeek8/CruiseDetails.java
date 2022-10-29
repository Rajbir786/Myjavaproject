package AssignmentWeek8;

import java.util.Scanner;

public class CruiseDetails {

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

	Scanner sc = new Scanner(System.in);

	CruiseDetails(String nameCruise, int numOfDays, double adultPrice, double childMoreThan5years) {
		// Constructor to initialize variables
		cruiseName = nameCruise;
		noOfDays = numOfDays;
		priceForAdult = adultPrice;
		priceForChildrenMoreThanFiveYears = childMoreThan5years;

	}

	public double cruisePricingForAdults(int numberOfAdults) // method for caluclating price of cruise for adults
	{

		priceOfCruiseForAdults = (priceForAdult * numberOfAdults * noOfDays);

		return (priceOfCruiseForAdults);
	}

	public double cruisePricingForChildren(int numberOfChildrenMoreThanFiveYears)// method for caluclating price of
																					// cruise for children above 5
	{

		priceOfCruiseForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * noOfDays
				* priceForChildrenMoreThanFiveYears);
		return priceOfCruiseForChildrenmoreThanFive;

	}

	public double buffetPricingForAdults(int numberOfAdults)// method to find price for adults if they selected
															// buffetmeal
	{
		buffetPriceForAdults = (numberOfAdults * 20.99 * noOfDays);
		return buffetPriceForAdults;
	}

	public double buffetPricingForChildrenmoreThanFive(int numberOfChildrenMoreThanFiveYears) // method to find price
																								// for children above 5
																								// if they selected
																								// buffetmeal
	{

		buffetPriceForChildrenmoreThanFive = (numberOfChildrenMoreThanFiveYears * 4.99 * noOfDays);
		return buffetPriceForChildrenmoreThanFive;
	}

	public double totalPricewithbuffetprice()// method to calculate totalprice of cruise with meal
	{
		totalPrice = priceOfCruiseForAdults + priceOfCruiseForChildrenmoreThanFive + buffetPriceForAdults
				+ buffetPriceForChildrenmoreThanFive;
		return totalPrice;
	}

	public double totalPricewithoutMeal()// method to calculate totalprice of cruise without meal
	{
		totalPrice = priceOfCruiseForAdults + priceOfCruiseForChildrenmoreThanFive;
		return totalPrice;
	}

	public double hstCalucalte() {
		hstCalucalted = totalPrice * 0.15;
		return hstCalucalted;

	}

	public double finalTotalBillCalucalated() {
		finalTotalbill = totalPrice + hstCalucalted;
		return finalTotalbill;

	}

	public void displayFinal(int numberOfAdults, int numberOfChildrenMoreThanFiveYears) {
		System.out.println(cruiseName + "Adults            @   " + numberOfAdults + "   $" + priceOfCruiseForAdults);
		System.out.println(cruiseName + "Children abovefiveyears@   " + numberOfChildrenMoreThanFiveYears + "   $"
				+ priceOfCruiseForChildrenmoreThanFive);
		System.out.println(
				"buffet specail price adults            @   " + numberOfAdults + "   $" + buffetPriceForAdults);
		System.out.println("Buffet Special price children above 5    @    " + numberOfChildrenMoreThanFiveYears + "$"
				+ buffetPriceForChildrenmoreThanFive);
		System.out.println("Total price:                 $" + totalPrice);
		System.out.println("HST@15%:                 $" + hstCalucalted);
		System.out.println("Final Price:                 $" + finalTotalbill);
	}

}
