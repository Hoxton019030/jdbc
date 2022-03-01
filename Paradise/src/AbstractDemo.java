
abstract class Cscore {
	protected int chia;
	protected int math;

	public abstract double avgScore();

	protected Cscore(int chia, int math) {
		this.chia = chia;
		this.math = math;
	}

}

class SimpleAvg extends Cscore {
	SimpleAvg(int chia, int math) {
		super(chia, math);

	}

	@Override
	public double avgScore() {
		// TODO Auto-generated method stub
		return (float) (chia + math) / 2;
	}

}

class WeightAvg extends Cscore {
	private int w1;
	private int w2;

	WeightAvg(int chia, int math, int w1, int w2) {
		super(chia, math);
		this.w1 = w1;
		this.w2 = w2;

	}

	public double avgScore() {
		return (float) (chia * w1 + math * w2) / (w1 + w2);

	}

}

public class AbstractDemo {
	public static void main(String[] args) {
		String name = "Hoxton";
		int chia = 92;
		int math = 83;
		SimpleAvg avg1 = new SimpleAvg(chia, math);
		System.out.println("姓名\t國文\t數學\t平均分數");
		System.out.println(name + "\t" + chia + "\t" + math + "\t" + avg1.avgScore());

	}
}