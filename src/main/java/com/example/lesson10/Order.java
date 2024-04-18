package com.example.lesson10;

import java.util.UUID;

public class Order {
    private UUID uuid;
    private Product product;
    private Status status;

    public Order() {
        this(null);
    }

    public Order(Product product) {
        this.product = product;
        uuid = UUID.randomUUID();
        status = Status.NEW;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Status getStatus() {
        return status;
    }

    public void changeStatus(Status newStatus) {
        status = newStatus;
    }

    public void setProduct(Product product) {
        if (this.product == null || status.equals(Status.NEW)) {
            this.product = product;
        }
        System.out.println("Status should be new");
    }

    public void changeProduct(Product product) {
        if (status.equals(Status.IN_PROGRESS) || status.equals(Status.NEW)) {
            this.product = product;
        }
        System.out.println("Status should be in progress or new");
    }

    public Product getProduct() {
        return product;
    }
}
