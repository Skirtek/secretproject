package com.codecool.apple.interfaces;

public class Mechanic {
    public <T extends Vehicle & WithEngine & WithDoors> void repair(T data) {
    }
}
