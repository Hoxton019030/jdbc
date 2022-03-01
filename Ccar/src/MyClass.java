
public class MyClass {
	static void sub(int x, int y) {
		System.out.println("呼叫Myclass類別的sub方法-->");
		System.out.println(x + "-" + y + "=" + (x - y));

	}

	public static void main(String[] args) {
		
		int a = 25;
		sub(a - 5, 3);
		MyCal c2 = new MyCal();
		c2.sub(a + 3, 5);

	}
}

class MyCal {
	void sub(int x, int y) {
		System.out.println("呼叫Myclcal類別的sub方法-->");
		System.out.println(x + "-" + y + "=" + (x - y));

	}
}