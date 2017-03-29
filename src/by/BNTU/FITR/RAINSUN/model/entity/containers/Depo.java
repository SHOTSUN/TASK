package by.BNTU.FITR.RAINSUN.model.entity.containers;

import by.BNTU.FITR.RAINSUN.model.entity.collsections.NewCollection;
import by.BNTU.FITR.RAINSUN.model.entity.collsections.StackOfArray;
import java.util.Iterator;

/**
 * @author SHOTSUN
 */
public class Depo implements Iterable<Train> {
    
    private final NewCollection<Train> depo;
    
    public Depo() {
        depo = new StackOfArray();
    }
    
    public Depo(NewCollection<Train> box) {
        depo = box;
    }
    
    public Depo(Train train) {
        depo = new StackOfArray();
        depo.put(train);
    }
    
    public NewCollection<Train> get() {
        return depo;
    }
    
    public void add(Train... trains) {
        try {
            for (Train t : trains) {
                depo.put(t);
            }
            
        } catch (ArrayStoreException e) {
            throw e;
        }
    }
    
    @Override
    public Iterator<Train> iterator(){
        return depo.iterator();
    }
    
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < depo.size(); i++) {
            result += "\n\tTrains:\n";
            
            for (Train train : depo) {
                result += train.toString();
            }
        }
        
        return result;
        
    }
    
}
