package com.codecool.apple.interfaces;

public class Car implements Vehicle, WithDoors, WithEngine {
    private final String engineType;
    private final String make;

    private final String model;

    public Car(String engineType, String make, String model) {
        this.engineType = engineType;
        this.make = make;
        this.model = model;
    }

    @Override
    public void run() {

    }

    @Override
    public void openDoors() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType='" + engineType + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
