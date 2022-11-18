package assignweek10;

public class FamilySuite extends HotelBooking {

	double priceatHotelStay = 0;

	public void priceHotelStay() {
		System.out.println("Please enter number of days of stay ");
		noOfdaysStayHotel = sc.nextInt();

		priceatHotelStay = (230 * noOfdaysStayHotel);

	}

	public void displayFinal() {
		System.out.println(roomSelcted + "  " + noOfdaysStayHotel + " @ nights" + priceatHotelStay);
		System.out.println("Lunch Pre-Booked Special Rate Adults" + "@   total number of adults   " + numberOfAdults
				+ "     $ " + priceHotelLunchforadults);

		System.out.println("Lunch Pre-Booked Special Rate Children " + "@    totalNumOFChildren    "
				+ totalNumOFChildren + " $   " + priceHotelLunchforchildren);

		System.out.println("Total price:                 $" + totalPrice);
		System.out.println("HST@18%:                 $" + taxCalucaltion);
		System.out.println("Final Price:                 $" + finalTotalbill);
	}

}
