package com.example.lesson10;

public class Main {
    public static String PATTERN = "Order with id %s has status %s for product %s";
    public static void main(String[] args) {
//        DayOfWeek day = DayOfWeek.FRIDAY;
//        System.out.println(day.getDescription());
//
//        System.out.println(DayOfWeek.SUNDAY.getDescription());
//        System.out.println(DayOfWeek.TUESDAY.getDescription());

//        DayOfWeek dayOfWeek = new DayOfWeek();
        Product cheese = new Product("Cheese", 10.3, 1037);
        Product bread = new Product("Bread", 3.3, 1033);

        Order order = new Order(cheese);


//        System.out.println(PATTERN.formatted(order.getUuid(), order.getStatus(), order.getProduct().getName()));
//
//        order.changeStatus(Status.IN_PROGRESS);
//        order.changeProduct(bread);
//        System.out.println(PATTERN.formatted(order.getUuid(), order.getStatus(), order.getProduct().getName()));
//
//        order.changeStatus(Status.DONE);
//        order.changeProduct(cheese);
//        System.out.println(PATTERN.formatted(order.getUuid(), order.getStatus(), order.getProduct().getName()));

    }
}
