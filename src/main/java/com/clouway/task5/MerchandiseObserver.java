package com.clouway.task5;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class MerchandiseObserver implements Observer {
    @Override
    public void update(Merchandise merchandise, String message) {
        System.out.println("Merchandise:" + merchandise.name + " of quantity:" + merchandise.quantity + " with price:" + merchandise.price + message);
    }
}
