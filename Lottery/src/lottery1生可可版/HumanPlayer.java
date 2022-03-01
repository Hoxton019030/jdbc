package lottery1生可可版;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HumanPlayer implements Player {
	Set<Integer> humanChosenNumber = new TreeSet<Integer>();

	public void chosenNumber() {
		Scanner scn = new Scanner(System.in);
		for (int i = 0; humanChosenNumber.size() < 6; i++) {
			humanChosenNumber.add(scn.nextInt());

		}
		System.out.println("你選的數字是" + humanChosenNumber);

	}

	@Override
	public Set<Integer> getNumber() {
		return humanChosenNumber;
	}

}
