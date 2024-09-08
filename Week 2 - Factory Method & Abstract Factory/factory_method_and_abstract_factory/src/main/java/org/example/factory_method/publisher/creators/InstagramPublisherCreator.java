package org.example.factory_method.publisher.creators;

import org.example.factory_method.publisher.PublisherCreator;
import org.example.factory_method.publisher.Publisher;
import org.example.factory_method.publisher.publishers.InstagramPublisher;

public class InstagramPublisherCreator extends PublisherCreator {
    @Override
    public Publisher createPublisher() {
        return new InstagramPublisher();
    }
}
