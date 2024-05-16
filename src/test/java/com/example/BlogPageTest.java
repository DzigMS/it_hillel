package com.example;

import com.example.config.ConfigProvider;
import com.example.lesson17.BlogPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;

public class BlogPageTest {

    private WebDriver driver;

    public void namePatternTest() {
//        local var     -->     pre-cond, input, expected   (given)
//        logic         -->     actual = steps              (when)
//        return        -->     assert actual == expected   (then)
    }

    @BeforeMethod
    public void setUp() {
        driver = ConfigProvider.getDriver();
    }

    @Test(dataProvider = "dataProviderName")
//    @Test()
//    @Parameters(value = {})
    public void searchJobsResultTest(String searchInput, String expectedContain) throws InterruptedException {
//        given
//        setUp();

//        String searchInput = "jobs";
//        String expectedContain = "Джобс";

        BlogPage page = new BlogPage(driver);

//        when
        page.openPage();
        BlogPage searchedPage = page.fillSearchFieldAndPressEnter(searchInput);
        Thread.sleep(3000);
        List<String> searchResultTitles = searchedPage.getSearchResultTitles();

//        then
        Assert.assertListContains(searchResultTitles, results -> results.contains(expectedContain), "message");
//        assert !searchedPage.getSearchResultTitles().stream()
//                .filter(results -> results.contains(expectedContain))
//                .toList().isEmpty();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "dataProviderName")
    public Object[][] dataProviderName(){
        return new Object[][]{
                {"jobs", "Джобс"},
                {"link", "link"}
        };
    }
}
