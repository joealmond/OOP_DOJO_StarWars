package com.codecool.model;

import com.codecool.service.Battle;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit {
    private static int idCounter = 0;
    private int id;
    private double battlePower = 0;
    private boolean isRebel;
    private Colors color;
    private boolean isReady = false;
    List<Battle> ownBattles;

    public Unit(boolean isRebel) {
        idCounter++;
        this.id = idCounter;
        this.battlePower = battlePower;
        this.isRebel = isRebel;
        this.color = isRebel ? Colors.BLUE : Colors.RED;
        this.isReady = isReady;
        this.ownBattles = new ArrayList<>();
    }

}

//Has a unique identifier
//Has battle power
//Knows which army it belongs to (Rebels or Empire)
//They have a color to make them easier to identify in the battlefield (Rebel units are blue and Empire units are red)
//They know if they are ready to deploy in battle
//Keeps track of all battles it has been in