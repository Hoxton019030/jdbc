package Poker;

import java.util.HashMap;
import java.util.Map;

public class Card {

	private final Rank rank;
	private final Suit suit;
	private final static Map<String, Card> CARD_CACHE = initCache();

	}

	private static Map<String, Card> initCache() {
		final Map<String, Card> cache = new HashMap<>();
		for (final Suit suit : Suit.values()) {
			for (final Rank rank : Rank.values()) {
				cache.put("", new Card(rank, suit));
			}
		}
	}

	private Card(final Rank rank, final Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	enum Suit {
		DIAMOND, CLUBS, HEARTS, SPADES;
	}

	enum Rank {
		TWO(2), THERE(3), FOUR(4), FIVE(5), SIX(6), SEVEM(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13),
		ACE(1);

		private final int rankvalue;

		Rank(final int rankvalue) {
			this.rankvalue = rankvalue;
		}
	}

}
