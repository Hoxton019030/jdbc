package Lottery;

import java.util.Set;
import java.util.TreeSet;

public class AiPlayer implements Player {
	private  Set<Integer> generateAiplayerLotteryNumber = new TreeSet<>();

	@Override
	public void chosenNumber() {
		
		for (int i = 0; generateAiplayerLotteryNumber.size() < 7; i++)
			this.generateAiplayerLotteryNumber.add((int) (Math.random() * 49)+1);
		// TODO Auto-generated method stub
//		for (Integer integer : generateAiplayerLotteryNumber) {
//			System.out.print(integer + ",");
//
//		}
//		System.out.println();
		

	}

	@Override
	public Set<Integer> getNumber() {
		// TODO Auto-generated method stub
		return generateAiplayerLotteryNumber;
	}

}
