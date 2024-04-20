package com.codecool.apple.interfaces;

import com.codecool.apple.exceptions.CatastrophicException;
import com.codecool.apple.exceptions.ValidationException;
import lombok.Cleanup;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.extern.java.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

@Log
public class Bicycle implements Vehicle {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();

        try {
            if (value.equals("abc")) {
                throw new ValidationException("Niee można w tym programie wpisać abc");
            }
        } catch (ValidationException ve) {
            ve.printStackTrace();
        }
    }

    public void go(@NonNull Coordinates destination) throws CatastrophicException {
        int i = 1;

        Coordinates coords = new Coordinates(1,2,3,4);

        //Coordinates anotherCoords = new Coordinates(2, 2);

        //System.out.println(anotherCoords.hashCode());
        System.out.println(destination.hashCode());

        if (i == 1) {

        } else {
            throw new CatastrophicException("Nastąpiła katastrofa", new ValidationException("Uważaj żeby jechać prosto"));
        }
    }

    private final Pattern pattern = Pattern.compile("\\d");

    @SneakyThrows
    public int getResponseFromUser() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();

        log.warning("There is warning");

        @Cleanup FileInputStream fileInputStream = new FileInputStream("C:\\Users");

        if (!pattern.matcher(value).find()) {
            throw new ValidationException("Błędny input od użytkownika");
        }


        if(value.equals("abc")){
            throw new IOException();
        }

        return Integer.parseInt(value);
    }
}
