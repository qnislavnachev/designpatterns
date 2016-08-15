package com.clouway.task3.item.builder;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class OrderItemBuilder implements  ItemBuilder {

    private OrderItem item;

    public OrderItemBuilder(){
        this.item = new OrderItem();
    }

    @Override
    public void buildProductName(String name) {
        item.setProductName(name);
    }

    @Override
    public void buildMeasureUnit(String unit) {
        item.setMeasureUnit(unit);
    }

    @Override
    public void buildQuantity(Double quantity) {
        item.setQuantity(quantity);
    }

    @Override
    public void buildPrice(Double price) {
        item.setPrice(price);
    }

    @Override
    public OrderItem getItem() {
        return this.item;
    }

}
