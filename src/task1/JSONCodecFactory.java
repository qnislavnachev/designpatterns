package task1;

public class JSONCodecFactory implements CodecFactory {

    @Override
    public Codec create() {
        return new JSONCodec();
    }
}