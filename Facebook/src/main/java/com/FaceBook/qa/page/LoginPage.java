package com.FaceBook.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import com.FaceBook.qa.utilities.*;
import com.FaceBook.qa.utilities.ReadConfigFile;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how = How.XPATH, using = "//input[@class='inputtext' and @name='email']")
	public WebElement user;
	
	@FindBy(how = How.XPATH, using ="//input[@class='inputtext' and @name='pass']")
	public WebElement pass;
	
	@FindBy(how = How.XPATH, using="//input[@value='Log In']")
	public WebElement loginBtn;
	
	@FindBy(how=How.XPATH, using="//input[@name='firstname']")
	public WebElement registerFirstName;
	
	@FindBy(how=How.XPATH, using="//input[@name='lastname']")
	public WebElement registerLastName;
	
	@FindBy(how=How.XPATH, using="//input[@name='reg_email__']")
	public WebElement registerPhnEmail;
	
	@FindBy(how=How.XPATH, using="//input[@name='reg_passwd__']")
	public WebElement registerNewPassword;
	
	@FindBy(how=How.XPATH, using="//button[@name='websubmit']")
	public WebElement signUpButton;
	
	String gender = "//label[text()='gender']";
	
	public HomePage enterCredentials() {
		user.sendKeys(config.uName());
		pass.sendKeys(config.uPass());
		loginBtn.click();
		return new HomePage();
	}

}
