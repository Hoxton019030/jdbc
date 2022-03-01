package 進階;

public class M3_Demo {

	public static void main(String[] args) {
		int[][] intListList = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int[] is : intListList) {
			for (int 一個東西 : is) {

				System.out.print(一個東西 + ",");
			}
			System.out.println();
		}

	}

}
