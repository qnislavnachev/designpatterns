package com.clouway.task1;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class ReflectionCodecFactory implements CodecFactory {

    public Codec create(String type) {
        try {
            if (type.equals("xml")) {
                Class c = XMLCodec.class;
                return (XMLCodec) c.newInstance();
            } else if (type.equals("json")) {
                Class c = JSONCodec.class;
                return ((JSONCodec) c.newInstance());
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
