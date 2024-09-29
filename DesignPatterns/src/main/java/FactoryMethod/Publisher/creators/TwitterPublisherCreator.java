package FactoryMethod.Publisher.creators;

import FactoryMethod.Publisher.Publisher;
import FactoryMethod.Publisher.PublisherCreator;
import FactoryMethod.Publisher.publishers.TwitterPublisher;

public class TwitterPublisherCreator extends PublisherCreator {
    @Override
    public Publisher createPublisher() {
        return new TwitterPublisher();
    }
}
