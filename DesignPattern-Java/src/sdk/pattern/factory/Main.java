package sdk.pattern.factory;

import sdk.pattern.factory.framework.CardFactory;
import sdk.pattern.factory.card.UnifiedCardFactory;
import sdk.pattern.factory.framework.Card;

public class Main {

	public static void main(String[] args) {
		CardFactory factory = new UnifiedCardFactory();

		Card card1 = factory.create("id", "A");
		Card card2 = factory.create("nfc", "B");

		card1.use();
		card2.use();
	}
}