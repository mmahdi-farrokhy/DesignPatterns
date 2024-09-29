package Solid.OCP.good;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GenericEncoder {

    private final IEncoderFactory encoderFactory;

    public String encode(String data, String format) throws Exception {
        DataEncoder encoder = encoderFactory.createEncoder(format);
        return encoder.encode(data);
    }
}
