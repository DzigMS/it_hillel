package com.example.lesson6.animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
//        this.name = name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public void voice() {
        if ("Barsik".equalsIgnoreCase(name)) {
//            super.voice();
        }else {
            System.out.println("Meow");
        }
    }
}
