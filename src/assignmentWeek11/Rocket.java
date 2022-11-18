package assignmentWeek11;

public class Rocket implements SpaceShip {

	public int cost;
	private int weightRocket;
	public int maxCargo;
	public int currentweight = 0;

	public Rocket(int cost, int maxCargo) {
		this.cost = cost;
		this.maxCargo = maxCargo;
	}

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean canCarry(Item item) {
		return this.currentweight + item.weight <= maxCargo;

	}

	public int carry(Item item) {
		this.currentweight = this.currentweight + item.weight;
		// TODO Auto-generated method stub
		return this.currentweight;
	}

}
