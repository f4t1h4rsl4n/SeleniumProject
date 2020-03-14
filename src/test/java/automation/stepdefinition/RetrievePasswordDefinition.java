package automation.stepdefinition;

import automation.pagefactory.ForgotPasswordPage;
import automation.pagefactory.PracticeCybertekHomePage;
import automation.utils.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RetrievePasswordDefinition extends BaseTest {
    private PracticeCybertekHomePage practiceCybertekHomePage;
    private ForgotPasswordPage forgotPasswordPage;
    private WebDriver driver;
    @Given("^User is on the practice landing page$")
    public void userIsOnThePracticeLandingPage(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        practiceCybertekHomePage=new PracticeCybertekHomePage(driver);
    }
    @When("^user navigates to forgot password page$")
    public void userNavigatesToForgotPasswordPage(){
        practiceCybertekHomePage.forgotPasswordLink.click();
        forgotPasswordPage=new ForgotPasswordPage(driver);
    }
    @And("^user enters the email$")
    public void userEntersTheEmail(){
        forgotPasswordPage.emailTextBox.sendKeys("fatih@google.com");
    }
    @And("^user clicks retrieve password button$")
    public void userClicksRetreivePasswordButton(){
        forgotPasswordPage.retrievePasswordButton.click();
    }
    @Then("^user be able to see 'Your e-mail's been sent!' message$")
    public void userSeesSuccessMessage(){
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        String result=forgotPasswordPage.successTittle.getText();
        String expected="Your e-mail's been sent!";
        Assert.assertEquals(result,expected);
        driver.quit();
    }
}
