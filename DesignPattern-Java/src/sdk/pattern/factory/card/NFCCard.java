package sdk.pattern.factory.card;

import sdk.pattern.factory.framework.Card;

public class NFCCard extends Card {

	private String owner;
	
	public NFCCard(String owner) {
		System.out.println("Make nfccard: " + owner);
		this.owner = owner;
	}
	
	@Override
	public void use() {
		System.out.println("Use nfccard: " + owner);
	}

	public String getOwner() {
		return owner;
	}
}
