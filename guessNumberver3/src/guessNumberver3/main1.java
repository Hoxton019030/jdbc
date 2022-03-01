package guessNumberver3;

import java.util.Scanner;

public class main1 {
	public static void main(String[] args) {
		int max = 100;
		int min = 0;
		int answer = (int) (Math.random() * 100);
		int reply;
		System.out.println("請輸入你的名字！");
		Scanner scn = new Scanner(System.in);
		String username = scn.nextLine();
		System.out.println("歡迎！" + username);
		System.out.println(answer);
		while (true) {

			System.out.println("請輸入一個" + max + "到" + min + "的數字");
			reply = scn.nextInt();
			if (reply > answer) {
				max = reply;
			} else if (answer > reply) {
				min = reply;
			} else if (answer == reply) {
				System.out.println("答對了!好棒喔!");
				break;

			}
		}

	}

}
