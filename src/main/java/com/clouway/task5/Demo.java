package com.clouway.task5;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class Demo {

    public static void main(String[] args){
        Merchandise jeans = new Merchandise("Jeans", 3, 35.90);
        Merchandise shirts = new Merchandise("Shirts", 5, 10.50);
        Merchandise belts = new Merchandise("Belts", 2, 22.80);
        Stock stock = new Stock();

        stock.add(jeans);
        stock.add(shirts);
        stock.sell(shirts);
        stock.add(belts);
        stock.statistic();
    }

}
