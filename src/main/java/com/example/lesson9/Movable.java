package com.example.lesson9;

public interface Movable {
    void move(Point source, Point destination);

    default void say() {

    }
}
