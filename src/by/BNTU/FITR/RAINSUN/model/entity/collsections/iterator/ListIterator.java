package by.BNTU.FITR.RAINSUN.model.entity.collsections.iterator;

import by.BNTU.FITR.RAINSUN.model.entity.structers.Struct;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListIterator<T> implements Iterator<T> {

    Struct next;
    Struct buf;
    int nextIndex;
    int size;

    public ListIterator(Struct head, int size) {
        this.next = head;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < size;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        buf = next;
        next = next.next;
        nextIndex++;
        return (T) buf.element;
    }
}
