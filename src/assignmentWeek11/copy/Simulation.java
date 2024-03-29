package assignmentWeek11.copy;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Simulation{
	public ArrayList loadItems() throws NumberFormatException, IOException {
		File file = new File("C:\\Users\\Rajbir\\Downloads\\phase-1.txt");
		ArrayList<Item> allData = new ArrayList<>();//
		String inputLine;
        BufferedReader readFile = new BufferedReader(new FileReader(file));
       
		while ((inputLine = readFile.readLine()) != null) // It checks if the file reader is ready to be read.
		{
			int indexOfequal =inputLine.indexOf('=');//"index of = sign in string we find 
			 String name =inputLine.substring(0,indexOfequal);//then part those string
			 String weight=inputLine.substring(indexOfequal+1);//then divide those string
			 Item item=new Item(name, Integer.parseInt(weight));
			 allData.add(item);//here create object of Item class and pass the arguments it.
			
		}
		readFile.close();//
		for (int j = 0; j < allData.size(); j++) {
			System.out.println(" Yes, yes, allData arraylist has" + allData.size() + "Items that need to send to Mars");

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
				
				R1Rockets.add(rocket);
				rocket = new R1();
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

		System.out.println("total budget of rockets in R2Fleet   " + RocketsR2.size());
		return RocketsR2;
	}

	public void runSimulationR1(ArrayList<Rocket> rocketsR1) {
		int counter = 0;
		Rocket rocket = new R1();
		for (int i=0;i<rocketsR1.size();i++) {
			
while((!rocket.launch())&&(!(rocket.land()))) {
	rocket.launch();
	counter++;
			}
		}

		System.out.println(counter + "  time rocketsR1");;
		
		int totalCostR1Fleet=(100*counter);
		System.out.println("Total cost of R1 fleet:$"+totalCostR1Fleet+"million");
	}

	public void runSimulationR2(ArrayList<Rocket> r2Rockets) {
		int counter2 = 0;
		 Rocket rocket = new R2();
		 for (int i=0;i<r2Rockets.size();i++) {
				
			 while((!rocket.launch())&&(!(rocket.land()))) {
				rocket.launch();
				counter2++;
			 			}
			
			}
		
		 
		System.out.println(counter2 + "  time rockets successful during launcing of R2");
		int totalCostR1Fleet=(120*counter2);
		System.out.println("Total budget of R2 fleet:$"+totalCostR1Fleet+"million");
	}}

		
	
	

