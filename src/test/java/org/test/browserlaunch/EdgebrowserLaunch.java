package org.test.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgebrowserLaunch {
    static String Url="https://www.makemytrip.com";
    public static void browserLaunch() {
        WebDriver driver = new EdgeDriver();
        driver.navigate().to(Url);

    }
}
