package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CoverPage extends BasePage {
	
	public CoverPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id ="logo")
	WebElement logo;
	@FindBy(xpath="//input[@ng-model='emailid']")
	WebElement UndTxt;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInBtn;
	@FindBy(xpath = "//button[text()='Skip Sign In']")
	WebElement skipSignInBtn;
	@FindBy(id = "enterimg")
	WebElement RegBtn;
	
	public Boolean logoVerificaton() {
		return logo.isDisplayed();
	}
	public String underlineTextVerification() {
		String text=UndTxt.getAttribute("placeholder");
	    return text ;
	}
	public Boolean signInBtnVerification() {
		return signInBtn.isEnabled();
	}
	public void clicksignInBtn() {
		 signInBtn.click();
	}
	public Boolean skipSignInBtnVerification() {
		return skipSignInBtn.isEnabled();
	}
	public void clickskipsignInBtn() {
		 skipSignInBtn.click();
	}
	public Boolean RegBtnVerification() {
		return RegBtn.isEnabled();
	}
	public void clickRegBtn() {
		RegBtn.click();
	}

}
