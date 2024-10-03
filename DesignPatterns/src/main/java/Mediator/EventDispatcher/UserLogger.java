package Mediator.EventDispatcher;

public class UserLogger {
    public void update(String event, String emitter, Object data) {
        System.out.println("Event: " + event);
        System.out.println("Emitter: " + emitter);
        System.out.println("Data: " + data);
    }
}
