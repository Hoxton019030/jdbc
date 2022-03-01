
public class Method1 {
	public static void main(String[] args) {
		Method1 Method1 = new Method1();
		Method1.factorial(6);
		Method1.factorial(9);
	}

	void factorial(int x) {
		int i = x;
		int j = 1;
		while (i > 0)
			j *= i--;
		System.out.println(x + "!=" + j);

	}

}
