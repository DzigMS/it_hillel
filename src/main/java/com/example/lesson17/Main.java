package com.example.lesson17;

import com.example.lesson18.BlockProfessionItem;
import com.example.lesson18.TestingCoursePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        DRY
//        YAGNI
//        KISS

        RemoteWebDriver browser = new SafariDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        browser.manage().window().maximize();

        Runtime.getRuntime().addShutdownHook(new Thread(browser::quit));

        TestingCoursePage testingCoursePage = new TestingCoursePage(browser);
        testingCoursePage.openPage();
        Thread.sleep(1_000);

//        BlogPage blogPage = testingCoursePage.clickToBlogButton();
        testingCoursePage.getCourses().stream()
                .map(BlockProfessionItem::getCourseName)
                .forEach(System.out::println);

        testingCoursePage.goToCategory("Тестування").getCourses().forEach(System.out::println);

        Thread.sleep(1_000);
//        blogPage.fillSearchField("jobs");
//        blogPage.clickSearchField();

        Thread.sleep(3_000);

        browser.quit();
    }
}
