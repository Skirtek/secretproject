package com.codecool.apple.fortests;

public class CalendarHelper {
    public boolean isWorkDay(Weekdays weekday) {
        return weekday != Weekdays.SATURDAY && weekday != Weekdays.SUNDAY;
    }
}
