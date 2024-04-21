package com.codecool.apple.fortests;

public class DatabaseHandler implements DatabaseManager {
    @Override
    public Configuration getAgeFromDatabase() {
        System.out.println("SELECT adultAge FROM configuration");
        return new Configuration(18);
    }
}
