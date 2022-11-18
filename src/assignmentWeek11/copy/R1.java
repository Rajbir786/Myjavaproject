package assignmentWeek11.copy;

public class R1 extends Rocket {
	public R1() {
		super(100,8000);
	}
		
	

	public boolean launch() {

		double random = (Math.random()/17);

		double chanceOfExplosion = (0.05 * (currentweight /this.maxCargo ));
		if (chanceOfExplosion<= random) {
			return true;
		} else {
			return false;
		}
	}

	public boolean land() {

		double random= (Math.random()/11);
		double chanceLandingCrash = (0.01 * (currentweight /this.maxCargo ));
		if (chanceLandingCrash <=random) {
			return true;

		} else {
			return false;
		}
	}
}
