package com.clouway.adapter;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class InStream extends InputStream {
  @Override
  public int read() throws IOException {
    return 0;
  }
}
