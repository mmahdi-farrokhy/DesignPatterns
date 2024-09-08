package org.example.OCP.good;

import java.util.HashMap;
import java.util.Map;

public class EncoderFactory implements IEncoderFactory, IEncoderFactoryConfig {

    private Map<String, DataEncoder> encoders = new HashMap<>();

    @Override
    public DataEncoder createEncoder(String format) throws Exception {
        DataEncoder encoder;

        if (encoders.containsKey(format)) {
            encoder = encoders.get(format);
        } else {
            throw new Exception("Invalid format!");
        }

        return encoder;
    }

    @Override
    public void addEncoder(String format, DataEncoder encoder) {
        encoders.put(format, encoder);
    }
}
