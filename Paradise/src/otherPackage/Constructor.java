package otherPackage;

class Ccar {
	private double gas = 50;
	private double tbo = 12;
	private double max_dist;

	private void setGas(double g) {
		if (g > 30 && g < 80)
			gas = g;
	}

	private void setTbo(double t) {
		if (t > 4 && t < 20)
			tbo = t;
	}

	private void maxDist() {
		max_dist = gas * tbo;
	}

	public Ccar() {
		maxDist();
	}

	public Ccar(double g) {
		setGas(g);
		maxDist();
	}

	public double getDist() {
		return max_dist;
	}
}

public class Constructor{
	public static void main (String[] args) {
		Ccar car1 = new Ccar();
		System.out.println("new Ccar() 加滿油可行駛"+car1.getDist()+"km");
	}
}
