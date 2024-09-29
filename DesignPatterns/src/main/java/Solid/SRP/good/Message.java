package Solid.SRP.good;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Message {
    private String subject;
    private String body;
    private String emailAddress;
}
