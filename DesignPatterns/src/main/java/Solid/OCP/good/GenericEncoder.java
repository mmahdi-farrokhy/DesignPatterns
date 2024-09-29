package Solid.OCP.good;


public class GenericEncoder {

    private final IEncoderFactory encoderFactory;

    public GenericEncoder(EncoderFactory encoderFactory) {
        this.encoderFactory = encoderFactory;
    }

    public String encode(String data, String format) throws Exception {
        DataEncoder encoder = encoderFactory.createEncoder(format);
        return encoder.encode(data);
    }
}
