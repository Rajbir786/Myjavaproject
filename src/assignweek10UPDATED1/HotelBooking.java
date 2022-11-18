
package assignweek10UPDATED1;

public class HotelBooking extends UserDetails {

	private int numOfAttempt1 = 0;
	private int numOfAttempt2 = 0;
	private String customerReplyforHotelLunch = "";
	double priceatHotelStay;
	double priceForchildrenatHotelStay = 0;
	protected int noOfdaysStayHotel = 0;
	private double priceHotelLunchforadults = 0;
	private double priceHotelLunchforchildren = 0;
	private double totalPrice = 0;
	private double taxCalucaltion = 0;
	private double finalTotalbill = 0;
	String roomName;

	public HotelBooking(String nameRoom, int eachPersonpriceatHotelStay) {
		roomName = nameRoom;
		priceatHotelStay = eachPersonpriceatHotelStay;

	}

	public String roomSelection() {

		System.out.println("Please enter the room you want to select ");
		System.out.println("Delux Suite: accommodates 2 adults and 2 children at the rate of $180/ night\r\n"
				+ "Family Suite: accommodates 4 adults and 4 children at $230/ night.");
		String roomSelcted = sc.nextLine();
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

	public double totalPricewithlunchprice(double priceatHotelStay, double priceHotelLunchforadults,
			double priceHotelLunchforchildren) {
		double totalPrice = (priceatHotelStay + priceHotelLunchforadults + priceHotelLunchforchildren);
		return totalPrice;
	}

	public void totalFinalBill(int numberOfAdults, int totalNumOFChildren) {
		System.out.println("Please enter number of days of stay ");
		noOfdaysStayHotel = sc.nextInt();
		priceatHotelStay = (priceatHotelStay * noOfdaysStayHotel);
		if (customerReplyforHotelLunch.equalsIgnoreCase("yes")) {
			priceHotelLunchforadults = (25 * numberOfAdults);
			priceHotelLunchforchildren = (5 * totalNumOFChildren);
		} else {
			priceHotelLunchforadults = 0;
			priceHotelLunchforchildren = 0;

		}
		totalPrice = (priceatHotelStay + priceHotelLunchforadults + priceHotelLunchforchildren);
		taxCalucaltion = (totalPrice * 0.18);

		finalTotalbill = totalPrice + taxCalucaltion;
	}

	public void displayFinal(int numberOfAdults, int totalNumOFChildre) {
		System.out.println(roomName + noOfdaysStayHotel + "@ nights" + priceatHotelStay);
		System.out.println("Lunch Pre-Booked Special Rate Adults" + "@   total number of adults   " + numberOfAdults
				+ "     $ " + priceHotelLunchforadults);

		System.out.println("Lunch Pre-Booked Special Rate Children " + "@    totalNumOFChildren    "
				+ totalNumOFChildren + " $   " + priceHotelLunchforchildren);

		System.out.println("Total price:                 $" + totalPrice);
		System.out.println("HST@18%:                 $" + taxCalucaltion);
		System.out.println("Final Price:                 $" + finalTotalbill);

	}
}
