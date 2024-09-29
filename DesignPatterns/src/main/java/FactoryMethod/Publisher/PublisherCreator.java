package FactoryMethod.Publisher;

public abstract class PublisherCreator {

    public abstract Publisher createPublisher();

    public void publish(Message message) {
        Publisher publisher = createPublisher();
        publisher.publish(message);
    }
}
