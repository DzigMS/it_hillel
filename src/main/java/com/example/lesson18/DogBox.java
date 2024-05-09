package com.example.lesson18;

import com.example.lesson6.animal.Dog;

public class DogBox {
    private Box box;

    public DogBox(int wight, int length, int height) {
        this.box = new Box(wight, length, height);
    }

    public Dog getDog() {
        return (Dog)box.getItem();
    }

    public boolean putDog(Dog item) {
        return box.putItem(item);
    }

    public int getWight() {
        return box.getWight();
    }

    public int getLength() {
        return box.getLength();
    }

    public int getHeight() {
        return box.getHeight();
    }
}
