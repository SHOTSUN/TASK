package by.BNTU.FITR.RAINSUN.model.entity.collsections;

import by.BNTU.FITR.RAINSUN.model.entity.structers.Struct;
import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import java.util.NoSuchElementException;

public class QueueOfList<T> extends ListAbstract<T> {

    private Struct tail;

    public QueueOfList() {
        head = null;
        size = 0;
    }

    @Override
    public T pop() throws ExistenceException {
        if (isEmpty()) {
            throw new ExistenceException("NO ELEMENTS TO TAKE");
        }
        T item = (T) head.element;
        head = head.next;

        if (isEmpty()) {
            tail = null;
        }

        size--;
        return item;
    }

    @Override
    public void push(T item) {
        Struct buf = tail;
        tail = new Struct();
        tail.element = item;
        tail.next = null;
        if (isEmpty()) {
            head = tail;
        } else {
            buf.next = tail;
        }
        size++;
    }

    @Override
    public String toString() {
        String result = super.toString();
        if (isEmpty()) {
            result = "QUEUE HAS NO ELEMENTS";
        }
        return result;
    }

}
