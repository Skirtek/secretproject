package com.codecool.apple;

import com.codecool.apple.exceptions.CatastrophicException;
import com.codecool.apple.generics.Response;
import com.codecool.apple.interfaces.*;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws CatastrophicException {
        Gson gson = new Gson();

        Car car = new Car("Electric", "TESLA", "Y");

        System.out.println(gson.toJson(car));

        Car carFromJson = gson.fromJson("{\"engineType\":\"Electric\",\"make\":\"TESLA\",\"model\":\"Y\"}", Car.class);
        System.out.println(carFromJson);

        Response<String, Integer> response = new Response<>("", true, "Data", 1);
        System.out.println(response.getData());
        System.out.println(response.getData2());

        Response<Integer, String> response1 = new Response<>("", true, 1, "Data");
        System.out.println(response1.getData());

        Mechanic mechanic = new Mechanic();

        Bicycle bicycle = new Bicycle();
        //bicycle.go(new Coordinates(1, 2));

        try {
            int value = bicycle.getResponseFromUser();
            System.out.println(value);
        } catch (Throwable ex) {
            System.out.println("Nie wprowadzamy takich wartości");
        }

/*        if (value == -1) {
            System.out.println("Nie wprowadzamy takich wartości");
        } else {

        }*/

        // Car car = new Car();
        //car.openDoors();

/*        Car car1 = new Car("Astra", 5, 1700);
        System.out.println(Car.getCostPerHundredKilometers());
        Car car2 = new Car("Ceed", 5, 2800);
        System.out.println(Car.getCostPerHundredKilometers());
        logger.info("Informacja w aplikacji");
        logger.warn("Ostrzeżenie w aplikacji");
        car2.startEngine();
        System.out.println("Number of engine of car2 is " + car2.generateEngineNumber());

        logger.debug("Debug");
        logger.error("Błąd krytyczny w aplikacji");*/
    }
}