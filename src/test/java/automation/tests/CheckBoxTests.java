package automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxTests {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        //#TASK
        //verify that 1st checkbox is not selected and 2nd is selected
        List<WebElement> checkboxes=driver.findElements(By.tagName("input"));
        System.out.println("first checbox selected: "+checkboxes.get(0).isSelected());
        System.out.println("second checbox selected: "+checkboxes.get(1).isSelected());
        driver.quit();

    }
}

