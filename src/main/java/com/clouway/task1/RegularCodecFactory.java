package com.clouway.task1;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class RegularCodecFactory implements CodecFactory {
    @Override
    public Codec createCodec(String codecType) {
        if (codecType.equals("xml")) {
            return new XMLCodec();
        } else if (codecType.equals("json")) {
            return new JSONCodec();
        }
        return null;
    }
}
