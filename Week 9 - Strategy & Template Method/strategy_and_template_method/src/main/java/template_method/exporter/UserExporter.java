package template_method.exporter;

import java.util.List;

public abstract class UserExporter {

    public void export() {
        List<User> users = fetchUsers();
        List<User> preparedUsers = prepare(users);
        process(preparedUsers);
    }

    private List<User> fetchUsers() {
        return List.of(
                new User("Username1", "Password1"),
                new User("Username2", "Password2"),
                new User("Username3", "Password3"),
                new User("Username4", "Password4"),
                new User("Username5", "Password5"));
    }

    private List<User> prepare(List<User> users) {
        return users
                .stream()
                .map(user ->
                        new User(user.getHashedUsername(),
                                user.getHashedPassword()))
                .toList();
    }

    protected abstract void process(List<User> users);
}
