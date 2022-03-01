package Tutorial;

public class Ccar {
	double gas;
	double tbo;
	double max_dist = 0;

	public void maxDist() {
		max_dist = gas * tbo;
	}
	public double dist(double oil) {
		return oil*tbo;
	}
}
