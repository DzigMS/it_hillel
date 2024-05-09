package com.example.lesson21;

import com.example.lesson18.TestingCoursePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();

        TestingCoursePage testingCoursePage = new TestingCoursePage(driver);
        testingCoursePage.getCourses();
    }
}
