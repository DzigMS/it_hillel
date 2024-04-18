package com.example.lesson12;

import com.example.lesson6.animal.Dog;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Collection<Integer> collection = new ArrayList();
//        collection = new LinkedList<>();
//        arrayList.add();
//        LinkedList
//        Vector

//        ArrayList arrayList = new ArrayList();
//        arrayList.add(10);
//        arrayList.add("sdfs");
//        arrayList.add(30);
//
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(1));

//        Map<String, String> map = new TreeMap<>();
//        map.put("Mike", "Second Name");
//
//        System.out.println(map.get("mike"));

        Dog dog1 = new Dog("Bobik", "British");
        Dog dog2 = new Dog("Sharik", "Dvorterier", LocalDate.of(2023, 11, 7));
        Dog dog3 = new Dog("Marusia", "Buldog", LocalDate.of(2024, 2, 3));
        Dog dog4 = new Dog("Patron", "Jack Russel Terier");

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);

        System.out.println(dogs);

        dogs.sort(new DogComparatorByName());
        System.out.println(dogs);

        dogs.sort(new DogComparatorByDob());
        System.out.println(dogs);
//        System.out.println(dog1.compareTo(dog2));



    }
}
