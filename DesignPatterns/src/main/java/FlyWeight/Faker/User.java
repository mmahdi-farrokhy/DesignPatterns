package FlyWeight.Faker;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private String firstName;
    private String lastName;
    private UserProfile userProfile;
}
