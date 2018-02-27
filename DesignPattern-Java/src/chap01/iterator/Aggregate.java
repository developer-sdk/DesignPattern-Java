package chap01.iterator;

/**
 * @author whitebeard-k
 *
 * @param <E>
 */
public interface Aggregate<E> {

	abstract Iterator<E> iterator();
}
