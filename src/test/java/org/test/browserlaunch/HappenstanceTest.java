package org.test.browserlaunch;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HappenstanceTest {
	static WebDriver driver;
@BeforeClass
void setup() {
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://happenstance.com/");
	driver.manage().window().maximize();
}
@Test
void Test() {
	Login ln=new Login(driver);
	ln.clickwomenMenu();
	ln.clickcasualShoes();
	
}
@AfterClass
void tearDown() {
	driver.quit();
}

}
