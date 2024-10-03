package Mediator.EventDispatcher;

public interface Observer {
    public void update(String event, Object emitter, Object data);
}
