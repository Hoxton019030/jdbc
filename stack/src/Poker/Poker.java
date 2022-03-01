package Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Poker {

	String[] type = new String[] { "♠", "♥", "♣", "♦" };
	String[] number = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	List<String> pokersize = new ArrayList<>();

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> randomSet = new ArrayList<>();

		while (randomSet.size() < 52) {
			randomSet.add(random.nextInt(52));
		}
		for (int i : randomSet) {
			System.out.println(i);
		}

		Poker poker = new Poker();

		Collections.shuffle(poker.pokersize);

		for (String string : poker.pokersize) {
			System.out.println(string);

		}

	}

	public Poker() {
		int count = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				pokersize.add(arrayCard(i, j));
			}
		}

	}

	public String arrayCard(int a, int b) {
		String card = type[a] + number[b];
		return card;
	}

}
