package chap03template;

public class TemplateMethodPattern {
	public static void main(String[] args) {

		AbstractDisplay display1 = new CharDiaplay('a');
		AbstractDisplay display2 = new StringDiaplay("Hello");

		display1.display();
		display2.display();
	}
}