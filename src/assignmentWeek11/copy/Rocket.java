package assignmentWeek11.copy;

public class Rocket implements SpaceShip {

	public int cost;
	private int weightRocket;
    public int maxCargo;
	int currentweight = 0;
    public Rocket(int cost, int maxCargo) {
	this.cost=cost;
	this.maxCargo=maxCargo;
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

	@Override
	public int carry(Item item) {
		this.currentweight = this.currentweight + item.weight;
		// TODO Auto-generated method stub
		return this.currentweight;
	}

}
