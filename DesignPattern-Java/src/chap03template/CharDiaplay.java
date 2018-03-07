package chap03template;

public class CharDiaplay extends AbstractDisplay {

	private char ch;
	
	public CharDiaplay(char ch) {
		this.ch = ch;
	}
	
	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}

}