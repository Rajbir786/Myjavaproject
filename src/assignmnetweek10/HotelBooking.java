package assignmnetweek10;

import java.util.Scanner;

public class HotelBooking extends UserDetails {
	Scanner sc = new Scanner(System.in);

	int numOfAttempt1 = 0;
	int numOfAttempt2 = 0;
	String customerReplyforHotelLunch = "";
	double priceatHotelStay = 0;
	double priceForchildrenatHotelStay = 0;
	int noOfdaysStayHotel = 0;
	String roomSelcted = "";
	double priceHotelLunchforadults = 0;
	double priceHotelLunchforchildren = 0;
	double totalPrice = 0;
	double taxCalucaltion = 0;
	double finalTotalbill = 0;

	public String roomSelection() {

		System.out.println("Please enter the room you want to select ");
		System.out.println("Delux Suite: accommodates 2 adults and 2 children at the rate of $180/ night\r\n"
				+ "Family Suite: accommodates 4 adults and 4 children at $230/ night.");
		roomSelcted = sc.nextLine();
		while (!(roomSelcted.equalsIgnoreCase("Delux Suite") || roomSelcted.equalsIgnoreCase("Family Suite"))) {

			numOfAttempt1++;
			if (numOfAttempt1 > 2) {
				System.out.println("You have entered more than 3 times invalid entry");

				System.exit(0);
			}
			System.out.println("you have selected invalid entry.please select Delux Suite /Family Suite ");
			roomSelcted = sc.nextLine();
		}

		return roomSelcted;

	}

	public void priceHotelLunchforadults() {
		if (customerReplyforHotelLunch.equalsIgnoreCase("yes")) {

			priceHotelLunchforadults = (25 * numberOfAdults);
		} else {
			priceHotelLunchforadults = 0;

		}

	}

	public void priceHotelLunchforChildren() {
		if (customerReplyforHotelLunch.equalsIgnoreCase("yes")) {

			priceHotelLunchforchildren = (5 * totalNumOFChildren);

		} else {
			priceHotelLunchforchildren = 0;
		}

	}

	public void taxCalucaltion() {
		taxCalucaltion = (totalPrice * 0.18);

	}

	public void lunchSelectionHotel() {

		System.out.println("Rooms come with free breakfast. Do you want to add lunch in your room as well at"
				+ " a discounted pre-booking rate of $25/ adult and $5/ child.All rooms come with free breakfast. "
				+ "Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.");
		customerReplyforHotelLunch = sc.next();
		while (!(customerReplyforHotelLunch.equalsIgnoreCase("yes")
				|| customerReplyforHotelLunch.equalsIgnoreCase("no"))) {
			System.out.println("you have selected invalid entry.please select yes or no ");
			customerReplyforHotelLunch = sc.next();

			numOfAttempt2++;
			if (numOfAttempt2 > 2) {
				System.out.println("You have entered more than 3 times invalid entry");

				System.exit(0);
			}

		}
	}

}
