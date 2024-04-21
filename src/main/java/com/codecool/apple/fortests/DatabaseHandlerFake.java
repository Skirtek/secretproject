package com.codecool.apple.fortests;

import java.util.HashMap;
import java.util.Map;

public class DatabaseHandlerFake implements DatabaseManager {
    private Map<Integer, Configuration> database = new HashMap<>();

    public DatabaseHandlerFake() {
        database.put(1, new Configuration(18));
    }

    @Override
    public Configuration getAgeFromDatabase() {
        return database.get(1);
    }
}
