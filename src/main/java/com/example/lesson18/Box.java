package com.example.lesson18;

import com.example.lesson6.animal.Animal;

public class Box<Type extends Animal> {
    private int wight;
    private int length;
    private int height;
    private Type item;

    public Box(int wight, int length, int height) {
        this.wight = wight;
        this.length = length;
        this.height = height;
    }

//    public <InputType extends Animal, OutputType> OutputType genericMethod(InputType input) {
//        return null;
//    }

    public Type getItem() {
        Type temp = item;
        item = null;
        return temp;
    }

    public boolean putItem(Type item) {
        if (this.item == null) {
            this.item = item;
            return true;
        }

        return false;
    }

    public int getWight() {
        return wight;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
