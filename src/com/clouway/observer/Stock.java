package com.clouway.observer;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class Stock {
  public String name;
  public Double quantity;

  public Stock(String name, Double quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public void incrementQuantity(Double quantity){
    this.quantity+=quantity;
  }

  @Override
  public String toString() {
    return "com.clouway.observer.Stock{" +
            "name='" + name + '\'' +
            ", quantity=" + quantity +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Stock stock = (Stock) o;

    if (name != null ? !name.equals(stock.name) : stock.name != null) return false;
    return quantity != null ? quantity.equals(stock.quantity) : stock.quantity == null;

  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
    return result;
  }
}
