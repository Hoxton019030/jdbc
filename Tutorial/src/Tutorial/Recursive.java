package Tutorial;

import java.util.Scanner;

public class Recursive {
	public static void main(String[] args) {
		System.out.println("�п�J�@�Ӿ�� :");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		recursive(input);
		System.out.printf("�A��J���Ʀr�O%d,�����֭p���h�O%d",input,recursive(input));
		
		
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
