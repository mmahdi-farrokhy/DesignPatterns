package org.example.decorator.user;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Date registerDate;

    public User(String firstName, String lastName, String email, Date registerDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.registerDate = registerDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public UserPresenter presenter() {
        return new UserPresenter(this);
    }
}
