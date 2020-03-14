package automation.tests;

import automation.pagefactory.AmazonHomePage;
import automation.utils.BaseTest;
import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTests extends BaseTest {

    /**
     * Given user is on the amazon.com page
     * When user enters "java" as a search item
     * Then user clicks on the search button
     * And user clicks on the first search item
     * And user verifies that title of the search item contains "java"
     */
    @Test
    public void amazonSearchTest() throws InterruptedException {
        driver.get("http://amazon.com");
        AmazonHomePage amazonHomePage=new AmazonHomePage(driver);
        amazonHomePage.searchBox.sendKeys("java"+ Keys.ENTER);
        driver.findElement(By.xpath("//div[@data-asin='B076926QSX']")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        String title=driver.findElement(By.id("ebooksProductTitle")).getText();
        String expected="Java: Programming Basics for Absolute Beginners (Step-By-Step Java Book 1)";
        Assert.assertEquals(title.trim(),expected);
    }
}
