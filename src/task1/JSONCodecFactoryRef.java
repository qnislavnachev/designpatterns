package task1;

public class JSONCodecFactoryRef implements CodecFactory {

    @Override
    public Codec create() {
        try {
            Class clazz = JSONCodec.class;
            return (Codec) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}