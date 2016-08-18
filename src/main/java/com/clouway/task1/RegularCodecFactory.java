package com.clouway.task1;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class RegularCodecFactory implements CodecFactory {
    @Override
    public Codec create(String type) {
        if (type.equals("xml")) {
            return new XMLCodec();
        } else if (type.equals("json")) {
            return new JSONCodec();
        }
        return null;
    }
}
