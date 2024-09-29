package FactoryMethod.Notification;

public class Alert {
    private final String message;
    private final String level;

    public Alert(String message, String level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public String getLevel() {
        return level;
    }
}
