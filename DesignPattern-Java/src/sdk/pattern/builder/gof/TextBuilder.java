package sdk.pattern.builder.gof;

public class TextBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		buffer.append("제목: ").append(title).append("\n");
	}

	@Override
	public void makeString(String str) {
		buffer.append("\t").append("서브 제목: ").append(str).append("\n");
	}

	@Override
	public void makeItem(String[] items) {
		for(String item : items)
			buffer.append("\t\t-").append("제목: ").append(item).append("\n");
	}

	@Override
	public String getResult() {
		return buffer.toString();
	}

}
