
package by.BNTU.FITR.RAINSUN.model.entity.collsections;

import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import java.util.Collection;

public interface NewCollection<T> extends Collection<T>  {
    
    void push(T obj);
    T pop() throws ExistenceException;
    T pick() throws ExistenceException;
    
}
