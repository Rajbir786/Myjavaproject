package learningMethods;
import java.util.Scanner;

public class MilkAvailMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		MilkAvail mAv = new MilkAvail();
		
		System.out.println("do you have milk");
		boolean milkAvailableYesOrNo = scn.nextBoolean();
		boolean milkAvailablility = mAv.isMilkAvailable(milkAvailableYesOrNo);
	
	if(milkAvailablility==true) {
		System.out.println("Milk is available");
	}
		else {
			System.out.println("Milk is  not available");
		}
	}
		
}	
	




