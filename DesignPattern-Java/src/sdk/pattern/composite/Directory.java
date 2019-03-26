package sdk.pattern.composite;

import java.util.ArrayList;

public class Directory extends Entry {

	private String name;
	private ArrayList<Entry> directory = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return directory.stream().map(x -> x.getSize()).reduce((x, y) -> x + y).orElse(0);
	}
	
	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		
		directory.stream().forEach(x -> x.printList(prefix + "/" + name));
	}

}