package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegPage;
import pageObjects.HomePage;

public class AccountRegTest extends BaseClass {
	
	public WebDriver driver;
	
  
    @Test
    public void verify_account_registration() {
    	HomePage hp=new HomePage(driver);
    	hp.clickMyaccount();
    	hp.clickRegister();
    	AccountRegPage arp= new AccountRegPage(driver);
    	arp.setFirstName("jhon");
    	arp.setLastName("sharma");
    	arp.setEmaiLAddress(randomstring()+"@gmail.com");
    	arp.setpassword("@12345678");
    	arp.clickTerms();
    	arp.clickContinueBtn();
    	String cnfmsg=arp.getcnfrmmsg();
    	Assert.assertEquals(cnfmsg, "Your Account Has Been Created!");
    }
    
}
