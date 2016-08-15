package com.clouway.task3.order.builder;

import com.clouway.task3.item.builder.OrderItem;

import java.util.Date;
import java.util.List;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class OrderDirector {

    private OrderBuilder orderBuilder;

    public OrderDirector(CourierOrderBuilder orderBuilder){
        this.orderBuilder = orderBuilder;
    }

    public Order getOrder(){
        return this.orderBuilder.getOrder();
    }

    public void makeOrder(Long orderId, String customerName, String customerAddress, Date creationDate, Date deliveryDate, List<OrderItem> items){
        this.orderBuilder.buildOrderId(orderId);
        this.orderBuilder.buildCustomerName(customerName);
        this.orderBuilder.buildCustomerAddress(customerAddress);
        this.orderBuilder.buildOrderCreationDate(creationDate);
        this.orderBuilder.buildOrderDeliveryDate(deliveryDate);
        this.orderBuilder.buildOrderItems(items);
    }

}
