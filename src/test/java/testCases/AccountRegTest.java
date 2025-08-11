package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegPage;
import pageObjects.HomePage;

public class AccountRegTest {
	
	public WebDriver driver;
	
   @BeforeClass
	public void setup(){
	   driver=new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://demo.opencart.com/");
	   driver.manage().window().maximize();
	   
		}
   @AfterClass
    public void teardown(){
		driver.quit();
	}
    @Test
    public void verify_account_registration() {
    	HomePage hp=new HomePage(driver);
    	hp.clickMyaccount();
    	hp.clickRegister();
    	AccountRegPage arp= new AccountRegPage(driver);
    	arp.setFirstName("jhon");
    	arp.setLastName("sharma");
    	arp.setEmaiLAddress("jhon.sharma@gmail.com");
    	arp.setpassword("@12345678");
    	arp.clickTerms();
    	arp.clickContinueBtn();
    	String cnfmsg=arp.getcnfrmmsg();
    	Assert.assertEquals(cnfmsg, "Your Account Has Been Created!");
    }
}
