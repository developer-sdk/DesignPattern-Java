package sdk.pattern.builder.gof;

public class Main {

	public static void main(String[] args) {
		
		String type = "html";
		
		Director director = null;
		
		switch(type) {
			case "txt":
				director = new Director(new TextBuilder());
				break;
			case "html":
				director = new Director(new HtmlBuilder());
				break;
		}
		
		System.out.println(director.construct());
	}
}
