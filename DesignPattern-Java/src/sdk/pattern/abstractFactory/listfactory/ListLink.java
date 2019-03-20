package sdk.pattern.abstractFactory.listfactory;

import sdk.pattern.abstractFactory.factory.Link;

public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return String.format("<li><a href=\"%s\">%s</a></li>\n", url, caption);
	}

}
