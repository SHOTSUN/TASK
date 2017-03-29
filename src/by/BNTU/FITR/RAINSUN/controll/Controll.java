package by.BNTU.FITR.RAINSUN.controll;

import by.BNTU.FITR.RAINSUN.entity.logic.Counter;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Depo;
import by.BNTU.FITR.RAINSUN.util.Creator;


import by.BNTU.FITR.RAINSUN.model.entity.collsections.StackOfArray;
import by.BNTU.FITR.RAINSUN.model.entity.collsections.QueueOfArray;
import by.BNTU.FITR.RAINSUN.model.entity.collsections.QueueOfList;
import by.BNTU.FITR.RAINSUN.model.entity.collsections.StackOfList;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;

public class Controll {

    public static void main(String[] args) {

        Depo depo = new Depo(new StackOfList());
        
        Creator.createDepo(depo, 4);

        System.out.println(Counter.calculateTotalCost(depo) + " - total weight");

        System.out.println(depo);
        
    }

}
