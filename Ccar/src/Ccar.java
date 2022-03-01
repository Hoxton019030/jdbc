
public class Ccar {
	public double gas;
	public double tbo;
	public double max_dist = 0;

	public void maxDist() {
		max_dist = gas * tbo;
	}
	
	public double dist(double oil) {
		return oil * tbo;
	}

}
