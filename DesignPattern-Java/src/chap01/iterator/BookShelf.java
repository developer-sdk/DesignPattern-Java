package chap01.iterator;

public class BookShelf implements Aggregate<Book> {

	private Book[] books;
	private int last = 0;

	public BookShelf(int size) {
		books = new Book[size];
	}

	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last++] = book;
	}
	
	public int getLength() {
		return last;
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}

}