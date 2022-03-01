package Tutorial;

import java.util.Scanner;

public class Recursive {
	public static void main(String[] args) {
		System.out.println("請輸入一個整數 :");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		recursive(input);
		System.out.printf("你輸入的數字是%d,它的累計階層是%d",input,recursive(input));
		
		
	}
	static long recursive(int x) {
		long total = 0; 
		if(x ==1) {
			return x;
		}
		else {
			total = x + recursive(x-1);
			return total;
		}
		
	}
		
	

}
