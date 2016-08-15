package com.clouway.task3.order.builder;

import com.clouway.task3.item.builder.OrderItem;

import java.util.Date;
import java.util.List;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class Order implements OrderPlan {

    private Long orderId;
    private String customerName;
    private String customerAddress;
    private Date creationDate;
    private Date deliveryDate;
    private List<OrderItem> items;


    @Override
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public void setOrderCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public void setOrderDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void setOrderItems(List<OrderItem> items) {
        this.items = items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

}
