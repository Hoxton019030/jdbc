package Lottery亂做;

import java.util.Set;
import java.util.TreeSet;

public class aiPlayer implements Player {
	private static Set<Integer> generateAiplayerLotteryNumber = new TreeSet<>();

	@Override
	public void chosenNumber() {
		for (int i = 0; generateAiplayerLotteryNumber.size() < 7; i++)
			aiPlayer.generateAiplayerLotteryNumber.add((int) (Math.random() * 49));
		// TODO Auto-generated method stub
		for (Integer integer : generateAiplayerLotteryNumber) {
			System.out.print(integer + ",");

		}
		System.out.println();
		

	}

}
