package com.clouway.task5;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class Stock {

    private Observer observer = new MerchandiseObserver();
    private Sold sold = new Sold(observer);
    private List<Merchandise> available = new LinkedList();

    public void add(Merchandise merchandise){
        available.add(merchandise);
        observer.update(merchandise, " was added!");
    }

    public void sell(Merchandise merchandise){
        int position;
        if(-1 != available.indexOf(merchandise)){
            position = available.indexOf(merchandise);
            sold.add(available.remove(position));
        }else{
            System.out.println("Merchandise not in stock!");
        }
    }

    public void statistic(){
        System.out.println("AVAILABLE:");
        for (Merchandise each: available) {
            System.out.println("Merchandise:" + each.getName() + " Quantity:" + each.getQuantity() + " Price:" + each.getPrice());
        }
        sold.statistic();
    }
}
