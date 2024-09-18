package org.example.flyweight.game;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Player {
    private String name;
    private PlayerProperties playerProperties;
}
