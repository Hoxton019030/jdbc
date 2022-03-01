package extendDemo;

class CMath123 {
	public void getMax(int a, int b) {
		int bigNum;
		if (a > b)
			bigNum = a;
		else
			bigNum = b;
		System.out.printf("%d與%d的最大數為%d", a, b, bigNum);
	}
}

class SonCMath123 extends CMath123 {
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

class GrandSonCMath extends SonCMath123{
	public void getFabonacci(int a) {
		int firstNum = 0 , secondNum = 1;
		System.out.println("費式數列:");
		System.out.printf("%d,%d",firstNum,secondNum);
		int ans;
		for (int i =2 ; i<=a ;i++) {
			ans = firstNum + secondNum;
			System.out.printf(",%d",ans);
			firstNum = secondNum;
			secondNum = ans;
		}
	}
}
public class MoreExtendDemo {
	public static void main(String[] args) {
		GrandSonCMath math2 = new GrandSonCMath();
		math2.getMax(10, 20);
		math2.getFactorial(5);
		math2.getFabonacci(10);
	}
}
