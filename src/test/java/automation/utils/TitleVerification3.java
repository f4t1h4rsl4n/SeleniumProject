package automation.utils;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws Exception {
        List<String> urls= Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com",
                "https://walmart.com",
                "https://www.westelm.com/");
        for (String url:urls) {
            var driver=BrowserFactory.createDriver("chrome");
            driver.get(url);
            String title = driver.getTitle();
            title = title.replace(" ", "").toLowerCase();
            System.out.println(url + " contains: " + title + "? " + url.contains(title));
            driver.close();
            Thread.sleep(2000);
        }
    }
}
