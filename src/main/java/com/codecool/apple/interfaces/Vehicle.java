package com.codecool.apple.interfaces;

public interface Vehicle {
    String FUEL_TYPE = "ELECTRIC";


    void run();

    default void checkOilLevel() {
        // 1 implementacji
        // ...
        checkIsOilClosed();
        // operacja B
        checkIsOilClosed();

        // 100 linijka implementacji
    }

    private void checkIsOilClosed() {
        // operacja A
    }
}
