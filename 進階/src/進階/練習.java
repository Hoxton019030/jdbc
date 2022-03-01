package 進階;

public class 練習 {
	public static void main(String[] args) {
		int[][] intListList = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] is = intListList[2];
		int[] is2 = new int[3];
		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
			{
				is2[i] = intListList[i][1];
			}

		}
		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
		}
		System.out.println();
		for (int i = 0; i < is2.length; i++) {
			System.out.println(is2[i]);

		}
		System.out.println(intListList[0][2]);
	}

}
