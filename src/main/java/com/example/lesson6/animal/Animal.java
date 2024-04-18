package com.example.lesson6.animal;

import com.example.lesson9.Voicable;

public abstract class Animal implements Voicable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getAnimalName() {
        return this.name;
    }

//    public abstract void voice();
//    {
//        System.out.println("I am an animal");
//    }
}
