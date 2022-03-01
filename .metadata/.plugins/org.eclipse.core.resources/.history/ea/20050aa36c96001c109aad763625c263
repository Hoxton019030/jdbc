package Lottery;

import java.util.Set;
import java.util.TreeSet;

public class LotteryLogic {
	private static Set<Integer> generateLotteryNumber = new TreeSet<>();
	
	public Set<Integer> GenerateLotteryNumber(){

		for (int i = 0; generateLotteryNumber.size() < 6; i++)
			LotteryLogic.generateLotteryNumber.add((int) (Math.random() * 49)+1);
		
		return generateLotteryNumber;
	}

}
