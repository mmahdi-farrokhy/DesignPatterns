package org.example.OCP.bad;


public class GenericEncoder {

    public String encode(String data, String format) throws Exception {
        DataEncoder encoder;

        if (format.equals("json")) {
            encoder = new JSONEncoder();
        } else if (format.equals("xml")) {
            encoder = new XMLEncoder();
        } else {
            throw new Exception("Invalid format");
        }

        return encoder.encode(data);
    }
}
