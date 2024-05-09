package com.example.lesson19;

@FunctionalInterface
public interface OwnFunctionalInterface {
    void someMethod();
//    void anotherMethod();

    default void printToConsole(String message) {
        System.out.println(message);
    }
}
