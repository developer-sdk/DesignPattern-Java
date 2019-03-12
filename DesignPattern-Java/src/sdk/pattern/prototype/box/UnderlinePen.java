package sdk.pattern.prototype.box;

import sdk.pattern.prototype.framework.Product;

public class UnderlinePen implements Product {

	@Override
	public void use(String s) {
		System.out.println(s);
		System.out.println("~~~~~~~~~~~~~~");
	}

	@Override
	public Product createClone() {

		try {
			return (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return null;
	}

}
