package com.clouway.task5;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class MerchandiseObserver implements Observer {
    @Override
    public void update(Merchandise merchandise, String message) {
        System.out.println("Merchandise:" + merchandise.getName() + " of quantity:" + merchandise.getQuantity() + " with price:" + merchandise.getPrice() + message);
    }
}
