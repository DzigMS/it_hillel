package com.example.lesson10;

import com.example.lesson9.Voicable;

public enum DayOfWeek {
    MONDAY(""),                     // new DayOfWeek("");
    TUESDAY,                                  // new DayOfWeek();
    WEDNESDAY(""),
    THURSDAY(""),
    FRIDAY("It's a friday"),    // public static final DayOfWeek FRIDAY = new DayOfWeek("It's a friday");
    SATURDAY(""),
    SUNDAY("Hello from sunday");

    private String description;

    DayOfWeek(String description) {
        this.description = description;
    }

    DayOfWeek() {}

    DayOfWeek(String abcDescription, String anotherDescription) {

    }

    public String getDescription() {
        return description;
    }
}
