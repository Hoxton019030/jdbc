package c2_module4;
//示範用

//應該怎麼寫

public class M4_Demo1 {

	private int a = 100;
	public static int a2 = 100;

	// 相加
	public int addNum(int a, int b) {
		// 動詞開頭
		int c = a + b;
		this.setA(0);
		this.a2 = 50;
		return c;
	}

	// 印出
	public void print(int a) {
		System.out.println(a);
		System.out.println("a2=" + this.a2);
		return;
	}

	public static double culBMI(double height, double weight) {
		a2 = 1000;
		double bmi = weight / Math.pow(height, 2);
//		double bmi=weight/(height*height);
		return bmi;
	}

	public static double culBMI(int height, double weight) {
		double bmi = weight / Math.pow((double)height/100, 2);
		return bmi;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
