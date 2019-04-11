package sdk.pattern.chainOfResponsbility;

/**
 * 어떤문제도 처리하지 않음 
 * 
 * @author User
 *
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) { 
        return false;
    }
}