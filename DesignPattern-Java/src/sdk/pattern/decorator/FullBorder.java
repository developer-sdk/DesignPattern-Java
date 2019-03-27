package sdk.pattern.decorator;

public class FullBorder extends Border {

	protected FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		return display.getColumns() + 2; // 좌우 보더 추가
	}

	@Override
	public int getRows() {
		return display.getRows() + 2; // 상하 보더 추가
	}

	@Override
	public String getRowText(int row) {
		if (row == 0 || row == display.getRows() + 1) {
			return makeLine('-', display.getColumns());
		} else {
			return '|' + display.getRowText(row - 1) + '|';
		}
	}

	private String makeLine(char ch, int count) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("+");
		for (int i = 0; i < count; i++)
			buffer.append(ch);

		buffer.append("+");
		return buffer.toString();
	}
}