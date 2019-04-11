package sdk.pattern.chainOfResponsbility;

/**
 * limit 번호 미만의 문제만 해결
 * 
 * @author User
 *
 */
public class LimitSupport extends Support {
	private int limit;

	public LimitSupport(String name, int limit) { 
		super(name);
		this.limit = limit;
	}

	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() < limit) {
			return true;
		} else {
			return false;
		}
	}
}