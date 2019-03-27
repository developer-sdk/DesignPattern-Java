package sdk.pattern.decorator;

public class SideBorder extends Border {

	private char borderChar;
	
	protected SideBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColumns() {
		return display.getColumns() + 2;	// 좌우 보더의 사이즈 추가 
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}

}