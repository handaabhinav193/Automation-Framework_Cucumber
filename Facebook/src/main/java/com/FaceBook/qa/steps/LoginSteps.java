package com.FaceBook.qa.steps;



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
	public void i_enter_username_and_password_and_hit_login_button(){

	}

	@Then("^I navigate to Home Page of test application$")
	public void i_navigate_to_Home_Page_of_test_application(){
	
	}

}
