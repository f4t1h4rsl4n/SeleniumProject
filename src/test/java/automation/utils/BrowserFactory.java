package automation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    /**
     *
     * @param browserName case insensitive, current parameters: edge,safari.
     * @return
     */
    public static WebDriver createDriver(String browserName){
        String oP=System.getProperty("os.name");
        switch (browserName){
            case "edge":
                if (oP.contains("ac")){
                    return null;
                } else{
                    WebDriverManager.edgedriver().setup();
                    return new EdgeDriver();
                }
            case "safari":
                if (oP.contains("indows")){
                    return null;
                } else{
                    System.out.println("I don't have safari method in WebdriverManager class");
                }
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
        }
        System.out.println("only safari and edge available");
        return null;
    }
}

