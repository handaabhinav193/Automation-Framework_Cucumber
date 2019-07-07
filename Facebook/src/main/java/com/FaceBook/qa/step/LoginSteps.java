package com.FaceBook.qa.step;

import org.openqa.selenium.support.PageFactory;

import com.FaceBook.qa.page.BaseClass;
import com.FaceBook.qa.page.HomePage;
import com.FaceBook.qa.page.LoginPage;

import cucumber.api.java.en.Given;

public class LoginSteps extends BaseClass{
	
	public HomePage homepage;
	
	@Given ("I enter username and password and hit login button")
	public void loginCredentials() {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		homepage = loginpage.enterCredentials();
	}
}
