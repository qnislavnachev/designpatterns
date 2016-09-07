package com.clouway.builder;

import java.util.Date;
import java.util.List;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public final class Order {
  private Long orderId;
  private String customerName;
  private String customerAddress;
  private Date orderCreationDate;
  private Date orderDeliveryDate;
  private List<OrderItem> items;

  public Order(OrderBuilder orderBuilder) {
    orderId=orderBuilder.getOrderId();
    customerName=orderBuilder.getCustomerName();
    customerAddress=orderBuilder.getCustomerAddress();
    orderCreationDate=orderBuilder.getOrderCreationDate();
    orderDeliveryDate=orderBuilder.getOrderDeliveryDate();
    items=orderBuilder.getItems();
  }
}
