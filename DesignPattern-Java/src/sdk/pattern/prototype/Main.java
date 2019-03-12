package sdk.pattern.prototype;

import sdk.pattern.prototype.box.MessageBox;
import sdk.pattern.prototype.box.UnderlinePen;
import sdk.pattern.prototype.framework.Manager;
import sdk.pattern.prototype.framework.Product;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		MessageBox starBox = new MessageBox('*');
		MessageBox hyphenBox = new MessageBox('-');
		UnderlinePen pen = new UnderlinePen();
		
		manager.register("star", starBox);
		manager.register("hyphen", hyphenBox);
		manager.register("pen", pen);
		
		Product p1 = manager.create("star");
		Product p2 = manager.create("hyphen");
		Product p3 = manager.create("pen");
		
		p1.use("hello");
		p2.use("hello");
		p3.use("hello");
	}
}