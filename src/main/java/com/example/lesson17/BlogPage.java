package com.example.lesson17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Objects;

public class BlogPage extends BasePage {

    private static final String SEARCH_FIELD_BUTTON_SELECTOR = "*.site-nav-search_btn";
    private static final String SEARCH_FIELD_INPUT_SELECTOR = "*.site-nav-search_input";
    private static final String POST_LIST_ITEMS_SELECTOR = "*.post-list_item";

    private static final String LINK = "https://blog.ithillel.ua";

    @FindBy(css = SEARCH_FIELD_BUTTON_SELECTOR)
    private WebElement searchFieldButton;

    @FindBy(css = SEARCH_FIELD_INPUT_SELECTOR)
    private WebElement searchInput;

    @FindBy(css = POST_LIST_ITEMS_SELECTOR)
    private List<WebElement> postListItems;

    public BlogPage(WebDriver driver) {
        super(driver);

//        searchFieldButton = driver.findElement(SEARCH_FIELD_BUTTON_SELECTOR);
//        searchInput = driver.findElement(SEARCH_FIELD_INPUT_SELECTOR);
    }

    @Override
    public void openPage() {
        openPage(LINK);
    }

    public void fillSearchField(String searchText) {
        clickSearchField();

//        searchInput = lazyImpl(searchInput, SEARCH_FIELD_INPUT_SELECTOR);
        searchInput.sendKeys(searchText);
    }

    public BlogPage fillSearchFieldAndPressEnter(String searchText) {
        fillSearchField(searchText);
        searchInput.sendKeys(Keys.ENTER);

        return new BlogPage(getDriver());
    }

    public void clickSearchField() {
//        searchFieldButton = lazyImpl(searchFieldButton, SEARCH_FIELD_BUTTON_SELECTOR);
        searchFieldButton.click();
    }

    public List<String> getSearchResultTitles() {
        return postListItems.stream()
                .map(we -> we.findElement(By.cssSelector("*.post-card_descr")))
                .map(WebElement::getText)
                .toList();
    }
}
