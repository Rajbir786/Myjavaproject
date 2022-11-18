package assignmentWeek11;

import java.io.IOException;
import java.util.ArrayList;

public class MainClass {
	public static void main(String args[]) throws IOException {

		Simulation simlation = new Simulation();

		ArrayList allData1 = simlation.loadItems();//call loadItems method and store result into allData1 Arraylist.
		ArrayList rocketsR1 = simlation.loadU1(allData1);//call loadU1 method and store result into rocketR1 Arraylist.
		ArrayList r2Rockets = simlation.loadU2(allData1);//call loadU2 method and store result into r2Rockets Arraylist.
		simlation.runSimulationR1(rocketsR1);//call runSimulationR1 method to run R1 ROCKETS
		simlation.runSimulationR2(r2Rockets);//call runSimulationR2 method to run R2 ROCKETS

	}
}