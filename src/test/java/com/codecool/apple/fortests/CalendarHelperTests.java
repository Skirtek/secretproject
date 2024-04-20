package com.codecool.apple.fortests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalendarHelperTests {
    private final CalendarHelper calendarHelper = new CalendarHelper();

    // methodname_stateundertest_expecation
    @ParameterizedTest
    @EnumSource(value = Weekdays.class, names = {"SATURDAY", "SUNDAY"}, mode = EnumSource.Mode.EXCLUDE)
    public void isWorkDay_workdayWasPassed_returnsTrue(Weekdays weekday) {
        // act
        boolean result = calendarHelper.isWorkDay(weekday);

        // assert
        assertTrue(result);
    }
}
