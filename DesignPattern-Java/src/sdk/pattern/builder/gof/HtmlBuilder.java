package sdk.pattern.builder.gof;

public class HtmlBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		buffer.append("<html><head><title>").append(title).append("</title></head><body>");
	}

	@Override
	public void makeString(String str) {
		buffer.append("<p>").append(str).append("</p>");
	}

	@Override
	public void makeItem(String[] items) {
		buffer.append("<ul>");
		
		for(String item : items)
			buffer.append("<li>").append(item).append("</li>");
		
		buffer.append("</ul>");
	}

	@Override
	public String getResult() {
		buffer.append("</body></html>");
		return buffer.toString();
	}

}