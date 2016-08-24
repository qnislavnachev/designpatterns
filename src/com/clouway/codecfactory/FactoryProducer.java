package com.clouway.codecfactory;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class FactoryProducer {
  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("new")) {
      return new CodecFactoryNew();
    }
    if (choice.equalsIgnoreCase("reflection")){
      return new CodecFactoryReflect();
    }
    return null;
  }
}
