package sdk.pattern.builder.gof;

public abstract class Builder {

	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItem(String[] items);
	public abstract String getResult();
}