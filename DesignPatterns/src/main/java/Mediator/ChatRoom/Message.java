package Mediator.ChatRoom;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Message {
    private String content;
    private Long sender;
    private Long receiver;
}
