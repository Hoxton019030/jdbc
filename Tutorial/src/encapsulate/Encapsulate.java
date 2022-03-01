package encapsulate;

class Ccar {
	private double gas;
	private double tbo;
	private double max_dist;

	private void maxDist() {
		max_dist = gas * tbo;
	}
	public void setValue(double g, double t) {
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
		Ccar car1;
		car1 = new Ccar();
		double g1 = 40;
		double t1 = 13.6;
		car1.setValue(g1, t1);
		double distance1 = car1.getDist();
		System.out.printf("car1 �[���o�i��p%skm ", distance1);
		Ccar car2 = new Ccar();
		car2.setValue(60, 9.5);
		System.out.printf("car2 �[���o�i��p%skm ", car2.getDist());
	}

}
