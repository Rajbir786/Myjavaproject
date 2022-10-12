package Forloop;

public class WaterTank2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxTankCapacity = 100;
		int bucketCapacity=10;
		int currentWaterInTank=0;
		
		while(currentWaterInTank<=100 )
		{
			
			currentWaterInTank+=10;
			
			if(currentWaterInTank>=maxTankCapacity)
			{
				System.out.println("STOP ADDING WATER OTHERWISE WATER OVERFLOW");
				break;
			}
			System.out.println("water in the tank is"+currentWaterInTank);
			
			}
				
			}
			
}
	


