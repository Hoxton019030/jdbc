package Tutorial;

public class Method2 {

	public static void main(String[] args) {
		System.out.println(factorial(6));
		factorial(9);

	}

	static int factorial(int x) {
		int j = 1;
		while (x > 0) {
			j *= x;
			x--;
		}
		return j;
	}

}