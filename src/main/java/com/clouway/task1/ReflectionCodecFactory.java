package com.clouway.task1;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class ReflectionCodecFactory {

    public Codec createCodec(String codecType) throws IllegalAccessException, InstantiationException {
        if (codecType.equals("xml")) {
            Class c = XMLCodec.class;
            return (XMLCodec) c.newInstance();
        } else if (codecType.equals("json")) {
            Class c = JSONCodec.class;
            return ((JSONCodec) c.newInstance());
        }
        return null;
    }

}
