package sdk.pattern.visitor;

public class ListVisitor extends Visitor {

	private String currentDir = "";
	
	@Override
	public void visit(File file) {
		System.out.printf("%s/%s", currentDir, file);
	}

	@Override
	public void visit(Directory directory) {
		System.out.printf("%s/%s", currentDir, directory);
		
		String savedDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();
		directory.iterator().forEachRemaining(x -> x.accept(this));
		currentDir = savedDir;
	}

	
}