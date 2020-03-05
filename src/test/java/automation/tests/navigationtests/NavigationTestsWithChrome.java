package automation.tests.navigationtests;

import automation.utils.BrowserFactory;
import automation.utils.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationTestsWithChrome {
    public static void main(String[] args) {
        WebDriver driver=BrowserFactory.createDriver("chrome");
        driver.get("https://google.com");
        String firstTitle=driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String secondTitle=driver.getTitle();
        driver.navigate().back();
        String firstTitleSecond=driver.getTitle();
        StringUtility.verifyEquals(firstTitle,firstTitleSecond);
        driver.navigate().forward();
        String secondTitleSecond=driver.getTitle();
        StringUtility.verifyEquals(secondTitle,secondTitleSecond);
        driver.quit();
    }
}
