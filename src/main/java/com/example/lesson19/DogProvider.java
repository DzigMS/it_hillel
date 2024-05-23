package com.example.lesson19;

import com.example.lesson6.animal.Dog;

import java.util.Random;

public class DogProvider {

    private static final String[] names = new String[]{"Bobik", "Sharik", "Knopa"};
    private static final String[] breeds = new String[]{"Dvorterier", "Buldog", "Rotveller", "Haski"};



    public static Dog getDog() {
        Random random = new Random();

        return new Dog(names[random.nextInt(names.length)], breeds[random.nextInt(breeds.length)]);
    }
}
