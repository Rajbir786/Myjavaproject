package assignmentWeek11;

public class R2 extends Rocket {
	public R2() {

		this.cost = 120;// million
	    this.maxCargo = 11000;//kg
	}

	public boolean launch() {
		double random = (Math.random());
		double chanceOfExplosion = (0.04 * (currentweight / this.maxCargo));
		if (chanceOfExplosion <=random) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean land() {
		double random = (Math.random());
		double chanceOfCrashing = (0.08 * (currentweight / this.maxCargo));

		if (chanceOfCrashing <=random) {
			return true;
		} else {
			return false;
		}
	}

}
