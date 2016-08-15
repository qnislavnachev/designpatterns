package com.clouway.task3.order.builder;

import com.clouway.task3.item.builder.OrderItem;

import java.util.Date;
import java.util.List;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public interface OrderBuilder {

    void buildOrderId(Long orderId);
    void buildCustomerName(String name);
    void buildCustomerAddress(String address);
    void buildOrderCreationDate(Date date);
    void buildOrderDeliveryDate(Date date);
    void buildOrderItems(List<OrderItem> items);
    Order getOrder();

}
