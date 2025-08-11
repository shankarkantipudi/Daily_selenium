package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	 @BeforeClass
		public void setup(){
		   driver=new ChromeDriver();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://demo.opencart.com");
		   driver.manage().window().maximize();
		   
			}
	 public String randomstring() {
	    	@SuppressWarnings("deprecation")
			String genString=RandomStringUtils.randomAlphabetic(5);
	    	return genString;
	    	
	    }
	   @AfterClass
	    public void teardown(){
			driver.quit();
		}

}
