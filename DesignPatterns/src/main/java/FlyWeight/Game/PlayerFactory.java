package FlyWeight.Game;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class PlayerFactory {
    private Map<String, PlayerProperties> playersProperties;

    public Player createPlayer(String name,
                               int xp,
                               int hp,
                               String rank,
                               String weapon) {
        PlayerProperties playerProperties = createPlayerProperties(xp, hp, rank, weapon);
        return new Player(name, playerProperties);
    }

    private PlayerProperties createPlayerProperties(int xp, int hp, String rank, String weapon) {
        String key = createPlayerPropertiesKey(xp, hp, rank, weapon);

        if (!playersProperties.containsKey(key)) {
            playersProperties.put(key, new PlayerProperties(xp, hp, rank, weapon));
        }

        return playersProperties.get(key);
    }

    private String createPlayerPropertiesKey(int xp, int hp, String rank, String weapon) {
        String propertiesParameters =
                xp + hp + rank + weapon;

        return String.valueOf(propertiesParameters.hashCode());
    }
}
