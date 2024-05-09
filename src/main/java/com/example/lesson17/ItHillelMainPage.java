package com.example.lesson17;

import com.example.lesson18.Course;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ItHillelMainPage extends BasePage{

    private static final String BLOG_BUTTON_SELECTOR = "*.site-nav-btn[href*=\"blog\"]";
    private static final String LINK = "https://ithillel.ua";

    @FindBy(css = BLOG_BUTTON_SELECTOR)
    private WebElement blogButton;
    private WebElement contactsButton;
    @FindBy(css = "sada")
    private List<WebElement> courses;


    public ItHillelMainPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        openPage(LINK);
    }

    public BlogPage clickToBlogButton() {
//        if (blogButton == null) {
//            blogButton = driver.findElement(BLOG_BUTTON_SELECTOR);
//        }
//        blogButton = lazyImpl(blogButton, BLOG_BUTTON_SELECTOR);

        blogButton.click();

        return new BlogPage(getDriver());
    }

    public List<Course> getCourses() {
        List<Course> courseList = new ArrayList<>();

        for (WebElement course : courses) {
            courseList.add(PageFactory.initElements(course, Course.class));
        }

        return courseList;
    }
}
