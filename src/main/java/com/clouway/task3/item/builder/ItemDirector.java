package com.clouway.task3.item.builder;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class ItemDirector {

    private ItemBuilder itemBuilder;

    public ItemDirector(ItemBuilder itemBuilder){
        this.itemBuilder = itemBuilder;
    }

    public OrderItem getOrderItem(){
        return this.itemBuilder.getItem();
    }

    public void makeOrderItem(String productName, String measureUnit, Double quantity, Double price){
        this.itemBuilder.buildProductName(productName);
        this.itemBuilder.buildMeasureUnit(measureUnit);
        this.itemBuilder.buildQuantity(quantity);
        this.itemBuilder.buildPrice(price);
    }

}
