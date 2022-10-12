package WHILEloop;

import java.util.Scanner;

public class MobileBrandSelection {
	public static void main(String args[])
	
{
		 String appleBrand="Apple";
			String samsungBrand="Samsung";
			
			Scanner scn=new Scanner(System.in);
			String modelsOfSamsung[]= {"S22","S22+","S22Ultra","S22FE"};
			String modelsOfApple[]= {"IPhone14" ,"IPhone14pro","IPhone14promax","IPhone14mini"};
			String  customerSelectedModelofPhone;
			int count;
		      String customerSelectedBrand;
	do {
	
	
		 System.out.println("Please enter brand");
		
	     customerSelectedBrand= scn.next();
	   
	

	switch(customerSelectedBrand)
	{
	case "Apple":
		
	
		System.out.println("Follwing is list of Apple phones?");
		/*for(int i=0;i< modelsOfApple.length;i++)
		{
			System.out.println(modelsOfApple[i]);
		
		}*/
		System.out.println("IPhone14,  "+"IPhone14pro,  "+"IPhone14promax,   "+"IPhone14mini,   ");
		System.out.println("Please enter which model of Apple do you like? ");

		  customerSelectedModelofPhone=scn.next();
		 
		/*for(int i=0;i< modelsOfApple.length;i++) {
			
		
		if(customerSelectedModelofPhone.equals(modelsOfApple[i]))
		{
			System.out.println("Customer selected"+customerSelectedModelofPhone);
			 count++;
			}
		if(count==0)
		{
				System.out.println("invalid");
			}
	
		}*/
		
			break;
		
		
	case "Samsung":
	
		System.out.println("Follwing is list of Samsung phones?");
		for(int i=0;i< modelsOfApple.length;i++)
		{
			System.out.println(modelsOfSamsung[i]);
		}

		//System.out.println("S22, "+" S22+ , "+ "S22Ultra,  "+"S22FE  ");
		System.out.println("Please enter which model of Samsung do you like? ");
		 customerSelectedModelofPhone=scn.next();
		for(int i=0;i<modelsOfSamsung.length;i++)
		{
			 
		if(customerSelectedModelofPhone.equals(modelsOfSamsung[i]))
		{
			System.out.println("Customer selected"+customerSelectedModelofPhone);
		}
		
			
		}
		
	 break;
	
	default:
		System.out.println("inavlid selection of brand and try again");
	
		
	
break;
	} }
	while((customerSelectedBrand!="Apple"&&customerSelectedBrand!="Samsung"));
	
	
	} 
}
	
		 
		 
		 

