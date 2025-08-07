package org.test.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ChromebrowserLaunch {
     static String Url="https://www.makemytrip.com";
    public static void browserLaunch() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(Url);

    }
}
