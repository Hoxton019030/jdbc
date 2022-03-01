package 進階;


class Ccar {
	private double gas;
	private double tbo;
	private double max_dist;

	private void maxDist() {
		max_dist = gas * tbo;
	}

	public void setVaule(double g, double t) {
		gas = g;
		tbo = t;
		maxDist();
	}

	public double getDist() {
		return max_dist;
	}

}

public class Encapsulate {
	public static void main(String[] args) {
		
	}
}

