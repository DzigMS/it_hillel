package com.example.lesson18;

import com.example.lesson6.animal.Animal;
import com.example.lesson6.animal.Cat;
import com.example.lesson6.animal.Dog;
import com.example.lesson9.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Box<Dog> box = new Box<>(5, 5, 5);
//        Box<Cat> catBox = new Box<>(5, 5, 5);
//        Box<Animal> animalBox = new Box<>(5, 5, 5);
//
//        Box objectBox = new Box(3, 3, 3);
//        objectBox.putItem(new Triangle(3, 3, 3));
//        objectBox.putItem(new Dog("Sharik", "Terier"));

//        Box<Triangle> triangleBox = new Box<>(7, 7, 7);
//        DogBox box = new DogBox(5, 5, 5);

//        System.out.println(box.getItem());

//        box.putItem(new Triangle(3, 4,5));
//        box.putDog(new Triangle(3, 4,5));
//        box.getItem();

//        box.putItem(new Dog("Bobik", "Dvorterier"));
//        Dog dog = box.getItem();

//        box.putDog(new Dog("Bobik", "Dvorterier"));
//        Dog dog = box.getDog();

//        System.out.println(dog.getDogName());

//        box.<Dog>genericMethod(new Dog("Sharik", "Terier"));

//        List<String> strings = new ArrayList<>();
//        strings.add("first");
//        strings.add("second");
//        strings.add("third");
//
//        List<Long> integers = new ArrayList<>();
//        integers.add(1L);
//        integers.add(2L);
//        integers.add(3L);
//
//        addIntegerToList(integers, 7L);
//
//        for (String s : strings) {
//            System.out.println(s.toUpperCase());
//        }

//        strings.add(10);
    }

    static <T extends Number> void addIntegerToList(List<T> list, T number) {
        list.add(number);
    }

//    static void addIntegerToList(List<? extends Number> list) {
//        list.add();
//    }
}
