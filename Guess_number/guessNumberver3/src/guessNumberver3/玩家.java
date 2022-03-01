import java.util.Scanner;

public class 玩家 extends player {
	
	public String nameSelf() {
		System.out.println("請輸入你的名字！");
		Scanner scn = new Scanner(System.in);
		String username = scn.nextLine();
		return username;

	}

}
