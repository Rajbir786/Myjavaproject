package asign6;

import java.util.Scanner;

public class BrandSelect {String appleBrand = "Apple";
String samsungBrand = "Samsung";

Scanner scn = new Scanner(System.in);
String modelsOfSamsung[] = { "S22", "S22+", "S22Ultra", "S22FE" };
String modelsOfApple[] = { "IPhone14", "IPhone14pro", "IPhone14promax", "IPhone14mini" };
String customerSelectedModelofPhone="";
int count;
String customerSelectedBrand;

public String mobBrandSel() {
do {
	System.out.println("Please enter brand");

	String customerSelectedBrand = scn.next();

	switch (customerSelectedBrand) {
	case "Apple":

		System.out.println("Follwing is list of Apple phones?");

		System.out.println("IPhone14,  " + "IPhone14pro,  " + "IPhone14promax,   " + "IPhone14mini,   ");
	

		

		break;

	case "Samsung":

		System.out.println("Follwing is list of Samsung phones?");
		for (int i = 0; i < modelsOfApple.length; i++) {
			System.out.println(modelsOfSamsung[i]);
		}


		break;

	default:
		System.out.println("inavlid selection of brand and try again"+customerSelectedBrand);

		break;
		

	}} while(!(customerSelectedBrand.equals("Apple")||customerSelectedBrand.equals("Samsung")));
	return(customerSelectedBrand);
}

}

