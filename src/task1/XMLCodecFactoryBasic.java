package task1;

public class XMLCodecFactoryBasic implements CodecFactory {

    @Override
    public Codec create() {
        return new XMLCodec();
    }
}