
//There is a water tank of capacity 100 litres
// Water is filled into it using bucket which have capacity of 10 litres.
//Write a program which fills the tank to its capacity using these buckets. Also include a mechanism in your program to stop the tank from over flowing.

package Assignment5Week;

public class WaterTank {
public static void main(String[] args) {
int[] numbers=new int[5];
for(int i=0;i<6;i++){
System.out.println(numbers[i]);
}
  		         }
}
/*public class WaterTank {
	public static void main(String[] args) {

		int maxTankCapacity = 100;
		int bucketCapacity = 10;

		for (int currentWaterInTank =10; currentWaterInTank <= 100; currentWaterInTank += 10) {
			
		
			if (currentWaterInTank>= maxTankCapacity) {
				System.out.println("stop adding water to avoid overflow");
				break;
			}
			System.out.println("Current level of water in tank " + currentWaterInTank + "litres");
		}
	}

}
 */