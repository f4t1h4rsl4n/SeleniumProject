package automation.tests.navigationtests;

import automation.utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptions {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select language=new Select(driver.findElement(By.name("Languages")));
        for (int i = 0; i < language.getOptions().size(); i++)
            language.selectByIndex(i);
        System.out.println("is multiple: "+language.isMultiple());
        for (WebElement selected:language.getAllSelectedOptions())
            System.out.println(selected.getText());
        driver.quit();
    }
}
