package automation.tests.navigationtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement upload=driver.findElement(By.id("file-upload"));
        String filePath="C:\\Users\\artem\\IdeaProjects\\SeleniumProject\\pom.xml";
        upload.sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}

