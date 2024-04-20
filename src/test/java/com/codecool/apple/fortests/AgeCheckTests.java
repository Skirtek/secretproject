package com.codecool.apple.fortests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgeCheckTests {
    private final AgeCheck ageCheck = new AgeCheck();

/*    @ParameterizedTest
    @ValueSource(ints = {18, 40, 99, 3000})
    public void isAdultTests(int age) {
        assertTrue(ageCheck.isAdult(age));
    }*/

    @ParameterizedTest
    @CsvSource({
            "18, true",
            "30, true",
            "4, false"
    })
    public void isAdult_returnsExpectedValue(int age, boolean expectedValue) {
        // act
        boolean result = ageCheck.isAdult(age);

        // assert
        assertEquals(expectedValue, result);
    }
}
