package lesson6.animal;

import lesson6.Food;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Dog {
    String breed;
    String name;
    LocalDate dateOfBirth;

    public Dog() {}

    public Dog(String dogName, String dogBreed) {
        name = dogName;
        breed = dogBreed;
        dateOfBirth = LocalDateTime.now().toLocalDate();
    }

    public void voice() {
        System.out.println("Woof");
    }

    public void eat(Food food) {
        System.out.println("Dog with name " + name + " eat " + food.foodName);
    }
}