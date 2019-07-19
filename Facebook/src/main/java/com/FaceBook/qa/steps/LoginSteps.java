package com.FaceBook.qa.steps;



import com.FaceBook.qa.page.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps extends BaseClass {
	
	public BaseClass session= new BaseClass();
	@Before
	public void startTestSession() {
		session.setup();
	}
	
	@After
	public void endTestSession() {
		session.tearDown();
	}
	
	@Given("^I enter username and password and hit login button$")
	public void enterCredentials(){
		loginpage = new LoginPage(driver);
		loginpage.enterUserDetails();
	}

	@Then("^I navigate to Home Page of test application$")
	public void navigateHome(){
	
	}

}
