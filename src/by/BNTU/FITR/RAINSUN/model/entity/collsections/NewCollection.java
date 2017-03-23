
package by.BNTU.FITR.RAINSUN.model.entity.collsections;

import java.util.Collection;

public interface NewCollection<T> extends Collection<T>  {
    
    void put(T obj);
    T get();
    T show();
    
}
