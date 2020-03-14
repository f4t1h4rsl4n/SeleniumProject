package automation.tests.navigationtests;

import automation.utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select select=new Select(dropdownElement);
        Select year=new Select(driver.findElement(By.id("year")));
        Select month=new Select(driver.findElement(By.id("month")));
        Select day=new Select(driver.findElement(By.id("day")));
        Select state=new Select(driver.findElement(By.id("state")));
        Select languages=new Select(driver.findElement(By.name("Languages")));
        List<WebElement> states=state.getOptions();
        List<WebElement> months=month.getOptions();
        List<WebElement> years=year.getOptions();
        List<WebElement> days=day.getOptions();
//        for (WebElement yr:years){
//            year.selectByVisibleText(yr.getText());
//            Thread.sleep(50);
//        }
        for (WebElement mnth:months){
            month.selectByVisibleText(mnth.getText());
            Thread.sleep(50);
        }

        state.selectByVisibleText("Arizona");
        String selectedState=state.getFirstSelectedOption().getText();
        System.out.println(selectedState.equals("Arizona"));


    }
}
