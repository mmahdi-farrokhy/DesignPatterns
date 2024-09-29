package FactoryMethod.Publisher.creators;

import FactoryMethod.Publisher.Publisher;
import FactoryMethod.Publisher.PublisherCreator;
import FactoryMethod.Publisher.publishers.InstagramPublisher;

public class InstagramPublisherCreator extends PublisherCreator {
    @Override
    public Publisher createPublisher() {
        return new InstagramPublisher();
    }
}
