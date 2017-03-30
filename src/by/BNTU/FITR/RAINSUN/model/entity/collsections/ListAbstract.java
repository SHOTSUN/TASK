package by.BNTU.FITR.RAINSUN.model.entity.collsections;

import by.BNTU.FITR.RAINSUN.model.entity.iterator.ListIterator;
import by.BNTU.FITR.RAINSUN.model.entity.structers.Struct;
import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import java.util.AbstractCollection;
import java.util.Iterator;

public abstract class ListAbstract<T> extends AbstractCollection<T> implements NewCollection<T> {

    protected Struct head;
    protected int size;

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T pick() throws ExistenceException{
        if (isEmpty()) {
            throw new ExistenceException("NO ELEMENTS TO SHOW");
        }
        return (T) head.element;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(head, size);
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder("\n");

        Struct buf = head;
        while (buf != null){
            s.append(buf.element);
            s.append("\t");
            buf = buf.next;
        }
        return s.toString();
    }

}
