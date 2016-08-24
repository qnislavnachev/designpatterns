package com.clouway.codecfactory;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public abstract class AbstractFactory {
  abstract Codec getCodec(String type);
}
