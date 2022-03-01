import java.util.Scanner;

public class HumanPlayer extends player {
	public String nameSelf() {
		System.out.println("請輸入你的使用者名稱 :");
		Scanner scn = new Scanner(System.in);
		String userName = scn.nextLine();
		System.out.println("你的使用者名稱是 :" + userName);
		return userName;

	}

	@Override
	protected void guess(int min, int max) {
		
		// TODO Auto-generated method stub

	}

}
