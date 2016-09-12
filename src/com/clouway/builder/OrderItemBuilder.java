package com.clouway.builder;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class OrderItemBuilder {
  private String productName = "name";
  private String measureUnit = "kg";
  private Double quantity = 0.0;
  private Double price = 0.0;

  public OrderItemBuilder() {
  }

  public OrderItemBuilder productName(String productName) {
    this.productName = productName;
    return this;
  }

  public OrderItemBuilder measureUnit(String measureUnit) {
    this.measureUnit = measureUnit;
    return this;
  }

  public OrderItemBuilder quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

  public OrderItemBuilder price(Double price) {
    this.price = price;
    return this;
  }

  public OrderItem build() {
    return new OrderItem(productName, measureUnit, quantity, price);
  }
}

