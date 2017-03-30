package by.BNTU.FITR.RAINSUN.model.entity.collsections;

import by.BNTU.FITR.RAINSUN.model.entity.collsections.iterator.ArrayIterator;
import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import java.util.AbstractCollection;
import java.util.Iterator;

public abstract class ArrayAbstract<T> extends AbstractCollection<T>
        implements NewCollection<T> {

    protected int size;
    protected Object[] box;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            box[i] = null;
        }
        size = 0;
    }

    @Override
    public T pick() throws ExistenceException {
        if (isEmpty()) {
            throw new ExistenceException("NO ELEMENTS TO SHOW");
        }
        return (T) box[0];
    }

    @Override
    public T pop() throws ExistenceException {
        if (isEmpty()) {
            throw new ExistenceException("NO ELEMENTS");
        }

        T item = (T) box[0];
        Object newbox[] = new Object[size - 1];
        System.arraycopy(box, 1, newbox, 0, size - 1);
        box = newbox;
        size--;

        return item;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator(size, box);
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("\n");

        for (Object element : box) {
            result.append(element).append("\t");
        }

        return result.toString();
    }

}
