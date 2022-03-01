import java.util.Arrays;

public class Random_原始版 {

	private static int i;

	public static void main(String[] args) {
		int[] Ramdom = new int[6];
		for (int i = 0; i < 6; i++) {
			Ramdom[i] = (int) Math.floor(Math.random() * 49 + 1);

			aa: for (int j = 0; j < i; j++) {
				if (Ramdom[i] == Ramdom[j]) {
					Ramdom[i] = (int) Math.floor(Math.random() * 49 + 1);
					continue aa;
				}
			}
			Arrays.sort(Ramdom);
			for (int j : Ramdom) {
				System.out.print(j + ",");
			}
			System.out.println();
		}
	}

}
