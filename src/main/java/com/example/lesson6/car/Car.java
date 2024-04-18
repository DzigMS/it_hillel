package com.example.lesson6.car;

import com.example.lesson9.Movable;
import com.example.lesson9.Point;

public class Car implements Movable {
    private Engine engine;
    String vinNumber;

//    public Car(String vinNumber) {
//        this.vinNumber = vinNumber;
//    }

    public Car(Engine engine) {
        this.engine = engine;
    }


    public void start() {
        engine.start();
    }

    @Override
    public void move(Point source, Point destination) {
        System.out.println("move from source point to dest in car");
    }
}
