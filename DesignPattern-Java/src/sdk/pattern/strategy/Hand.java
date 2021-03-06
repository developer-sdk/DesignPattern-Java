package sdk.pattern.strategy;

public class Hand {

	public static final int BAWI = 0;
	public static final int GAWI = 1;
	public static final int BO = 2;

	public static final Hand[] hand = { new Hand(BAWI), new Hand(GAWI), new Hand(BO) };

	public static final String[] name = { "주먹", "가위", "보" };

	private int handvalue;

	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}

	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}

	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}

	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}

	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handvalue + 1) % 3 == h.handvalue) {
			return 1;
		} else
			return -1;
	}

	public String toString() {
		return name[handvalue];
	}
}