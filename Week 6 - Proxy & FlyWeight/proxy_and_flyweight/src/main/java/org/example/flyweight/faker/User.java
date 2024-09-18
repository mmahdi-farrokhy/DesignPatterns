package org.example.flyweight.faker;

public class User {
    private String firstName;
    private String lastName;
    private UserProfile userProfile;

    public User(String firstName, String lastName, UserProfile userProfile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userProfile = userProfile;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }
}
