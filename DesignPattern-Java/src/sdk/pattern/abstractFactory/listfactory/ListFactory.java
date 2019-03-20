package sdk.pattern.abstractFactory.listfactory;

import sdk.pattern.abstractFactory.factory.Factory;
import sdk.pattern.abstractFactory.factory.Link;
import sdk.pattern.abstractFactory.factory.Page;
import sdk.pattern.abstractFactory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}