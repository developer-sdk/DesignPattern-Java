package sdk.pattern.prototype.box;

import sdk.pattern.prototype.framework.Product;

public class MessageBox implements Product {

	private char c;

	public MessageBox(char c) {
		this.c = c;
	}

	@Override
	public void use(String s) {
		System.out.printf("%s%s%s", c, c, c);
		System.out.print(s);
		System.out.printf("%s%s%s\n", c, c, c);
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