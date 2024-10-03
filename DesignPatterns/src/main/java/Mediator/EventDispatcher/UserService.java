package Mediator.EventDispatcher;

public class UserService {
    private final EventDispatcher eventDispatcher;

    public UserService(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }

    public void removeUser(Long userId) {
        eventDispatcher.fire("user:removed", this, userId);
    }
}
