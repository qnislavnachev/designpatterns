package com.clouway.codecfactory;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class AbstractCodecFactory {
  public static CodecFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("new")) {
      return new CodecFactoryNew();
    }
    if (choice.equalsIgnoreCase("reflection")){
      return new CodecFactoryReflect();
    }
    return null;
  }
}
