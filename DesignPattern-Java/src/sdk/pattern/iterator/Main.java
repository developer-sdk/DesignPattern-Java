package sdk.pattern.iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookshelf = new BookShelf(4);
		bookshelf.appendBook(new Book("Head"));
		bookshelf.appendBook(new Book("First"));
		bookshelf.appendBook(new Book("Java"));
		bookshelf.appendBook(new Book("Scala"));

		Iterator<Book> iter = bookshelf.iterator();

		while (iter.hasNext()) {
			Book book = iter.next();
			System.out.println(book);
		}
	}
}