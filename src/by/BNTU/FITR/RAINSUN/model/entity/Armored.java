package by.BNTU.FITR.RAINSUN.model.entity;

/**
 * @author Владислав
 */
public class Armored extends Coach {

    private int armor;

    public Armored() {
        super();
        this.armor = 0;

    }

    public Armored(int weight, int armor) {
        super(weight);
        this.armor = armor;

    }

    public int getArmor() {
        return this.armor;
    }

    public void setArmor(int armor) {
        if (armor > 0) {
            this.armor = armor;
        }
    }

    @Override
    public String toString() {
        return "Armored car(" + super.toString() + ", armor = "
                + this.armor + ")";
    }

}
