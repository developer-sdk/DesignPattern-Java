package sdk.pattern.factory.card;

import sdk.pattern.factory.framework.Card;

public class IDCard extends Card {

	private String owner;

	public IDCard(String owner) {
		System.out.println("Make idcard: " + owner);
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println("Use idcard: " + owner);
	}

	public String getOwner() {
		return owner;
	}
}