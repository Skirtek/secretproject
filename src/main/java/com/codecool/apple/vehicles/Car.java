package com.codecool.apple.vehicles;

import com.codecool.apple.vehicles.parts.Engine;
import com.codecool.apple.vehicles.parts.Seats;
import com.codecool.apple.vehicles.parts.Tire;

import java.util.Random;

public class Car {
    private static int carCount = 90;

    private String model;
    private int numberOfDoors;
    private double weight;
    public static double costPerHundredKilometers;
    private Seats seats;

    private Tire[] tires;

    private Engine engine;

    public Car(String model, int numberOfDoors, double weight) {
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.weight = weight;

        costPerHundredKilometers = numberOfDoors * weight / 100;

        tires = new Tire[]{new Tire(2, 18)};

        carCount++;
    }

    public static double getCostPerHundredKilometers() {
        return costPerHundredKilometers;
    }

    public static int getCount() {
        return carCount;
    }

    public void startEngine() {
        System.out.println("Starting!");
    }

    public int generateEngineNumber() {
        Random random = new Random();

        return random.nextInt(1000) + 10000;
    }
}
