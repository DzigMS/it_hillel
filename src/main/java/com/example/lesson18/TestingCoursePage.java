package com.example.lesson18;

import com.example.lesson17.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.example.lesson18.TestingCoursePageConstants.TESTING_COURSE_LINK;
import static com.example.lesson18.TestingCoursePageConstants.TESTING_COURSE_NAME;

public class TestingCoursePage extends BasePage implements Course {

    @FindBy(css = "*.block-profession_list")
    private WebElement blockProfessionList;


    public TestingCoursePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public List<BlockProfessionItem> getCourses() {
        return blockProfessionList
                .findElements(By.cssSelector("*.block-profession_item"))
                .stream()
                .map(item -> PageFactory.initElements(item, BlockProfessionItem.class))
                .toList();
//        return List.of();
    }

    @Override
    public List<BlockProfessionItem> getAdditionalCourses() {
        return List.of();
    }

    @Override
    public List<String> getOpportunities() {
        return List.of();
    }

    public <T extends Course> T goToCategory(String category) {
        T coursePage = null;
        switch (category) {
            case TESTING_COURSE_NAME:
                coursePage = (T) new TestingCoursePage(getDriver());
                break;
            default: throw new RuntimeException();
        }

        return coursePage;
    }

    @Override
    public void openPage() {
        openPage(TestingCoursePageConstants.PAGE_LINK);
    }
}
