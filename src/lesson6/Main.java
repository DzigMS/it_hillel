package lesson6;

import lesson6.animal.Dog;

public class Main {
    public static void main(String[] args) {
//        Dog firstDog;
//        new Dog(); -> instance
//        firstDog = new Dog();
        Food pedigree = new Food();
        pedigree.foodName = "Pedigree";

        Food meet = new Food();
        meet.foodName = "Meet";

        Dog firstDog = new Dog("Sharik", "Pitbul");
        Dog secondDog = new Dog("Tuzik", "Dvorterierr");

        firstDog.voice();
        firstDog.eat(pedigree);

        secondDog.voice();
        secondDog.eat(pedigree);

        Dog dog = new Dog();
        dog.eat(meet);

        Car car = new Car("EU243242442");
    }
}
