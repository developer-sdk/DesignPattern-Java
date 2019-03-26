package sdk.pattern.composite;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Making root entries...");
		
		Directory root = new Directory("root");
		
		Directory bin = new Directory("bin");
		bin.add(new File("vi", 1000));
		bin.add(new File("cp", 2000));
		bin.add(new File("mv", 3000));
		
		Directory lib = new Directory("lib");
		lib.add(new File("jar",  2000));
		lib.add(new File("zip",  4000));
		lib.add(new File("gzip", 3000));
		
		
		root.add(bin);
		root.add(lib);
		
		root.printList();
	}
}