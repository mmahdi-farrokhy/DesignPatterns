package FlyWeight.Faker;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client {
    private final UserFactory userFactory;

    public void generateDiscount() {
        for (int i = 1; i < 101; i++) {
            userFactory.createUser(
                    "first name-" + i,
                    "last name-" + i,
                    i % 2 == 0 ? "Male" : "Female",
                    i * 2,
                    "province-" + i);
        }
    }
}
