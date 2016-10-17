package task1;

public class AbsFactory implements Factory {

    @Override
    public Codec create(String codec) {
        if (codec == null) {
            return null;
        }
        if ("XML".equals(codec)) {
            return new XMLCodec();
        }
        if ("JSON".equals(codec)) {
            return new JSONCodec();
        }
        return null;
    }
}