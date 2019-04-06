package sdk.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

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
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public Iterator<Entry> iterator() {
		return directory.iterator();
	}
}