package com.clouway.task5;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class Merchandise {
    public final String name;
    public final Integer quantity;
    public final Double price;

    public Merchandise(String name, Integer quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
