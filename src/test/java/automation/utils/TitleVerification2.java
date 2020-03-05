package automation.utils;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls= Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com",
                "https://walmart.com",
                "https://www.westelm.com/");
        var driver=BrowserFactory.createDriver("chrome");

        for (String url:urls){
            driver.get(url);
            String title=driver.getTitle();
            title=title.replace(" ","").toLowerCase();
            System.out.println(url+" contains: "+title+"? "+url.contains(title));
        }
        driver.quit();
    }
}
