package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegPage extends BasePage{

	 public AccountRegPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "input-firstname")
	WebElement txtFirstName;
	@FindBy(name = "lastname")
	WebElement txtLastName;
	@FindBy(xpath ="//input[@type='email']")
	WebElement txtEmail;
	@FindBy(xpath ="//input[@type='password']")
	WebElement txtPassword;
	@FindBy(name = "agree")
	WebElement chkTerms;
	@FindBy(xpath= "//button[@type='submit']") 
	WebElement btnContinue;
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fstname) {
		txtFirstName.sendKeys(fstname);
	}
	public void setLastName(String lstname) {
		txtLastName.sendKeys(lstname);
	}
	public void setEmaiLAddress(String emailadd) {
		txtEmail.sendKeys(emailadd);
	}
	public void setpassword(String password) {
		txtPassword.sendKeys(password);
	}
	public void clickTerms() {
		chkTerms.click();	
	}
	public void clickContinueBtn() {
		btnContinue.click();	
	}
	public String getcnfrmmsg() {
		try{
			return(msgConfirmation.getText());
		}
		catch(Exception e){
			return e.getMessage();
			
		}
	}

}
