package task1;

public class RefFactory implements Factory {

    @Override
    public Codec create(String codec) {
        Class clazz = null;

        if (codec == null) {
            return null;
        }
        if ("XML".equals(codec)) {
            clazz = XMLCodec.class;
            try {
                return (XMLCodec) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        if ("JSON".equals(codec)) {
            clazz = JSONCodec.class;
            try {
                return (JSONCodec) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}