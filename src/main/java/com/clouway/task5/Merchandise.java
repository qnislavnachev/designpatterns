package com.clouway.task5;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class Merchandise {
    private String name;
    private Integer quantity;
    private Double price;

    public Merchandise(String name, Integer quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
}
