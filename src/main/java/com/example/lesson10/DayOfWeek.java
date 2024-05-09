package com.example.lesson10;

import com.example.lesson9.Voicable;

public enum DayOfWeek {
    MONDAY("Mon", ""),                     // new DayOfWeek("");
    TUESDAY,                                  // new DayOfWeek();
    WEDNESDAY("Wed", ""),
    THURSDAY("Thu", ""),
    FRIDAY("Fri", "It's a friday"),    // public static final DayOfWeek FRIDAY = new DayOfWeek("It's a friday");
    SATURDAY("Sat",""),
    SUNDAY("Sun", "Hello from sunday");

    private String shortName;
    private String description;

    DayOfWeek(String name, String description) {
        this.shortName = name;
        this.description = description;
    }

    DayOfWeek() {}

    public String getDescription() {
        return description;
    }
}
