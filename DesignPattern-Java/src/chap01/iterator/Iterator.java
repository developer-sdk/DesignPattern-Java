package chap01.iterator;

/**
 * @author whitebeard-k
 *
 * @param <E>
 */
public interface Iterator<E> {
	abstract boolean hasNext();
	abstract E next();
}
