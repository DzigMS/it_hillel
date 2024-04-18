package com.example.lesson9;

import com.example.lesson6.animal.Animal;
import com.example.lesson6.animal.Cat;
import com.example.lesson6.animal.Dog;
import com.example.lesson6.animal.Elephant;
import com.example.lesson6.car.Car;
import com.example.lesson6.car.CombustionEngine;
import com.example.lesson6.car.ElectricEngine;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
//        Dog dog = new Dog("Sharik", "Pitbul");
//
//        Animal animal;
//        animal = new Dog("name", "Dvor");
//
//        animal.voice();
//
//        animal = new Cat("Murzik");
//        animal.voice();
//
//        Point source = new Point();
//        Point dest = new Point();
//
//        Movable movable = new Car(new CombustionEngine());
//
//        Car car = new Car(new ElectricEngine());
//        Elephant elephant = new Elephant("Paul");
//
//        travel(car, source, dest);
//        travel(elephant, source, dest);

//        Class<? extends Dog> dogClass = dog.getClass();
//        Annotation[] annotations = dogClass.getAnnotations();
//        System.out.println(Arrays.toString(annotations));
//
//        Field[] declaredFields = dogClass.getDeclaredFields();
//        System.out.println(Arrays.toString(declaredFields));
//
//        System.out.println(dog.getDogName());
//
//        for (Field field : declaredFields) {
//            if (field.isAnnotationPresent(Experimental.class)) {
//                field.setAccessible(true);
//                System.out.println(field.getName() + " : " + field.get(dog));
//                field.set(dog, "Dvorterier");
//            }
//        }
//
//        System.out.println(dog.getDogName());

        Circle circle = new Circle(10);
        System.out.println(circle.getPerimeter());
        Integer number = 10;

        Triangle triangle = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(3,4,30.0);



    }

    public static void travel(Movable movable, Point source, Point dest) {
        movable.move(source, dest);
    }
}
