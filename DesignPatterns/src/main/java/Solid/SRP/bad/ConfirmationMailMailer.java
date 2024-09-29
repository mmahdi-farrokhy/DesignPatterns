package Solid.SRP.bad;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConfirmationMailMailer {
    private final ITemplateEngine templateEngine;
    private final ITranslator translator;
    private final IMailer mailer;

    public void sendTo(User user) {
        Message message = createMessageFor(user);
        sendMessage(message);
    }

    private void sendMessage(Message message) {
        mailer.send(message);
    }

    private Message createMessageFor(User user) {
        String subject = translator.translate("Please confirm your email address");
        String body = templateEngine.render("confirmation-email", user.getConfirmationCode());

        return new Message(subject, body, user.getEmailAddress());
    }
}
