import java.util.Scanner;

public class main1 {
	public static void main(String[] args) {
		int max = 100;
		int min = 0;
		int answer = (int) (Math.random() * 100);
		int reply;
		System.out.println("�п�J�A���W�r�I");
		Scanner scn = new Scanner(System.in);
		String username = scn.nextLine();
		System.out.println("�w��" + username);
		System.out.println(answer);
		while (true) {

			System.out.println("�п�J�@��" + max + "�숰" + min + "���Ʀr");
			reply = scn.nextInt();
			if (reply > answer) {
				max = reply;
			} else if (answer > reply) {
				min = reply;
			} else if (answer == reply) {
				System.out.println("����F!�n�γ�!");

			}
			
		}

	}

}
