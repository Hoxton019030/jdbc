package lottery1生可可版;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

interface Player {
	Set<Integer> humanChosenNumber = new TreeSet<Integer>();
	Set<Integer> totalLotteryNumber = new HashSet<Integer>();
	Set<Integer> generateAiplayerLotteryNumber = new TreeSet<Integer>();

	public void chosenNumber();
	Set<Integer> getNumber(); //一個回傳資料型態為Set的Method

}
