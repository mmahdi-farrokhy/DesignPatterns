package FlyWeight.Game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class PlayerProperties {
    private int xp;
    private int hp;
    private String rank;
    private String weapon;
}
