package lottery1生可可版;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//假資料
		Set<Integer> ans=new TreeSet<Integer>();
		ans.add(1);
		ans.add(2);
		ans.add(3);
		ans.add(4);
		ans.add(5);
		ans.add(6);
		//假資料
		for (Integer integer : ans) {
			System.out.print(integer + ",");
		}
		System.out.println();
		
		for (Player player : playerList) {
			if(player.getNumber().containsAll(ans))System.out.println("中獎了");
			else System.out.println("沒中");
		}

	}

}
