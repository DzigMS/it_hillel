package com.example.lesson10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Product {

    public static String generalFieldForAllInstances = "General field";

    private String name;

    private int article;
    private String description;
    private double price;

    private Product() {
//        super();
    }

    public Product(String name, double price, int article) {
//        super();
        this.name = name;
        this.price = price;
        this.article = article;
    }

    public Product(String name, double price, int article, String description) {
        super();
        this.name = name;
        this.price = price;
        this.article = article;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", article=" + article +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode() && !(obj instanceof Product)) {
            return false;
        }
        return name.equals(((Product)obj).name) && article == ((Product)obj).article;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }


    public final void setPrice(double price) {
        staticMethod();
        this.price = price;
    }

    public static void staticMethod() {
//        this.setPrice();
        System.out.println("I am a static method");
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {
        private final Product product;

        public ProductBuilder() {
            product = new Product();
        }

        public ProductBuilder setName(String name) {
            product.name = name;
            return this;
        }

        public ProductBuilder setArticle(int article) {
            product.article = article;
            return this;
        }

        public ProductBuilder setPrice(double price) {
            product.price = price;
            return this;
        }

        public ProductBuilder setDescription(String description) {
            product.description = description;
            return this;
        }

        public Product build() {
            if (product.name == null) {
                throw new IllegalArgumentException("Name is required");
            }

            return product;
        }
    }
}
