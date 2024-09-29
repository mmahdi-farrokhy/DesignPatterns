package Solid.SRP.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConfirmationMailMailer {
    private final IMailer mailer;
    private final ConfirmationMailFactory confirmationMailFactory;

    public void sendTo(User user) {
        Message message = confirmationMailFactory.createMessageFor(user);
        sendMessage(message);
    }

    private void sendMessage(Message message) {
        mailer.send(message);
    }
}
