package by.BNTU.FITR.RAINSUN.model.entity.collsections;

public class StackOfArray<T> extends ArrayAbstract<T> {

    public StackOfArray() {
        box = new Object[0];
        size = 0;
    }

    @Override
    public void push(T item) {

        Object newbox[] = new Object[size + 1];
        System.arraycopy(box, 0, newbox, 1, size);
        newbox[0] = item;
        box = newbox;
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
