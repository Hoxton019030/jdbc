package Tutorial;

public class Method_1 {
	public static void main(String[] args) {
		factorial(6);
		factorial(9);
		mul mul_2 = new mul();
		mul_2.mul_1(4, 8);
	}

	static void factorial(int x) {
		int i = x;
		int j = 1;
		while (i > 0) {
			j *= i;
			i--;
		}
		System.out.println(j);
	}
}

class mul {
	void mul_1(int y, int z) {
		System.out.println(y * z);
	}
}