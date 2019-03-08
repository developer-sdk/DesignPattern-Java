package sdk.pattern.factory.card;

import sdk.pattern.factory.framework.Card;
import sdk.pattern.factory.framework.CardFactory;

public class UnifiedCardFactory extends CardFactory {

	@Override
	public Card create(String type, String owner) {

		switch (type) {
		case "id":
			return new IDCard(owner);
		case "nfc":
			return new NFCCard(owner);
		default:
			return null;
		}
	}
}