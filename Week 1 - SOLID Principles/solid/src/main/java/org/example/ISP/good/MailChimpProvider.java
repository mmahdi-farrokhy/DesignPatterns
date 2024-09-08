package org.example.ISP.good;

public class MailChimpProvider implements EmailProvider {
    @Override
    public void sendEmail(String message) {
        System.out.println("Sending Email to Iran: " + message);
    }
}
