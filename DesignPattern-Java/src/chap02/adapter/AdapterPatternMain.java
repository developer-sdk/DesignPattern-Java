package chap02.adapter;

public class AdapterPatternMain {

	public static void main(String[] args) {

		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}