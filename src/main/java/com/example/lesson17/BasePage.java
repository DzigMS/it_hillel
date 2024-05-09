package com.example.lesson17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public abstract class BasePage {
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public abstract void openPage();

    protected void openPage(String link) {
        driver.get(link);
    }

    protected WebDriver getDriver() {
        return driver;
    }

//    protected WebElement lazyImpl(WebElement element, By selector) {
//        if (Objects.isNull(element)) {
//            return driver.findElement(selector);
//        }
//
//        return element;
//    }
}
