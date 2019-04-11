package sdk.pattern.chainOfResponsbility;

/**
 * 홀수 문제만 해결 
 * 
 * @author User
 *
 */
public class OddSupport extends Support {
	public OddSupport(String name) {
		super(name);
	}

	protected boolean resolve(Trouble trouble) { 
		if (trouble.getNumber() % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}
}