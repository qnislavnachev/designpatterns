package com.clouway.task3.item.builder;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public interface ItemBuilder {

    void buildProductName(String name);
    void buildMeasureUnit(String unit);
    void buildQuantity(Double quantity);
    void buildPrice(Double price);
    OrderItem getItem();

}
