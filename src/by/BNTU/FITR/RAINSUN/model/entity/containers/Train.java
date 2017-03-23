
package by.BNTU.FITR.RAINSUN.model.entity.containers;
import by.BNTU.FITR.RAINSUN.model.entity.collsections.StackOfArray;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;

/**
 * @author Владислав
 */
public class Train {

    private final StackOfArray<Coach> train;

    public Train(){
        train = new StackOfArray();
    }
    
    public Train(Coach coach){
        train = new StackOfArray();
        train.put(coach);
    }
    
    public void add(Coach ... obj) {
        for (Coach c : obj) {
            train.put(c);
        }
    }

    public StackOfArray<Coach> get() {
        return train;
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
