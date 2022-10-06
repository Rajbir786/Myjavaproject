package Assignment5Week;

public class WaterTank {
	public static void main(String[] args) {
		
	int tankHas;
	int tankCapacity = 100;
	int oneBucketCapacity = 10;
	for (int i = 1; i <= 10; i++) {
		tankHas = i * oneBucketCapacity;
		System.out.println("now tank has water" + tankHas + "litre of water");
		if ( tankHas>=tankCapacity) {
			System.out.println("tank is full stopp adding water TO avoid overflow");
			break;
		}

	}

}

}



