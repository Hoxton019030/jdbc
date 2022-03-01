package cycu;

import java.util.Scanner;

public class sodadasd {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			banana:for (int j = 1; j < 10; j++) {
				if(j==5) break banana;
				System.out.print(i * j +"\t");
			}
			System.out.println();
		}
	}

}
