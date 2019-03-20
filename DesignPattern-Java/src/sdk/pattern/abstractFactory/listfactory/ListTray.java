package sdk.pattern.abstractFactory.listfactory;

import java.util.Iterator;

import sdk.pattern.abstractFactory.factory.Item;
import sdk.pattern.abstractFactory.factory.Tray;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>").append("\n");
		buffer.append(caption).append("\n");
		buffer.append("<ul>").append("\n");
		
		Iterator<Item> it = tray.iterator();
		while(it.hasNext()) {
			Item item = it.next();
			buffer.append(item.makeHTML());
		}
		
		buffer.append("</ul>").append("\n");
		buffer.append("</li>").append("\n");
		
		return buffer.toString();
	}

}
