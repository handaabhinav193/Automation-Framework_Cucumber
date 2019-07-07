package com.FaceBook.qa.step;

import org.junit.Assert;

import com.FaceBook.qa.page.*;

import cucumber.api.java.en.Then;

public class HomePageSteps extends BaseClass{
	
	public HomePage homepage;
	
	@Then ("I navigate to Home Page of test application")
	public void verifyHome() {
		homepage = new HomePage();
		Assert.assertTrue(homepage.homePageAbhinav());
	}

}
