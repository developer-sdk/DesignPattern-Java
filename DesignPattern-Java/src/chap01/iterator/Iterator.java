package chap01.iterator;

public interface Iterator<E> {
	abstract boolean hasNext();
	abstract E next();
}
