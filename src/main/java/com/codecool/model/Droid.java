package com.codecool.model;

public class Droid extends Unit {
    private String manufacturer;
    private double batteryPower = 100;
    private boolean isReady;
    private double battlePower = 2;
    private boolean isKillable = true;

    public Droid(boolean isRebel, String manufacturer) {
        super(isRebel);
        this.manufacturer = manufacturer;
        this.isReady = batteryPower > 65;
    }
}
//Is a unit
//Has a manufacturer
//Has max battery capacity
//Has battery power (measured in watt)
//They are ready for battle if their battery is over 65%
//Their battle power is 2
//Can be killed
