package com.clouway.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class OrderBuilder {
  private Long orderId = 0l;
  private String customerName = "Customer";
  private String customerAddress = "Home";
  private Date orderCreationDate = new Date(0);
  private Date orderDeliveryDate = new Date(0);
  private List<OrderItem> items=new ArrayList<>();

  public OrderBuilder() {
  }

  public OrderBuilder orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public OrderBuilder customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  public OrderBuilder customerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
    return this;
  }

  public OrderBuilder orderCreationDate(Date orderCreationDate) {
    this.orderCreationDate = orderCreationDate;
    return this;
  }

  public OrderBuilder orderDeliveryDate(Date orderDeliveryDate) {
    this.orderDeliveryDate = orderDeliveryDate;
    return this;
  }

  public OrderBuilder items(List<OrderItem> items) {
    this.items = items;
    return this;
  }

  public Order build() {
    return new Order(orderId, customerName, customerAddress, orderCreationDate, orderDeliveryDate, items);
  }
}
