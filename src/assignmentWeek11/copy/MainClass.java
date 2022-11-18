package assignmentWeek11.copy;

import java.io.IOException;
import java.util.ArrayList;

public class MainClass {
	public static void main(String args[]) throws IOException {

		Simulation simlation = new Simulation();

		ArrayList allData1 = simlation.loadItems();
		ArrayList rocketsR1 = simlation.loadU1(allData1);
		ArrayList r2Rockets = simlation.loadU2(allData1);
		simlation.runSimulationR1(rocketsR1);
		simlation.runSimulationR2(r2Rockets);


	}
}