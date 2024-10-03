package Mediator.ChatRoom;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom {
    private Map<Long, User> users = new HashMap<>();
    private Emitter emitter;

    public void addUser(User user, Emitter emitter) {
        users.put(user.getUserId(), user);
        this.emitter = emitter;
    }

    public void removeUser(Long userId) {
        users.remove(userId);
    }

    public void send(Message message) {
        User user = users.get(message.getReceiver());
        if (user == null) {
            return;
        }

        emitter.emit(user, message);
    }
}
