
public class CallByVal {
	public static void main(String[] arsgs) {
		int a = 10;
		int b = 15;
		System.out.println("�ǭȩI�s�e\t a=" + a + "\t b = " + b);
		byVal(a,b);
		System.out.println("�ǭȩI�s��\t a=" + a + "\t b = " + b);

	}

	static void byVal(int x, int y) {
		int t;
		t = x;
		x = y;
		y = t;
		System.out.println("�ǭȩI�s��\t x=" + x + "\t y = " + y);

	}

}
