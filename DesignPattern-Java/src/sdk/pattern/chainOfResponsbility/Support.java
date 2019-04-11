package sdk.pattern.chainOfResponsbility;

public abstract class Support {
	private String name;	// 트러블 해결자의 이름 
	private Support next;	// 떠넘기는 곳 

	public Support(String name) {
		this.name = name;
	}

	public Support setNext(Support next) {	// 떠넘길 곳을 설정 
		this.next = next;
		return next;
	}

	public void support(Trouble trouble) {	// 해결순서 
		if (resolve(trouble)) {
			done(trouble);
		} else if (next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}

	public String toString() {
		return "[" + name + "]";
	}

	protected abstract boolean resolve(Trouble trouble);

	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}

	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}
}