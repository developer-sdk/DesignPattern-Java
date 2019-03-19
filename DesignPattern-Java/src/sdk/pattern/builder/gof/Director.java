package sdk.pattern.builder.gof;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public String construct() {
		builder.makeTitle("운동");

		builder.makeString("구기");
		builder.makeItem(new String[] { "축구", "야구" });

		builder.makeString("육상");
		builder.makeItem(new String[] { "달리기", "던지기" });

		return builder.getResult();
	}
}