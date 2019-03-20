package sdk.pattern.abstractFactory;

import sdk.pattern.abstractFactory.factory.Factory;
import sdk.pattern.abstractFactory.factory.Link;
import sdk.pattern.abstractFactory.factory.Page;
import sdk.pattern.abstractFactory.factory.Tray;

public class Main {

	public static void main(String[] args) {
		
		String param1 = "sdk.pattern.abstractFactory.listfactory.ListFactory";
		
		Factory factory = Factory.getFactory(param1);
		
		Link joins = factory.createLink("네이버", "www.naver.com");
		Link google = factory.createLink("구글", "www.google.com");
		
		Tray traySearch = factory.createTray("검색엔진");
		traySearch.add(joins);
		traySearch.add(google);
		
		Page page = factory.createPage("LinkPage", "홍길동");
		page.add(traySearch);
		
		page.output();
	}
}