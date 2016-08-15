package com.clouway.task1;

/**
 * @author Borislav Gadjev <gadjevb@gmail.com>
 */
public class ReflectionCodecFactory {

    public Codec createCodec(String codecType) {
        if (codecType.equals("xml")) {
            Class c = XMLCodec.class;
            try {
                return ((XMLCodec) c.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        } else if (codecType.equals("json")) {
            Class c = JSONCodec.class;
            try {
                return ((JSONCodec) c.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
