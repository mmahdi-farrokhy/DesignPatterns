package Solid.SRP.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConfirmationMailFactory {
    private final ITranslator translator;
    private final ITemplateEngine templateEngine;

    public Message createMessageFor(User user) {
        String subject = translator.translate("Please confirm your email address");
        String body = templateEngine.render("confirmation-email", user.getConfirmationCode());

        return new Message(subject, body, user.getEmailAddress());
    }
}
