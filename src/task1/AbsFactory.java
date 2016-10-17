package task1;

public class AbsFactory implements Factory {

    @Override
    public Codec create(String codec) {
        if (codec == null) {
            return null;
        }
        if ("JSON".equals(codec)) {
            return new JSONCodec();
        }
        if ("XML".equals(codec)) {
            return new XMLCodec();
        }
        return null;
    }
}