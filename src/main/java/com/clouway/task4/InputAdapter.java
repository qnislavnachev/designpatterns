package com.clouway.task4;

import java.io.*;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class InputAdapter implements Closeable {

    private InputStream inputStream;

    public InputAdapter(String fileName) throws FileNotFoundException {
        inputStream = new FileInputStream(fileName);
    }

    public int read(byte[] b, int off, int len) throws IOException {
        return inputStream.read(b,off,len);
    }

    @Override
    public void close() throws IOException {
        if(inputStream != null){
            inputStream.close();
        }
    }
}
