package sdk.pattern.templatemethod;

public class Main {

	public static void main(String[] args) {
		AbstractDisplay display1 = new CharDisplay('a');
		display1.display();

		AbstractDisplay display2 = new StringDisplay("hello");
		display2.display();
	}
}
