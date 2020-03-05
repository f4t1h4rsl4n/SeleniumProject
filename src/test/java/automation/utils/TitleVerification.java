package automation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.
                asList
                        (
                                "http://practice.cybertekschool.com/"
                                ,
                                "http://practice.cybertekschool.com/dropdown"
                                ,
                                "http://practice.cybertekschool.com/login"
                        );
        var driver=BrowserFactory.createDriver("chrome");
        Set<String> set=new HashSet<>();
        for (int i = 0; i <urls.size() ; i++) {
            driver.get(urls.get(i));
            set.add(driver.getTitle());
        }
        for (String url:urls)
            if (!url.contains("http://practice.cybertekschool.com"))
                System.out.println("url doesn't contain: http://practice.cybertekschool.com");
        System.out.println("All titles has same tag: "+(set.size()==1));
            driver.quit();
    }
}
