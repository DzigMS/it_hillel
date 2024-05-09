package com.example.lesson19;


import com.example.lesson6.Food;
import com.example.lesson6.animal.Dog;
import org.checkerframework.checker.units.qual.A;

import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, InterruptedException {
//        Supplier      Object supply()
//        Consumer      void consume(Object o)
//        Function      AnotherType func(Type o)
//        Predicate     boolean filter(Object o)

        Supplier<Dog> supplier = () -> new Dog("Bobik", "Dvorterier");

//        Supplier<Dog> supplier = new Supplier<Dog>() {
//            @Override
//            public Dog get() {
//                return new Dog("Bobik", "Dvorterier");
//            }
//        };

//        Dog dog = supplier.get();
//        System.out.println(dog);
//        System.out.println(supplier.get());
//
//        supplier = () -> {
//            System.out.println("Override method get for supplier object");
//            return new Dog("Sharik", "Terier");
//        };
//
//        System.out.println(supplier.get());

//        DogService<String, Dog> dogDogService = new DogService<>();
//
//        dogDogService.setProcedures(d -> {
//            Food meat = new Food("Meat");
//            d.eat(meat);
//            return "Dog " + d.getDogName() + " is fed with " + meat.foodName;
//        });
//
//        String serviceResult = dogDogService.serviceForDog(supplier.get());
//        System.out.println(serviceResult);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Bobik", "Dvorterier", LocalDate.now().minusDays(3)));
        dogs.add(new Dog("Sharik", "Terier", LocalDate.now().minusDays(4)));
        dogs.add(new Dog("Tuzik", "Buldog", LocalDate.now().minusDays(5)));
        dogs.add(new Dog("Knopa", "Pitbul", LocalDate.now().minusDays(1)));

//        Stream.generate()

        List<String> list = dogs.stream()
                .filter(dog -> dog.getDateOfBirth().isAfter(LocalDate.now().minusDays(7)))
                .sorted((dog1, dog2) -> dog1.getDogName().compareTo(dog2.getDogName()))
                .map(dog -> dog.getDogName())
                .toList();

        System.out.println(list);
    }
}
