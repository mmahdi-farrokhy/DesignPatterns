package FlyWeight.Faker;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class UserFactory {
    private Map<String, UserProfile> usersProfile;

    public User createUser(
            String firstName,
            String lastName,
            String gender,
            int age,
            String province) {
        UserProfile userProfile = createUserProfile(gender, age, province);
        return new User(firstName, lastName, userProfile);
    }

    private UserProfile createUserProfile(String gender, int age, String province) {
        String key = createProfileKey(gender, age, province);

        if (!usersProfile.containsKey(key)) {
            usersProfile.put(key, new UserProfile(gender, age, province));
        }

        return usersProfile.get(key);
    }

    private String createProfileKey(String gender, int age, String province) {
        String profileParameters =
                gender +
                        age +
                        province;

        return String.valueOf(profileParameters.hashCode());
    }
}
