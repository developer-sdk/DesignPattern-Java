package sdk.pattern.singleton;

public class SingletonIdiom {

	private SingletonIdiom() {
		System.out.println("create SingletonIdiom");
	}

	private static class Singleton {
		private static final SingletonIdiom instance = new SingletonIdiom();
	}

	public static SingletonIdiom getInstance() {
		return Singleton.instance;
	}
}