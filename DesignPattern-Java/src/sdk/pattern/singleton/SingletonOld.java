package sdk.pattern.singleton;

public class SingletonOld {

	private static SingletonOld instance = new SingletonOld();

	private SingletonOld() {
		System.out.println("create SingletonOld");
	}

	public static SingletonOld getInstance() {
		return instance;
	}
}