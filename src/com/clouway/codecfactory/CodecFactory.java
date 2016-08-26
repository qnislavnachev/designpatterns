package com.clouway.codecfactory;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public interface CodecFactory {
  Codec getCodec(String type);
}
