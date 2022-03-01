package 進階;

public class addNum {
	public static void main(String[] args) {
		AddUtil addutil = new AddUtil();
		
		System.out.println(addutil.addNum(1,3
		System.out.println(addutil.addNum(1.15,3.646));

		
	}

}

class AddUtil{
	public int addNum(int a, int b) {
		int c = a+b;
		return c;
	}
	public double addNum(double a, double b) {
		double c = a+b;
		return c;
	}
	
}
