package com.example;

import com.example.lesson10.Product;
import com.example.lesson6.animal.Dog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Mai {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));

        Thread.sleep(3000);
    }
}
