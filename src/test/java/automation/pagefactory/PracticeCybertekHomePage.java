package automation.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeCybertekHomePage {
    private WebDriver driver;

    public PracticeCybertekHomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Forgot Password")
    public WebElement forgotPasswordLink;



}
