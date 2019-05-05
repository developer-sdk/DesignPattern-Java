package sdk.pattern.facade;

import sdk.pattern.facade.pagemaker.PageMaker;

public class Main {
	public static void main(String[] args) {

		PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
	}
}