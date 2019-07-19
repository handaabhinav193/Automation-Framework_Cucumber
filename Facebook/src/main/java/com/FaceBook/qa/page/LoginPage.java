package com.FaceBook.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.FaceBook.qa.steps.BaseClass;

public class LoginPage{
	
	public WebDriver ldriver;
	BaseClass baseClass = new BaseClass();
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//input[@type='email' and @name='email']")
	public WebElement emailTextBox;
	
	@FindBy(how = How.XPATH, using ="//input[@type='password' and @name='pass']")
	public WebElement passTextBox;
	
	@FindBy(how = How.XPATH, using ="//input[@type='submit']")
	public WebElement loginBtn;
	
	public void enterUserDetails() {
		emailTextBox.sendKeys(baseClass.user);
		passTextBox.sendKeys(baseClass.pass);
		loginBtn.click();
	}

}
