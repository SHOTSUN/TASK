package by.BNTU.FITR.RAINSUN.model.entity;

import java.util.ArrayList;

/**
 * @author Владислав
 */
public class Train {

    private final ArrayList<Coach> train = new ArrayList<>();

    public void addTo(Coach obj) {
        train.add(obj);
    }

    public ArrayList<Coach> getList() {
        return train;
    }

    @Override
    public String toString() {

        StringBuilder showBag
                = new StringBuilder();

        for (Coach thing : train) {
            showBag.append(thing.toString()).append("\n");
        }

        return showBag.toString();
    }

}
