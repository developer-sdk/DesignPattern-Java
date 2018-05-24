package chap04.factory.idcard;

import java.util.ArrayList;

import chap04.factory.Factory;
import chap04.factory.Product;

public class IDCardFactory extends Factory {

	public IDCardFactory() {
		list = new ArrayList<>();
	}

	@Override
	public Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	public void registerProduct(Product p) {
		list.add(p);
	}
}