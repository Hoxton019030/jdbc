package lottery1生可可版;

import java.util.Set;
import java.util.TreeSet;

public class AiPlayer implements Player {
	private Set<Integer> generateAiplayerLotteryNumber = new TreeSet<>();

	@Override
	public void chosenNumber() {

		for (int i = 0; generateAiplayerLotteryNumber.size() < 7; i++)
			this.generateAiplayerLotteryNumber.add((int) (Math.random() * 49) + 1);

	}

	@Override
	public Set<Integer> getNumber() {
		return generateAiplayerLotteryNumber;
	}

}
