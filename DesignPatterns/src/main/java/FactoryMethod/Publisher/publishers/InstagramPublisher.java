package FactoryMethod.Publisher.publishers;

import FactoryMethod.Publisher.Message;
import FactoryMethod.Publisher.Publisher;

public class InstagramPublisher implements Publisher {
    @Override
    public void publish(Message message) {
        System.out.println("Message Published on Instagram:");
        System.out.println("Title: " + message.getTitle());
        System.out.println("Image: " + message.getImage());
        System.out.println("Content: " + message.getContent());
    }
}
