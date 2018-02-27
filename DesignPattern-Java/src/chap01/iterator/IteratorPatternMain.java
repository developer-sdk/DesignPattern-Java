package chap01.iterator;

/**
 * iterator 패턴 실행 파일 
 * iterator 패턴은 여러개의 데이터를 하나씩 열거하면서 처리 
 * 
 * @author whitebeard-k
 *
 */
public class IteratorPatternMain {
	public static void main(String[] args) {
		BookShelf shelf = new BookShelf(4);
		shelf.appendBook(new Book("책1"));
		shelf.appendBook(new Book("책2"));
		shelf.appendBook(new Book("책3"));
		shelf.appendBook(new Book("책4"));
		
		Iterator<Book> it = shelf.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}
}
