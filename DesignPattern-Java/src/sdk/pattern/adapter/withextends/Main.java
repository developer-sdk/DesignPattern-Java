package sdk.pattern.adapter.withextends;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello with extends");
		p.printWeak();
		p.printStrong();
	}
}
