package sdk.pattern.iterator;

public class BookShelfIterator implements Iterator<Book> {

	private int index;
	private BookShelf bookShelf;

	public BookShelfIterator(BookShelf bookshelf) {
		this.bookShelf = bookshelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < bookShelf.getLength();
	}

	@Override
	public Book next() {
		return bookShelf.getBookAt(index++);
	}

}