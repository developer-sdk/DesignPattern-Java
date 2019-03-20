package sdk.pattern.abstractFactory.listfactory;

import java.util.Iterator;

import sdk.pattern.abstractFactory.factory.Item;
import sdk.pattern.abstractFactory.factory.Page;

public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("<html><head><title>").append(title).append("</title></head>").append("\n");
		buffer.append(title).append("\n");
		
		buffer.append("<p>");
		
		Iterator<Item> it = content.iterator();
		while(it.hasNext()) {
			Item item = it.next();
			buffer.append(item.makeHTML());
		}
		
		buffer.append("</p>");
		
		return buffer.toString();
	}

}