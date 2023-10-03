package com.codecool.model;

public class Solder extends Unit {

    private String name;
    private boolean isKillable = true;
    private double battlePower = 1;

    public Solder(boolean isRebel, String name) {
        super(isRebel);
        this.name = name;
    }

    public void addWeapon() {
        System.out.println("Weapon receiver.");

    }
}
//Is a unit
//Has a name
//They are ready for battle if they have received their weapon
//Their battle power is 1
//Can be killed