package sdk.pattern.adapter.withinstance;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello with instance");
		p.printWeak();
		p.printStrong();
	}
}