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

  public Order(Long orderId, String customerName, String customerAddress, Date orderCreationDate, Date orderDeliveryDate, List<OrderItem> items) {
    this.orderId = orderId;
    this.customerName = customerName;
    this.customerAddress = customerAddress;
    this.orderCreationDate = orderCreationDate;
    this.orderDeliveryDate = orderDeliveryDate;
    this.items = items;
  }
}
