package Solid.SRP.good;

public class ConfirmationMailMailer {
    private final IMailer mailer;
    private final ConfirmationMailFactory confirmationMailFactory;

    public ConfirmationMailMailer(IMailer mailer, ConfirmationMailFactory confirmationMailFactory) {
        this.mailer = mailer;
        this.confirmationMailFactory = confirmationMailFactory;
    }

    public void sendTo(User user) {
        Message message = confirmationMailFactory.createMessageFor(user);
        sendMessage(message);
    }

    private void sendMessage(Message message) {
        mailer.send(message);
    }
}
