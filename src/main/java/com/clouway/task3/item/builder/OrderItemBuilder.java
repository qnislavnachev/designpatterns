package com.clouway.task3.item.builder;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class OrderItemBuilder {

    private OrderItem item;

    public OrderItemBuilder(){
        this.item = new OrderItem();
    }

    public OrderItemBuilder buildProductName(String name) {
        item.setProductName(name);
        return this;
    }

    public OrderItemBuilder buildMeasureUnit(String unit) {
        item.setMeasureUnit(unit);
        return this;
    }

    public OrderItemBuilder buildQuantity(Double quantity) {
        item.setQuantity(quantity);
        return this;
    }

    public OrderItemBuilder buildPrice(Double price) {
        item.setPrice(price);
        return this;
    }

    public OrderItem getItem() {
        return this.item;
    }

}
