package automation.tests;

import automation.utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NoSelectDropdown {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = BrowserFactory.createDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");
    driver.findElement(By.id("dropdownMenuLink")).click();
    List<WebElement> droplist=driver.findElements(By.className("dropdown-item"));
        for (int i = 0; i <5 ; i++) {
            System.out.println(droplist.get(i).getAttribute("href"));
            Thread.sleep(500);
            driver.findElement(By.id("dropdownMenuLink")).click();
            Thread.sleep(500);
        }
        driver.quit();
    }
}