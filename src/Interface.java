import java.io.IOException;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public interface Interface {
  public int read(byte[] buf, int offset, int length) throws IOException;
}
