package chap04.factory.pencil;

import chap04.factory.Product;

public class Pencil extends Product {

	public Pencil(String owner) {
		this.owner = owner;
		System.out.println(owner + "의 연필을 만듭니다.");
	}
	
	@Override
	public void use() {
		System.out.println(owner + "의 연필을 사용합니다.");
	}
}