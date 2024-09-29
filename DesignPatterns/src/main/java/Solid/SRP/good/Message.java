package Solid.SRP.good;

public class Message {
    private String subject;
    private String body;
    private String emailAddress;

    public Message(String subject, String body, String emailAddress) {
        this.subject = subject;
        this.body = body;
        this.emailAddress = emailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
