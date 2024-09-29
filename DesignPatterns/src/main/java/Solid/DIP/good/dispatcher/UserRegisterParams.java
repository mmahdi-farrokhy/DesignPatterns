package Solid.DIP.good.dispatcher;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserRegisterParams {
    String firstName;
    String lastName;
    String password;
    String email;
}
