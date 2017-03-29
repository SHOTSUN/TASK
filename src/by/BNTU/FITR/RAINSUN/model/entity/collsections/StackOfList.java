package by.BNTU.FITR.RAINSUN.model.entity.collsections;

import by.BNTU.FITR.RAINSUN.model.entity.structers.Struct;
import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import java.util.NoSuchElementException;

public class StackOfList<T> extends ListAbstract<T> {

    public StackOfList() {
        head = null;
        size = 0;
    }

    @Override
    public T get()throws ExistenceException {
        if (isEmpty()) {
            throw new ExistenceException("NO ELEMENTS TO TAKE");
        }
        T item = (T) head.element;
        head = head.next;
        size--;

        return item;
    }

    @Override
    public void put(T item) {
        Struct buf = head;
        head = new Struct();
        head.element = item;
        head.next = buf;
        size++;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        if (isEmpty()) {
            result = "STACK HAS NO ELEMENTS";
        }
        return result;
    }
}
