package com.example;

import com.example.lesson17.BlogPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BlogPageTest {

    public void namePatternTest() {
//        local var     -->     pre-cond, input, expected   (given)
//        logic         -->     actual = steps              (when)
//        return        -->     assert actual == expected   (then)
    }

    @Test
    public void searchJobsResultTest() throws InterruptedException {
//        given
        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));

        String searchInput = "jobs";
        String expectedContain = "Джобс";

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
}
