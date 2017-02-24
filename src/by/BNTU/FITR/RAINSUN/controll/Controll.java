package by.BNTU.FITR.RAINSUN.controll;

import by.BNTU.FITR.RAINSUN.model.entity.Depo;
import by.BNTU.FITR.RAINSUN.entity.logic.Counter;
import by.BNTU.FITR.RAINSUN.view.View;

/**
 * @author SHOTSUN
 */
public class Controll {

    public static void main(String[] args) {

        Depo depo = new Depo();
        depo.createDepo(3);

        View.print(Counter.calculateTotalCost(depo) + " - total weight");
        
        View.print(depo.showDepo() + "");
        
       
    }

}
