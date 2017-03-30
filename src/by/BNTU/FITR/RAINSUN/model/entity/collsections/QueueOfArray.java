package by.BNTU.FITR.RAINSUN.model.entity.collsections;

public class QueueOfArray<T> extends ArrayAbstract<T> {

    public QueueOfArray() {
        box = new Object[0];
        size = 0;
    }

    @Override
    public void push(T item) {
        Object newbox[] = new Object[size + 1];
        System.arraycopy(box, 0, newbox, 0, size);
        newbox[size++] = item;
        box = newbox;
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
