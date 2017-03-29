
package by.BNTU.FITR.RAINSUN.model.entity.collsections;

import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import java.util.Collection;

public interface NewCollection<T> extends Collection<T>  {
    
    void put(T obj);
    T get() throws ExistenceException;
    T show() throws ExistenceException;
    
}
