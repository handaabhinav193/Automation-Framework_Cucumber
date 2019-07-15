package com.FaceBook.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.FaceBook.qa.utilities.ReadConfigFile;

public class LoginPage extends BaseClass{

	public ReadConfigFile config;
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.driver, LoginPage.class);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='email']")
	public WebElement username;
	
	@FindBy(how=How.XPATH, using="//input[@name='pass']")
	public WebElement password;
	
	public void enterUserPassDetails() {
		config = new ReadConfigFile();
		username.sendKeys(config.uName());
		password.sendKeys(config.uPass());
	}

}