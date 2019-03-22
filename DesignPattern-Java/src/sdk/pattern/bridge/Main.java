package sdk.pattern.bridge;

public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello d1"));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello d2"));
		CountDisplay c1 = new CountDisplay(new StringDisplayImpl("Hello c1"));
		
		d1.displaya();
		d2.displaya();
		c1.displaya();
		c1.multiDisplay(3);
	}
}
