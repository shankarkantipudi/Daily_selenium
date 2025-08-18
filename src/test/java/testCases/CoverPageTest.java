package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CoverPage;
import testBase.BaseClass;




public class CoverPageTest extends BaseClass{
	
	
	@Test
	 void testcoverpage() {
		 CoverPage cp= new CoverPage(driver);
		 Assert.assertTrue(cp.logoVerificaton());
		 System.out.println(cp.underlineTextVerification());
		 Assert.assertEquals(cp.underlineTextVerification(),"Email id for Sign Up" );
		 System.out.println("step1");
		 Assert.assertTrue(cp.signInBtnVerification());
		 cp.clicksignInBtn();
		 System.out.println("signINBtn clicked");
		 driver.navigate().back();
		 Assert.assertTrue(cp.skipSignInBtnVerification());
		 cp.clickskipsignInBtn();
		 driver.navigate().back();
		 Assert.assertTrue(cp.RegBtnVerification());
		 cp.clickRegBtn();
		 
	 }
	
}
