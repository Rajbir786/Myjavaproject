package AssignmentWeek6;//Question1 Class1

import java.util.Scanner;

public class MobileOsBrandSelection {

	String appleBrand = "Apple";
	String samsungBrand = "Samsung";

	Scanner scn = new Scanner(System.in);
	String modelsOfSamsung[] = { "S22", "S22+", "S22Ultra", "S22FE" };
	String modelsOfApple[] = { "IPhone14", "IPhone14pro", "IPhone14promax", "IPhone14mini" };
	String customerSelectedModelofPhone = "";
	int count;
	String customerSelectedBrand;

	public String mobBrandSel() {

		System.out.println("Please enter brand");

		String customerSelectedBrand = scn.next();

		switch (customerSelectedBrand) {
		case "Apple":

			System.out.println("Follwing is list of Apple phones?");

			System.out.println("IPhone14,  " + "IPhone14pro,  " + "IPhone14promax,   " + "IPhone14mini,   ");
			System.out.println("Please enter which model of Apple do you like? ");

			customerSelectedModelofPhone = scn.next();

			break;

		case "Samsung":

			System.out.println("Follwing is list of Samsung phones?");
			for (int i = 0; i < modelsOfApple.length; i++) {
				System.out.println(modelsOfSamsung[i]);
			}

			System.out.println("Please enter which model of Samsung do you like? ");
			customerSelectedModelofPhone = scn.next();
			for (int i = 0; i < modelsOfSamsung.length; i++) {

				if (customerSelectedModelofPhone.equals(modelsOfSamsung[i])) {
					System.out.println("Customer selected" + customerSelectedModelofPhone);
				}

			}

			break;

		default:
			System.out.println("inavlid selection of brand and try again");

			break;

		}

		return (customerSelectedModelofPhone);
	}
}
