package automation.tests;

import automation.utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlertTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        List<WebElement> buttons=driver.findElements(By.tagName("button"));
        buttons.get(0).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        buttons.get(1).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        buttons.get(2).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("yo man!");
        driver.switchTo().alert().accept();
        WebElement result=driver.findElement(By.id("result"));
        System.out.println(result.getText().equals("You entered: yo man!"));
        driver.quit();
    }
}
