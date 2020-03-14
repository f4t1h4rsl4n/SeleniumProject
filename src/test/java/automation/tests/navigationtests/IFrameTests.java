package automation.tests.navigationtests;

import automation.utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrameTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=BrowserFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement editor=driver.findElement(By.tagName("p"));
        editor.clear();
        editor.sendKeys("Adana Demirsporludur");
        editor.sendKeys(Keys.CONTROL+"a");
        driver.switchTo().parentFrame();
        for (int i = 0; i <5 ; i++) {
            driver.findElement(By.xpath("//i[@class='mce-ico mce-i-indent']")).click();
        }
        driver.findElement(By.id("mceu_3")).click();
        Thread.sleep(1500);
        driver.quit();

    }
}
