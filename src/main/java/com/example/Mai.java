package com.example;

import com.example.lesson10.Product;
import com.example.lesson6.animal.Dog;

public class Mai {
    public static void main(String[] args) {
        final Product meatProduct = new MeatProduct(10.0);

        System.out.println(Product.generalFieldForAllInstances);

        Product product1 = new MeatProduct(7.3);
        System.out.println(Product.generalFieldForAllInstances);

        Product.generalFieldForAllInstances = "product1";
        System.out.println(Product.generalFieldForAllInstances);
        System.out.println(Product.generalFieldForAllInstances);

        Product.staticMethod();

        Product product = Product.builder()
                .setName("Meat")
                .setPrice(3.7)
                .setDescription("Milk")
                .build();

        System.out.println(product);

        System.out.println(product.hashCode());
        System.out.println(meatProduct.hashCode());

        System.out.println(product == meatProduct);
        System.out.println(product.equals(meatProduct));

        Dog dog = new Dog("Patron", "JackRussel");

        System.out.println(product.equals(dog));


    }
}
