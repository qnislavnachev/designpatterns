package task1;

public class FactoryProvider {

    public static CodecFactory getXMLCodecFactory() {
        return new XMLCodecFactory();
    }

    public static CodecFactory getXMLCodecReflectionFactory() {
        return new XMLCodecReflectionFactory();
    }

    public static CodecFactory getJSONCodecFactory() {
        return new JSONCodecFactory();
    }

    public static CodecFactory getJSONCodecReflectionFactory() {
        return new JSONCodecReflectionFactory();
    }
}