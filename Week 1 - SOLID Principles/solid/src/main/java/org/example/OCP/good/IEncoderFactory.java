package org.example.OCP.good;

public interface IEncoderFactory {
    DataEncoder createEncoder(String format) throws Exception;
}
