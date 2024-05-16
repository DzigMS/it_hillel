package com.example;

import org.testng.annotations.*;

public class TestNgAnnotations {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @Test(groups = {"regression"})
    public void test1() {
        System.out.println("Run first test");
    }

    @Test(groups = {"regression, api"})
    public void test2() {
        System.out.println("Run second test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }
}
