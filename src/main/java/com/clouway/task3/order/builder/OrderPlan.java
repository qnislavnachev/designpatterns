package com.clouway.task3.order.builder;

import com.clouway.task3.item.builder.OrderItem;

import java.util.Date;
import java.util.List;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public interface OrderPlan {

    void setOrderId(Long orderId);
    void setCustomerName(String name);
    void setCustomerAddress(String address);
    void setOrderCreationDate(Date date);
    void setOrderDeliveryDate(Date date);
    void setOrderItems(List<OrderItem> items);

}
