package FactoryMethod.Publisher;

import FactoryMethod.Publisher.creators.TwitterPublisherCreator;

public class SocialController {

    private final SocialService socialService;

    public SocialController() {
        this.socialService = new SocialService(new TwitterPublisherCreator());
    }

    public void publish(Message message) {
        socialService.publish(message);
    }
}
