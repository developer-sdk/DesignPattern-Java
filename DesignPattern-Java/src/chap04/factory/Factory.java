package chap04.factory;

import java.util.List;

public abstract class Factory {

	protected List<Product> list;

	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	public abstract Product createProduct(String owner);

	public abstract void registerProduct(Product p);

	public List<Product> getList() {
		return list;
	}
}