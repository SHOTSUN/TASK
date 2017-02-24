package by.BNTU.FITR.RAINSUN.util;

import by.BNTU.FITR.RAINSUN.model.entity.Simple;
import by.BNTU.FITR.RAINSUN.model.entity.Armored;
import by.BNTU.FITR.RAINSUN.model.entity.Train;
import java.util.Random;

/**
 * @author Владислав
 */
public class Creator {

    public static void Create(Train train, int n) {
        Random myRandom = new Random();

        for (int i = 0; i < n-1; i++) {
            int buf = myRandom.nextInt(n);
            if (buf % 2 == 0) {
                train.addTo(new Armored(15 + myRandom.nextInt(40), myRandom.nextInt(300)));
            } else {
                train.addTo(new Simple(15 + myRandom.nextInt(40), 1 + myRandom.nextInt(5)));
            }

        }
    }
}
