package com.example.lesson15;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        String browserName = System.getenv("browser");
//        System.out.println(browserName);

        RemoteWebDriver browser = getDriver(args[0]);
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        browser.get("https://ithillel.ua/courses/front-end-basic");

        browser.manage().window().maximize();
        System.out.println(browser.getTitle());

        FluentWait<RemoteWebDriver> wait = new FluentWait<>(browser)
                .pollingEvery(Duration.ofMillis(100))       // wait.pollingEvery(Duration.ofMillis(300));
                .withTimeout(Duration.ofSeconds(15))        // wait.withTimeout(Duration.ofSeconds(15));
                .ignoring(NoSuchElementException.class);    // wait.ignoring(NoSuchElementException.class);

        WebElement coachSection = wait.until((driver) -> {
            driver.executeScript("window.scrollBy(0,200)");
            return driver.findElement(By.id("coachesSection"));
        });

        System.out.println(coachSection);

        List<WebElement> coachesNames = coachSection.findElements(By.className("coach-card_name"));
//        coachesNames.get(3);
//        #coachesSection > div > div > ul > li:nth-child(3) > a > div > div.coach-card_group > p.coach-card_name
        coachesNames.stream()
                .map(WebElement::getText)
                .forEach(System.out::println);

        

//        WebElement programmingCourseButton = browser.findElement(By.cssSelector("a.block-course-cats_link[href*='programming']"));
//
//        programmingCourseButton.click();

//        WebElement blogButton = browser.findElement(By.cssSelector("*.site-nav-btn[href*=\"blog\"]"));
//        blogButton.click();
//        Thread.sleep(1000);
//        System.out.println(browser.getTitle());
//
//        WebElement searchFieldButton = browser.findElement(By.cssSelector("*.site-nav-search_btn"));
//        WebElement searchInput = browser.findElement(By.cssSelector("*.site-nav-search_input"));
//        searchFieldButton.click();
//        searchInput.sendKeys("jobs");
//        searchFieldButton.click();
//        searchInput.sendKeys(Keys.ENTER);

//        Thread.sleep(5000);
        browser.quit();
    }

    static RemoteWebDriver getDriver(String driverName) {
        switch (driverName) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "safari":
                return new SafariDriver();
            case "edge":
                return new EdgeDriver();
            default:
                throw new IllegalArgumentException("No such driver");
        }
    }
}
