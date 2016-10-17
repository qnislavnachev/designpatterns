package task1;

public class XMLCodecFactoryRef implements CodecFactory {

    @Override
    public Codec create() {
        try {
            Class clazz = XMLCodec.class;
            return (Codec) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}