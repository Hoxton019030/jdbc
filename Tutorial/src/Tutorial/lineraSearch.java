package Tutorial;

import java.util.Scanner;

public class lineraSearch {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入一個數字 :");
		int input = scanner.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == input) {
				System.out.println(array[i] + "這是第" + (i + 1) + "個數字");
				break;
			} else {
				if (i + 1 == array.length) {
					System.out.println("沒這個數字");

				}
			}
		}

		scanner.close();
	}

}
