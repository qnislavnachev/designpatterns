package task1;

public class XMLCodecFactory implements CodecFactory {

    @Override
    public Codec create() {
        return new XMLCodec();
    }
}