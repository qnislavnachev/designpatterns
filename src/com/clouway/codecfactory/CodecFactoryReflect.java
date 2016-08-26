package com.clouway.codecfactory;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class CodecFactoryReflect implements CodecFactory {
  public Codec getCodec(String type) {
    try {
      if (type.equalsIgnoreCase("xml")) {
        return XmlCodec.class.newInstance();
      }
      if (type.equalsIgnoreCase("json")) {
        return JsonCodec.class.newInstance();
      }
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    return null;
  }
}
