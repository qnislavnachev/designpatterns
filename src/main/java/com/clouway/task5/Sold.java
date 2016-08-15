package com.clouway.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class Sold {

    private List<Merchandise> sold = new ArrayList();
    private Observer observer;

    public Sold(Observer observer){
        this.observer = observer;
    }

    public void add(Merchandise merchandise){
        sold.add(merchandise);
        observer.update(merchandise, " was sold!");
    }

    public void statistic(){
        System.out.println("SOLD:");
        for (Merchandise each: sold) {
            System.out.println("Merchandise:" + each.getName() + " Quantity:" + each.getQuantity() + " Price:" + each.getPrice());
        }
    }

}
