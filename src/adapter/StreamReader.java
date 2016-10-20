package adapter;

import java.io.IOException;

public interface StreamReader {

    int read(byte[] data, int off, int length) throws IOException;
}