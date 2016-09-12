package com.clouway.builder;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public final class OrderItem {

  private String productName;
  private String measureUnit;
  private Double quantity;
  private Double price;

  public OrderItem(String productName, String measureUnit, Double quantity, Double price) {
    this.productName = productName;
    this.measureUnit = measureUnit;
    this.quantity = quantity;
    this.price = price;
  }
}
