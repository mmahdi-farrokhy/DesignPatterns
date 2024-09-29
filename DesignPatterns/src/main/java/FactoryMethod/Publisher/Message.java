package FactoryMethod.Publisher;

public class Message {
    private final String title;
    private final String image;
    private final String content;

    public Message(String title, String image, String content) {
        this.title = title;
        this.image = image;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getContent() {
        return content;
    }
}
