package automation.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
    private WebDriver driver;
    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;
    @FindBy(id = "form_submit")
    public WebElement retrievePasswordButton;

    //after directing to the email_sent page
    @FindBy(tagName = "h4")
    public WebElement successTittle;

}
