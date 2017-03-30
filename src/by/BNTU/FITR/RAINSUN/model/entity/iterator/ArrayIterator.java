package by.BNTU.FITR.RAINSUN.model.entity.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {

    Object box[];
    int size;
    int cursor;

    public ArrayIterator(int size, Object[] box) {
        this.size = size;
        this.box = box;
    }

    @Override
    public boolean hasNext() {
        return cursor != size;
    }

    @Override
    public T next() {
        int i = cursor;
        if (i >= size) {
            throw new NoSuchElementException();
        }
        cursor = i + 1;
        return (T) box[i];
    }

}
