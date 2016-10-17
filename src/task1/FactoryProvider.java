package task1;

public class FactoryProvider {

    public CodecFactory getFactory(String type) {
        if (type.equals("newXML")) {
            return new XMLCodecFactoryBasic();
        }
        if (type.equals("RefXML")) {
            return new XMLCodecFactoryRef();
        }
        if (type.equals("newJSON")) {
            return new JSONCodecFactoryBasic();
        }
        if (type.equals("RefJSON")) {
            return new JSONCodecFactoryRef();
        }
        return null;
    }
}