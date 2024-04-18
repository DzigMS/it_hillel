package com.example.lesson8;

//import com.example.lesson5.Car;
import com.example.lesson6.animal.Animal;
import com.example.lesson6.animal.Cat;
import com.example.lesson6.animal.Dog;
//import com.example.lesson6.car.Car;
import com.example.lesson6.car.CombustionEngine;
import com.example.lesson6.car.ElectricEngine;
import com.example.lesson6.car.Engine;

public class Main {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Sharik", "Pitbul");
//        firstDog = new Cat("Mirzik");
//
//        System.out.println(firstDog.getDogName());
//        System.out.println(firstDog.getAnimalName());
//
//        firstDog.setName("Bobik");
//        System.out.println(firstDog.getDogName());
//        System.out.println(firstDog.getAnimalName());
//        firstDog.voice();
//
//        Cat cat = new Cat("Murzik");
//        System.out.println(cat.getAnimalName());
//        cat.voice();

//        Car car = new Car();
//        car.start();

//        Animal animal = new Cat("Murzik");
//        animal.voice();
//
//        animal = new Dog("Sharik", "Pitbul");
//        animal.voice();

        Engine[] engines = {new CombustionEngine(), new ElectricEngine()};


        com.example.lesson6.car.Car car = new com.example.lesson6.car.Car(engines[(int)(Math.random() + 0.2)]);
        car.start();

        com.example.lesson5.Car car1 = new com.example.lesson5.Car();

    }
}
