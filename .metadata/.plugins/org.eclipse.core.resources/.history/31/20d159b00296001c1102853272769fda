package Lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("打算要有多少AI跟你一起抽獎呢?");
		Scanner scn = new Scanner(System.in);
		int totalAiPlayer = scn.nextInt();
		Player humanplayer = new HumanPlayer();
		List<Player> playerList = new ArrayList<>();
		LotteryLogic lotterylogic = new LotteryLogic();

		System.out.println("大樂透開始囉！請從1~49裡面選擇6個數字吧");
		humanplayer.chosenNumber();
		playerList.add(humanplayer);
//這邊負責決定要幾個AI玩家
		for (int i = 0; i < totalAiPlayer; i++) {
			Player aiPlayer = new AiPlayer();
			aiPlayer.chosenNumber();
			playerList.add(aiPlayer);
		}
//		List<Player> list = new ArrayList<Player>();
		System.out.println("本期大樂透中獎號碼:");
//生成中獎號碼
		for (Integer integer : lotterylogic.GenerateLotteryNumber()) {
			System.out.print(integer + ",");
		}
		System.out.println();

		for (Player player : playerList) {
			if (player.getNumber().containsAll(lotterylogic.GenerateLotteryNumber())) {
				System.out.println("中獎了");
				System.out.println(player.getNumber());
			} else {
				System.out.println("沒中");
				System.out.println(player.getNumber());
			}
		}
//		if (humanplayer.humanChosenNumber.containsAll(lotterylogic.GenerateLotteryNumber())
//				|| aiPlayer.generateAiplayerLotteryNumber.containsAll(lotterylogic.GenerateLotteryNumber())) {
//			System.out.println("中獎了");
//
//		} else {
//			System.out.println("無人中獎");
//		}

	}

}
