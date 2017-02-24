package by.BNTU.FITR.RAINSUN.model.entity;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author SHOTSUN
 * @param <T>
 */
public class Container<T> implements Iterable<T> {

    private T box[] = null;
    
    Container(){
        
    }

    Container(int count) {
        box = (T[]) new Object[count];
    }

    public T get(int index) {
        return box[index];
    }

    public int size() {
        return box.length;
    }
    
    public void add(T train){
        T box2[] = (T[]) new Object[size() + 1];
        System.arraycopy(box, 0, box2, 0, size());
        box2[size()] = train;
        box = box2;
    }
    
    @Override
    public Iterator<T> iterator() {
        Iterable<T> iterable = Arrays.asList(box);
        return iterable.iterator();
    }

}
