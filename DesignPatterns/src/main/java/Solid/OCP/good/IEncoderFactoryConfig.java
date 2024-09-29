package Solid.OCP.good;

public interface IEncoderFactoryConfig {
    void addEncoder(String format, DataEncoder encoder);
}
