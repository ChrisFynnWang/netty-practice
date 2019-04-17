package com.headfirst.decoratorPattern.inputstream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/7
 * @Other:
 */
public class MyInputStream extends FilterInputStream {

  private InputStream in;

  /**
   * Creates a <code>FilterInputStream</code> by assigning the  argument <code>in</code> to the
   * field <code>this.in</code> so as to remember it for later use.
   *
   * @param in the underlying input stream, or <code>null</code> if this instance is to be created
   * without an underlying stream.
   */
  public MyInputStream(InputStream in) {
    super(in);
    this.in = in;
  }


  public int read() throws IOException {
    int c = super.read();
//    return c == -1 ? c : Character.toLowerCase((char) c);
    return c == -1 ? c : Character.toLowerCase((char) c);
  }
}
