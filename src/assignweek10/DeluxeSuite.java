package assignweek10;

public class DeluxeSuite extends HotelBooking {

	double priceatHotelStay = 0;

	public void priceHotelStay() {
		System.out.println("Please enter number of days of stay ");
		noOfdaysStayHotel = sc.nextInt();

		priceatHotelStay = (180 * noOfdaysStayHotel);

	}

	public void displayFinal() {
		System.out.println("Delux Suite" + "  " + noOfdaysStayHotel + " @ nights" + priceatHotelStay);
		System.out.println("Lunch Pre-Booked Special Rate Adults" + "@  number of adults  " + numberOfAdults + "   $  "
				+ priceHotelLunchforadults);

		System.out.println("Lunch Pre-Booked Special Rate Children " + "  @  number of adults  " + totalNumOFChildren
				+ " $  " + priceHotelLunchforchildren);

		System.out.println("Total price:                 $" + totalPrice);
		System.out.println("HST@18%:                 $" + taxCalucaltion);
		System.out.println("Final Price:                 $" + finalTotalbill);
	}

	public void totalPricewithlunchprice() {
		totalPrice = (priceatHotelStay + priceHotelLunchforadults + priceHotelLunchforchildren);

	}

	public void calFinalPrice() {
		finalTotalbill = totalPrice + taxCalucaltion;

	}
}
