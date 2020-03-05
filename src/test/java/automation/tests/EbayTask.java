package automation.tests;

import automation.utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EbayTask {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.createDriver("chrome");
        driver.get("https://www.ebay.com/");
        WebElement searchBox=driver.findElement(By.xpath("//input[@label=\"Search for anything\"]"));
        searchBox.sendKeys("java book"+ Keys.ENTER);
        List<WebElement> resultList=driver.findElements(By.xpath("//li[@class='s-item   ']"));
        System.out.println(resultList.size());
        driver.quit();
    }
}
