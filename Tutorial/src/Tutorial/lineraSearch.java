package Tutorial;

import java.util.Scanner;

public class lineraSearch {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		Scanner scanner = new Scanner(System.in);

		System.out.println("�п�J�@�ӼƦr :");
		int input = scanner.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == input) {
				System.out.println(array[i] + "�o�O��" + (i + 1) + "�ӼƦr");
				break;
			} else {
				if (i + 1 == array.length) {
					System.out.println("�S�o�ӼƦr");

				}
			}
		}

		scanner.close();
	}

}
