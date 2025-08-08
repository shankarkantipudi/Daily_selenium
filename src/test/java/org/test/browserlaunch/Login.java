package org.test.browserlaunch;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
 @FindBy(xpath = "//a[@data-menu='Women']") WebElement women_menu;
 @FindBy(xpath ="//ul[@class='mx-0 md:mx-10']//a[text()='Casual Shoes'][1]") WebElement casual_shoes;
 
 public void clickwomenMenu() {
	 women_menu.click();
 }
 public void clickcasualShoes() {
	 casual_shoes.click();
 }

}
