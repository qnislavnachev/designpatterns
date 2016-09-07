package com.clouway.builder;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public final class OrderItem {
  private String productName;
  private String measureUnit;
  private Double quantity;
  private Double price;
  public OrderItem(ItemBuilder itemBuilder){
    productName=itemBuilder.getProductName();
    measureUnit=itemBuilder.getMeasureUnit();
    quantity=itemBuilder.getQuantity();
    price=itemBuilder.getPrice();
  }
}
