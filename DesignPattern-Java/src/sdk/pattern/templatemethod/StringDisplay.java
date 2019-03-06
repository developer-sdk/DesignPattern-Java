package sdk.pattern.templatemethod;

public class StringDisplay extends AbstractDisplay {

	private String string;

	public StringDisplay(String string) {
		this.string = string;
	}

	@Override
	public void open() {
		System.out.println("-------------------");
	}

	@Override
	public void print() {
		System.out.println(String.format("|%s|", string));
	}

	@Override
	public void close() {
		System.out.println("-------------------");
	}

}