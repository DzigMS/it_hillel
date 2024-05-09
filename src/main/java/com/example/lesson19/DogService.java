package com.example.lesson19;

import com.example.lesson6.animal.Dog;

import java.util.function.Function;

public class DogService<R, I extends Dog> {
    private Function<I, R> function;

    public void setProcedures(Function<I, R> function) {
        this.function = function;
    }

    public R serviceForDog(I input) {
        System.out.println("Start service for dog " + input.getDogName());
        return function.apply(input);
    }
}
