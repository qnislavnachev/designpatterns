package com.clouway.builder;

import java.util.Date;
import java.util.List;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class OrderBuilder {
  private Long orderId;
  private String customerName;
  private String customerAddress;
  private Date orderCreationDate;
  private Date orderDeliveryDate;
  private List<OrderItem> items;

  public OrderBuilder orderId(Long orderId){
    this.orderId=orderId;
    return this;
  }
  public OrderBuilder customerName(String customerName){
    this.customerName=customerName;
    return this;
  }
  public OrderBuilder customerAddress(String customerAddress){
    this.customerAddress=customerAddress;
    return this;
  }
  public OrderBuilder orderCreationDate(Date orderCreationDate){
    this.orderCreationDate=orderCreationDate;
    return this;
  }
  public OrderBuilder orderDeliveryDate(Date orderDeliveryDate){
    this.orderDeliveryDate=orderDeliveryDate;
    return this;
  }
  public OrderBuilder items(List<OrderItem> items){
    this.items=items;
    return this;
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

  public Date getOrderCreationDate() {
    return orderCreationDate;
  }

  public Date getOrderDeliveryDate() {
    return orderDeliveryDate;
  }

  public List<OrderItem> getItems() {
    return items;
  }
  public Order build(){

    return new Order(this);
  }
}
