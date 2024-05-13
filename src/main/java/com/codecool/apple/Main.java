package com.codecool.apple;

import com.codecool.apple.common.MyFieldAnnotation;
import com.codecool.apple.common.Tuple;
import com.codecool.apple.exceptions.CatastrophicException;
import com.codecool.apple.generics.Response;
import com.codecool.apple.interfaces.*;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    @MyFieldAnnotation(value = "This is a field annotation value")
    private String myField;

    public static void main(String[] args) throws CatastrophicException, NoSuchFieldException {
        Gson gson = new Gson();

        // Pobranie adnotacji i jej wartości dla pola 'myField' w trakcie działania programu
        Field field = Main.class.getDeclaredField("myField");
        MyFieldAnnotation annotation = field.getAnnotation(MyFieldAnnotation.class);
        System.out.println("Annotation value: " + annotation.value()); // Wypisanie wartości adnotacji


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

        com.codecool.apple.vehicles.Car anotherCar = new com.codecool.apple.vehicles.Car("Cayenne", 5, 2700);

        Map<String, Float> employees = new HashMap<>();
        //dodawania elementów do mapy
        employees.put("John Dool", 3000.0f);
        employees.put("Chao Di", 4500.0f);
        employees.put("Prasad D", 1000.0f);
        //usuwanie element z mapy o danym kluczu
        employees.remove("John Dool");
        //pobieranie elementu z mapy o danym kluczu
        System.out.println(employees.get("Prasad D"));

        for (String k : employees.keySet()) {
            System.out.println("Pracownik: " + k);
        }
        for (float value : employees.values()) {
            System.out.println("Wypłata: "+ value);
        }
        for (Map.Entry<String, Float> pair : employees.entrySet()) {
            System.out.println("Pracownik-wypłata " + pair);
        }

        var startEngineResult = anotherCar.startEngine();

        System.out.println("Start engine succeeded: " + startEngineResult.getItem1());
        System.out.println("Time elapsed: " + startEngineResult.getItem2() + "s");

        AbstractMap.SimpleEntry<Integer, String> entry
                = new AbstractMap.SimpleEntry<>(1, "one");
        Integer key = entry.getKey();
        String mapValue = entry.getValue();

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

        //tworzenie obiektu typu Map

    }
}