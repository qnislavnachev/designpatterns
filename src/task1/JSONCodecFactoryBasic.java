package task1;

public class JSONCodecFactoryBasic implements CodecFactory {

    @Override
    public Codec create() {
        return new JSONCodec();
    }
}