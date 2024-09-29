package Solid.OCP.good;

public interface IEncoderFactory {
    DataEncoder createEncoder(String format) throws Exception;
}
