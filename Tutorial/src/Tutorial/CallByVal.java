package Tutorial;

import java.awt.desktop.PrintFilesEvent;

public class CallByVal {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		System.out.println("before a =" + a);
		System.out.println("before b =" + b);
		byVal(a, b);
		System.out.println();
		System.out.printf("after a = %d", a);
		System.out.println();
		System.out.printf("after b = %d", b);

	}

	static void byVal(int x, int y) {
		int t;
		t = x;
		x = y;
		y = t;
		System.out.printf("In call , x = %d", x);
		System.out.println();
		System.out.printf("In call , y = %d", y);
	}

}
