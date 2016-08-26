package com.clouway.codecfactory;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class CodecFactoryNew  implements CodecFactory {
  public Codec getCodec(String type) {
    if (type == null) {
      return null;
    }
    if (type.equalsIgnoreCase("xml")) {
      return new XmlCodec();
    }
    if (type.equalsIgnoreCase("json")) {
      return new JsonCodec();
    } else return null;
  }
}
