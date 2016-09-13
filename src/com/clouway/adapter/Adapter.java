package com.clouway.adapter;

import java.io.IOException;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class Adapter implements SimpleReader {
  @Override
  public int read(byte[] buf, int offset, int length) throws IOException {
    return new InStream().read(buf, offset, length);
  }
}
