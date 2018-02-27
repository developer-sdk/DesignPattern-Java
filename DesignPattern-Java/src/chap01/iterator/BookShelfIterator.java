package chap01.iterator;

public class BookShelfIterator implements Iterator<Book> {

	private BookShelf bs;
	private int index;
	
	public BookShelfIterator(BookShelf bs) {
		this.bs = bs;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		return (index + 1) > bs.getLength() ? false : true;
	}

	@Override
	public Book next() {
		return bs.getBookAt(index++);
	}

}
