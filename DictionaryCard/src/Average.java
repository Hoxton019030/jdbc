
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score = 0;
		int sum = 0;
		int num = 0;
		while (score != -1) {
			System.out.println("�п�J����");
			score = scn.nextInt();
			if (score != -1) {
				sum += score;
				num++;
			}
		}
		System.out.println("�������� = " + (double) ((sum) / (num)));

	}

}
