/* Write a program to prepare the bill for a pizza shop.
     a. Assume an order and work out the final bill.
     b. Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
     c. For additional c: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
     d. Extra cheese for any size pizza: + $1
 . For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
 . “Your final bill is $24”*/

package Assignment5Week;

public class PizzaBill {

	public static void main(String[] args) {
		String pizzaSize = "small";

		boolean extChs = true;
		boolean pepproniAdd = true;
		int bill = 0;
		{

			switch (pizzaSize) {
			case "small":

				bill = bill + 15;

				if (pepproniAdd == true) {

					bill = bill + 2;
				}
				if (extChs == true) {
					bill = bill + 1;
				}
				break;
			case "large":

				bill = bill + 25;

				if (pepproniAdd == true) {

					bill = bill + 3;
				}
				if (extChs == true) {
					bill = bill + 1;
				}

				break;
			case "medium":

				bill = bill + 20;

				if (pepproniAdd == true) {

					bill = bill + 3;
				}
				if (extChs == true) {
					bill = bill + 1;
				}

				break;

			default:
				System.out.println("enter correct size of pizza");

				break;

			}

			System.out.println("Total bill is " + bill);
		}
	}
}