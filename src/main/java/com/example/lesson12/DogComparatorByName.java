package com.example.lesson12;

import com.example.lesson6.animal.Dog;

import java.util.Comparator;

public class DogComparatorByName implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getDogName().compareTo(o2.getDogName());
    }
}
