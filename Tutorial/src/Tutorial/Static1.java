package Tutorial;

public class Static1 {
	static void sub(int x, int y) {
		System.out.println("呼叫static1類別的sub方法-->");
		System.out.println(x + "-" + y + "=" + (x - y));
	}

	public static void main(String[] args) {
		int a = 25;
		sub(a - 5, 3);
		Static2.sub(a + 3, 5);
	}

}

class Static2 {
	static void sub(int x, int y) {
		System.out.println("呼叫Static 2 類別的sun方法-->");
		System.out.println(x + "-" + y + "=" + (x - y));
	}
}
