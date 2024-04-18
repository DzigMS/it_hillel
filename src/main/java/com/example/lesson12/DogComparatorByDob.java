package com.example.lesson12;

import com.example.lesson6.animal.Dog;

import java.util.Comparator;

public class DogComparatorByDob implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getDateOfBirth() == null && o2.getDateOfBirth() == null) {
            return o1.getDogName().compareTo(o2.getDogName());
        }
        if (o1.getDateOfBirth() == null) {
            return -1;
        } else if (o2.getDateOfBirth() == null) {
            return 1;
        }

        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
