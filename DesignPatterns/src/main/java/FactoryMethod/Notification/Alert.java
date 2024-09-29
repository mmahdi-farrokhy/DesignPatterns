package FactoryMethod.Notification;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Alert {
    private final String message;
    private final String level;
}
