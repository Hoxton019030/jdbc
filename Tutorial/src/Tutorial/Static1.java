package Tutorial;

public class Static1 {
	static void sub(int x, int y) {
		System.out.println("�I�sstatic1���O��sub��k-->");
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
		System.out.println("�I�sStatic 2 ���O��sun��k-->");
		System.out.println(x + "-" + y + "=" + (x - y));
	}
}
