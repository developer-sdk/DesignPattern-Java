package chap03template;

public class StringDiaplay extends AbstractDisplay {

	private String string;
	
	public StringDiaplay(String string) {
		this.string = string;
	}
	
	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.print("|");
		System.out.print(string);
		System.out.println("|");
	}

	@Override
	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for(int i = 0; i < string.length(); i++)
			System.out.print("-");
		System.out.println("+");
	}
}