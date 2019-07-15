package com.FaceBook.qa.steps;

import com.FaceBook.qa.page.BaseClass;
import com.FaceBook.qa.page.HomePage;

import cucumber.api.java.en.Then;

public class HomeSteps extends BaseClass{
	
	public HomePage homePage;
	
	@Then("^I navigate to Home Page of test application$")
	public void i_navigate_to_Home_Page_of_test_application(){
		homePage = new HomePage();
		homePage.homePageDisplayed();
	}

}
