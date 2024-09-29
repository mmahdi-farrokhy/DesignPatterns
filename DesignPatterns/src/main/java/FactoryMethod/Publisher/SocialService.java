package FactoryMethod.Publisher;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SocialService {
    private final PublisherCreator publisher;

    public void publish(Message message) {
        publisher.publish(message);
    }
}
