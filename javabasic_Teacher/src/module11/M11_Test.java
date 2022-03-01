package module11;

import java.util.Scanner;

public class M11_Test {

	public static void main(String[] args) {
		// 1~100
		int total = 0;
		String s = null;
		banana: for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (j == 5) {
					break banana;
				}
				System.out.print(j + "X" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
//		System.out.println("total="+total);
	}

}
