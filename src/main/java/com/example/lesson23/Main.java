package com.example.lesson23;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.example.lesson17.BlogPage;
import org.openqa.selenium.By;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Configuration.timeout = 3000;
//        Configuration.browser = "safari";
//        Configuration.baseUrl = "https://ithillel.ua/";

        Selenide.open("https://blog.ithillel.ua/");
        SelenideElement searchButton = Selenide.$(By.cssSelector("*.site-nav-search_btn"));
        searchButton.click();
        SelenideElement searchField = Selenide.$(By.cssSelector("*.site-nav-search_input"));
        searchField.shouldHave(Condition.interactable).type("jobs");


        Selenide.sleep(3000);
//        Thread.sleep(3000);
        Selenide.closeWebDriver();
    }
}
