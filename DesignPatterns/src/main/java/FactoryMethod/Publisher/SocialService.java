package FactoryMethod.Publisher;

public class SocialService {
    private final PublisherCreator publisher;

    public SocialService(PublisherCreator publisher) {
        this.publisher = publisher;
    }

    public void publish(Message message) {
        publisher.publish(message);
    }
}