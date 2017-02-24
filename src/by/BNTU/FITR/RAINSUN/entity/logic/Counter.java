package by.BNTU.FITR.RAINSUN.entity.logic;

import by.BNTU.FITR.RAINSUN.model.entity.Depo;
import by.BNTU.FITR.RAINSUN.model.entity.Train;
import by.BNTU.FITR.RAINSUN.model.entity.Coach;

/**
 * @author SHOTSUN
 */
public class Counter {

    public static int calculateTotalCost(Depo depo) {

        int total = 0;

        for (Train train : depo.getDepo()) {
            for (Coach coach : train.getList()) {
                total += coach.getWeight();
            }
        }
        return total;
    }

}
