package FactoryMethod.Publisher;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Message {
    private final String title;
    private final String image;
    private final String content;
}
