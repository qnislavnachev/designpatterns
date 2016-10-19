package adapter;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamReader extends InputStream {

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }
}