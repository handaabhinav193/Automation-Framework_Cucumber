package com.FaceBook.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.FaceBook.qa.utilities.ReadConfigFile;

public class LoginPage {
	
	WebDriver ldriver;
	public ReadConfigFile configFile;
	
	public LoginPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, LoginPage.class);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='email']")
	public WebElement username;
	
	@FindBy(how=How.XPATH, using="//input[@name='pass']")
	public WebElement password;
	
	public void enterUserPassDetails() {
		configFile = new ReadConfigFile();
		username.sendKeys(configFile.uName());
		password.sendKeys(configFile.uPass());
	}

}