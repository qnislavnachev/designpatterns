package adapter;

import java.io.IOException;

public class InputStreamAdapter implements StreamReader {
    private InputStreamReader reader;

    public InputStreamAdapter() {
        reader = new InputStreamReader();
    }

    @Override
    public int read(byte[] data, int off, int length) throws IOException {
        return reader.read(data, off, length);
    }
}