package com.example.lesson6.animal;

import com.example.lesson6.Food;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

/**
 *
 */
public class Dog extends Animal {
    private String[] blockedNames = {"New name", "Ivan", "Durik"};
    private String breed;

    private String name;
    private LocalDate dateOfBirth;

//    public Dog() {
//        super();
//    }

    public Dog(String name, String breed) {
        this(name, breed, LocalDateTime.now().toLocalDate());
//        this.name = name;
//        this.breed = breed;
//        dateOfBirth = LocalDateTime.now().toLocalDate();
    }

    public Dog(String name, String breed, LocalDate dateOfBirth) {
        super("name for animal");
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    /**
     *
     * @param food
     */
    public void eat(Food food) {
        System.out.println("Dog with name " + name + " eat " + food.foodName);
    }

    public String getDogName() {
        return this.name;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String newName) {
        if (!isValidName(newName)) {
//            super.name = this.name;
            this.name = newName;
        } else {
            System.out.println("Name " + newName + " is blocked");
        }
    }

    private boolean isValidName(String newName) {
        return Arrays.asList(blockedNames).contains(newName);
    }

//    @Override
//    public int compareTo(Dog dog) {
//        return this.name.compareTo(dog.name);
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}