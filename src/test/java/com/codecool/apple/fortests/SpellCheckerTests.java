package com.codecool.apple.fortests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpellCheckerTests {
    private final SpellChecker spellChecker = new SpellChecker();

    @ParameterizedTest
    @NullAndEmptySource // ""
    @ValueSource(strings = { "                   " })
    public void isNullOrEmptyTests(String input) {
        assertTrue(spellChecker.isNullOrEmpty(input));
    }
}
