package by.BNTU.FITR.RAINSUN.model.entity;

/**
 * @author Владислав
 */
public class Coach {

    private int weight;

    public Coach() {
    }

    public Coach(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "weight = " + this.weight + ";";
    }

}
