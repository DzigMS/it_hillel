package com.example.lesson6.animal;


import com.example.lesson9.Movable;
import com.example.lesson9.Point;
import com.example.lesson9.Swimable;

public class Elephant extends Animal implements Movable, Swimable {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Oooo");
    }

    @Override
    public void move(Point source, Point destination) {
        System.out.println("Travel on elephant");
    }

    @Override
    public void swim() {
        System.out.println("Elephant is swimming");
    }
}
