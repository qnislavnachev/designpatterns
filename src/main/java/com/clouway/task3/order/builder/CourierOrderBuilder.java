package com.clouway.task3.order.builder;

import com.clouway.task3.item.builder.OrderItem;

import java.util.Date;
import java.util.List;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class CourierOrderBuilder implements OrderBuilder {

    private Order order;

    public CourierOrderBuilder(){
        this.order = new Order();
    }

    @Override
    public void buildOrderId(Long orderId) {
        this.order.setOrderId(orderId);
    }

    @Override
    public void buildCustomerName(String name) {
        this.order.setCustomerName(name);
    }

    @Override
    public void buildCustomerAddress(String address) {
        this.order.setCustomerAddress(address);
    }

    @Override
    public void buildOrderCreationDate(Date date) {
        this.order.setOrderCreationDate(date);
    }

    @Override
    public void buildOrderDeliveryDate(Date date) {
        this.order.setOrderDeliveryDate(date);
    }

    @Override
    public void buildOrderItems(List<OrderItem> items) {
        this.order.setOrderItems(items);
    }

    @Override
    public Order getOrder() {
        return this.order;
    }

}
