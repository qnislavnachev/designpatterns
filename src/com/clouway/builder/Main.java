package com.clouway.builder;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class Main {
  public static void main(String[] args) {
    OrderItem order = new OrderItemBuilder().productName("Ivan").build();
  }
}
