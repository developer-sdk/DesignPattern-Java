package sdk.pattern.decorator;

public abstract class Display {

	public abstract int getColumns();
	public abstract int getRows();
	public abstract String getRowText(int row);
	
	public final void show() {
		for(int row = 0; row < getRows(); row++) {
			System.out.println(getRowText(row));
		}
	}
}