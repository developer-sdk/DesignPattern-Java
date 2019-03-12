package sdk.pattern.singleton;

public class Main {
	public static void main(String[] args) {

		SingletonOld s1 = SingletonOld.getInstance();
		SingletonOld s2 = SingletonOld.getInstance();

		if (s1 == s2) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		System.out.println("----------------");

		SingletonIdiom si1 = SingletonIdiom.getInstance();
		SingletonIdiom si2 = SingletonIdiom.getInstance();

		if (si1 == si2) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
	}
}