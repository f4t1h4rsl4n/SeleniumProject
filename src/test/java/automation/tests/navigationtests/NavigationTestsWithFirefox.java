package automation.tests.navigationtests;

import automation.utils.BrowserFactory;
import automation.utils.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTestsWithFirefox {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.createDriver("firefox");
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
