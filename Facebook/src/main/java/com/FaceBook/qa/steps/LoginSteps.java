package com.FaceBook.qa.steps;

import com.FaceBook.qa.page.BaseClass;
import com.FaceBook.qa.page.LoginPage;

import cucumber.api.java.en.Given;

public class LoginSteps extends BaseClass{
	
	
	@Given("I enter username and password and hit login button")
	public void enterLoginDetails(){
		loginPage = new LoginPage();
		loginPage.enterUserPassDetails();
	}

}
