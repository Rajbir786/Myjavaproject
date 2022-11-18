package assignmentWeek11;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Simulation {
	public  ArrayList<Item> loadItems() throws NumberFormatException, IOException {
		File file = new File("C:\\Users\\Rajbir\\Downloads\\phase-1.txt");
		ArrayList<Item> allData = new ArrayList<>();//
		String inputLine;

		BufferedReader readFile = new BufferedReader(new FileReader(file));
		while ((inputLine = readFile.readLine()) != null) // It checks if the file reader is ready to be read.
		{
			int indexOfequal = inputLine.indexOf("=");// "index of = sign in string we find
			String nameItem = inputLine.substring(0, indexOfequal);// then part those string
			String weightItem = inputLine.substring(indexOfequal + 1);// then divide those string
			Item item = new Item(nameItem, Integer.valueOf(weightItem));
			allData.add(item);// here create object of Item class and pass the
								// arguments it.

		}
		readFile.close();//
		for (int j = 0; j < allData.size(); j++) {
			System.out.println("allData arraylist has   " + allData.size() + "Items that need to send to Mars");

			break;
		}
		return allData;

	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> allData1) {
		ArrayList<Rocket> R1Rockets = new ArrayList<>();
		Rocket rocket = new R1();
		R1Rockets.add(rocket);

		for (Item item : allData1) {
			if (rocket.canCarry(item)) {
				rocket.carry(item);

			} else {
				rocket = new R1();
				R1Rockets.add(rocket);
				rocket.carry(item);

			}
		}
		System.out.println("total number of rockets in R1Fleet   " + R1Rockets.size());
		return R1Rockets;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> allData1) {
		ArrayList<Rocket> RocketsR2 = new ArrayList<>();
		Rocket rocket = new R2();
		RocketsR2.add(rocket);
		for (Item item : allData1) {
			if (rocket.canCarry(item)) {
				rocket.carry(item);

			} else {
				rocket = new R2();
				RocketsR2.add(rocket);
				rocket.carry(item);

			}
		}

		System.out.println("total number of rockets in R2Fleet   " + RocketsR2.size());
		return RocketsR2;
	}

	public void runSimulationR1(ArrayList<Rocket> rocketsR1) {
		int counter = 0;
		Rocket rocket = new R1();
		for (int i = 0; i < rocketsR1.size(); i++) {

			if ((rocketsR1.get(i).launch()) && (rocketsR1.get(i).land())) {
				counter++;
			} else {
				rocketsR1.get(i).launch();

			}
		}

		System.out.println(counter + "  time rockets R1 succefully launch and land");

		int totalCostR1Fleet = (rocket.cost * counter);
		System.out.println("Total budget of R1 fleet:$" + totalCostR1Fleet + "million");
	}

	public void runSimulationR2(ArrayList<Rocket> r2Rockets) {
		int counter2 = 0;
		Rocket rocket = new R2();

		for (int i = 0; i < r2Rockets.size(); i++) {
			if ((r2Rockets.get(i).launch()) && (r2Rockets.get(i).land())) {
				counter2++;
			} else {
				r2Rockets.get(i).launch();

			}

		
		}

		System.out.println(counter2 + "  time rockets  R2 rockets successfully launch and land ");
		int totalCostR1Fleet = (rocket.cost * counter2);
		System.out.println("Total budget of R1 fleet:$" + totalCostR1Fleet + "million");
	}
}
