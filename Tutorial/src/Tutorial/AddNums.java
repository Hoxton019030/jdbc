package Tutorial;

public class AddNums {

	public static void main(String[] args) {
		System.out.printf("%n%d", add(1,2,3,4,5,6));
	}

	static int add(int... a) {

		int total = 0;
		for (int i : a) {
			total += i;
		}

		return total;
	}

}
