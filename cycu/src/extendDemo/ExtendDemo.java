package extendDemo;

class CMath {
	public void getMax(int a, int b) {
		int bigNum;
		if (a > b)
			bigNum = a;
		else
			bigNum = b;
		System.out.printf("%d與%d的最大數為%d", a, b, bigNum);
	}
}

class SonCMath extends CMath123 {
	public void getFactorial(int a) {
		int ans = 1, i;
		System.out.printf("%d!=", a);
		for (i = 1; i < a; i++) {
			System.out.println(i + "*");
			ans *= i;
		}
		ans *= a;
		System.out.printf("%d=%d", a, ans);
	}
}

public class ExtendDemo {
	public static void main(String[] args) {
		SonCMath123 math1 = new SonCMath123();
		math1.getMax(10, 20);
		System.out.println();
		math1.getFactorial(5);
	}
}
