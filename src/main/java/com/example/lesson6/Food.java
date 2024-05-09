package com.example.lesson6;

public class Food {
    public String foodName;
    protected String protectedField;
    String defaultField;
    private String privateField;

    public Food() {
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    //  fields
    //  constructors
    //  methods

    //  getter
    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField(String s) {
        privateField = s;
    }
}
