package Mediator.ChatRoom;

public interface Emitter {
    public void emit(User user, Message message);
}
