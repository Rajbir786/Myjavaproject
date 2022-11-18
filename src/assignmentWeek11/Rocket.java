package assignmentWeek11;

public class Rocket implements SpaceShip {

	public int cost;
	private int weightRocket;
	private int maxWeightwithCargo;
	public int maxCargo;
	int currentweight = 0;

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
		return this.currentweight + item.weight <= this.maxCargo;

	}

	@Override
	public int carry(Item item) {
		this.currentweight = this.currentweight + item.weight;
		// TODO Auto-generated method stub
		return this.currentweight;
	}

}
