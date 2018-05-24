package chap04.factory.pencil;

import java.util.ArrayList;

import chap04.factory.Factory;
import chap04.factory.Product;

public class PencilFactory extends Factory {

	public PencilFactory() {
		list = new ArrayList<>();
	}

	@Override
	public Product createProduct(String owner) {
		return new Pencil(owner);
	}

	@Override
	public void registerProduct(Product p) {
		list.add(p);
	}

}