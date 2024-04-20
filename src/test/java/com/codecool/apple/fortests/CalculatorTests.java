package com.codecool.apple.fortests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTests {
    private final Calculator calculator = new Calculator();

    @Test
    public void addTests() {
        int result = calculator.add(1, 1);

        assertEquals(2, result);
    }
}
