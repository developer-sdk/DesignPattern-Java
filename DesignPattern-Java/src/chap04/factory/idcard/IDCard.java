package chap04.factory.idcard;

import chap04.factory.Product;

public class IDCard extends Product {

	public IDCard(String owner) {
		this.owner = owner;
		System.out.println(owner + "의 카드를 만듭니다.");
	}

	@Override
	public void use() {
		System.out.println(owner + "의 카드를 사용합니다.");
	}
}