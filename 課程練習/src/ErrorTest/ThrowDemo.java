package ErrorTest;

public class ThrowDemo {
	static void math_div(int n1, int n2) {
		try {
			if (n2 == 0)
				throw new ArithmeticException("���Ƭ��s");
			int div = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + div);

		} catch (ArithmeticException e) {
			System.out.println("�ҥ~���e:" + e.getMessage());

		}
	}

	public static void main (String[] args) {
		int num1, num2;
		num1 = 6;
		num2 = 3;
		System.out.println("�Q���� =" + num1 + ",����" + num2);
	}

}
