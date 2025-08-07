package org.test.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Methodsused {
    static String Url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public static void browserLaunch() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(Url);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();

    }
}
