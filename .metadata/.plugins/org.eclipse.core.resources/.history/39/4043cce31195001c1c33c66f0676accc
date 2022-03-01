import java.util.Scanner;

public class Humanplayer implements player {

	@Override
	public void nameSelf() {
		System.out.println("請輸入你的名字！");
		Scanner scn = new Scanner(System.in);
		String username = scn.nextLine();
		System.out.println("歡迎" + username);

		// TODO Auto-generated method stub

	}

	@Override
	public void guessNumber() {

		Scanner scn = new Scanner(System.in);
		int humanPlayerAnswer = scn.nextInt();
		if (humanPlayerAnswer > Main.answer) {
			Main.max = humanPlayerAnswer;
		} else if (humanPlayerAnswer < Main.answer) {
			Main.min = humanPlayerAnswer;
		} else {
			System.out.println("猜對了，好棒！");
			

		}
		// TODO Auto-generated method stub

	}

	public void setTheCounter() {
		System.out.println(Main.max + "到" + Main.min + "之間選一個數吧!");
	}

}
