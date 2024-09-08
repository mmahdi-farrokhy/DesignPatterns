package org.example.factory_method.publisher.publishers;

import org.example.factory_method.publisher.Message;
import org.example.factory_method.publisher.Publisher;

public class TwitterPublisher implements Publisher {
    @Override
    public void publish(Message message) {
        System.out.println("Message Published on Twitter:");
        System.out.println("Title: " + message.getTitle());
        System.out.println("Image: " + message.getImage());
        System.out.println("Content: " + message.getContent());
    }
}
