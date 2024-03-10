package com.codecool.apple;

import com.codecool.apple.vehicles.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Car car1 = new Car("Astra", 5, 1700);
        System.out.println(Car.getCostPerHundredKilometers());
        Car car2 = new Car("Ceed", 5, 2800);
        System.out.println(Car.getCostPerHundredKilometers());
        logger.info("Informacja w aplikacji");
        logger.warn("Ostrzeżenie w aplikacji");
        car2.startEngine();
        System.out.println("Number of engine of car2 is " + car2.generateEngineNumber());

        logger.debug("Debug");
        logger.error("Błąd krytyczny w aplikacji");
    }
}