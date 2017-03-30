
package by.BNTU.FITR.RAINSUN.model.entity.containers;
import by.BNTU.FITR.RAINSUN.model.entity.collsections.NewCollection;
import by.BNTU.FITR.RAINSUN.model.entity.collsections.StackOfArray;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import java.util.Iterator;

/**
 * @author Владислав
 */
public class Train implements Iterable<Coach> {

    private final NewCollection<Coach> train;

    public Train(){
        train = new StackOfArray();
    }
    
    public Train(NewCollection<Coach> box) {
        train = box;
    }
    
    public Train(Coach coach){
        train = new StackOfArray();
        train.push(coach);
    }
    
    public void add(Coach ... obj) {
        for (Coach c : obj) {
            train.push(c);
        }
    }

    public NewCollection<Coach> get() {
        return train;
    }
    
    @Override
    public Iterator<Coach> iterator(){
        return train.iterator();
    }

    @Override
    public String toString() {

        StringBuilder showBag = new StringBuilder();

        for (Coach thing : train) {
            showBag.append(thing.toString()).append("\n");
        }

        return showBag.toString();
    }

}
