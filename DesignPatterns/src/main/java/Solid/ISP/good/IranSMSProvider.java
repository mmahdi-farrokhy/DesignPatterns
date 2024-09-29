package Solid.ISP.good;

public class IranSMSProvider implements SMSProvider {
    public void sendSMS(String message) {
        System.out.println("Sending SMS to Iran: " + message);
    }
}
