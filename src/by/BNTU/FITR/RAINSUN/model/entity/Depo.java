package by.BNTU.FITR.RAINSUN.model.entity;

import by.BNTU.FITR.RAINSUN.util.Creator;
import java.util.Random;

/**
 * @author SHOTSUN
 */
public class Depo {

    //private ArrayList<Train> depo = new ArrayList<>();
    private Container <Train> depo = new Container();

    public void createDepo(int numbTrains) {

        Random myRandom = new Random();
        int minNum = 2;
        for (int i = 0; i < numbTrains; i++) {
            Train train = new Train();

            Creator.Create(train, minNum + myRandom.nextInt(15));
            depo.add(train);
        }
    }

    public int size() {
        return depo.size();
    }

    public Container getDepo() {
        return depo;
    }

    public String showDepo() {
        String result = "";
        for (int i = 0; i < depo.size(); i++) {
            result += "\n\n\tTrains:\n";
            
            for (Train train : depo) {
                result += train.toString();
            }
        }

        return result;

    }

}
