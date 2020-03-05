package automation.tests;

import automation.utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SignUpTest {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.findElement(By.name("full_name")).sendKeys("fatih");
        driver.findElement(By.name("email")).sendKeys("hello@fake.com");
        driver.findElement(By.name("wooden_spoon")).click();
        String result=driver.findElement(By.tagName("h3")).getText();
        if (result.equals("Thank you for signing up. Click the button below to return to the home page.")){
            System.out.println("Test Succeed");
        } else{
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}
