package com.clouway.task3.order.builder;

import com.clouway.task3.item.builder.OrderItem;

import java.util.Date;
import java.util.List;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class OrderBuilder{

    private Order order;

    public OrderBuilder(){
        this.order = new Order();
    }

    public OrderBuilder buildOrderId(Long orderId) {
        this.order.setOrderId(orderId);
        return this;
    }

    public OrderBuilder buildCustomerName(String name) {
        this.order.setCustomerName(name);
        return  this;
    }

    public OrderBuilder buildCustomerAddress(String address) {
        this.order.setCustomerAddress(address);
        return  this;
    }

    public OrderBuilder buildOrderCreationDate(Date date) {
        this.order.setOrderCreationDate(date);
        return  this;
    }

    public OrderBuilder buildOrderDeliveryDate(Date date) {
        this.order.setOrderDeliveryDate(date);
        return  this;
    }

    public OrderBuilder buildOrderItems(List<OrderItem> items) {
        this.order.setOrderItems(items);
        return  this;
    }

    public Order build() {
        return this.order;
    }

}
