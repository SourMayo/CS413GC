package listtest;

public class LinkedListWithIterator< E extends Comparable <? super E> > implements ListInterface<E> {

    public void add(E newEntry) {

    }

    public boolean add(int newPosition, E newEntry) {
        return false;
    }

    public Comparable remove(int givenPosition) {
        return null;
    }

    public void clear() {

    }

    public E replace(int givenPosition, E newEntry) {
        return null;
    }

    // FIXME
    public E getEntry(int givenPosition) {
        return null;
    }

    public boolean contains(E anEntry) {
        return false;
    }

    public int getLength() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }
}
