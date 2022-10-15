package asign6;

import java.util.Scanner;

import AssignmentWeek6.MonthlyPlans;

public class MobileMain {
	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		System.out.println("*Welcome to Mobile Shop*");
		System.out.println("We have two types of OS brands which one do you want to buy?/n Apple or Samsung");

		BrandSelectMobile mselB = new BrandSelectMobile();//creating instance of Class BrandSelectMobile 
		String customerSelectedBrand = mselB.mobBrandSelected();//showing on console which brand is selected 
		System.out.println("Customer selected brand is" + customerSelectedBrand);//showing on console which brand is selected 
		String customerSelectedModel = mselB.mobModelSelect();//with object of Class  BrandSelectMobile invoked a mobModelSelect() method to get model that is selected and here
		                                                       //invalidation also checked
		System.out.println("Customer selected model is" + customerSelectedModel);//showing on console which model is selected 
		
        String monthlySelectedPlan = mselB.monthlyPlanSelect();//with object of Class  BrandSelectMobile invoked a monthlyPlanSelect() method to get model that is selected where
		                                                        //invalidation also checked
       
        int phoneTabPrice=mselB.priceOfTab();//priceOfTab method is invoked to get price of tab according to selected model
        int monthlyPlanCharges=mselB.planChargesMonthly();//planChargesMonthly method is invoked to get charges for monthly selected plan
	    int totalPhoneAmount=phoneTabPrice+monthlyPlanCharges;
		System.out.println("********Total Amount of phone is********"+totalPhoneAmount);
		
		
		

	}
}
