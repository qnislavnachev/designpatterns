package com.clouway.builder;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class ItemBuilder {
  private String productName;
  private String measureUnit;
  private Double quantity;
  private Double price;

  public ItemBuilder productName(String productName) {
    this.productName = productName;
    return this;
  }

  public ItemBuilder measureUnit(String measureUnit) {
    this.measureUnit = measureUnit;
    return this;
  }

  public ItemBuilder quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

  public ItemBuilder price(Double price) {
    this.price = price;
    return this;
  }

  public String getProductName() {
    return productName;
  }

  public String getMeasureUnit() {
    return measureUnit;
  }

  public Double getQuantity() {
    return quantity;
  }

  public Double getPrice() {
    return price;
  }

  public OrderItem build(){
    if (productName == null){
      throw new IllegalStateException("No item name.");
    }

    if (measureUnit == null){
      throw new IllegalStateException("No measure unit.");
    }

    if (quantity == null){
      throw new IllegalStateException("No quantity.");
    }

    if (price == null){
      throw new IllegalStateException("No price.");
    }
    return new OrderItem(this);
    }
  }

